#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdCopyImageToBuffer_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstBuffer, jint regionCount, jlong pRegions){
    (void)env;
    (void)jc;
    PFN_vkCmdCopyImageToBuffer f = (PFN_vkCmdCopyImageToBuffer)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkImage*)jniLongToPointer(srcImage)),
        (VkImageLayout)srcImageLayout,
        *((VkBuffer*)jniLongToPointer(dstBuffer)),
        (uint32_t)regionCount,
        ((VkBufferImageCopy*)jniLongToPointer(pRegions))
    );
}

