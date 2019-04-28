#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkGetSwapchainImagesKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong swapchain, jlong pSwapchainImageCount, jlong pSwapchainImages){
    (void)env;
    (void)jc;
    PFN_vkGetSwapchainImagesKHR f = (PFN_vkGetSwapchainImagesKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkSwapchainKHR*)jniLongToPointer(swapchain)),
        ((uint32_t*)jniLongToPointer(pSwapchainImageCount)),
        ((VkImage*)jniLongToPointer(pSwapchainImages))
    );
}

