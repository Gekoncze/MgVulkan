#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdCopyImage_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstImage, jint dstImageLayout, jint regionCount, jlong pRegions){
    (void)env;
    (void)jc;
    PFN_vkCmdCopyImage f = (PFN_vkCmdCopyImage)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkImage*)jniLongToPointer(srcImage)),
        (VkImageLayout)srcImageLayout,
        *((VkImage*)jniLongToPointer(dstImage)),
        (VkImageLayout)dstImageLayout,
        (uint32_t)regionCount,
        ((VkImageCopy*)jniLongToPointer(pRegions))
    );
}

