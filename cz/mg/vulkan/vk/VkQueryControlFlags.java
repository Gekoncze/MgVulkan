package cz.mg.vulkan.vk;

public class VkQueryControlFlags extends VkFlags {
    public VkQueryControlFlags() {
    }

    public VkQueryControlFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueryControlFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkQueryControlFlags(int value) {
        setValue(value);
    }
}
