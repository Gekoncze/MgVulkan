#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetPhysicalDeviceMemoryProperties2_call(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pMemoryProperties){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceMemoryProperties2 f = (PFN_vkGetPhysicalDeviceMemoryProperties2)jniLongToFunctionPointer(address);
    f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((VkPhysicalDeviceMemoryProperties2*)jniLongToPointer(pMemoryProperties))
    );
}
