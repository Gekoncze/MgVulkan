package cz.mg.vulkan;

public class VkMemoryHeapFlags extends VkFlags {
    public VkMemoryHeapFlags() {
    }

    protected VkMemoryHeapFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkMemoryHeapFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkMemoryHeapFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkMemoryHeapFlags(int value) {
        setValue(value);
    }
}
