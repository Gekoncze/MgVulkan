#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdClearDepthStencilImage_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong image, jint imageLayout, jlong pDepthStencil, jint rangeCount, jlong pRanges){
    (void)env;
    (void)jc;
    PFN_vkCmdClearDepthStencilImage f = (PFN_vkCmdClearDepthStencilImage)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkImage*)jniLongToPointer(image)),
        (VkImageLayout)imageLayout,
        ((VkClearDepthStencilValue*)jniLongToPointer(pDepthStencil)),
        (uint32_t)rangeCount,
        ((VkImageSubresourceRange*)jniLongToPointer(pRanges))
    );
}

