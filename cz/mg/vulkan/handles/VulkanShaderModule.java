package cz.mg.vulkan.handles;

import cz.mg.vulkan.jna.handles.VkShaderModule;


public class VulkanShaderModule {
    public final VkShaderModule handle;

    public VulkanShaderModule(VkShaderModule handle) {
        this.handle = handle;
    }
}
