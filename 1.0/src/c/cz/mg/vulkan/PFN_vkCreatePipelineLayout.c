#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCreatePipelineLayout_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pPipelineLayout, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkCreatePipelineLayout f = (PFN_vkCreatePipelineLayout)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkPipelineLayoutCreateInfo*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkPipelineLayout*)jniLongToPointer(pPipelineLayout))
    );
}


jint Java_cz_mg_vulkan_PFNvkCreatePipelineLayout_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pPipelineLayout){
    (void)env;
    (void)jc;
    PFN_vkCreatePipelineLayout f = (PFN_vkCreatePipelineLayout)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkPipelineLayoutCreateInfo*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkPipelineLayout*)jniLongToPointer(pPipelineLayout))
    );
}

