package cz.mg.vulkan;

public class VkPipelineTessellationStateCreateFlags extends VkFlags {
    public VkPipelineTessellationStateCreateFlags() {
    }

    protected VkPipelineTessellationStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPipelineTessellationStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineTessellationStateCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkPipelineTessellationStateCreateFlags(int value) {
        setValue(value);
    }
}
