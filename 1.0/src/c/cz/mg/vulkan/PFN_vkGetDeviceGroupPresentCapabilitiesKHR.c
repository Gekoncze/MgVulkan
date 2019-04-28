#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetDeviceGroupPresentCapabilitiesKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pDeviceGroupPresentCapabilities, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetDeviceGroupPresentCapabilitiesKHR f = (PFN_vkGetDeviceGroupPresentCapabilitiesKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(pDeviceGroupPresentCapabilities))
    );
}


jint Java_cz_mg_vulkan_PFNvkGetDeviceGroupPresentCapabilitiesKHR_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pDeviceGroupPresentCapabilities){
    (void)env;
    (void)jc;
    PFN_vkGetDeviceGroupPresentCapabilitiesKHR f = (PFN_vkGetDeviceGroupPresentCapabilitiesKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(pDeviceGroupPresentCapabilities))
    );
}

