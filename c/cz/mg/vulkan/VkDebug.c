#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

#include <stdio.h>

VkBool32 defaultVkDebugReportCallbackEXT(VkDebugReportFlagsEXT flags, VkDebugReportObjectTypeEXT objectType, uint64_t object, size_t location, int32_t messageCode, const char* pLayerPrefix, const char* pMessage, void* pUserData){
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
    printf("(%s%s%s%s%s) %s: %s", informationBit, warningBit, performanceBit, errorBit, debugBit, pLayerPrefix, pMessage);
    return VK_FALSE;
}

jlong Java_cz_mg_vulkan_vk_VkDebug_getDefaultVkDebugReportCallbackEXTAddress(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return jniFunctionPointerToLong((PFN_vkVoidFunction)defaultVkDebugReportCallbackEXT);
}
