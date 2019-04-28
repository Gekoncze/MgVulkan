#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong format, jlong type, jlong tiling, jlong usage, jlong flags, jlong externalHandleType, jlong pExternalImageFormatProperties, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV f = (PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((VkFormat*)jniLongToPointer(format)),
        *((VkImageType*)jniLongToPointer(type)),
        *((VkImageTiling*)jniLongToPointer(tiling)),
        *((VkImageUsageFlags*)jniLongToPointer(usage)),
        *((VkImageCreateFlags*)jniLongToPointer(flags)),
        *((VkExternalMemoryHandleTypeFlagsNV*)jniLongToPointer(externalHandleType)),
        ((VkExternalImageFormatPropertiesNV*)jniLongToPointer(pExternalImageFormatProperties))
    );
}


jint Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jint format, jint type, jint tiling, jint usage, jint flags, jint externalHandleType, jlong pExternalImageFormatProperties){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV f = (PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV)jniLongToFunctionPointer(address);
    return f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        (VkFormat)format,
        (VkImageType)type,
        (VkImageTiling)tiling,
        (VkImageUsageFlags)usage,
        (VkImageCreateFlags)flags,
        (VkExternalMemoryHandleTypeFlagsNV)externalHandleType,
        ((VkExternalImageFormatPropertiesNV*)jniLongToPointer(pExternalImageFormatProperties))
    );
}

