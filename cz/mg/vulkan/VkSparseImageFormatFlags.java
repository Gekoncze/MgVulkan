package cz.mg.vulkan;

public class VkSparseImageFormatFlags extends VkFlags {
    public VkSparseImageFormatFlags() {
    }

    public VkSparseImageFormatFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSparseImageFormatFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSparseImageFormatFlags(int value) {
        setValue(value);
    }
}
