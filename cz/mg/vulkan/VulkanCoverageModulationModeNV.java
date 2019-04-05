package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanCoverageModulationModeNV extends VulkanEnum {
    public static final int COVERAGE_MODULATION_MODE_NONE_NV = VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_NONE_NV;
    public static final int COVERAGE_MODULATION_MODE_RGB_NV = VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_RGB_NV;
    public static final int COVERAGE_MODULATION_MODE_ALPHA_NV = VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_ALPHA_NV;
    public static final int COVERAGE_MODULATION_MODE_RGBA_NV = VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_RGBA_NV;

    public VulkanCoverageModulationModeNV(){
        super(new VkCoverageModulationModeNV());
    }

    public VulkanCoverageModulationModeNV(VkCoverageModulationModeNV vk){
        super(vk);
    }

    @Override
    public VkCoverageModulationModeNV getVk(){
        return (VkCoverageModulationModeNV) super.getVk();
    }

    public VulkanCoverageModulationModeNV(int value){
        super(new VkCoverageModulationModeNV(value));
    }

    @Override
    public String toString() {
        if(getValue() == COVERAGE_MODULATION_MODE_NONE_NV) return "COVERAGE_MODULATION_MODE_NONE_NV";
        if(getValue() == COVERAGE_MODULATION_MODE_RGB_NV) return "COVERAGE_MODULATION_MODE_RGB_NV";
        if(getValue() == COVERAGE_MODULATION_MODE_ALPHA_NV) return "COVERAGE_MODULATION_MODE_ALPHA_NV";
        if(getValue() == COVERAGE_MODULATION_MODE_RGBA_NV) return "COVERAGE_MODULATION_MODE_RGBA_NV";
        return "UNKNOWN";
    }
}
