#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdWriteBufferMarkerAMD_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong pipelineStage, jlong dstBuffer, jlong dstOffset, jlong marker){
    (void)env;
    (void)jc;
    PFN_vkCmdWriteBufferMarkerAMD f = (PFN_vkCmdWriteBufferMarkerAMD)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkPipelineStageFlagBits*)jniLongToPointer(pipelineStage)),
        *((VkBuffer*)jniLongToPointer(dstBuffer)),
        *((VkDeviceSize*)jniLongToPointer(dstOffset)),
        *((uint32_t*)jniLongToPointer(marker))
    );
}


void Java_cz_mg_vulkan_PFNvkCmdWriteBufferMarkerAMD_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jint pipelineStage, jlong dstBuffer, jlong dstOffset, jint marker){
    (void)env;
    (void)jc;
    PFN_vkCmdWriteBufferMarkerAMD f = (PFN_vkCmdWriteBufferMarkerAMD)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (VkPipelineStageFlagBits)pipelineStage,
        *((VkBuffer*)jniLongToPointer(dstBuffer)),
        (VkDeviceSize)dstOffset,
        (uint32_t)marker
    );
}

