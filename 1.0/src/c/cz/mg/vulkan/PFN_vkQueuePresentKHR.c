#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkQueuePresentKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong queue, jlong pPresentInfo){
    (void)env;
    (void)jc;
    PFN_vkQueuePresentKHR f = (PFN_vkQueuePresentKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkQueue*)jniLongToPointer(queue)),
        ((VkPresentInfoKHR*)jniLongToPointer(pPresentInfo))
    );
}

