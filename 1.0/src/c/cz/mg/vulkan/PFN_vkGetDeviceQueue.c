#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetDeviceQueue_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jint queueFamilyIndex, jint queueIndex, jlong pQueue){
    (void)env;
    (void)jc;
    PFN_vkGetDeviceQueue f = (PFN_vkGetDeviceQueue)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        (uint32_t)queueFamilyIndex,
        (uint32_t)queueIndex,
        ((VkQueue*)jniLongToPointer(pQueue))
    );
}

