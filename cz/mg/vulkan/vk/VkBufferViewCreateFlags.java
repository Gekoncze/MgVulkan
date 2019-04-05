package cz.mg.vulkan.vk;

public class VkBufferViewCreateFlags extends VkFlags {
    public VkBufferViewCreateFlags() {
    }

    public VkBufferViewCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferViewCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkBufferViewCreateFlags(int value) {
        setValue(value);
    }
}
