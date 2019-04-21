package cz.mg.vulkan;

public class VkMemoryAllocateFlagsKHX extends VkFlags {
    public VkMemoryAllocateFlagsKHX() {
    }

    public VkMemoryAllocateFlagsKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryAllocateFlagsKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkMemoryAllocateFlagsKHX(int value) {
        setValue(value);
    }
}
