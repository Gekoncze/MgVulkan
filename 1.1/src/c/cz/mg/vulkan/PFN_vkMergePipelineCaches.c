#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkMergePipelineCaches_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong dstCache, jint srcCacheCount, jlong pSrcCaches){
    (void)env;
    (void)jc;
    PFN_vkMergePipelineCaches f = (PFN_vkMergePipelineCaches)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkPipelineCache*)jniLongToPointer(dstCache)),
        (uint32_t)srcCacheCount,
        ((VkPipelineCache*)jniLongToPointer(pSrcCaches))
    );
}

