package cz.mg.vulkan.vk;

public class VkImageType extends VkEnum {
    public static final int VK_IMAGE_TYPE_1D = 0;
    public static final int VK_IMAGE_TYPE_2D = 1;
    public static final int VK_IMAGE_TYPE_3D = 2;

    public VkImageType() {
    }

    public VkImageType(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageType(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_IMAGE_TYPE_1D) return "VK_IMAGE_TYPE_1D";
        if(getValue() == VK_IMAGE_TYPE_2D) return "VK_IMAGE_TYPE_2D";
        if(getValue() == VK_IMAGE_TYPE_3D) return "VK_IMAGE_TYPE_3D";
        return "UNKNOWN";
    }
}
