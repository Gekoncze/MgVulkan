package cz.mg.vulkan;

public class VkBufferUsageFlags extends VkFlags {
    public VkBufferUsageFlags() {
    }

    protected VkBufferUsageFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkBufferUsageFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBufferUsageFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkBufferUsageFlags(int value) {
        setValue(value);
    }
}
