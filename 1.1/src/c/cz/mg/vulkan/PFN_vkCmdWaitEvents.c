#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdWaitEvents_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong eventCount, jlong pEvents, jlong srcStageMask, jlong dstStageMask, jlong memoryBarrierCount, jlong pMemoryBarriers, jlong bufferMemoryBarrierCount, jlong pBufferMemoryBarriers, jlong imageMemoryBarrierCount, jlong pImageMemoryBarriers){
    (void)env;
    (void)jc;
    PFN_vkCmdWaitEvents f = (PFN_vkCmdWaitEvents)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((uint32_t*)jniLongToPointer(eventCount)),
        ((VkEvent*)jniLongToPointer(pEvents)),
        *((VkPipelineStageFlags*)jniLongToPointer(srcStageMask)),
        *((VkPipelineStageFlags*)jniLongToPointer(dstStageMask)),
        *((uint32_t*)jniLongToPointer(memoryBarrierCount)),
        ((VkMemoryBarrier*)jniLongToPointer(pMemoryBarriers)),
        *((uint32_t*)jniLongToPointer(bufferMemoryBarrierCount)),
        ((VkBufferMemoryBarrier*)jniLongToPointer(pBufferMemoryBarriers)),
        *((uint32_t*)jniLongToPointer(imageMemoryBarrierCount)),
        ((VkImageMemoryBarrier*)jniLongToPointer(pImageMemoryBarriers))
    );
}


void Java_cz_mg_vulkan_PFNvkCmdWaitEvents_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jint eventCount, jlong pEvents, jint srcStageMask, jint dstStageMask, jint memoryBarrierCount, jlong pMemoryBarriers, jint bufferMemoryBarrierCount, jlong pBufferMemoryBarriers, jint imageMemoryBarrierCount, jlong pImageMemoryBarriers){
    (void)env;
    (void)jc;
    PFN_vkCmdWaitEvents f = (PFN_vkCmdWaitEvents)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (uint32_t)eventCount,
        ((VkEvent*)jniLongToPointer(pEvents)),
        (VkPipelineStageFlags)srcStageMask,
        (VkPipelineStageFlags)dstStageMask,
        (uint32_t)memoryBarrierCount,
        ((VkMemoryBarrier*)jniLongToPointer(pMemoryBarriers)),
        (uint32_t)bufferMemoryBarrierCount,
        ((VkBufferMemoryBarrier*)jniLongToPointer(pBufferMemoryBarriers)),
        (uint32_t)imageMemoryBarrierCount,
        ((VkImageMemoryBarrier*)jniLongToPointer(pImageMemoryBarriers))
    );
}

