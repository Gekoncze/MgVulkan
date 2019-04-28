#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkQueueSubmit_callNative(JNIEnv* env, jclass jc, jlong address, jlong queue, jint submitCount, jlong pSubmits, jlong fence){
    (void)env;
    (void)jc;
    PFN_vkQueueSubmit f = (PFN_vkQueueSubmit)jniLongToFunctionPointer(address);
    return f(
        *((VkQueue*)jniLongToPointer(queue)),
        (uint32_t)submitCount,
        ((VkSubmitInfo*)jniLongToPointer(pSubmits)),
        *((VkFence*)jniLongToPointer(fence))
    );
}

