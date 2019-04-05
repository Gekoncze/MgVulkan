package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanExternalSemaphoreFeatureFlagBits extends VulkanFlagBits {
    public static final int EXPORTABLE = VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT;
    public static final int IMPORTABLE = VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT;
    public static final int EXPORTABLE_KHR = VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR;
    public static final int IMPORTABLE_KHR = VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR;

    public VulkanExternalSemaphoreFeatureFlagBits(){
        super(new VkExternalSemaphoreFeatureFlagBits());
    }

    public VulkanExternalSemaphoreFeatureFlagBits(VkExternalSemaphoreFeatureFlagBits vk){
        super(vk);
    }

    @Override
    public VkExternalSemaphoreFeatureFlagBits getVk(){
        return (VkExternalSemaphoreFeatureFlagBits) super.getVk();
    }

    public VulkanExternalSemaphoreFeatureFlagBits(int value){
        super(new VkExternalSemaphoreFeatureFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == EXPORTABLE) s += "EXPORTABLE";
        if(getValue() == IMPORTABLE) s += "IMPORTABLE";
        if(getValue() == EXPORTABLE_KHR) s += "EXPORTABLE_KHR";
        if(getValue() == IMPORTABLE_KHR) s += "IMPORTABLE_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
