package cz.mg.vulkan;

public class VkEventCreateFlags extends VkFlags {
    public VkEventCreateFlags() {
    }

    protected VkEventCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkEventCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkEventCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkEventCreateFlags(int value) {
        setValue(value);
    }
}
