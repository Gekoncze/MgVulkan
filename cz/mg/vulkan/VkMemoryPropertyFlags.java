package cz.mg.vulkan;

public class VkMemoryPropertyFlags extends VkFlags {
    public VkMemoryPropertyFlags() {
    }

    public VkMemoryPropertyFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryPropertyFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkMemoryPropertyFlags(int value) {
        setValue(value);
    }
}
