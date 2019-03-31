#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdFillBuffer_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong dstBuffer, jlong dstOffset, jlong size, jlong data){
    (void)env;
    (void)jc;
    PFN_vkCmdFillBuffer f = (PFN_vkCmdFillBuffer)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkBuffer*)jniLongToPointer(dstBuffer)),
        *((VkDeviceSize*)jniLongToPointer(dstOffset)),
        *((VkDeviceSize*)jniLongToPointer(size)),
        *((uint32_t*)jniLongToPointer(data))
    );
}
