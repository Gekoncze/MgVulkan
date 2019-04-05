package cz.mg.vulkan.vk;

public class VkAccessFlags extends VkFlags {
    public VkAccessFlags() {
    }

    public VkAccessFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkAccessFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkAccessFlags(int value) {
        setValue(value);
    }
}
