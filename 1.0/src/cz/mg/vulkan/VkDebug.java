package cz.mg.vulkan;

public class VkDebug {
    public static PFNvkDebugReportCallbackEXT getDefaultPFNvkDebugReportCallbackEXT(){
        return new PFNvkDebugReportCallbackEXT(getDefaultPFNvkDebugReportCallbackEXTAddress());
    }

    private static native long getDefaultPFNvkDebugReportCallbackEXTAddress();
}
