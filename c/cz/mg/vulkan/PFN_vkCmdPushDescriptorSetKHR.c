#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdPushDescriptorSetKHR_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong pipelineBindPoint, jlong layout, jlong set, jlong descriptorWriteCount, jlong pDescriptorWrites){
    (void)env;
    (void)jc;
    PFN_vkCmdPushDescriptorSetKHR f = (PFN_vkCmdPushDescriptorSetKHR)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkPipelineBindPoint*)jniLongToPointer(pipelineBindPoint)),
        *((VkPipelineLayout*)jniLongToPointer(layout)),
        *((uint32_t*)jniLongToPointer(set)),
        *((uint32_t*)jniLongToPointer(descriptorWriteCount)),
        ((VkWriteDescriptorSet*)jniLongToPointer(pDescriptorWrites))
    );
}
