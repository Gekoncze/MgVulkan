#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdBeginRenderPass_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong pRenderPassBegin, jlong contents){
    (void)env;
    (void)jc;
    PFN_vkCmdBeginRenderPass f = (PFN_vkCmdBeginRenderPass)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        ((VkRenderPassBeginInfo*)jniLongToPointer(pRenderPassBegin)),
        *((VkSubpassContents*)jniLongToPointer(contents))
    );
}


void Java_cz_mg_vulkan_PFNvkCmdBeginRenderPass_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong pRenderPassBegin, jint contents){
    (void)env;
    (void)jc;
    PFN_vkCmdBeginRenderPass f = (PFN_vkCmdBeginRenderPass)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        ((VkRenderPassBeginInfo*)jniLongToPointer(pRenderPassBegin)),
        (VkSubpassContents)contents
    );
}

