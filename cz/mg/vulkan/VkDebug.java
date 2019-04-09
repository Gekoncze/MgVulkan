package cz.mg.vulkan;

public class VkDebug {
    public static VkDebugReportCallbackEXT getDefaultVkDebugReportCallbackEXT(){
        return new VkDebugReportCallbackEXT(getDefaultVkDebugReportCallbackEXTAddress());
    }

    private static native long getDefaultVkDebugReportCallbackEXTAddress();
}
