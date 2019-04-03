package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkValidationCacheCreateFlagsEXT.html">khronos documentation</a>
 **/
public class VulkanValidationCacheCreateFlagsEXT extends VulkanFlags {
    public VulkanValidationCacheCreateFlagsEXT(){
        super(new VkValidationCacheCreateFlagsEXT());
    }

    public VulkanValidationCacheCreateFlagsEXT(VkValidationCacheCreateFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkValidationCacheCreateFlagsEXT getVk(){
        return (VkValidationCacheCreateFlagsEXT) super.getVk();
    }

    public VulkanValidationCacheCreateFlagsEXT(int value){
        super(new VkValidationCacheCreateFlagsEXT(value));
    }
}
