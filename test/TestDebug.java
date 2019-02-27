package test;

public class TestDebug {
    public void unused(){
//        VkDebugReportCallbackEXT debugCallback = createDebugCallback(instance);
//        System.out.println("Debug report callback created successfully.");

//        VK_EXT_DEBUG_REPORT_EXTENSION_NAME
    }

//    private static VkDebugReportCallbackEXT createDebugCallback(VkInstance instance){
//        VkDebugReportCallbackCreateInfoEXT debugCallbackCreateInfo = new VkDebugReportCallbackCreateInfoEXT.ByReference();
//        debugCallbackCreateInfo.flags = new VkDebugReportFlagsEXT.ByValue(VK_DEBUG_REPORT_DEBUG_BIT_EXT | VK_DEBUG_REPORT_ERROR_BIT_EXT | VK_DEBUG_REPORT_WARNING_BIT_EXT);
//        debugCallbackCreateInfo.pfnCallback = debugCallbackFunction;
//        debugCallbackCreateInfo.pNext = NULL;
//        debugCallbackCreateInfo.pUserData = NULL;
//        debugCallbackCreateInfo.sType = new VkStructureType.ByValue(VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT);
//
//        VkDebugReportCallbackEXT debugCallback = new VkDebugReportCallbackEXT.ByReference();
//        PFN_vkCreateDebugReportCallbackEXT _vkCreateDebugReportCallbackEXT = (PFN_vkCreateDebugReportCallbackEXT) vkGetInstanceProcAddr(instance, "vkCreateDebugReportCallbackEXT");
//        if(_vkCreateDebugReportCallbackEXT == null) throw new VulkanException();
//        VkResult result = _vkCreateDebugReportCallbackEXT(instance, debugCallbackCreateInfo, NULL, debugCallback);
//        if(result.value != VK_SUCCESS) throw new VulkanException(result, "vkCreateDebugReportCallbackEXT");
//        return debugCallback;
//    }
}
