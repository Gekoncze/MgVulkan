#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkCreatePipelineCache_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pPipelineCache){
    (void)env;
    (void)jc;
    PFN_vkCreatePipelineCache f = (PFN_vkCreatePipelineCache)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkPipelineCacheCreateInfo*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkPipelineCache*)jniLongToPointer(pPipelineCache))
    );
}

