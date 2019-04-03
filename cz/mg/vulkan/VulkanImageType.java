package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageType.html">khronos documentation</a>
 **/
public class VulkanImageType extends VulkanEnum {
    public static final int D1 = VkImageType.VK_IMAGE_TYPE_1D;
    public static final int D2 = VkImageType.VK_IMAGE_TYPE_2D;
    public static final int D3 = VkImageType.VK_IMAGE_TYPE_3D;

    public VulkanImageType(){
        super(new VkImageType());
    }

    public VulkanImageType(VkImageType vk){
        super(vk);
    }

    @Override
    public VkImageType getVk(){
        return (VkImageType) super.getVk();
    }

    public VulkanImageType(int value){
        super(new VkImageType(value));
    }

    @Override
    public String toString() {
        if(getValue() == D1) return "D1";
        if(getValue() == D2) return "D2";
        if(getValue() == D3) return "D3";
        return "UNKNOWN";
    }
}
