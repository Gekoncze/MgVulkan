#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkInvalidateMappedMemoryRanges_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong memoryRangeCount, jlong pMemoryRanges, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkInvalidateMappedMemoryRanges f = (PFN_vkInvalidateMappedMemoryRanges)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((uint32_t*)jniLongToPointer(memoryRangeCount)),
        ((VkMappedMemoryRange*)jniLongToPointer(pMemoryRanges))
    );
}


jint Java_cz_mg_vulkan_PFNvkInvalidateMappedMemoryRanges_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong device, jint memoryRangeCount, jlong pMemoryRanges){
    (void)env;
    (void)jc;
    PFN_vkInvalidateMappedMemoryRanges f = (PFN_vkInvalidateMappedMemoryRanges)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        (uint32_t)memoryRangeCount,
        ((VkMappedMemoryRange*)jniLongToPointer(pMemoryRanges))
    );
}

