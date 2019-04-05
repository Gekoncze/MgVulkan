package cz.mg.vulkan.vk;

public class VkEventCreateFlags extends VkFlags {
    public VkEventCreateFlags() {
    }

    public VkEventCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkEventCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkEventCreateFlags(int value) {
        setValue(value);
    }
}
