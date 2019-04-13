package cz.mg.vulkan;

public class VkCommandPoolTrimFlags extends VkFlags {
    public VkCommandPoolTrimFlags() {
    }

    public VkCommandPoolTrimFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandPoolTrimFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkCommandPoolTrimFlags(int value) {
        setValue(value);
    }
}
