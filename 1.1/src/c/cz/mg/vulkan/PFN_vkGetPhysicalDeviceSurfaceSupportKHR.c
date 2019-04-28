#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceSurfaceSupportKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jint queueFamilyIndex, jlong surface, jlong pSupported){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceSurfaceSupportKHR f = (PFN_vkGetPhysicalDeviceSurfaceSupportKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        (uint32_t)queueFamilyIndex,
        *((VkSurfaceKHR*)jniLongToPointer(surface)),
        ((VkBool32*)jniLongToPointer(pSupported))
    );
}

