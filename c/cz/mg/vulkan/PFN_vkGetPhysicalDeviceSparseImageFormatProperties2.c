#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetPhysicalDeviceSparseImageFormatProperties2_call(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pFormatInfo, jlong pPropertyCount, jlong pProperties){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceSparseImageFormatProperties2 f = (PFN_vkGetPhysicalDeviceSparseImageFormatProperties2)jniLongToFunctionPointer(address);
    f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((VkPhysicalDeviceSparseImageFormatInfo2*)jniLongToPointer(pFormatInfo)),
        ((uint32_t*)jniLongToPointer(pPropertyCount)),
        ((VkSparseImageFormatProperties2*)jniLongToPointer(pProperties))
    );
}
