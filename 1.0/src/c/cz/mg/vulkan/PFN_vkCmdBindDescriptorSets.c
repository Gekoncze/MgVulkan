#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdBindDescriptorSets_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jint pipelineBindPoint, jlong layout, jint firstSet, jint descriptorSetCount, jlong pDescriptorSets, jint dynamicOffsetCount, jlong pDynamicOffsets){
    (void)env;
    (void)jc;
    PFN_vkCmdBindDescriptorSets f = (PFN_vkCmdBindDescriptorSets)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (VkPipelineBindPoint)pipelineBindPoint,
        *((VkPipelineLayout*)jniLongToPointer(layout)),
        (uint32_t)firstSet,
        (uint32_t)descriptorSetCount,
        ((VkDescriptorSet*)jniLongToPointer(pDescriptorSets)),
        (uint32_t)dynamicOffsetCount,
        ((uint32_t*)jniLongToPointer(pDynamicOffsets))
    );
}

