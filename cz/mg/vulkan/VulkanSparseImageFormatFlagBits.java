package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseImageFormatFlagBits.html">khronos documentation</a>
 **/
public class VulkanSparseImageFormatFlagBits extends VulkanFlagBits {
    public static final int SINGLE_MIPTAIL = VkSparseImageFormatFlagBits.VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT;
    public static final int ALIGNED_MIP_SIZE = VkSparseImageFormatFlagBits.VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT;
    public static final int NONSTANDARD_BLOCK_SIZE = VkSparseImageFormatFlagBits.VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT;

    public VulkanSparseImageFormatFlagBits(){
        super(new VkSparseImageFormatFlagBits());
    }

    public VulkanSparseImageFormatFlagBits(VkSparseImageFormatFlagBits vk){
        super(vk);
    }

    @Override
    public VkSparseImageFormatFlagBits getVk(){
        return (VkSparseImageFormatFlagBits) super.getVk();
    }

    public VulkanSparseImageFormatFlagBits(int value){
        super(new VkSparseImageFormatFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == SINGLE_MIPTAIL) s += "SINGLE_MIPTAIL";
        if(getValue() == ALIGNED_MIP_SIZE) s += "ALIGNED_MIP_SIZE";
        if(getValue() == NONSTANDARD_BLOCK_SIZE) s += "NONSTANDARD_BLOCK_SIZE";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
