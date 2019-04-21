#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetDescriptorSetLayoutSupport_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pCreateInfo, jlong pSupport){
    (void)env;
    (void)jc;
    PFN_vkGetDescriptorSetLayoutSupport f = (PFN_vkGetDescriptorSetLayoutSupport)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkDescriptorSetLayoutCreateInfo*)jniLongToPointer(pCreateInfo)),
        ((VkDescriptorSetLayoutSupport*)jniLongToPointer(pSupport))
    );
}
