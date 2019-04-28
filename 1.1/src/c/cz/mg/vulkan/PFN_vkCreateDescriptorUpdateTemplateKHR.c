#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCreateDescriptorUpdateTemplateKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pDescriptorUpdateTemplate, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkCreateDescriptorUpdateTemplateKHR f = (PFN_vkCreateDescriptorUpdateTemplateKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkDescriptorUpdateTemplate*)jniLongToPointer(pDescriptorUpdateTemplate))
    );
}


jint Java_cz_mg_vulkan_PFNvkCreateDescriptorUpdateTemplateKHR_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pDescriptorUpdateTemplate){
    (void)env;
    (void)jc;
    PFN_vkCreateDescriptorUpdateTemplateKHR f = (PFN_vkCreateDescriptorUpdateTemplateKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkDescriptorUpdateTemplate*)jniLongToPointer(pDescriptorUpdateTemplate))
    );
}

