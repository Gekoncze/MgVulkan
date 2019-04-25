package cz.mg.vulkan;

public class VkPipelineCreateFlags extends VkFlags {
    public VkPipelineCreateFlags() {
    }

    protected VkPipelineCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPipelineCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkPipelineCreateFlags(int value) {
        setValue(value);
    }
}
