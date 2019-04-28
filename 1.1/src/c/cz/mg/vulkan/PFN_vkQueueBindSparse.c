#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkQueueBindSparse_callNative(JNIEnv* env, jclass jc, jlong address, jlong queue, jlong bindInfoCount, jlong pBindInfo, jlong fence, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkQueueBindSparse f = (PFN_vkQueueBindSparse)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkQueue*)jniLongToPointer(queue)),
        *((uint32_t*)jniLongToPointer(bindInfoCount)),
        ((VkBindSparseInfo*)jniLongToPointer(pBindInfo)),
        *((VkFence*)jniLongToPointer(fence))
    );
}


jint Java_cz_mg_vulkan_PFNvkQueueBindSparse_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong queue, jint bindInfoCount, jlong pBindInfo, jlong fence){
    (void)env;
    (void)jc;
    PFN_vkQueueBindSparse f = (PFN_vkQueueBindSparse)jniLongToFunctionPointer(address);
    return f(
        *((VkQueue*)jniLongToPointer(queue)),
        (uint32_t)bindInfoCount,
        ((VkBindSparseInfo*)jniLongToPointer(pBindInfo)),
        *((VkFence*)jniLongToPointer(fence))
    );
}

