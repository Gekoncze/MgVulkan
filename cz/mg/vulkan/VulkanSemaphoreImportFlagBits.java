package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSemaphoreImportFlagBits extends VulkanFlagBits {
    public static final int TEMPORARY = VkSemaphoreImportFlagBits.VK_SEMAPHORE_IMPORT_TEMPORARY_BIT;
    public static final int TEMPORARY_KHR = VkSemaphoreImportFlagBits.VK_SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR;

    public VulkanSemaphoreImportFlagBits(){
        super(new VkSemaphoreImportFlagBits());
    }

    public VulkanSemaphoreImportFlagBits(VkSemaphoreImportFlagBits vk){
        super(vk);
    }

    @Override
    public VkSemaphoreImportFlagBits getVk(){
        return (VkSemaphoreImportFlagBits) super.getVk();
    }

    public VulkanSemaphoreImportFlagBits(int value){
        super(new VkSemaphoreImportFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == TEMPORARY) s += "TEMPORARY";
        if(getValue() == TEMPORARY_KHR) s += "TEMPORARY_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
