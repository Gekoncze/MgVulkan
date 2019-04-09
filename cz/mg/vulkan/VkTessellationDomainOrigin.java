package cz.mg.vulkan;

public class VkTessellationDomainOrigin extends VkEnum {
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT = 0;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT = 1;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR = VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR = VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT;

    public VkTessellationDomainOrigin() {
    }

    public VkTessellationDomainOrigin(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkTessellationDomainOrigin(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkTessellationDomainOrigin(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT) return "VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT";
        if(getValue() == VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT) return "VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT";
        if(getValue() == VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR) return "VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR";
        if(getValue() == VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR) return "VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR";
        return "UNKNOWN";
    }
}
