package cz.mg.vulkan.vk;

public class VkRasterizationOrderAMD extends VkEnum {
    public static final int VK_RASTERIZATION_ORDER_STRICT_AMD = 0;
    public static final int VK_RASTERIZATION_ORDER_RELAXED_AMD = 1;

    public VkRasterizationOrderAMD() {
    }

    public VkRasterizationOrderAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRasterizationOrderAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkRasterizationOrderAMD(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_RASTERIZATION_ORDER_STRICT_AMD) return "VK_RASTERIZATION_ORDER_STRICT_AMD";
        if(getValue() == VK_RASTERIZATION_ORDER_RELAXED_AMD) return "VK_RASTERIZATION_ORDER_RELAXED_AMD";
        return "UNKNOWN";
    }
}
