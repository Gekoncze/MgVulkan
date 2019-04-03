package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkValidationCacheHeaderVersionEXT.html">khronos documentation</a>
 **/
public class VulkanValidationCacheHeaderVersionEXT extends VulkanEnum {
    public static final int VALIDATION_CACHE_HEADER_VERSION_ONE_EXT = VkValidationCacheHeaderVersionEXT.VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT;

    public VulkanValidationCacheHeaderVersionEXT(){
        super(new VkValidationCacheHeaderVersionEXT());
    }

    public VulkanValidationCacheHeaderVersionEXT(VkValidationCacheHeaderVersionEXT vk){
        super(vk);
    }

    @Override
    public VkValidationCacheHeaderVersionEXT getVk(){
        return (VkValidationCacheHeaderVersionEXT) super.getVk();
    }

    public VulkanValidationCacheHeaderVersionEXT(int value){
        super(new VkValidationCacheHeaderVersionEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == VALIDATION_CACHE_HEADER_VERSION_ONE_EXT) return "VALIDATION_CACHE_HEADER_VERSION_ONE_EXT";
        return "UNKNOWN";
    }
}
