package cz.mg.vulkan.vk;

public class VkImageViewCreateFlags extends VkFlags {
    public VkImageViewCreateFlags() {
    }

    public VkImageViewCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageViewCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageViewCreateFlags(int value) {
        setValue(value);
    }
}
