package cz.mg.vulkan.handles;

import cz.mg.vulkan.jna.handles.VkDescriptorSetLayout;


public class VulkanDescriptorSetLayout {
    public final VkDescriptorSetLayout handle;

    public VulkanDescriptorSetLayout(VkDescriptorSetLayout handle) {
        this.handle = handle;
    }
}
