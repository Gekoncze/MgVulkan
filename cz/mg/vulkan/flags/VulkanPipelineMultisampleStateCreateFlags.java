package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkPipelineMultisampleStateCreateFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanPipelineMultisampleStateCreateFlags {
    public final VkPipelineMultisampleStateCreateFlags flags;

    public VulkanPipelineMultisampleStateCreateFlags(){
        this(0);
    }

    public VulkanPipelineMultisampleStateCreateFlags(int flag){
        this(new VkPipelineMultisampleStateCreateFlags(flag));
    }

    public VulkanPipelineMultisampleStateCreateFlags(VkPipelineMultisampleStateCreateFlags flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkPipelineMultisampleStateCreateFlags.class);
    }
}
