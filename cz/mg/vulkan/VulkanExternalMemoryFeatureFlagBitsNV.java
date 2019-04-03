package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryFeatureFlagBitsNV.html">khronos documentation</a>
 **/
public class VulkanExternalMemoryFeatureFlagBitsNV extends VulkanFlagBits {
    public static final int EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_NV = VkExternalMemoryFeatureFlagBitsNV.VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV;
    public static final int EXTERNAL_MEMORY_FEATURE_EXPORTABLE_NV = VkExternalMemoryFeatureFlagBitsNV.VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV;
    public static final int EXTERNAL_MEMORY_FEATURE_IMPORTABLE_NV = VkExternalMemoryFeatureFlagBitsNV.VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV;

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
        if(getValue() == EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_NV) s += "EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_NV";
        if(getValue() == EXTERNAL_MEMORY_FEATURE_EXPORTABLE_NV) s += "EXTERNAL_MEMORY_FEATURE_EXPORTABLE_NV";
        if(getValue() == EXTERNAL_MEMORY_FEATURE_IMPORTABLE_NV) s += "EXTERNAL_MEMORY_FEATURE_IMPORTABLE_NV";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
