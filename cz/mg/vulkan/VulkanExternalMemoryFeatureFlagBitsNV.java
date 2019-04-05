package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanExternalMemoryFeatureFlagBitsNV extends VulkanFlagBits {
    public static final int DEDICATED_ONLY_NV = VkExternalMemoryFeatureFlagBitsNV.VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV;
    public static final int EXPORTABLE_NV = VkExternalMemoryFeatureFlagBitsNV.VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV;
    public static final int IMPORTABLE_NV = VkExternalMemoryFeatureFlagBitsNV.VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV;

    public VulkanExternalMemoryFeatureFlagBitsNV(){
        super(new VkExternalMemoryFeatureFlagBitsNV());
    }

    public VulkanExternalMemoryFeatureFlagBitsNV(VkExternalMemoryFeatureFlagBitsNV vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryFeatureFlagBitsNV getVk(){
        return (VkExternalMemoryFeatureFlagBitsNV) super.getVk();
    }

    public VulkanExternalMemoryFeatureFlagBitsNV(int value){
        super(new VkExternalMemoryFeatureFlagBitsNV(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DEDICATED_ONLY_NV) s += "DEDICATED_ONLY_NV";
        if(getValue() == EXPORTABLE_NV) s += "EXPORTABLE_NV";
        if(getValue() == IMPORTABLE_NV) s += "IMPORTABLE_NV";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
