#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCreateDisplayPlaneSurfaceKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkCreateDisplayPlaneSurfaceKHR f = (PFN_vkCreateDisplayPlaneSurfaceKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkInstance*)jniLongToPointer(instance)),
        ((VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkSurfaceKHR*)jniLongToPointer(pSurface))
    );
}


jint Java_cz_mg_vulkan_PFNvkCreateDisplayPlaneSurfaceKHR_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pSurface){
    (void)env;
    (void)jc;
    PFN_vkCreateDisplayPlaneSurfaceKHR f = (PFN_vkCreateDisplayPlaneSurfaceKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkInstance*)jniLongToPointer(instance)),
        ((VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkSurfaceKHR*)jniLongToPointer(pSurface))
    );
}

