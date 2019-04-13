#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

#include <stdio.h>

VkBool32 defaultPFNvkDebugReportCallbackEXT(
        VkDebugReportFlagsEXT         flags,
        VkDebugReportObjectTypeEXT    objectType,
        uint64_t                      object,
        size_t                        location,
        int32_t                       messageCode,
        const char*                   pLayerPrefix,
        const char*                   pMessage,
        void*                         pUserData
){
    (void)objectType;
    (void)object;
    (void)location;
    (void)messageCode;
    (void)pUserData;
    const char* informationBit = " ";
    const char* warningBit = " ";
    const char* performanceBit = " ";
    const char* errorBit = " ";
    const char* debugBit = " ";
    if(flags & VK_DEBUG_REPORT_INFORMATION_BIT_EXT) informationBit = "I";
    if(flags & VK_DEBUG_REPORT_WARNING_BIT_EXT) warningBit = "W";
    if(flags & VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT) performanceBit = "P";
    if(flags & VK_DEBUG_REPORT_ERROR_BIT_EXT) performanceBit = "E";
    if(flags & VK_DEBUG_REPORT_DEBUG_BIT_EXT) debugBit = "D";
    printf("(%s%s%s%s%s) %s: %s\n", informationBit, warningBit, performanceBit, errorBit, debugBit, pLayerPrefix, pMessage);
    fflush(stdout);
    return VK_FALSE;
}

jlong Java_cz_mg_vulkan_VkDebug_getDefaultPFNvkDebugReportCallbackEXTAddress(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return jniFunctionPointerToLong((PFN_vkVoidFunction)defaultPFNvkDebugReportCallbackEXT);
}

VkBool32 defaultPFNvkDebugUtilsMessengerCallbackEXT(
    VkDebugUtilsMessageSeverityFlagBitsEXT         messageSeverity,
    VkDebugUtilsMessageTypeFlagsEXT                messageType,
    const VkDebugUtilsMessengerCallbackDataEXT*    pCallbackData,
    void*                                          pUserData
){
    (void)pUserData;
    const char* verboseBit = " ";
    const char* infoBit = " ";
    const char* warningBit = " ";
    const char* errorBit = " ";
    const char* generalBit = " ";
    const char* validationBit = " ";
    const char* performanceBit = " ";
    if(messageSeverity & VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT) verboseBit = "V";
    if(messageSeverity & VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT) infoBit = "I";
    if(messageSeverity & VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT) warningBit = "W";
    if(messageSeverity & VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT) errorBit = "E";
    if(messageType & VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT) generalBit = "G";
    if(messageType & VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT) validationBit = "V";
    if(messageType & VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT) performanceBit = "P";
    printf("(%s%s%s%s|%s%s%s) %s\n", verboseBit, infoBit, warningBit, errorBit, generalBit, validationBit, performanceBit, pCallbackData->pMessage);
    fflush(stdout);
    return VK_FALSE;
}

jlong Java_cz_mg_vulkan_VkDebug_getDefaultPFNvkDebugUtilsMessengerCallbackEXTAddress(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return jniFunctionPointerToLong((PFN_vkVoidFunction)defaultPFNvkDebugUtilsMessengerCallbackEXT);
}
