package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkImageType;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanImageType {
    public static final int D1 = VkImageType.VK_IMAGE_TYPE_1D;
    public static final int D2 = VkImageType.VK_IMAGE_TYPE_2D;
    public static final int D3 = VkImageType.VK_IMAGE_TYPE_3D;

    public final VkImageType enums;

    public VulkanImageType() {
        this(0);
    }

    public VulkanImageType(int value) {
        this(new VkImageType(value));
    }

    public VulkanImageType(VkImageType enums) {
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
        return ToString.constantToString(enums.value, VkImageType.class);
    }
}
