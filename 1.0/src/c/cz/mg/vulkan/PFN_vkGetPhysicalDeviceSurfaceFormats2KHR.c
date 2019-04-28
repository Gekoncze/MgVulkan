#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceSurfaceFormats2KHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pSurfaceInfo, jlong pSurfaceFormatCount, jlong pSurfaceFormats, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceSurfaceFormats2KHR f = (PFN_vkGetPhysicalDeviceSurfaceFormats2KHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((VkPhysicalDeviceSurfaceInfo2KHR*)jniLongToPointer(pSurfaceInfo)),
        ((uint32_t*)jniLongToPointer(pSurfaceFormatCount)),
        ((VkSurfaceFormat2KHR*)jniLongToPointer(pSurfaceFormats))
    );
}


jint Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceSurfaceFormats2KHR_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pSurfaceInfo, jlong pSurfaceFormatCount, jlong pSurfaceFormats){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceSurfaceFormats2KHR f = (PFN_vkGetPhysicalDeviceSurfaceFormats2KHR)jniLongToFunctionPointer(address);
    return f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((VkPhysicalDeviceSurfaceInfo2KHR*)jniLongToPointer(pSurfaceInfo)),
        ((uint32_t*)jniLongToPointer(pSurfaceFormatCount)),
        ((VkSurfaceFormat2KHR*)jniLongToPointer(pSurfaceFormats))
    );
}

