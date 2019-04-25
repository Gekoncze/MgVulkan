package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkCompositeAlphaFlagBitsKHR extends VkFlagBits {
    public static final int VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR = 0x00000001;
    public static final int VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR = 0x00000002;
    public static final int VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR = 0x00000004;
    public static final int VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR = 0x00000008;

    public VkCompositeAlphaFlagBitsKHR() {
    }

    protected VkCompositeAlphaFlagBitsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkCompositeAlphaFlagBitsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCompositeAlphaFlagBitsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkCompositeAlphaFlagBitsKHR(int value) {
        setValue(value);
    }

    public VkCompositeAlphaFlagBitsKHR(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR) != 0) s.addLast("VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR");
        if((getValue() & VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR) != 0) s.addLast("VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR");
        if((getValue() & VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR) != 0) s.addLast("VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR");
        if((getValue() & VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR) != 0) s.addLast("VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
