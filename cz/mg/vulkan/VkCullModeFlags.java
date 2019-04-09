package cz.mg.vulkan;

public class VkCullModeFlags extends VkFlags {
    public VkCullModeFlags() {
    }

    public VkCullModeFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCullModeFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCullModeFlags(int value) {
        setValue(value);
    }
}
