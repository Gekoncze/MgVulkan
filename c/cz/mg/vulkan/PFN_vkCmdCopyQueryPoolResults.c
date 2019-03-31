#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdCopyQueryPoolResults_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong queryPool, jlong firstQuery, jlong queryCount, jlong dstBuffer, jlong dstOffset, jlong stride, jlong flags){
    (void)env;
    (void)jc;
    PFN_vkCmdCopyQueryPoolResults f = (PFN_vkCmdCopyQueryPoolResults)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkQueryPool*)jniLongToPointer(queryPool)),
        *((uint32_t*)jniLongToPointer(firstQuery)),
        *((uint32_t*)jniLongToPointer(queryCount)),
        *((VkBuffer*)jniLongToPointer(dstBuffer)),
        *((VkDeviceSize*)jniLongToPointer(dstOffset)),
        *((VkDeviceSize*)jniLongToPointer(stride)),
        *((VkQueryResultFlags*)jniLongToPointer(flags))
    );
}
