package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkImageTiling;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanImageTiling {
    public static final int OPTIMAL = VkImageTiling.VK_IMAGE_TILING_OPTIMAL;
    public static final int LINEAR = VkImageTiling.VK_IMAGE_TILING_LINEAR;

    public final VkImageTiling enums;

    public VulkanImageTiling() {
        this(0);
    }

    public VulkanImageTiling(int value) {
        this(new VkImageTiling(value));
    }

    public VulkanImageTiling(VkImageTiling enums) {
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
        return ToString.constantToString(enums.value, VkImageTiling.class);
    }
}
