package cz.mg.vulkan.vk;

public class VkBufferUsageFlags extends VkFlags {
    public VkBufferUsageFlags() {
    }

    public VkBufferUsageFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferUsageFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkBufferUsageFlags(int value) {
        setValue(value);
    }
}
