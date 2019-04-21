#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkDestroySwapchainKHR_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong swapchain, jlong pAllocator){
    (void)env;
    (void)jc;
    PFN_vkDestroySwapchainKHR f = (PFN_vkDestroySwapchainKHR)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkSwapchainKHR*)jniLongToPointer(swapchain)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator))
    );
}
