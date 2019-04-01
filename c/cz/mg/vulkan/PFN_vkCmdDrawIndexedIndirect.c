#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdDrawIndexedIndirect_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong buffer, jlong offset, jlong drawCount, jlong stride){
    (void)env;
    (void)jc;
    PFN_vkCmdDrawIndexedIndirect f = (PFN_vkCmdDrawIndexedIndirect)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkBuffer*)jniLongToPointer(buffer)),
        *((VkDeviceSize*)jniLongToPointer(offset)),
        *((uint32_t*)jniLongToPointer(drawCount)),
        *((uint32_t*)jniLongToPointer(stride))
    );
}
