package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanConservativeRasterizationModeEXT extends VulkanEnum {
    public static final int CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT = VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT;
    public static final int CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT = VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT;
    public static final int CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT = VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT;

    public VulkanConservativeRasterizationModeEXT(){
        super(new VkConservativeRasterizationModeEXT());
    }

    public VulkanConservativeRasterizationModeEXT(VkConservativeRasterizationModeEXT vk){
        super(vk);
    }

    @Override
    public VkConservativeRasterizationModeEXT getVk(){
        return (VkConservativeRasterizationModeEXT) super.getVk();
    }

    public VulkanConservativeRasterizationModeEXT(int value){
        super(new VkConservativeRasterizationModeEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT) return "CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT";
        if(getValue() == CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT) return "CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT";
        if(getValue() == CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT) return "CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT";
        return "UNKNOWN";
    }
}
