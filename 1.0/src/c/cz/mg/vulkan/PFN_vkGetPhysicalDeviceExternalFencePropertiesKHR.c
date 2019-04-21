#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceExternalFencePropertiesKHR_call(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pExternalFenceInfo, jlong pExternalFenceProperties){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceExternalFencePropertiesKHR f = (PFN_vkGetPhysicalDeviceExternalFencePropertiesKHR)jniLongToFunctionPointer(address);
    f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((VkPhysicalDeviceExternalFenceInfoKHR*)jniLongToPointer(pExternalFenceInfo)),
        ((VkExternalFencePropertiesKHR*)jniLongToPointer(pExternalFenceProperties))
    );
}
