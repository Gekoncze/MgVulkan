package cz.mg.vulkan;

public class VkPipelineVertexInputStateCreateFlags extends VkFlags {
    public VkPipelineVertexInputStateCreateFlags() {
    }

    protected VkPipelineVertexInputStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPipelineVertexInputStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineVertexInputStateCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkPipelineVertexInputStateCreateFlags(int value) {
        setValue(value);
    }
}
