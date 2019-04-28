#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdCopyQueryPoolResults_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong queryPool, jint firstQuery, jint queryCount, jlong dstBuffer, jlong dstOffset, jlong stride, jint flags){
    (void)env;
    (void)jc;
    PFN_vkCmdCopyQueryPoolResults f = (PFN_vkCmdCopyQueryPoolResults)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkQueryPool*)jniLongToPointer(queryPool)),
        (uint32_t)firstQuery,
        (uint32_t)queryCount,
        *((VkBuffer*)jniLongToPointer(dstBuffer)),
        (VkDeviceSize)dstOffset,
        (VkDeviceSize)stride,
        (VkQueryResultFlags)flags
    );
}

