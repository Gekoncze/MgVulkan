package cz.mg.vulkan;

public class VkBufferViewCreateFlags extends VkFlags {
    public VkBufferViewCreateFlags() {
    }

    protected VkBufferViewCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkBufferViewCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBufferViewCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkBufferViewCreateFlags(int value) {
        setValue(value);
    }
}
