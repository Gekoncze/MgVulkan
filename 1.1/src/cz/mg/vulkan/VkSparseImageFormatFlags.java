package cz.mg.vulkan;

public class VkSparseImageFormatFlags extends VkFlags {
    public VkSparseImageFormatFlags() {
    }

    protected VkSparseImageFormatFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSparseImageFormatFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSparseImageFormatFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkSparseImageFormatFlags(int value) {
        setValue(value);
    }
}
