package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanExternalFenceFeatureFlagBits extends VulkanFlagBits {
    public static final int EXPORTABLE = VkExternalFenceFeatureFlagBits.VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT;
    public static final int IMPORTABLE = VkExternalFenceFeatureFlagBits.VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT;
    public static final int EXPORTABLE_KHR = VkExternalFenceFeatureFlagBits.VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR;
    public static final int IMPORTABLE_KHR = VkExternalFenceFeatureFlagBits.VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR;

    public VulkanExternalFenceFeatureFlagBits(){
        super(new VkExternalFenceFeatureFlagBits());
    }

    public VulkanExternalFenceFeatureFlagBits(VkExternalFenceFeatureFlagBits vk){
        super(vk);
    }

    @Override
    public VkExternalFenceFeatureFlagBits getVk(){
        return (VkExternalFenceFeatureFlagBits) super.getVk();
    }

    public VulkanExternalFenceFeatureFlagBits(int value){
        super(new VkExternalFenceFeatureFlagBits(value));
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
