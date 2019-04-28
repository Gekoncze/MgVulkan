#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdUpdateBuffer_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong dstBuffer, jlong dstOffset, jlong dataSize, jlong pData){
    (void)env;
    (void)jc;
    PFN_vkCmdUpdateBuffer f = (PFN_vkCmdUpdateBuffer)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkBuffer*)jniLongToPointer(dstBuffer)),
        (VkDeviceSize)dstOffset,
        (VkDeviceSize)dataSize,
        ((void*)jniLongToPointer(pData))
    );
}

