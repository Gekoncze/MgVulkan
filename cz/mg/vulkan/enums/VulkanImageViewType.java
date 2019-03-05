package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkImageViewType;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanImageViewType {
    public static final int D1 = VkImageViewType.VK_IMAGE_VIEW_TYPE_1D;
    public static final int D2 = VkImageViewType.VK_IMAGE_VIEW_TYPE_2D;
    public static final int D3 = VkImageViewType.VK_IMAGE_VIEW_TYPE_3D;
    public static final int CUBE = VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE;
    public static final int D1_ARRAY = VkImageViewType.VK_IMAGE_VIEW_TYPE_1D_ARRAY;
    public static final int D2_ARRAY = VkImageViewType.VK_IMAGE_VIEW_TYPE_2D_ARRAY;
    public static final int CUBE_ARRAY = VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE_ARRAY;

    public final VkImageViewType enums;

    public VulkanImageViewType() {
        this(0);
    }

    public VulkanImageViewType(int value) {
        this(new VkImageViewType(value));
    }

    public VulkanImageViewType(VkImageViewType enums) {
        this.enums = enums;
    }

    public boolean is(int value){
        return this.enums.value == value;
    }

    public void set(int value){
        this.enums.value = value;
    }

    @Override
    public String toString() {
        return ToString.constantToString(enums.value, VkImageViewType.class);
    }
}
