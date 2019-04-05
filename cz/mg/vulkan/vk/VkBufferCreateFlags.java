package cz.mg.vulkan.vk;

public class VkBufferCreateFlags extends VkFlags {
    public VkBufferCreateFlags() {
    }

    public VkBufferCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkBufferCreateFlags(int value) {
        setValue(value);
    }
}
