package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugReportFlagBitsEXT.html">khronos documentation</a>
 **/
public class VulkanDebugReportFlagBitsEXT extends VulkanFlagBits {
    public static final int DEBUG_REPORT_INFORMATION_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_INFORMATION_BIT_EXT;
    public static final int DEBUG_REPORT_WARNING_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_WARNING_BIT_EXT;
    public static final int DEBUG_REPORT_PERFORMANCE_WARNING_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT;
    public static final int DEBUG_REPORT_ERROR_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_ERROR_BIT_EXT;
    public static final int DEBUG_REPORT_DEBUG_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_DEBUG_BIT_EXT;

    public VulkanDebugReportFlagBitsEXT(){
        super(new VkDebugReportFlagBitsEXT());
    }

    public VulkanDebugReportFlagBitsEXT(VkDebugReportFlagBitsEXT vk){
        super(vk);
    }

    @Override
    public VkDebugReportFlagBitsEXT getVk(){
        return (VkDebugReportFlagBitsEXT) super.getVk();
    }

    public VulkanDebugReportFlagBitsEXT(int value){
        super(new VkDebugReportFlagBitsEXT(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DEBUG_REPORT_INFORMATION_EXT) s += "DEBUG_REPORT_INFORMATION_EXT";
        if(getValue() == DEBUG_REPORT_WARNING_EXT) s += "DEBUG_REPORT_WARNING_EXT";
        if(getValue() == DEBUG_REPORT_PERFORMANCE_WARNING_EXT) s += "DEBUG_REPORT_PERFORMANCE_WARNING_EXT";
        if(getValue() == DEBUG_REPORT_ERROR_EXT) s += "DEBUG_REPORT_ERROR_EXT";
        if(getValue() == DEBUG_REPORT_DEBUG_EXT) s += "DEBUG_REPORT_DEBUG_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
