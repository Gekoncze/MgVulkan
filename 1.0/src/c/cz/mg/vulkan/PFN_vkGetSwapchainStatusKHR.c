#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetSwapchainStatusKHR_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong swapchain, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetSwapchainStatusKHR f = (PFN_vkGetSwapchainStatusKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkSwapchainKHR*)jniLongToPointer(swapchain))
    );
}
