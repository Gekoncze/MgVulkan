package cz.mg.vulkan;

public class VkPipelineRasterizationStateCreateFlags extends VkFlags {
    public VkPipelineRasterizationStateCreateFlags() {
    }

    public VkPipelineRasterizationStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineRasterizationStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineRasterizationStateCreateFlags(int value) {
        setValue(value);
    }
}
