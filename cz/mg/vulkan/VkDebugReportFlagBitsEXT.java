package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkDebugReportFlagBitsEXT extends VkFlagBits {
    public static final int VK_DEBUG_REPORT_INFORMATION_BIT_EXT = 0x00000001;
    public static final int VK_DEBUG_REPORT_WARNING_BIT_EXT = 0x00000002;
    public static final int VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = 0x00000004;
    public static final int VK_DEBUG_REPORT_ERROR_BIT_EXT = 0x00000008;
    public static final int VK_DEBUG_REPORT_DEBUG_BIT_EXT = 0x00000010;

    public VkDebugReportFlagBitsEXT() {
    }

    public VkDebugReportFlagBitsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugReportFlagBitsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugReportFlagBitsEXT(int value) {
        setValue(value);
    }

    public VkDebugReportFlagBitsEXT(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_DEBUG_REPORT_INFORMATION_BIT_EXT) != 0) s.addLast("VK_DEBUG_REPORT_INFORMATION_BIT_EXT");
        if((getValue() & VK_DEBUG_REPORT_WARNING_BIT_EXT) != 0) s.addLast("VK_DEBUG_REPORT_WARNING_BIT_EXT");
        if((getValue() & VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT) != 0) s.addLast("VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT");
        if((getValue() & VK_DEBUG_REPORT_ERROR_BIT_EXT) != 0) s.addLast("VK_DEBUG_REPORT_ERROR_BIT_EXT");
        if((getValue() & VK_DEBUG_REPORT_DEBUG_BIT_EXT) != 0) s.addLast("VK_DEBUG_REPORT_DEBUG_BIT_EXT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
