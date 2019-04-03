package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugReportFlagsEXT.html">khronos documentation</a>
 **/
public class VulkanDebugReportFlagsEXT extends VulkanFlags {
    public VulkanDebugReportFlagsEXT(){
        super(new VkDebugReportFlagsEXT());
    }

    public VulkanDebugReportFlagsEXT(VkDebugReportFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkDebugReportFlagsEXT getVk(){
        return (VkDebugReportFlagsEXT) super.getVk();
    }

    public VulkanDebugReportFlagsEXT(int value){
        super(new VkDebugReportFlagsEXT(value));
    }
}
