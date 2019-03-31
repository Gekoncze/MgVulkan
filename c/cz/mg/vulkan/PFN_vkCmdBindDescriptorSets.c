#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdBindDescriptorSets_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong pipelineBindPoint, jlong layout, jlong firstSet, jlong descriptorSetCount, jlong pDescriptorSets, jlong dynamicOffsetCount, jlong pDynamicOffsets){
    (void)env;
    (void)jc;
    PFN_vkCmdBindDescriptorSets f = (PFN_vkCmdBindDescriptorSets)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkPipelineBindPoint*)jniLongToPointer(pipelineBindPoint)),
        *((VkPipelineLayout*)jniLongToPointer(layout)),
        *((uint32_t*)jniLongToPointer(firstSet)),
        *((uint32_t*)jniLongToPointer(descriptorSetCount)),
        ((VkDescriptorSet*)jniLongToPointer(pDescriptorSets)),
        *((uint32_t*)jniLongToPointer(dynamicOffsetCount)),
        ((uint32_t*)jniLongToPointer(pDynamicOffsets))
    );
}
