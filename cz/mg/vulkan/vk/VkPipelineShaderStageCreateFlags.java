package cz.mg.vulkan.vk;

public class VkPipelineShaderStageCreateFlags extends VkFlags {
    public VkPipelineShaderStageCreateFlags() {
    }

    public VkPipelineShaderStageCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineShaderStageCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineShaderStageCreateFlags(int value) {
        setValue(value);
    }
}
