package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanTessellationDomainOrigin extends VulkanEnum {
    public static final int UPPER_LEFT = VkTessellationDomainOrigin.VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT;
    public static final int LOWER_LEFT = VkTessellationDomainOrigin.VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT;
    public static final int UPPER_LEFT_KHR = VkTessellationDomainOrigin.VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR;
    public static final int LOWER_LEFT_KHR = VkTessellationDomainOrigin.VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR;

    public VulkanTessellationDomainOrigin(){
        super(new VkTessellationDomainOrigin());
    }

    public VulkanTessellationDomainOrigin(VkTessellationDomainOrigin vk){
        super(vk);
    }

    @Override
    public VkTessellationDomainOrigin getVk(){
        return (VkTessellationDomainOrigin) super.getVk();
    }

    public VulkanTessellationDomainOrigin(int value){
        super(new VkTessellationDomainOrigin(value));
    }

    @Override
    public String toString() {
        if(getValue() == UPPER_LEFT) return "UPPER_LEFT";
        if(getValue() == LOWER_LEFT) return "LOWER_LEFT";
        if(getValue() == UPPER_LEFT_KHR) return "UPPER_LEFT_KHR";
        if(getValue() == LOWER_LEFT_KHR) return "LOWER_LEFT_KHR";
        return "UNKNOWN";
    }
}
