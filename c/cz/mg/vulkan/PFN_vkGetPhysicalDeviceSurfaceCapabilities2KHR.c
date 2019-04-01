#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR_call(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pSurfaceInfo, jlong pSurfaceCapabilities, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR f = (PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((VkPhysicalDeviceSurfaceInfo2KHR*)jniLongToPointer(pSurfaceInfo)),
        ((VkSurfaceCapabilities2KHR*)jniLongToPointer(pSurfaceCapabilities))
    );
}
