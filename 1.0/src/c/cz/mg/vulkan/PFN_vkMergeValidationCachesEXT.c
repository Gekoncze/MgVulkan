#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkMergeValidationCachesEXT_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong dstCache, jlong srcCacheCount, jlong pSrcCaches, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkMergeValidationCachesEXT f = (PFN_vkMergeValidationCachesEXT)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkValidationCacheEXT*)jniLongToPointer(dstCache)),
        *((uint32_t*)jniLongToPointer(srcCacheCount)),
        ((VkValidationCacheEXT*)jniLongToPointer(pSrcCaches))
    );
}


jint Java_cz_mg_vulkan_PFNvkMergeValidationCachesEXT_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong dstCache, jint srcCacheCount, jlong pSrcCaches){
    (void)env;
    (void)jc;
    PFN_vkMergeValidationCachesEXT f = (PFN_vkMergeValidationCachesEXT)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkValidationCacheEXT*)jniLongToPointer(dstCache)),
        (uint32_t)srcCacheCount,
        ((VkValidationCacheEXT*)jniLongToPointer(pSrcCaches))
    );
}

