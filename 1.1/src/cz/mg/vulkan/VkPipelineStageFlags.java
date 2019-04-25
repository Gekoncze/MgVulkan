package cz.mg.vulkan;

public class VkPipelineStageFlags extends VkFlags {
    public VkPipelineStageFlags() {
    }

    protected VkPipelineStageFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPipelineStageFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineStageFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkPipelineStageFlags(int value) {
        setValue(value);
    }
}
