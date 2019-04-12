package cz.mg.vulkan;

public class VkDebug {
    public static PFNvkDebugReportCallbackEXT getDefaultPFNvkDebugReportCallbackEXT(){
        return new PFNvkDebugReportCallbackEXT(getDefaultPFNvkDebugReportCallbackEXTAddress());
    }

    public static PFNvkDebugUtilsMessengerCallbackEXT getDefaultPFNvkDebugUtilsMessengerCallbackEXT(){
        return new PFNvkDebugUtilsMessengerCallbackEXT(getDefaultPFNvkDebugUtilsMessengerCallbackEXTAddress());
    }

    private static native long getDefaultPFNvkDebugReportCallbackEXTAddress();
    private static native long getDefaultPFNvkDebugUtilsMessengerCallbackEXTAddress();
}
