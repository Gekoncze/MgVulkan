package cz.mg.vulkan;

public class VkPipelineShaderStageCreateFlags extends VkFlags {
    public VkPipelineShaderStageCreateFlags() {
    }

    protected VkPipelineShaderStageCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPipelineShaderStageCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineShaderStageCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkPipelineShaderStageCreateFlags(int value) {
        setValue(value);
    }
}
