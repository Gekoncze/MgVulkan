package cz.mg.vulkan;

public class VkMemoryPropertyFlags extends VkFlags {
    public VkMemoryPropertyFlags() {
    }

    protected VkMemoryPropertyFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkMemoryPropertyFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkMemoryPropertyFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkMemoryPropertyFlags(int value) {
        setValue(value);
    }
}
