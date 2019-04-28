#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdDrawIndirectCountAMD_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong buffer, jlong offset, jlong countBuffer, jlong countBufferOffset, jlong maxDrawCount, jlong stride){
    (void)env;
    (void)jc;
    PFN_vkCmdDrawIndirectCountAMD f = (PFN_vkCmdDrawIndirectCountAMD)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkBuffer*)jniLongToPointer(buffer)),
        *((VkDeviceSize*)jniLongToPointer(offset)),
        *((VkBuffer*)jniLongToPointer(countBuffer)),
        *((VkDeviceSize*)jniLongToPointer(countBufferOffset)),
        *((uint32_t*)jniLongToPointer(maxDrawCount)),
        *((uint32_t*)jniLongToPointer(stride))
    );
}


void Java_cz_mg_vulkan_PFNvkCmdDrawIndirectCountAMD_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong buffer, jlong offset, jlong countBuffer, jlong countBufferOffset, jint maxDrawCount, jint stride){
    (void)env;
    (void)jc;
    PFN_vkCmdDrawIndirectCountAMD f = (PFN_vkCmdDrawIndirectCountAMD)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkBuffer*)jniLongToPointer(buffer)),
        (VkDeviceSize)offset,
        *((VkBuffer*)jniLongToPointer(countBuffer)),
        (VkDeviceSize)countBufferOffset,
        (uint32_t)maxDrawCount,
        (uint32_t)stride
    );
}

