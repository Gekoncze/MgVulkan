#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong surface, jlong pSurfaceCapabilities, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR f = (PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((VkSurfaceKHR*)jniLongToPointer(surface)),
        ((VkSurfaceCapabilitiesKHR*)jniLongToPointer(pSurfaceCapabilities))
    );
}


jint Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong surface, jlong pSurfaceCapabilities){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR f = (PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((VkSurfaceKHR*)jniLongToPointer(surface)),
        ((VkSurfaceCapabilitiesKHR*)jniLongToPointer(pSurfaceCapabilities))
    );
}

