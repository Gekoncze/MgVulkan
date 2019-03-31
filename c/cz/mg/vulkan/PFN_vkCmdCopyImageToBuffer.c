#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdCopyImageToBuffer_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong srcImage, jlong srcImageLayout, jlong dstBuffer, jlong regionCount, jlong pRegions){
    (void)env;
    (void)jc;
    PFN_vkCmdCopyImageToBuffer f = (PFN_vkCmdCopyImageToBuffer)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkImage*)jniLongToPointer(srcImage)),
        *((VkImageLayout*)jniLongToPointer(srcImageLayout)),
        *((VkBuffer*)jniLongToPointer(dstBuffer)),
        *((uint32_t*)jniLongToPointer(regionCount)),
        ((VkBufferImageCopy*)jniLongToPointer(pRegions))
    );
}
