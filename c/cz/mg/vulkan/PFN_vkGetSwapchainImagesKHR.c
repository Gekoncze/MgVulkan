#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetSwapchainImagesKHR_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong swapchain, jlong pSwapchainImageCount, jlong pSwapchainImages, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetSwapchainImagesKHR f = (PFN_vkGetSwapchainImagesKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkSwapchainKHR*)jniLongToPointer(swapchain)),
        ((uint32_t*)jniLongToPointer(pSwapchainImageCount)),
        ((VkImage*)jniLongToPointer(pSwapchainImages))
    );
}
