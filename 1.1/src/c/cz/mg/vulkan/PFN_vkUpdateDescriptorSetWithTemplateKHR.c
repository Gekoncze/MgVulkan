#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkUpdateDescriptorSetWithTemplateKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong descriptorSet, jlong descriptorUpdateTemplate, jlong pData){
    (void)env;
    (void)jc;
    PFN_vkUpdateDescriptorSetWithTemplateKHR f = (PFN_vkUpdateDescriptorSetWithTemplateKHR)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkDescriptorSet*)jniLongToPointer(descriptorSet)),
        *((VkDescriptorUpdateTemplate*)jniLongToPointer(descriptorUpdateTemplate)),
        ((void*)jniLongToPointer(pData))
    );
}

