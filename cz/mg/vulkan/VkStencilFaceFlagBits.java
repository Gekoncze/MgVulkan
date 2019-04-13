package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkStencilFaceFlagBits extends VkFlagBits {
    public static final int VK_STENCIL_FACE_FRONT_BIT = 0x00000001;
    public static final int VK_STENCIL_FACE_BACK_BIT = 0x00000002;
    public static final int VK_STENCIL_FRONT_AND_BACK = 0x00000003;

    public VkStencilFaceFlagBits() {
    }

    public VkStencilFaceFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkStencilFaceFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStencilFaceFlagBits(int value) {
        setValue(value);
    }

    public VkStencilFaceFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_STENCIL_FACE_FRONT_BIT) != 0) s.addLast("VK_STENCIL_FACE_FRONT_BIT");
        if((getValue() & VK_STENCIL_FACE_BACK_BIT) != 0) s.addLast("VK_STENCIL_FACE_BACK_BIT");
        if((getValue() & VK_STENCIL_FRONT_AND_BACK) != 0) s.addLast("VK_STENCIL_FRONT_AND_BACK");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
