#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pSurfaceInfo, jlong pSurfaceCapabilities){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR f = (PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR)jniLongToFunctionPointer(address);
    return f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((VkPhysicalDeviceSurfaceInfo2KHR*)jniLongToPointer(pSurfaceInfo)),
        ((VkSurfaceCapabilities2KHR*)jniLongToPointer(pSurfaceCapabilities))
    );
}

