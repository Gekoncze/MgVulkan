#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceQueueFamilyProperties2KHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pQueueFamilyPropertyCount, jlong pQueueFamilyProperties){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceQueueFamilyProperties2KHR f = (PFN_vkGetPhysicalDeviceQueueFamilyProperties2KHR)jniLongToFunctionPointer(address);
    f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((uint32_t*)jniLongToPointer(pQueueFamilyPropertyCount)),
        ((VkQueueFamilyProperties2*)jniLongToPointer(pQueueFamilyProperties))
    );
}

