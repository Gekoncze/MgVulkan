package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkPipelineDepthStencilStateCreateFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanPipelineDepthStencilStateCreateFlags {
    public final VkPipelineDepthStencilStateCreateFlags flags;

    public VulkanPipelineDepthStencilStateCreateFlags(){
        this(0);
    }

    public VulkanPipelineDepthStencilStateCreateFlags(int flag){
        this(new VkPipelineDepthStencilStateCreateFlags(flag));
    }

    public VulkanPipelineDepthStencilStateCreateFlags(VkPipelineDepthStencilStateCreateFlags flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkPipelineDepthStencilStateCreateFlags.class);
    }
}
