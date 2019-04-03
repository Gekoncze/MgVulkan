package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugReportCallbackEXT.html">khronos documentation</a>
 **/
public class VulkanDebugReportCallbackEXT extends VulkanHandle {
    public VulkanDebugReportCallbackEXT(){
        super(new VkDebugReportCallbackEXT());
    }

    public VulkanDebugReportCallbackEXT(VkDebugReportCallbackEXT vk){
        super(vk);
    }

    @Override
    public VkDebugReportCallbackEXT getVk(){
        return (VkDebugReportCallbackEXT) super.getVk();
    }

    public VulkanDebugReportCallbackEXT(int value){
        super(new VkDebugReportCallbackEXT(value));
    }
}
