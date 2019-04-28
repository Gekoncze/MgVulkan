#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdPipelineBarrier_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong srcStageMask, jlong dstStageMask, jlong dependencyFlags, jlong memoryBarrierCount, jlong pMemoryBarriers, jlong bufferMemoryBarrierCount, jlong pBufferMemoryBarriers, jlong imageMemoryBarrierCount, jlong pImageMemoryBarriers){
    (void)env;
    (void)jc;
    PFN_vkCmdPipelineBarrier f = (PFN_vkCmdPipelineBarrier)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkPipelineStageFlags*)jniLongToPointer(srcStageMask)),
        *((VkPipelineStageFlags*)jniLongToPointer(dstStageMask)),
        *((VkDependencyFlags*)jniLongToPointer(dependencyFlags)),
        *((uint32_t*)jniLongToPointer(memoryBarrierCount)),
        ((VkMemoryBarrier*)jniLongToPointer(pMemoryBarriers)),
        *((uint32_t*)jniLongToPointer(bufferMemoryBarrierCount)),
        ((VkBufferMemoryBarrier*)jniLongToPointer(pBufferMemoryBarriers)),
        *((uint32_t*)jniLongToPointer(imageMemoryBarrierCount)),
        ((VkImageMemoryBarrier*)jniLongToPointer(pImageMemoryBarriers))
    );
}


void Java_cz_mg_vulkan_PFNvkCmdPipelineBarrier_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jint srcStageMask, jint dstStageMask, jint dependencyFlags, jint memoryBarrierCount, jlong pMemoryBarriers, jint bufferMemoryBarrierCount, jlong pBufferMemoryBarriers, jint imageMemoryBarrierCount, jlong pImageMemoryBarriers){
    (void)env;
    (void)jc;
    PFN_vkCmdPipelineBarrier f = (PFN_vkCmdPipelineBarrier)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (VkPipelineStageFlags)srcStageMask,
        (VkPipelineStageFlags)dstStageMask,
        (VkDependencyFlags)dependencyFlags,
        (uint32_t)memoryBarrierCount,
        ((VkMemoryBarrier*)jniLongToPointer(pMemoryBarriers)),
        (uint32_t)bufferMemoryBarrierCount,
        ((VkBufferMemoryBarrier*)jniLongToPointer(pBufferMemoryBarriers)),
        (uint32_t)imageMemoryBarrierCount,
        ((VkImageMemoryBarrier*)jniLongToPointer(pImageMemoryBarriers))
    );
}

