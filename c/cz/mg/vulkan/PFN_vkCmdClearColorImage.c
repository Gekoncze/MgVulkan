#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdClearColorImage_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong image, jlong imageLayout, jlong pColor, jlong rangeCount, jlong pRanges){
    (void)env;
    (void)jc;
    PFN_vkCmdClearColorImage f = (PFN_vkCmdClearColorImage)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkImage*)jniLongToPointer(image)),
        *((VkImageLayout*)jniLongToPointer(imageLayout)),
        ((VkClearColorValue*)jniLongToPointer(pColor)),
        *((uint32_t*)jniLongToPointer(rangeCount)),
        ((VkImageSubresourceRange*)jniLongToPointer(pRanges))
    );
}
