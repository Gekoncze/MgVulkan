#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCreateFramebuffer_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pFramebuffer, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkCreateFramebuffer f = (PFN_vkCreateFramebuffer)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkFramebufferCreateInfo*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkFramebuffer*)jniLongToPointer(pFramebuffer))
    );
}


jint Java_cz_mg_vulkan_PFNvkCreateFramebuffer_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pFramebuffer){
    (void)env;
    (void)jc;
    PFN_vkCreateFramebuffer f = (PFN_vkCreateFramebuffer)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkFramebufferCreateInfo*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkFramebuffer*)jniLongToPointer(pFramebuffer))
    );
}

