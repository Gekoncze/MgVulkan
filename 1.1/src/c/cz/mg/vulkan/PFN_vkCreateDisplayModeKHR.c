#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCreateDisplayModeKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong display, jlong pCreateInfo, jlong pAllocator, jlong pMode, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkCreateDisplayModeKHR f = (PFN_vkCreateDisplayModeKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((VkDisplayKHR*)jniLongToPointer(display)),
        ((VkDisplayModeCreateInfoKHR*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkDisplayModeKHR*)jniLongToPointer(pMode))
    );
}


jint Java_cz_mg_vulkan_PFNvkCreateDisplayModeKHR_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong display, jlong pCreateInfo, jlong pAllocator, jlong pMode){
    (void)env;
    (void)jc;
    PFN_vkCreateDisplayModeKHR f = (PFN_vkCreateDisplayModeKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((VkDisplayKHR*)jniLongToPointer(display)),
        ((VkDisplayModeCreateInfoKHR*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkDisplayModeKHR*)jniLongToPointer(pMode))
    );
}

