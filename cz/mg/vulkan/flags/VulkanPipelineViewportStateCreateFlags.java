package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkPipelineViewportStateCreateFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanPipelineViewportStateCreateFlags {
    public final VkPipelineViewportStateCreateFlags flags;

    public VulkanPipelineViewportStateCreateFlags(){
        this(0);
    }

    public VulkanPipelineViewportStateCreateFlags(int flag){
        this(new VkPipelineViewportStateCreateFlags(flag));
    }

    public VulkanPipelineViewportStateCreateFlags(VkPipelineViewportStateCreateFlags flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkPipelineViewportStateCreateFlags.class);
    }
}
