#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceImageFormatProperties_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong format, jlong type, jlong tiling, jlong usage, jlong flags, jlong pImageFormatProperties, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceImageFormatProperties f = (PFN_vkGetPhysicalDeviceImageFormatProperties)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((VkFormat*)jniLongToPointer(format)),
        *((VkImageType*)jniLongToPointer(type)),
        *((VkImageTiling*)jniLongToPointer(tiling)),
        *((VkImageUsageFlags*)jniLongToPointer(usage)),
        *((VkImageCreateFlags*)jniLongToPointer(flags)),
        ((VkImageFormatProperties*)jniLongToPointer(pImageFormatProperties))
    );
}


jint Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceImageFormatProperties_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jint format, jint type, jint tiling, jint usage, jint flags, jlong pImageFormatProperties){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceImageFormatProperties f = (PFN_vkGetPhysicalDeviceImageFormatProperties)jniLongToFunctionPointer(address);
    return f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        (VkFormat)format,
        (VkImageType)type,
        (VkImageTiling)tiling,
        (VkImageUsageFlags)usage,
        (VkImageCreateFlags)flags,
        ((VkImageFormatProperties*)jniLongToPointer(pImageFormatProperties))
    );
}

