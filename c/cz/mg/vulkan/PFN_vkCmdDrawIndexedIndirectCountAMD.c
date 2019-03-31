#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdDrawIndexedIndirectCountAMD_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong buffer, jlong offset, jlong countBuffer, jlong countBufferOffset, jlong maxDrawCount, jlong stride){
    (void)env;
    (void)jc;
    PFN_vkCmdDrawIndexedIndirectCountAMD f = (PFN_vkCmdDrawIndexedIndirectCountAMD)jniLongToFunctionPointer(address);
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
