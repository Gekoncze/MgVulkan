package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkPipelineVertexInputStateCreateFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanPipelineVertexInputStateCreateFlags {
    public final VkPipelineVertexInputStateCreateFlags flags;

    public VulkanPipelineVertexInputStateCreateFlags(){
        this(0);
    }

    public VulkanPipelineVertexInputStateCreateFlags(int flag){
        this(new VkPipelineVertexInputStateCreateFlags(flag));
    }

    public VulkanPipelineVertexInputStateCreateFlags(VkPipelineVertexInputStateCreateFlags flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkPipelineVertexInputStateCreateFlags.class);
    }
}
