package cz.mg.vulkan;

public class VkPipelineMultisampleStateCreateFlags extends VkFlags {
    public VkPipelineMultisampleStateCreateFlags() {
    }

    protected VkPipelineMultisampleStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPipelineMultisampleStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineMultisampleStateCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkPipelineMultisampleStateCreateFlags(int value) {
        setValue(value);
    }
}
