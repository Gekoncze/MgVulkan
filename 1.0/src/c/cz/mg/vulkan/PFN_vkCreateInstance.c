#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCreateInstance_callNative(JNIEnv* env, jclass jc, jlong address, jlong pCreateInfo, jlong pAllocator, jlong pInstance, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkCreateInstance f = (PFN_vkCreateInstance)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        ((VkInstanceCreateInfo*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkInstance*)jniLongToPointer(pInstance))
    );
}


jint Java_cz_mg_vulkan_PFNvkCreateInstance_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong pCreateInfo, jlong pAllocator, jlong pInstance){
    (void)env;
    (void)jc;
    PFN_vkCreateInstance f = (PFN_vkCreateInstance)jniLongToFunctionPointer(address);
    return f(
        ((VkInstanceCreateInfo*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkInstance*)jniLongToPointer(pInstance))
    );
}

