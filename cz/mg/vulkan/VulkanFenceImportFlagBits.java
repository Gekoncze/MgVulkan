package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFenceImportFlagBits.html">khronos documentation</a>
 **/
public class VulkanFenceImportFlagBits extends VulkanFlagBits {
    public static final int TEMPORARY = VkFenceImportFlagBits.VK_FENCE_IMPORT_TEMPORARY_BIT;
    public static final int TEMPORARY_KHR = VkFenceImportFlagBits.VK_FENCE_IMPORT_TEMPORARY_BIT_KHR;

    public VulkanFenceImportFlagBits(){
        super(new VkFenceImportFlagBits());
    }

    public VulkanFenceImportFlagBits(VkFenceImportFlagBits vk){
        super(vk);
    }

    @Override
    public VkFenceImportFlagBits getVk(){
        return (VkFenceImportFlagBits) super.getVk();
    }

    public VulkanFenceImportFlagBits(int value){
        super(new VkFenceImportFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == TEMPORARY) s += "TEMPORARY";
        if(getValue() == TEMPORARY_KHR) s += "TEMPORARY_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
