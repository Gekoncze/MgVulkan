package cz.mg.vulkan;

public class VkBufferCreateFlags extends VkFlags {
    public VkBufferCreateFlags() {
    }

    protected VkBufferCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkBufferCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBufferCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkBufferCreateFlags(int value) {
        setValue(value);
    }
}
