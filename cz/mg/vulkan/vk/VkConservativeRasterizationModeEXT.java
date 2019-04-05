package cz.mg.vulkan.vk;

public class VkConservativeRasterizationModeEXT extends VkEnum {
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT = 0;
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT = 1;
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT = 2;

    public VkConservativeRasterizationModeEXT() {
    }

    public VkConservativeRasterizationModeEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkConservativeRasterizationModeEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkConservativeRasterizationModeEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT) return "VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT";
        if(getValue() == VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT) return "VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT";
        if(getValue() == VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT) return "VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT";
        return "UNKNOWN";
    }
}
