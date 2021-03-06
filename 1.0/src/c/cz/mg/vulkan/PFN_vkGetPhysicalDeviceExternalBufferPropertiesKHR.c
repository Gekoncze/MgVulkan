#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceExternalBufferPropertiesKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pExternalBufferInfo, jlong pExternalBufferProperties){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceExternalBufferPropertiesKHR f = (PFN_vkGetPhysicalDeviceExternalBufferPropertiesKHR)jniLongToFunctionPointer(address);
    f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((VkPhysicalDeviceExternalBufferInfo*)jniLongToPointer(pExternalBufferInfo)),
        ((VkExternalBufferProperties*)jniLongToPointer(pExternalBufferProperties))
    );
}

