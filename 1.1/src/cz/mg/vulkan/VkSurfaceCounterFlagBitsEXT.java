package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkSurfaceCounterFlagBitsEXT extends VkFlagBits {
    public static final int VK_SURFACE_COUNTER_VBLANK_EXT = 0x00000001;

    public VkSurfaceCounterFlagBitsEXT() {
    }

    protected VkSurfaceCounterFlagBitsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSurfaceCounterFlagBitsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSurfaceCounterFlagBitsEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkSurfaceCounterFlagBitsEXT(int value) {
        setValue(value);
    }

    public VkSurfaceCounterFlagBitsEXT(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_SURFACE_COUNTER_VBLANK_EXT) != 0) s.addLast("VK_SURFACE_COUNTER_VBLANK_EXT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
