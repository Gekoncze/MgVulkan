package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkValidationCacheEXT.html">khronos documentation</a>
 **/
public class VulkanValidationCacheEXT extends VulkanHandle {
    public VulkanValidationCacheEXT(){
        super(new VkValidationCacheEXT());
    }

    public VulkanValidationCacheEXT(VkValidationCacheEXT vk){
        super(vk);
    }

    @Override
    public VkValidationCacheEXT getVk(){
        return (VkValidationCacheEXT) super.getVk();
    }

    public VulkanValidationCacheEXT(int value){
        super(new VkValidationCacheEXT(value));
    }
}
