package cz.mg.vulkan.handles;

import cz.mg.vulkan.jna.handles.VkPipelineLayout;


public class VulkanPipelineLayout {
    public final VkPipelineLayout handle;

    public VulkanPipelineLayout(VkPipelineLayout handle) {
        this.handle = handle;
    }
}
