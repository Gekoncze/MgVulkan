#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetDeviceQueue_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong queueFamilyIndex, jlong queueIndex, jlong pQueue){
    (void)env;
    (void)jc;
    PFN_vkGetDeviceQueue f = (PFN_vkGetDeviceQueue)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((uint32_t*)jniLongToPointer(queueFamilyIndex)),
        *((uint32_t*)jniLongToPointer(queueIndex)),
        ((VkQueue*)jniLongToPointer(pQueue))
    );
}
