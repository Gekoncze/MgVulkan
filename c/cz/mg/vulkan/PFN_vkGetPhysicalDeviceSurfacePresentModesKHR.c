#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetPhysicalDeviceSurfacePresentModesKHR_call(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong surface, jlong pPresentModeCount, jlong pPresentModes, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceSurfacePresentModesKHR f = (PFN_vkGetPhysicalDeviceSurfacePresentModesKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((VkSurfaceKHR*)jniLongToPointer(surface)),
        ((uint32_t*)jniLongToPointer(pPresentModeCount)),
        ((VkPresentModeKHR*)jniLongToPointer(pPresentModes))
    );
}
