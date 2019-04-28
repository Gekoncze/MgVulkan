#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkEnumeratePhysicalDevices_callNative(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong pPhysicalDeviceCount, jlong pPhysicalDevices){
    (void)env;
    (void)jc;
    PFN_vkEnumeratePhysicalDevices f = (PFN_vkEnumeratePhysicalDevices)jniLongToFunctionPointer(address);
    return f(
        *((VkInstance*)jniLongToPointer(instance)),
        ((uint32_t*)jniLongToPointer(pPhysicalDeviceCount)),
        ((VkPhysicalDevice*)jniLongToPointer(pPhysicalDevices))
    );
}

