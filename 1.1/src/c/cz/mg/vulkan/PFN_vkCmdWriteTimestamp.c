#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdWriteTimestamp_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jint pipelineStage, jlong queryPool, jint query){
    (void)env;
    (void)jc;
    PFN_vkCmdWriteTimestamp f = (PFN_vkCmdWriteTimestamp)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (VkPipelineStageFlagBits)pipelineStage,
        *((VkQueryPool*)jniLongToPointer(queryPool)),
        (uint32_t)query
    );
}

