package cz.mg.vulkan;

public class VkMemoryAllocateFlags extends VkFlags {
    public VkMemoryAllocateFlags() {
    }

    public VkMemoryAllocateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryAllocateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkMemoryAllocateFlags(int value) {
        setValue(value);
    }
}
