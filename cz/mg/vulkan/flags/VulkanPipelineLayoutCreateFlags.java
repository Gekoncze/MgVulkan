package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkPipelineLayoutCreateFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanPipelineLayoutCreateFlags {
    public final VkPipelineLayoutCreateFlags flags;

    public VulkanPipelineLayoutCreateFlags(){
        this(0);
    }

    public VulkanPipelineLayoutCreateFlags(int flag){
        this(new VkPipelineLayoutCreateFlags(flag));
    }

    public VulkanPipelineLayoutCreateFlags(VkPipelineLayoutCreateFlags flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkPipelineLayoutCreateFlags.class);
    }
}
