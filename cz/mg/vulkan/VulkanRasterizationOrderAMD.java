package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanRasterizationOrderAMD extends VulkanEnum {
    public static final int RASTERIZATION_ORDER_STRICT_AMD = VkRasterizationOrderAMD.VK_RASTERIZATION_ORDER_STRICT_AMD;
    public static final int RASTERIZATION_ORDER_RELAXED_AMD = VkRasterizationOrderAMD.VK_RASTERIZATION_ORDER_RELAXED_AMD;

    public VulkanRasterizationOrderAMD(){
        super(new VkRasterizationOrderAMD());
    }

    public VulkanRasterizationOrderAMD(VkRasterizationOrderAMD vk){
        super(vk);
    }

    @Override
    public VkRasterizationOrderAMD getVk(){
        return (VkRasterizationOrderAMD) super.getVk();
    }

    public VulkanRasterizationOrderAMD(int value){
        super(new VkRasterizationOrderAMD(value));
    }

    @Override
    public String toString() {
        if(getValue() == RASTERIZATION_ORDER_STRICT_AMD) return "RASTERIZATION_ORDER_STRICT_AMD";
        if(getValue() == RASTERIZATION_ORDER_RELAXED_AMD) return "RASTERIZATION_ORDER_RELAXED_AMD";
        return "UNKNOWN";
    }
}
