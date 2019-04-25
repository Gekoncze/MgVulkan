package cz.mg.vulkan;

public class VkPipelineRasterizationStateCreateFlags extends VkFlags {
    public VkPipelineRasterizationStateCreateFlags() {
    }

    protected VkPipelineRasterizationStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPipelineRasterizationStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineRasterizationStateCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkPipelineRasterizationStateCreateFlags(int value) {
        setValue(value);
    }
}
