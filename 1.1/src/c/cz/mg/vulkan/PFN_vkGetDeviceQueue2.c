#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetDeviceQueue2_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pQueueInfo, jlong pQueue){
    (void)env;
    (void)jc;
    PFN_vkGetDeviceQueue2 f = (PFN_vkGetDeviceQueue2)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkDeviceQueueInfo2*)jniLongToPointer(pQueueInfo)),
        ((VkQueue*)jniLongToPointer(pQueue))
    );
}

