#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetRefreshCycleDurationGOOGLE_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong swapchain, jlong pDisplayTimingProperties, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetRefreshCycleDurationGOOGLE f = (PFN_vkGetRefreshCycleDurationGOOGLE)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkSwapchainKHR*)jniLongToPointer(swapchain)),
        ((VkRefreshCycleDurationGOOGLE*)jniLongToPointer(pDisplayTimingProperties))
    );
}


jint Java_cz_mg_vulkan_PFNvkGetRefreshCycleDurationGOOGLE_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong swapchain, jlong pDisplayTimingProperties){
    (void)env;
    (void)jc;
    PFN_vkGetRefreshCycleDurationGOOGLE f = (PFN_vkGetRefreshCycleDurationGOOGLE)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkSwapchainKHR*)jniLongToPointer(swapchain)),
        ((VkRefreshCycleDurationGOOGLE*)jniLongToPointer(pDisplayTimingProperties))
    );
}

