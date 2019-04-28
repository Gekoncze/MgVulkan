#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCreateDebugReportCallbackEXT_callNative(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pCallback, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkCreateDebugReportCallbackEXT f = (PFN_vkCreateDebugReportCallbackEXT)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkInstance*)jniLongToPointer(instance)),
        ((VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkDebugReportCallbackEXT*)jniLongToPointer(pCallback))
    );
}


jint Java_cz_mg_vulkan_PFNvkCreateDebugReportCallbackEXT_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pCallback){
    (void)env;
    (void)jc;
    PFN_vkCreateDebugReportCallbackEXT f = (PFN_vkCreateDebugReportCallbackEXT)jniLongToFunctionPointer(address);
    return f(
        *((VkInstance*)jniLongToPointer(instance)),
        ((VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkDebugReportCallbackEXT*)jniLongToPointer(pCallback))
    );
}

