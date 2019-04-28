#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCreateSamplerYcbcrConversionKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pYcbcrConversion, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkCreateSamplerYcbcrConversionKHR f = (PFN_vkCreateSamplerYcbcrConversionKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkSamplerYcbcrConversion*)jniLongToPointer(pYcbcrConversion))
    );
}


jint Java_cz_mg_vulkan_PFNvkCreateSamplerYcbcrConversionKHR_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pYcbcrConversion){
    (void)env;
    (void)jc;
    PFN_vkCreateSamplerYcbcrConversionKHR f = (PFN_vkCreateSamplerYcbcrConversionKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkSamplerYcbcrConversion*)jniLongToPointer(pYcbcrConversion))
    );
}

