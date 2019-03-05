package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkPipelineDynamicStateCreateFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanPipelineDynamicStateCreateFlags {
    public final VkPipelineDynamicStateCreateFlags flags;

    public VulkanPipelineDynamicStateCreateFlags(){
        this(0);
    }

    public VulkanPipelineDynamicStateCreateFlags(int flag){
        this(new VkPipelineDynamicStateCreateFlags(flag));
    }

    public VulkanPipelineDynamicStateCreateFlags(VkPipelineDynamicStateCreateFlags flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkPipelineDynamicStateCreateFlags.class);
    }
}
