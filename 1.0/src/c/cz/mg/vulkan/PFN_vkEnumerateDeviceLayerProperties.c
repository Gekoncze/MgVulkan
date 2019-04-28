#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkEnumerateDeviceLayerProperties_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pPropertyCount, jlong pProperties, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkEnumerateDeviceLayerProperties f = (PFN_vkEnumerateDeviceLayerProperties)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((uint32_t*)jniLongToPointer(pPropertyCount)),
        ((VkLayerProperties*)jniLongToPointer(pProperties))
    );
}


jint Java_cz_mg_vulkan_PFNvkEnumerateDeviceLayerProperties_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pPropertyCount, jlong pProperties){
    (void)env;
    (void)jc;
    PFN_vkEnumerateDeviceLayerProperties f = (PFN_vkEnumerateDeviceLayerProperties)jniLongToFunctionPointer(address);
    return f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((uint32_t*)jniLongToPointer(pPropertyCount)),
        ((VkLayerProperties*)jniLongToPointer(pProperties))
    );
}

