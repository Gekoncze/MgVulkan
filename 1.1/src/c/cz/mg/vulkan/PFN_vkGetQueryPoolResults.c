#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetQueryPoolResults_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong queryPool, jlong firstQuery, jlong queryCount, jlong dataSize, jlong pData, jlong stride, jlong flags, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetQueryPoolResults f = (PFN_vkGetQueryPoolResults)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkQueryPool*)jniLongToPointer(queryPool)),
        *((uint32_t*)jniLongToPointer(firstQuery)),
        *((uint32_t*)jniLongToPointer(queryCount)),
        *((size_t*)jniLongToPointer(dataSize)),
        ((void*)jniLongToPointer(pData)),
        *((VkDeviceSize*)jniLongToPointer(stride)),
        *((VkQueryResultFlags*)jniLongToPointer(flags))
    );
}


jint Java_cz_mg_vulkan_PFNvkGetQueryPoolResults_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong queryPool, jint firstQuery, jint queryCount, jlong dataSize, jlong pData, jlong stride, jint flags){
    (void)env;
    (void)jc;
    PFN_vkGetQueryPoolResults f = (PFN_vkGetQueryPoolResults)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkQueryPool*)jniLongToPointer(queryPool)),
        (uint32_t)firstQuery,
        (uint32_t)queryCount,
        (size_t)dataSize,
        ((void*)jniLongToPointer(pData)),
        (VkDeviceSize)stride,
        (VkQueryResultFlags)flags
    );
}

