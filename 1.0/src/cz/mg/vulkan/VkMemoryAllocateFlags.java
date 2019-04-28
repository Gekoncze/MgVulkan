package cz.mg.vulkan;

public class VkMemoryAllocateFlags extends VkFlags {
    public VkMemoryAllocateFlags() {
    }

    protected VkMemoryAllocateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkMemoryAllocateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkMemoryAllocateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkMemoryAllocateFlags(int value) {
        setValue(value);
    }
}
