#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetPhysicalDeviceFormatProperties2_call(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong format, jlong pFormatProperties){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceFormatProperties2 f = (PFN_vkGetPhysicalDeviceFormatProperties2)jniLongToFunctionPointer(address);
    f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((VkFormat*)jniLongToPointer(format)),
        ((VkFormatProperties2*)jniLongToPointer(pFormatProperties))
    );
}
