package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkPipelineRasterizationStateCreateFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanPipelineRasterizationStateCreateFlags {
    public final VkPipelineRasterizationStateCreateFlags flags;

    public VulkanPipelineRasterizationStateCreateFlags(){
        this(0);
    }

    public VulkanPipelineRasterizationStateCreateFlags(int flag){
        this(new VkPipelineRasterizationStateCreateFlags(flag));
    }

    public VulkanPipelineRasterizationStateCreateFlags(VkPipelineRasterizationStateCreateFlags flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkPipelineRasterizationStateCreateFlags.class);
    }
}
