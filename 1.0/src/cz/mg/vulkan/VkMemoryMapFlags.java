package cz.mg.vulkan;

public class VkMemoryMapFlags extends VkFlags {
    public VkMemoryMapFlags() {
    }

    protected VkMemoryMapFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkMemoryMapFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkMemoryMapFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkMemoryMapFlags(int value) {
        setValue(value);
    }
}
