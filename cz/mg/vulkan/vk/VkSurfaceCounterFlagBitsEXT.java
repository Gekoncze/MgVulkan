package cz.mg.vulkan.vk;

public class VkSurfaceCounterFlagBitsEXT extends VkFlagBits {
    public static final int VK_SURFACE_COUNTER_VBLANK_EXT = 0x00000001;

    public VkSurfaceCounterFlagBitsEXT() {
    }

    public VkSurfaceCounterFlagBitsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSurfaceCounterFlagBitsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSurfaceCounterFlagBitsEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_SURFACE_COUNTER_VBLANK_EXT) s += "VK_SURFACE_COUNTER_VBLANK_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
