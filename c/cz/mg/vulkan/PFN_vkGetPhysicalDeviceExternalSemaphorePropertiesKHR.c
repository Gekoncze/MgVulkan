#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR_call(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pExternalSemaphoreInfo, jlong pExternalSemaphoreProperties){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceExternalSemaphorePropertiesKHR f = (PFN_vkGetPhysicalDeviceExternalSemaphorePropertiesKHR)jniLongToFunctionPointer(address);
    f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((VkPhysicalDeviceExternalSemaphoreInfo*)jniLongToPointer(pExternalSemaphoreInfo)),
        ((VkExternalSemaphoreProperties*)jniLongToPointer(pExternalSemaphoreProperties))
    );
}
