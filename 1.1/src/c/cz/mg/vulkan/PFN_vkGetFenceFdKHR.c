#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetFenceFdKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pGetFdInfo, jlong pFd, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetFenceFdKHR f = (PFN_vkGetFenceFdKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkFenceGetFdInfoKHR*)jniLongToPointer(pGetFdInfo)),
        ((int*)jniLongToPointer(pFd))
    );
}


jint Java_cz_mg_vulkan_PFNvkGetFenceFdKHR_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pGetFdInfo, jlong pFd){
    (void)env;
    (void)jc;
    PFN_vkGetFenceFdKHR f = (PFN_vkGetFenceFdKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkFenceGetFdInfoKHR*)jniLongToPointer(pGetFdInfo)),
        ((int*)jniLongToPointer(pFd))
    );
}

