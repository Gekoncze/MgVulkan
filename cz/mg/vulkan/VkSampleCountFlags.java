package cz.mg.vulkan;

public class VkSampleCountFlags extends VkFlags {
    public VkSampleCountFlags() {
    }

    public VkSampleCountFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSampleCountFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSampleCountFlags(int value) {
        setValue(value);
    }
}
