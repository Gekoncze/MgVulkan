package cz.mg.vulkan.vk;

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

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_STENCIL_FACE_FRONT_BIT) s += "VK_STENCIL_FACE_FRONT_BIT";
        if(getValue() == VK_STENCIL_FACE_BACK_BIT) s += "VK_STENCIL_FACE_BACK_BIT";
        if(getValue() == VK_STENCIL_FRONT_AND_BACK) s += "VK_STENCIL_FRONT_AND_BACK";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
