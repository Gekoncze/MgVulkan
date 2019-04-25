package cz.mg.vulkan;

public class VkCullModeFlags extends VkFlags {
    public VkCullModeFlags() {
    }

    protected VkCullModeFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkCullModeFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCullModeFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkCullModeFlags(int value) {
        setValue(value);
    }
}
