package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanImageTiling extends VulkanEnum {
    public static final int OPTIMAL = VkImageTiling.VK_IMAGE_TILING_OPTIMAL;
    public static final int LINEAR = VkImageTiling.VK_IMAGE_TILING_LINEAR;

    public VulkanImageTiling(){
        super(new VkImageTiling());
    }

    public VulkanImageTiling(VkImageTiling vk){
        super(vk);
    }

    @Override
    public VkImageTiling getVk(){
        return (VkImageTiling) super.getVk();
    }

    public VulkanImageTiling(int value){
        super(new VkImageTiling(value));
    }

    @Override
    public String toString() {
        if(getValue() == OPTIMAL) return "OPTIMAL";
        if(getValue() == LINEAR) return "LINEAR";
        return "UNKNOWN";
    }
}
