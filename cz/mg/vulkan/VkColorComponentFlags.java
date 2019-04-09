package cz.mg.vulkan;

public class VkColorComponentFlags extends VkFlags {
    public VkColorComponentFlags() {
    }

    public VkColorComponentFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkColorComponentFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkColorComponentFlags(int value) {
        setValue(value);
    }
}
