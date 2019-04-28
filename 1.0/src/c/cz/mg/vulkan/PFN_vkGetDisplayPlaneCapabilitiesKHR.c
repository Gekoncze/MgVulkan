#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkGetDisplayPlaneCapabilitiesKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong mode, jint planeIndex, jlong pCapabilities){
    (void)env;
    (void)jc;
    PFN_vkGetDisplayPlaneCapabilitiesKHR f = (PFN_vkGetDisplayPlaneCapabilitiesKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((VkDisplayModeKHR*)jniLongToPointer(mode)),
        (uint32_t)planeIndex,
        ((VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(pCapabilities))
    );
}

