package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkValidationCheckEXT.html">khronos documentation</a>
 **/
public class VulkanValidationCheckEXT extends VulkanEnum {
    public static final int VALIDATION_CHECK_ALL_EXT = VkValidationCheckEXT.VK_VALIDATION_CHECK_ALL_EXT;
    public static final int VALIDATION_CHECK_SHADERS_EXT = VkValidationCheckEXT.VK_VALIDATION_CHECK_SHADERS_EXT;

    public VulkanValidationCheckEXT(){
        super(new VkValidationCheckEXT());
    }

    public VulkanValidationCheckEXT(VkValidationCheckEXT vk){
        super(vk);
    }

    @Override
    public VkValidationCheckEXT getVk(){
        return (VkValidationCheckEXT) super.getVk();
    }

    public VulkanValidationCheckEXT(int value){
        super(new VkValidationCheckEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == VALIDATION_CHECK_ALL_EXT) return "VALIDATION_CHECK_ALL_EXT";
        if(getValue() == VALIDATION_CHECK_SHADERS_EXT) return "VALIDATION_CHECK_SHADERS_EXT";
        return "UNKNOWN";
    }
}
