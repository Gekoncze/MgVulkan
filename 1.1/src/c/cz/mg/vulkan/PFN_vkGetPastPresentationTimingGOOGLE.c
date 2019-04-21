#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetPastPresentationTimingGOOGLE_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong swapchain, jlong pPresentationTimingCount, jlong pPresentationTimings, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetPastPresentationTimingGOOGLE f = (PFN_vkGetPastPresentationTimingGOOGLE)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkSwapchainKHR*)jniLongToPointer(swapchain)),
        ((uint32_t*)jniLongToPointer(pPresentationTimingCount)),
        ((VkPastPresentationTimingGOOGLE*)jniLongToPointer(pPresentationTimings))
    );
}
