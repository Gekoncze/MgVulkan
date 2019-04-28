#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceFormatProperties_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong format, jlong pFormatProperties){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceFormatProperties f = (PFN_vkGetPhysicalDeviceFormatProperties)jniLongToFunctionPointer(address);
    f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((VkFormat*)jniLongToPointer(format)),
        ((VkFormatProperties*)jniLongToPointer(pFormatProperties))
    );
}


void Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceFormatProperties_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jint format, jlong pFormatProperties){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceFormatProperties f = (PFN_vkGetPhysicalDeviceFormatProperties)jniLongToFunctionPointer(address);
    f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        (VkFormat)format,
        ((VkFormatProperties*)jniLongToPointer(pFormatProperties))
    );
}

