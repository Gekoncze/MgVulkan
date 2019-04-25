package cz.mg.vulkan;

public class VkImageCreateFlags extends VkFlags {
    public VkImageCreateFlags() {
    }

    protected VkImageCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkImageCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkImageCreateFlags(int value) {
        setValue(value);
    }
}
