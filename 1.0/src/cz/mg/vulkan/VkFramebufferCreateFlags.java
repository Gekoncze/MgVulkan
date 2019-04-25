package cz.mg.vulkan;

public class VkFramebufferCreateFlags extends VkFlags {
    public VkFramebufferCreateFlags() {
    }

    protected VkFramebufferCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkFramebufferCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkFramebufferCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkFramebufferCreateFlags(int value) {
        setValue(value);
    }
}
