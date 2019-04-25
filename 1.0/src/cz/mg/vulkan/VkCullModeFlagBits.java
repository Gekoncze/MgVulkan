package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkCullModeFlagBits extends VkFlagBits {
    public static final int VK_CULL_MODE_NONE = 0;
    public static final int VK_CULL_MODE_FRONT_BIT = 0x00000001;
    public static final int VK_CULL_MODE_BACK_BIT = 0x00000002;
    public static final int VK_CULL_MODE_FRONT_AND_BACK = 0x00000003;

    public VkCullModeFlagBits() {
    }

    protected VkCullModeFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkCullModeFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCullModeFlagBits(VkPointer pointer) {
        super(pointer);
    }



    public VkCullModeFlagBits(int value) {
        setValue(value);
    }

    public VkCullModeFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_CULL_MODE_NONE) != 0) s.addLast("VK_CULL_MODE_NONE");
        if((getValue() & VK_CULL_MODE_FRONT_BIT) != 0) s.addLast("VK_CULL_MODE_FRONT_BIT");
        if((getValue() & VK_CULL_MODE_BACK_BIT) != 0) s.addLast("VK_CULL_MODE_BACK_BIT");
        if((getValue() & VK_CULL_MODE_FRONT_AND_BACK) != 0) s.addLast("VK_CULL_MODE_FRONT_AND_BACK");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
