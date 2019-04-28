#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkAcquireNextImage2KHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pAcquireInfo, jlong pImageIndex, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkAcquireNextImage2KHR f = (PFN_vkAcquireNextImage2KHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkAcquireNextImageInfoKHR*)jniLongToPointer(pAcquireInfo)),
        ((uint32_t*)jniLongToPointer(pImageIndex))
    );
}


jint Java_cz_mg_vulkan_PFNvkAcquireNextImage2KHR_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pAcquireInfo, jlong pImageIndex){
    (void)env;
    (void)jc;
    PFN_vkAcquireNextImage2KHR f = (PFN_vkAcquireNextImage2KHR)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkAcquireNextImageInfoKHR*)jniLongToPointer(pAcquireInfo)),
        ((uint32_t*)jniLongToPointer(pImageIndex))
    );
}

