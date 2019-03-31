#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdClearDepthStencilImage_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong image, jlong imageLayout, jlong pDepthStencil, jlong rangeCount, jlong pRanges){
    (void)env;
    (void)jc;
    PFN_vkCmdClearDepthStencilImage f = (PFN_vkCmdClearDepthStencilImage)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkImage*)jniLongToPointer(image)),
        *((VkImageLayout*)jniLongToPointer(imageLayout)),
        ((VkClearDepthStencilValue*)jniLongToPointer(pDepthStencil)),
        *((uint32_t*)jniLongToPointer(rangeCount)),
        ((VkImageSubresourceRange*)jniLongToPointer(pRanges))
    );
}
