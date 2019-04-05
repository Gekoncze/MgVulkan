package cz.mg.vulkan.vk;

public class VkCullModeFlagBits extends VkFlagBits {
    public static final int VK_CULL_MODE_NONE = 0;
    public static final int VK_CULL_MODE_FRONT_BIT = 0x00000001;
    public static final int VK_CULL_MODE_BACK_BIT = 0x00000002;
    public static final int VK_CULL_MODE_FRONT_AND_BACK = 0x00000003;

    public VkCullModeFlagBits() {
    }

    public VkCullModeFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCullModeFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCullModeFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_CULL_MODE_NONE) s += "VK_CULL_MODE_NONE";
        if(getValue() == VK_CULL_MODE_FRONT_BIT) s += "VK_CULL_MODE_FRONT_BIT";
        if(getValue() == VK_CULL_MODE_BACK_BIT) s += "VK_CULL_MODE_BACK_BIT";
        if(getValue() == VK_CULL_MODE_FRONT_AND_BACK) s += "VK_CULL_MODE_FRONT_AND_BACK";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
