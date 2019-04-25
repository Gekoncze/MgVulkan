package cz.mg.vulkan;

public class VkQueryControlFlags extends VkFlags {
    public VkQueryControlFlags() {
    }

    protected VkQueryControlFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkQueryControlFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkQueryControlFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkQueryControlFlags(int value) {
        setValue(value);
    }
}
