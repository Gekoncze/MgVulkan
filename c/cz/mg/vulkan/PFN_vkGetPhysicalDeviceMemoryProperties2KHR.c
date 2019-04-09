#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceMemoryProperties2KHR_call(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pMemoryProperties){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceMemoryProperties2KHR f = (PFN_vkGetPhysicalDeviceMemoryProperties2KHR)jniLongToFunctionPointer(address);
    f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((VkPhysicalDeviceMemoryProperties2*)jniLongToPointer(pMemoryProperties))
    );
}
