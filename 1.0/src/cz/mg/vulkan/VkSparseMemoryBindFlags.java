package cz.mg.vulkan;

public class VkSparseMemoryBindFlags extends VkFlags {
    public VkSparseMemoryBindFlags() {
    }

    public VkSparseMemoryBindFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSparseMemoryBindFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSparseMemoryBindFlags(int value) {
        setValue(value);
    }
}
