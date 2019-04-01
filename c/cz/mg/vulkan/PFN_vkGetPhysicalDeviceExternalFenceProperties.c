#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetPhysicalDeviceExternalFenceProperties_call(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pExternalFenceInfo, jlong pExternalFenceProperties){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceExternalFenceProperties f = (PFN_vkGetPhysicalDeviceExternalFenceProperties)jniLongToFunctionPointer(address);
    f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((VkPhysicalDeviceExternalFenceInfo*)jniLongToPointer(pExternalFenceInfo)),
        ((VkExternalFenceProperties*)jniLongToPointer(pExternalFenceProperties))
    );
}
