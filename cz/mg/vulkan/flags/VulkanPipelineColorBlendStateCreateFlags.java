package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkPipelineColorBlendStateCreateFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanPipelineColorBlendStateCreateFlags {
    public final VkPipelineColorBlendStateCreateFlags flags;

    public VulkanPipelineColorBlendStateCreateFlags(){
        this(0);
    }

    public VulkanPipelineColorBlendStateCreateFlags(int flag){
        this(new VkPipelineColorBlendStateCreateFlags(flag));
    }

    public VulkanPipelineColorBlendStateCreateFlags(VkPipelineColorBlendStateCreateFlags flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkPipelineColorBlendStateCreateFlags.class);
    }
}
