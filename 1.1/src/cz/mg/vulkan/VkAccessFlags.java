package cz.mg.vulkan;

public class VkAccessFlags extends VkFlags {
    public VkAccessFlags() {
    }

    protected VkAccessFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkAccessFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkAccessFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkAccessFlags(int value) {
        setValue(value);
    }
}
