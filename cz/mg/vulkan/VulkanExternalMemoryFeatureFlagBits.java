package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryFeatureFlagBits.html">khronos documentation</a>
 **/
public class VulkanExternalMemoryFeatureFlagBits extends VulkanFlagBits {
    public static final int DEDICATED_ONLY = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT;
    public static final int EXPORTABLE = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT;
    public static final int IMPORTABLE = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT;
    public static final int DEDICATED_ONLY_KHR = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHR;
    public static final int EXPORTABLE_KHR = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHR;
    public static final int IMPORTABLE_KHR = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHR;

    public VulkanExternalMemoryFeatureFlagBits(){
        super(new VkExternalMemoryFeatureFlagBits());
    }

    public VulkanExternalMemoryFeatureFlagBits(VkExternalMemoryFeatureFlagBits vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryFeatureFlagBits getVk(){
        return (VkExternalMemoryFeatureFlagBits) super.getVk();
    }

    public VulkanExternalMemoryFeatureFlagBits(int value){
        super(new VkExternalMemoryFeatureFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DEDICATED_ONLY) s += "DEDICATED_ONLY";
        if(getValue() == EXPORTABLE) s += "EXPORTABLE";
        if(getValue() == IMPORTABLE) s += "IMPORTABLE";
        if(getValue() == DEDICATED_ONLY_KHR) s += "DEDICATED_ONLY_KHR";
        if(getValue() == EXPORTABLE_KHR) s += "EXPORTABLE_KHR";
        if(getValue() == IMPORTABLE_KHR) s += "IMPORTABLE_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
