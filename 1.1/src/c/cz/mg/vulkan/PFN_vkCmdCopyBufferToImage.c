#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdCopyBufferToImage_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong srcBuffer, jlong dstImage, jlong dstImageLayout, jlong regionCount, jlong pRegions){
    (void)env;
    (void)jc;
    PFN_vkCmdCopyBufferToImage f = (PFN_vkCmdCopyBufferToImage)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkBuffer*)jniLongToPointer(srcBuffer)),
        *((VkImage*)jniLongToPointer(dstImage)),
        *((VkImageLayout*)jniLongToPointer(dstImageLayout)),
        *((uint32_t*)jniLongToPointer(regionCount)),
        ((VkBufferImageCopy*)jniLongToPointer(pRegions))
    );
}


void Java_cz_mg_vulkan_PFNvkCmdCopyBufferToImage_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong srcBuffer, jlong dstImage, jint dstImageLayout, jint regionCount, jlong pRegions){
    (void)env;
    (void)jc;
    PFN_vkCmdCopyBufferToImage f = (PFN_vkCmdCopyBufferToImage)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkBuffer*)jniLongToPointer(srcBuffer)),
        *((VkImage*)jniLongToPointer(dstImage)),
        (VkImageLayout)dstImageLayout,
        (uint32_t)regionCount,
        ((VkBufferImageCopy*)jniLongToPointer(pRegions))
    );
}

