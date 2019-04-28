#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCreateDescriptorSetLayout_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pSetLayout, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkCreateDescriptorSetLayout f = (PFN_vkCreateDescriptorSetLayout)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkDescriptorSetLayoutCreateInfo*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkDescriptorSetLayout*)jniLongToPointer(pSetLayout))
    );
}


jint Java_cz_mg_vulkan_PFNvkCreateDescriptorSetLayout_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pSetLayout){
    (void)env;
    (void)jc;
    PFN_vkCreateDescriptorSetLayout f = (PFN_vkCreateDescriptorSetLayout)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkDescriptorSetLayoutCreateInfo*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkDescriptorSetLayout*)jniLongToPointer(pSetLayout))
    );
}

