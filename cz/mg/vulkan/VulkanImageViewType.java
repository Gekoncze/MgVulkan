package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanImageViewType extends VulkanEnum {
    public static final int D1 = VkImageViewType.VK_IMAGE_VIEW_TYPE_1D;
    public static final int D2 = VkImageViewType.VK_IMAGE_VIEW_TYPE_2D;
    public static final int D3 = VkImageViewType.VK_IMAGE_VIEW_TYPE_3D;
    public static final int CUBE = VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE;
    public static final int D1_ARRAY = VkImageViewType.VK_IMAGE_VIEW_TYPE_1D_ARRAY;
    public static final int D2_ARRAY = VkImageViewType.VK_IMAGE_VIEW_TYPE_2D_ARRAY;
    public static final int CUBE_ARRAY = VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE_ARRAY;

    public VulkanImageViewType(){
        super(new VkImageViewType());
    }

    public VulkanImageViewType(VkImageViewType vk){
        super(vk);
    }

    @Override
    public VkImageViewType getVk(){
        return (VkImageViewType) super.getVk();
    }

    public VulkanImageViewType(int value){
        super(new VkImageViewType(value));
    }

    @Override
    public String toString() {
        if(getValue() == D1) return "D1";
        if(getValue() == D2) return "D2";
        if(getValue() == D3) return "D3";
        if(getValue() == CUBE) return "CUBE";
        if(getValue() == D1_ARRAY) return "D1_ARRAY";
        if(getValue() == D2_ARRAY) return "D2_ARRAY";
        if(getValue() == CUBE_ARRAY) return "CUBE_ARRAY";
        return "UNKNOWN";
    }
}
