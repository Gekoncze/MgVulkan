#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdPushDescriptorSetWithTemplateKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong descriptorUpdateTemplate, jlong layout, jint set, jlong pData){
    (void)env;
    (void)jc;
    PFN_vkCmdPushDescriptorSetWithTemplateKHR f = (PFN_vkCmdPushDescriptorSetWithTemplateKHR)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkDescriptorUpdateTemplate*)jniLongToPointer(descriptorUpdateTemplate)),
        *((VkPipelineLayout*)jniLongToPointer(layout)),
        (uint32_t)set,
        ((void*)jniLongToPointer(pData))
    );
}

