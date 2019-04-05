package cz.mg.vulkan.vk;

public class VkImageViewType extends VkEnum {
    public static final int VK_IMAGE_VIEW_TYPE_1D = 0;
    public static final int VK_IMAGE_VIEW_TYPE_2D = 1;
    public static final int VK_IMAGE_VIEW_TYPE_3D = 2;
    public static final int VK_IMAGE_VIEW_TYPE_CUBE = 3;
    public static final int VK_IMAGE_VIEW_TYPE_1D_ARRAY = 4;
    public static final int VK_IMAGE_VIEW_TYPE_2D_ARRAY = 5;
    public static final int VK_IMAGE_VIEW_TYPE_CUBE_ARRAY = 6;

    public VkImageViewType() {
    }

    public VkImageViewType(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageViewType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageViewType(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_IMAGE_VIEW_TYPE_1D) return "VK_IMAGE_VIEW_TYPE_1D";
        if(getValue() == VK_IMAGE_VIEW_TYPE_2D) return "VK_IMAGE_VIEW_TYPE_2D";
        if(getValue() == VK_IMAGE_VIEW_TYPE_3D) return "VK_IMAGE_VIEW_TYPE_3D";
        if(getValue() == VK_IMAGE_VIEW_TYPE_CUBE) return "VK_IMAGE_VIEW_TYPE_CUBE";
        if(getValue() == VK_IMAGE_VIEW_TYPE_1D_ARRAY) return "VK_IMAGE_VIEW_TYPE_1D_ARRAY";
        if(getValue() == VK_IMAGE_VIEW_TYPE_2D_ARRAY) return "VK_IMAGE_VIEW_TYPE_2D_ARRAY";
        if(getValue() == VK_IMAGE_VIEW_TYPE_CUBE_ARRAY) return "VK_IMAGE_VIEW_TYPE_CUBE_ARRAY";
        return "UNKNOWN";
    }
}
