#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetDisplayPlaneSupportedDisplaysKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong planeIndex, jlong pDisplayCount, jlong pDisplays, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetDisplayPlaneSupportedDisplaysKHR f = (PFN_vkGetDisplayPlaneSupportedDisplaysKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((uint32_t*)jniLongToPointer(planeIndex)),
        ((uint32_t*)jniLongToPointer(pDisplayCount)),
        ((VkDisplayKHR*)jniLongToPointer(pDisplays))
    );
}


jint Java_cz_mg_vulkan_PFNvkGetDisplayPlaneSupportedDisplaysKHR_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jint planeIndex, jlong pDisplayCount, jlong pDisplays){
    (void)env;
    (void)jc;
    PFN_vkGetDisplayPlaneSupportedDisplaysKHR f = (PFN_vkGetDisplayPlaneSupportedDisplaysKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        (uint32_t)planeIndex,
        ((uint32_t*)jniLongToPointer(pDisplayCount)),
        ((VkDisplayKHR*)jniLongToPointer(pDisplays))
    );
}

