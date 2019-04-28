#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdPushConstants_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong layout, jlong stageFlags, jlong offset, jlong size, jlong pValues){
    (void)env;
    (void)jc;
    PFN_vkCmdPushConstants f = (PFN_vkCmdPushConstants)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkPipelineLayout*)jniLongToPointer(layout)),
        *((VkShaderStageFlags*)jniLongToPointer(stageFlags)),
        *((uint32_t*)jniLongToPointer(offset)),
        *((uint32_t*)jniLongToPointer(size)),
        ((void*)jniLongToPointer(pValues))
    );
}


void Java_cz_mg_vulkan_PFNvkCmdPushConstants_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong layout, jint stageFlags, jint offset, jint size, jlong pValues){
    (void)env;
    (void)jc;
    PFN_vkCmdPushConstants f = (PFN_vkCmdPushConstants)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkPipelineLayout*)jniLongToPointer(layout)),
        (VkShaderStageFlags)stageFlags,
        (uint32_t)offset,
        (uint32_t)size,
        ((void*)jniLongToPointer(pValues))
    );
}

