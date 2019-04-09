package cz.mg.vulkan;

public class VkPipelineColorBlendStateCreateFlags extends VkFlags {
    public VkPipelineColorBlendStateCreateFlags() {
    }

    public VkPipelineColorBlendStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineColorBlendStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineColorBlendStateCreateFlags(int value) {
        setValue(value);
    }
}
