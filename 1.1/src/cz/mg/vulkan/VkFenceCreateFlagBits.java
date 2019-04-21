package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkFenceCreateFlagBits extends VkFlagBits {
    public static final int VK_FENCE_CREATE_SIGNALED_BIT = 0x00000001;

    public VkFenceCreateFlagBits() {
    }

    public VkFenceCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFenceCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkFenceCreateFlagBits(int value) {
        setValue(value);
    }

    public VkFenceCreateFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_FENCE_CREATE_SIGNALED_BIT) != 0) s.addLast("VK_FENCE_CREATE_SIGNALED_BIT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
