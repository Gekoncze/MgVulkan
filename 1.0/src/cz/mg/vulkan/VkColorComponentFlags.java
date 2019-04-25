package cz.mg.vulkan;

public class VkColorComponentFlags extends VkFlags {
    public VkColorComponentFlags() {
    }

    protected VkColorComponentFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkColorComponentFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkColorComponentFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkColorComponentFlags(int value) {
        setValue(value);
    }
}
