#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdClearAttachments_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong attachmentCount, jlong pAttachments, jlong rectCount, jlong pRects){
    (void)env;
    (void)jc;
    PFN_vkCmdClearAttachments f = (PFN_vkCmdClearAttachments)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((uint32_t*)jniLongToPointer(attachmentCount)),
        ((VkClearAttachment*)jniLongToPointer(pAttachments)),
        *((uint32_t*)jniLongToPointer(rectCount)),
        ((VkClearRect*)jniLongToPointer(pRects))
    );
}


void Java_cz_mg_vulkan_PFNvkCmdClearAttachments_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jint attachmentCount, jlong pAttachments, jint rectCount, jlong pRects){
    (void)env;
    (void)jc;
    PFN_vkCmdClearAttachments f = (PFN_vkCmdClearAttachments)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (uint32_t)attachmentCount,
        ((VkClearAttachment*)jniLongToPointer(pAttachments)),
        (uint32_t)rectCount,
        ((VkClearRect*)jniLongToPointer(pRects))
    );
}

