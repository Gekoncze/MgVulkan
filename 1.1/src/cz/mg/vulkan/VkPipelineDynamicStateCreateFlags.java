package cz.mg.vulkan;

public class VkPipelineDynamicStateCreateFlags extends VkFlags {
    public VkPipelineDynamicStateCreateFlags() {
    }

    protected VkPipelineDynamicStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPipelineDynamicStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineDynamicStateCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkPipelineDynamicStateCreateFlags(int value) {
        setValue(value);
    }
}
