#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCreateDisplayModeKHR_call(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong display, jlong pCreateInfo, jlong pAllocator, jlong pMode, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkCreateDisplayModeKHR f = (PFN_vkCreateDisplayModeKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((VkDisplayKHR*)jniLongToPointer(display)),
        ((VkDisplayModeCreateInfoKHR*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkDisplayModeKHR*)jniLongToPointer(pMode))
    );
}
