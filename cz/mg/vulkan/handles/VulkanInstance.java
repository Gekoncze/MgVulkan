package cz.mg.vulkan.handles;

import cz.mg.collections.array.Array;
import cz.mg.collections.array.ReadonlyArray;
import cz.mg.vulkan.Vulkan;
import cz.mg.vulkan.structures.VulkanPhysicalDevice;
import cz.mg.vulkan.jna.Vk;
import cz.mg.vulkan.jna.arrays.StringArray;
import cz.mg.vulkan.jna.arrays.VkPhysicalDeviceArray;
import cz.mg.vulkan.jna.handles.VkInstance;
import cz.mg.vulkan.utilities.Version;


public class VulkanInstance {
    private final Vulkan parent;
    public final VkInstance.ByValue handle;
    private Array<VulkanPhysicalDevice> physicalDevices = null;

    public VulkanInstance(Vulkan vulkan, String applicationName, Version applicationVersion, String engineName, Version engineVersion, String[] extensions, String[] layers){
        this.parent = vulkan;
        this.handle = new VkInstance.ByValue(vulkan.vks.vkCreateInstance(
                Vk.VK_API_VERSION_1_0,
                applicationName, applicationVersion.getValue(),
                engineName, engineVersion.getValue(),
                new StringArray(extensions),
                new StringArray(layers)
        ));
    }

    public Vulkan getParent() {
        return parent;
    }

    public ReadonlyArray<VulkanPhysicalDevice> getPhysicalDevices() {
        if(physicalDevices == null){
            VkPhysicalDeviceArray array = parent.vks.vkEnumeratePhysicalDevices(handle);
            this.physicalDevices = new Array<>(array.count());
            for(int i = 0; i < array.count(); i++) this.physicalDevices.set(i, new VulkanPhysicalDevice(this, array.get(i).byValue(false, true)));
        }
        return physicalDevices;
    }

    @Override
    protected void finalize() {
        parent.vk.vkDestroyInstance(handle, null);
    }
}
