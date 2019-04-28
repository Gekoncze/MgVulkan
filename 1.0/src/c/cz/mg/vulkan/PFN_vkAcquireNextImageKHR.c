#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkAcquireNextImageKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong swapchain, jlong timeout, jlong semaphore, jlong fence, jlong pImageIndex){
    (void)env;
    (void)jc;
    PFN_vkAcquireNextImageKHR f = (PFN_vkAcquireNextImageKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkSwapchainKHR*)jniLongToPointer(swapchain)),
        (uint64_t)timeout,
        *((VkSemaphore*)jniLongToPointer(semaphore)),
        *((VkFence*)jniLongToPointer(fence)),
        ((uint32_t*)jniLongToPointer(pImageIndex))
    );
}

