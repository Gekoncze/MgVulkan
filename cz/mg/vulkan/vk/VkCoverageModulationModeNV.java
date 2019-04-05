package cz.mg.vulkan.vk;

public class VkCoverageModulationModeNV extends VkEnum {
    public static final int VK_COVERAGE_MODULATION_MODE_NONE_NV = 0;
    public static final int VK_COVERAGE_MODULATION_MODE_RGB_NV = 1;
    public static final int VK_COVERAGE_MODULATION_MODE_ALPHA_NV = 2;
    public static final int VK_COVERAGE_MODULATION_MODE_RGBA_NV = 3;

    public VkCoverageModulationModeNV() {
    }

    public VkCoverageModulationModeNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCoverageModulationModeNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCoverageModulationModeNV(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_COVERAGE_MODULATION_MODE_NONE_NV) return "VK_COVERAGE_MODULATION_MODE_NONE_NV";
        if(getValue() == VK_COVERAGE_MODULATION_MODE_RGB_NV) return "VK_COVERAGE_MODULATION_MODE_RGB_NV";
        if(getValue() == VK_COVERAGE_MODULATION_MODE_ALPHA_NV) return "VK_COVERAGE_MODULATION_MODE_ALPHA_NV";
        if(getValue() == VK_COVERAGE_MODULATION_MODE_RGBA_NV) return "VK_COVERAGE_MODULATION_MODE_RGBA_NV";
        return "UNKNOWN";
    }
}
