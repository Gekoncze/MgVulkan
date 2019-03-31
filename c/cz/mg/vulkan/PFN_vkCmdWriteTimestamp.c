#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdWriteTimestamp_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong pipelineStage, jlong queryPool, jlong query){
    (void)env;
    (void)jc;
    PFN_vkCmdWriteTimestamp f = (PFN_vkCmdWriteTimestamp)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkPipelineStageFlagBits*)jniLongToPointer(pipelineStage)),
        *((VkQueryPool*)jniLongToPointer(queryPool)),
        *((uint32_t*)jniLongToPointer(query))
    );
}
