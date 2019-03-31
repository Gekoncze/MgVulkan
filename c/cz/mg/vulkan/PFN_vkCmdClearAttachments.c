#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdClearAttachments_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong attachmentCount, jlong pAttachments, jlong rectCount, jlong pRects){
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
