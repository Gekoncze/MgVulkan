package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDebugReportFlagBitsEXT extends VulkanFlagBits {
    public static final int INFORMATION_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_INFORMATION_BIT_EXT;
    public static final int WARNING_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_WARNING_BIT_EXT;
    public static final int PERFORMANCE_WARNING_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT;
    public static final int ERROR_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_ERROR_BIT_EXT;
    public static final int DEBUG_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_DEBUG_BIT_EXT;

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
        if(getValue() == INFORMATION_EXT) s += "INFORMATION_EXT";
        if(getValue() == WARNING_EXT) s += "WARNING_EXT";
        if(getValue() == PERFORMANCE_WARNING_EXT) s += "PERFORMANCE_WARNING_EXT";
        if(getValue() == ERROR_EXT) s += "ERROR_EXT";
        if(getValue() == DEBUG_EXT) s += "DEBUG_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
