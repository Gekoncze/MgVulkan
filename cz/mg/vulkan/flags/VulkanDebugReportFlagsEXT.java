package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkDebugReportFlagsEXT;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanDebugReportFlagsEXT {
    private final VkDebugReportFlagsEXT flags;

    public VulkanDebugReportFlagsEXT(VkDebugReportFlagsEXT flags) {
        this.flags = flags;
    }

    public boolean isVkDebugReportInformationBitExt(){
        return (flags.value & VkDebugReportFlagsEXT.VK_DEBUG_REPORT_INFORMATION_BIT_EXT) != 0;
    }

    public boolean isVkDebugReportWarningBitExt(){
        return (flags.value & VkDebugReportFlagsEXT.VK_DEBUG_REPORT_WARNING_BIT_EXT) != 0;
    }

    public boolean isVkDebugReportPerformanceWarningBitExt(){
        return (flags.value & VkDebugReportFlagsEXT.VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT) != 0;
    }

    public boolean isVkDebugReportErrorBitExt(){
        return (flags.value & VkDebugReportFlagsEXT.VK_DEBUG_REPORT_ERROR_BIT_EXT) != 0;
    }

    public boolean isVkDebugReportDebugBitExt(){
        return (flags.value & VkDebugReportFlagsEXT.VK_DEBUG_REPORT_DEBUG_BIT_EXT) != 0;
    }

    @Override
    public String toString() {
        return ToString.flagsToStringNoLabels(flags.value, VkDebugReportFlagsEXT.class);
    }
}
