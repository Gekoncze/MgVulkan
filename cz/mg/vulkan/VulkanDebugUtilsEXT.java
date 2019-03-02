package cz.mg.vulkan;

import cz.mg.vulkan.handles.VulkanInstance;
import cz.mg.vulkan.jna.extensions.VkDebugUtilsEXT;
import cz.mg.vulkan.jna.extensions.VkDebugUtilsEXTSimplified;


public class VulkanDebugUtilsEXT {
    public final VkDebugUtilsEXT vkdu;
    public final VkDebugUtilsEXTSimplified vkdus;
    private final VulkanInstance instance;

    public VulkanDebugUtilsEXT(VulkanInstance instance) {
        this.vkdu = VkDebugUtilsEXT.load(instance.handle, instance.getParent().vks);
        this.vkdus = new VkDebugUtilsEXTSimplified(vkdu);
        this.instance = instance;
    }

    public VulkanInstance getInstance() {
        return instance;
    }
}
