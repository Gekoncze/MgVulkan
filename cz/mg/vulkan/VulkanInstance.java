package cz.mg.vulkan;

import cz.mg.collections.array.Array;
import cz.mg.collections.array.ReadonlyArray;
import cz.mg.vulkan.jna.VulkanNative;
import cz.mg.vulkan.jna.arrays.StringArray;
import cz.mg.vulkan.jna.arrays.VkPhysicalDeviceArray;
import cz.mg.vulkan.jna.handles.VkInstance;


public class VulkanInstance {
    private final Vulkan parent;
    private final VkInstance.ByValue handle;
    private Array<VulkanPhysicalDevice> physicalDevices = null;

    public VulkanInstance(Vulkan vulkan, String applicationName, Version applicationVersion, String engineName, Version engineVersion){
        this.parent = vulkan;
        this.handle = new VkInstance.ByValue(vulkan.vks.vkCreateInstance(
                VulkanNative.VK_API_VERSION_1_0,
                applicationName, applicationVersion.getValue(),
                engineName, engineVersion.getValue(),
                new StringArray(new String[]{
                        "VK_KHR_surface"
                }),
                new StringArray(new String[]{
                })
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
