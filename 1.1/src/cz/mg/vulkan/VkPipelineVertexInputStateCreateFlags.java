package cz.mg.vulkan;

public class VkPipelineVertexInputStateCreateFlags extends VkFlags {
    public VkPipelineVertexInputStateCreateFlags() {
    }

    public VkPipelineVertexInputStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineVertexInputStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkPipelineVertexInputStateCreateFlags(int value) {
        setValue(value);
    }
}
