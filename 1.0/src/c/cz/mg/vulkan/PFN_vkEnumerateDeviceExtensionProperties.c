#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkEnumerateDeviceExtensionProperties_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pLayerName, jlong pPropertyCount, jlong pProperties){
    (void)env;
    (void)jc;
    PFN_vkEnumerateDeviceExtensionProperties f = (PFN_vkEnumerateDeviceExtensionProperties)jniLongToFunctionPointer(address);
    return f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((char*)jniLongToPointer(pLayerName)),
        ((uint32_t*)jniLongToPointer(pPropertyCount)),
        ((VkExtensionProperties*)jniLongToPointer(pProperties))
    );
}

