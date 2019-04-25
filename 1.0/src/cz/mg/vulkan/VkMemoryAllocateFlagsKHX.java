package cz.mg.vulkan;

public class VkMemoryAllocateFlagsKHX extends VkFlags {
    public VkMemoryAllocateFlagsKHX() {
    }

    protected VkMemoryAllocateFlagsKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkMemoryAllocateFlagsKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkMemoryAllocateFlagsKHX(VkPointer pointer) {
        super(pointer);
    }



    public VkMemoryAllocateFlagsKHX(int value) {
        setValue(value);
    }
}
