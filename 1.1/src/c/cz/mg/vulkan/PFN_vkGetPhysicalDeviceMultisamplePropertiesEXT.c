#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetPhysicalDeviceMultisamplePropertiesEXT_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jint samples, jlong pMultisampleProperties){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT f = (PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT)jniLongToFunctionPointer(address);
    f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        (VkSampleCountFlagBits)samples,
        ((VkMultisamplePropertiesEXT*)jniLongToPointer(pMultisampleProperties))
    );
}

