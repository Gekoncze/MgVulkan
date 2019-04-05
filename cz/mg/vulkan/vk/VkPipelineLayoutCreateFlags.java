package cz.mg.vulkan.vk;

public class VkPipelineLayoutCreateFlags extends VkFlags {
    public VkPipelineLayoutCreateFlags() {
    }

    public VkPipelineLayoutCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineLayoutCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineLayoutCreateFlags(int value) {
        setValue(value);
    }
}
