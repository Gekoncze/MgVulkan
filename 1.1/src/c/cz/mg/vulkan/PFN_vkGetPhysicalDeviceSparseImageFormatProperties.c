#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceSparseImageFormatProperties_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong format, jlong type, jlong samples, jlong usage, jlong tiling, jlong pPropertyCount, jlong pProperties){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceSparseImageFormatProperties f = (PFN_vkGetPhysicalDeviceSparseImageFormatProperties)jniLongToFunctionPointer(address);
    f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((VkFormat*)jniLongToPointer(format)),
        *((VkImageType*)jniLongToPointer(type)),
        *((VkSampleCountFlagBits*)jniLongToPointer(samples)),
        *((VkImageUsageFlags*)jniLongToPointer(usage)),
        *((VkImageTiling*)jniLongToPointer(tiling)),
        ((uint32_t*)jniLongToPointer(pPropertyCount)),
        ((VkSparseImageFormatProperties*)jniLongToPointer(pProperties))
    );
}


void Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceSparseImageFormatProperties_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jint format, jint type, jint samples, jint usage, jint tiling, jlong pPropertyCount, jlong pProperties){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceSparseImageFormatProperties f = (PFN_vkGetPhysicalDeviceSparseImageFormatProperties)jniLongToFunctionPointer(address);
    f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        (VkFormat)format,
        (VkImageType)type,
        (VkSampleCountFlagBits)samples,
        (VkImageUsageFlags)usage,
        (VkImageTiling)tiling,
        ((uint32_t*)jniLongToPointer(pPropertyCount)),
        ((VkSparseImageFormatProperties*)jniLongToPointer(pProperties))
    );
}

