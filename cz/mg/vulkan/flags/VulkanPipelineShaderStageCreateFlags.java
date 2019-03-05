package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkPipelineShaderStageCreateFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanPipelineShaderStageCreateFlags {
    public final VkPipelineShaderStageCreateFlags flags;

    public VulkanPipelineShaderStageCreateFlags(){
        this(0);
    }

    public VulkanPipelineShaderStageCreateFlags(int flag){
        this(new VkPipelineShaderStageCreateFlags(flag));
    }

    public VulkanPipelineShaderStageCreateFlags(VkPipelineShaderStageCreateFlags flags) {
        this.flags = flags;
    }

    public boolean isSet(int flag){
        return (flags.value & flag) != 0;
    }

    public void set(int flag){
        flags.value |= flag;
    }

    @Override
    public String toString() {
        return ToString.flagsToStringNoLabels(flags.value, VkPipelineShaderStageCreateFlags.class);
    }
}
