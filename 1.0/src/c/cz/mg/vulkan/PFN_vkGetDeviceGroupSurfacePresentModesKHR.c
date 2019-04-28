#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetDeviceGroupSurfacePresentModesKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong surface, jlong pModes, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetDeviceGroupSurfacePresentModesKHR f = (PFN_vkGetDeviceGroupSurfacePresentModesKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkSurfaceKHR*)jniLongToPointer(surface)),
        ((VkDeviceGroupPresentModeFlagsKHR*)jniLongToPointer(pModes))
    );
}


jint Java_cz_mg_vulkan_PFNvkGetDeviceGroupSurfacePresentModesKHR_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong surface, jlong pModes){
    (void)env;
    (void)jc;
    PFN_vkGetDeviceGroupSurfacePresentModesKHR f = (PFN_vkGetDeviceGroupSurfacePresentModesKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkSurfaceKHR*)jniLongToPointer(surface)),
        ((VkDeviceGroupPresentModeFlagsKHR*)jniLongToPointer(pModes))
    );
}

