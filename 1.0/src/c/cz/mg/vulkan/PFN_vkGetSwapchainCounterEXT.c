#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkGetSwapchainCounterEXT_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong swapchain, jint counter, jlong pCounterValue){
    (void)env;
    (void)jc;
    PFN_vkGetSwapchainCounterEXT f = (PFN_vkGetSwapchainCounterEXT)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkSwapchainKHR*)jniLongToPointer(swapchain)),
        (VkSurfaceCounterFlagBitsEXT)counter,
        ((uint64_t*)jniLongToPointer(pCounterValue))
    );
}

