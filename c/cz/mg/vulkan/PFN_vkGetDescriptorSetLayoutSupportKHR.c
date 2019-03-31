#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetDescriptorSetLayoutSupportKHR_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pCreateInfo, jlong pSupport){
    (void)env;
    (void)jc;
    PFN_vkGetDescriptorSetLayoutSupportKHR f = (PFN_vkGetDescriptorSetLayoutSupportKHR)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkDescriptorSetLayoutCreateInfo*)jniLongToPointer(pCreateInfo)),
        ((VkDescriptorSetLayoutSupport*)jniLongToPointer(pSupport))
    );
}
