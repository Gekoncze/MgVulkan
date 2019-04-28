#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkCreateGraphicsPipelines_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pipelineCache, jint createInfoCount, jlong pCreateInfos, jlong pAllocator, jlong pPipelines){
    (void)env;
    (void)jc;
    PFN_vkCreateGraphicsPipelines f = (PFN_vkCreateGraphicsPipelines)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkPipelineCache*)jniLongToPointer(pipelineCache)),
        (uint32_t)createInfoCount,
        ((VkGraphicsPipelineCreateInfo*)jniLongToPointer(pCreateInfos)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkPipeline*)jniLongToPointer(pPipelines))
    );
}

