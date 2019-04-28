#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceImageFormatProperties2_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pImageFormatInfo, jlong pImageFormatProperties, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceImageFormatProperties2 f = (PFN_vkGetPhysicalDeviceImageFormatProperties2)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((VkPhysicalDeviceImageFormatInfo2*)jniLongToPointer(pImageFormatInfo)),
        ((VkImageFormatProperties2*)jniLongToPointer(pImageFormatProperties))
    );
}


jint Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceImageFormatProperties2_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pImageFormatInfo, jlong pImageFormatProperties){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceImageFormatProperties2 f = (PFN_vkGetPhysicalDeviceImageFormatProperties2)jniLongToFunctionPointer(address);
    return f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((VkPhysicalDeviceImageFormatInfo2*)jniLongToPointer(pImageFormatInfo)),
        ((VkImageFormatProperties2*)jniLongToPointer(pImageFormatProperties))
    );
}

