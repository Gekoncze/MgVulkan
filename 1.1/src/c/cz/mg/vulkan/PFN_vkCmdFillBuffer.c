#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdFillBuffer_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong dstBuffer, jlong dstOffset, jlong size, jint data){
    (void)env;
    (void)jc;
    PFN_vkCmdFillBuffer f = (PFN_vkCmdFillBuffer)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkBuffer*)jniLongToPointer(dstBuffer)),
        (VkDeviceSize)dstOffset,
        (VkDeviceSize)size,
        (uint32_t)data
    );
}

