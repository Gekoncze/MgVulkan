package cz.mg.vulkan;

public class VkImageViewCreateFlags extends VkFlags {
    public VkImageViewCreateFlags() {
    }

    protected VkImageViewCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkImageViewCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageViewCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkImageViewCreateFlags(int value) {
        setValue(value);
    }
}
