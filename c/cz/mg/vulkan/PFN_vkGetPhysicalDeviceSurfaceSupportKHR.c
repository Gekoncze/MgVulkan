#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetPhysicalDeviceSurfaceSupportKHR_call(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong queueFamilyIndex, jlong surface, jlong pSupported, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDeviceSurfaceSupportKHR f = (PFN_vkGetPhysicalDeviceSurfaceSupportKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((uint32_t*)jniLongToPointer(queueFamilyIndex)),
        *((VkSurfaceKHR*)jniLongToPointer(surface)),
        ((VkBool32*)jniLongToPointer(pSupported))
    );
}
