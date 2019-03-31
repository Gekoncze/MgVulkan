#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetPhysicalDeviceSparseImageFormatProperties_call(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong format, jlong type, jlong samples, jlong usage, jlong tiling, jlong pPropertyCount, jlong pProperties){
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
