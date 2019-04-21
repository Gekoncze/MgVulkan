#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCreateSharedSwapchainsKHR_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong swapchainCount, jlong pCreateInfos, jlong pAllocator, jlong pSwapchains, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkCreateSharedSwapchainsKHR f = (PFN_vkCreateSharedSwapchainsKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((uint32_t*)jniLongToPointer(swapchainCount)),
        ((VkSwapchainCreateInfoKHR*)jniLongToPointer(pCreateInfos)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkSwapchainKHR*)jniLongToPointer(pSwapchains))
    );
}
