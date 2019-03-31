#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX_call(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pFeatures, jlong pLimits){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX f = (PFN_vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX)jniLongToFunctionPointer(address);
    f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((VkDeviceGeneratedCommandsFeaturesNVX*)jniLongToPointer(pFeatures)),
        ((VkDeviceGeneratedCommandsLimitsNVX*)jniLongToPointer(pLimits))
    );
}
