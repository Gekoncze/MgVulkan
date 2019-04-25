package cz.mg.vulkan;

public class VkPipelineLayoutCreateFlags extends VkFlags {
    public VkPipelineLayoutCreateFlags() {
    }

    protected VkPipelineLayoutCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPipelineLayoutCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineLayoutCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkPipelineLayoutCreateFlags(int value) {
        setValue(value);
    }
}
