package cz.mg.vulkan;

public class VkPipelineViewportStateCreateFlags extends VkFlags {
    public VkPipelineViewportStateCreateFlags() {
    }

    protected VkPipelineViewportStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPipelineViewportStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineViewportStateCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkPipelineViewportStateCreateFlags(int value) {
        setValue(value);
    }
}
