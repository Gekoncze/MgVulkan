#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdPushConstants_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong layout, jlong stageFlags, jlong offset, jlong size, jlong pValues){
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
