#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdBindPipeline_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong pipelineBindPoint, jlong pipeline){
    (void)env;
    (void)jc;
    PFN_vkCmdBindPipeline f = (PFN_vkCmdBindPipeline)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkPipelineBindPoint*)jniLongToPointer(pipelineBindPoint)),
        *((VkPipeline*)jniLongToPointer(pipeline))
    );
}
