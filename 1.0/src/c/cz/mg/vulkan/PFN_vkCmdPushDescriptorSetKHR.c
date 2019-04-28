#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdPushDescriptorSetKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jint pipelineBindPoint, jlong layout, jint set, jint descriptorWriteCount, jlong pDescriptorWrites){
    (void)env;
    (void)jc;
    PFN_vkCmdPushDescriptorSetKHR f = (PFN_vkCmdPushDescriptorSetKHR)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (VkPipelineBindPoint)pipelineBindPoint,
        *((VkPipelineLayout*)jniLongToPointer(layout)),
        (uint32_t)set,
        (uint32_t)descriptorWriteCount,
        ((VkWriteDescriptorSet*)jniLongToPointer(pDescriptorWrites))
    );
}

