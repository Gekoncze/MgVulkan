package cz.mg.vulkan;

public class VkPipelineColorBlendStateCreateFlags extends VkFlags {
    public VkPipelineColorBlendStateCreateFlags() {
    }

    protected VkPipelineColorBlendStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPipelineColorBlendStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineColorBlendStateCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkPipelineColorBlendStateCreateFlags(int value) {
        setValue(value);
    }
}
