#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCreateSwapchainKHR_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pSwapchain, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkCreateSwapchainKHR f = (PFN_vkCreateSwapchainKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkSwapchainCreateInfoKHR*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkSwapchainKHR*)jniLongToPointer(pSwapchain))
    );
}
