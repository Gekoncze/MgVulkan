#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetDisplayPlaneCapabilitiesKHR_call(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong mode, jlong planeIndex, jlong pCapabilities, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetDisplayPlaneCapabilitiesKHR f = (PFN_vkGetDisplayPlaneCapabilitiesKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((VkDisplayModeKHR*)jniLongToPointer(mode)),
        *((uint32_t*)jniLongToPointer(planeIndex)),
        ((VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(pCapabilities))
    );
}
