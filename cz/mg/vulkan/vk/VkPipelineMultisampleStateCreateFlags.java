package cz.mg.vulkan.vk;

public class VkPipelineMultisampleStateCreateFlags extends VkFlags {
    public VkPipelineMultisampleStateCreateFlags() {
    }

    public VkPipelineMultisampleStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineMultisampleStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineMultisampleStateCreateFlags(int value) {
        setValue(value);
    }
}
