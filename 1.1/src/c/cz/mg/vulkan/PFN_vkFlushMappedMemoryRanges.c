#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkFlushMappedMemoryRanges_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jint memoryRangeCount, jlong pMemoryRanges){
    (void)env;
    (void)jc;
    PFN_vkFlushMappedMemoryRanges f = (PFN_vkFlushMappedMemoryRanges)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        (uint32_t)memoryRangeCount,
        ((VkMappedMemoryRange*)jniLongToPointer(pMemoryRanges))
    );
}

