package cz.mg.vulkan;

public class VkSparseMemoryBindFlags extends VkFlags {
    public VkSparseMemoryBindFlags() {
    }

    protected VkSparseMemoryBindFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSparseMemoryBindFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSparseMemoryBindFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkSparseMemoryBindFlags(int value) {
        setValue(value);
    }
}
