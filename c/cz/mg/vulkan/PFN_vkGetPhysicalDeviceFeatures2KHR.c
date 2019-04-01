#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetPhysicalDeviceFeatures2KHR_call(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pFeatures){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceFeatures2KHR f = (PFN_vkGetPhysicalDeviceFeatures2KHR)jniLongToFunctionPointer(address);
    f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((VkPhysicalDeviceFeatures2*)jniLongToPointer(pFeatures))
    );
}
