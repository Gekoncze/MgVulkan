package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkPipelineInputAssemblyStateCreateFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanPipelineInputAssemblyStateCreateFlags {
    public final VkPipelineInputAssemblyStateCreateFlags flags;

    public VulkanPipelineInputAssemblyStateCreateFlags(){
        this(0);
    }

    public VulkanPipelineInputAssemblyStateCreateFlags(int flag){
        this(new VkPipelineInputAssemblyStateCreateFlags(flag));
    }

    public VulkanPipelineInputAssemblyStateCreateFlags(VkPipelineInputAssemblyStateCreateFlags flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkPipelineInputAssemblyStateCreateFlags.class);
    }
}
