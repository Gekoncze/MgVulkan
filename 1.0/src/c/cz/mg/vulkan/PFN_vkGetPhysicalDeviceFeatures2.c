#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceFeatures2_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pFeatures){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceFeatures2 f = (PFN_vkGetPhysicalDeviceFeatures2)jniLongToFunctionPointer(address);
    f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((VkPhysicalDeviceFeatures2*)jniLongToPointer(pFeatures))
    );
}

