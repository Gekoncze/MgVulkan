#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetPhysicalDevicePresentRectanglesKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong surface, jlong pRectCount, jlong pRects, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDevicePresentRectanglesKHR f = (PFN_vkGetPhysicalDevicePresentRectanglesKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((VkSurfaceKHR*)jniLongToPointer(surface)),
        ((uint32_t*)jniLongToPointer(pRectCount)),
        ((VkRect2D*)jniLongToPointer(pRects))
    );
}


jint Java_cz_mg_vulkan_PFNvkGetPhysicalDevicePresentRectanglesKHR_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong surface, jlong pRectCount, jlong pRects){
    (void)env;
    (void)jc;
    PFN_vkGetPhysicalDevicePresentRectanglesKHR f = (PFN_vkGetPhysicalDevicePresentRectanglesKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((VkSurfaceKHR*)jniLongToPointer(surface)),
        ((uint32_t*)jniLongToPointer(pRectCount)),
        ((VkRect2D*)jniLongToPointer(pRects))
    );
}

