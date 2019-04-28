#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkRegisterDisplayEventEXT_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong display, jlong pDisplayEventInfo, jlong pAllocator, jlong pFence){
    (void)env;
    (void)jc;
    PFN_vkRegisterDisplayEventEXT f = (PFN_vkRegisterDisplayEventEXT)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkDisplayKHR*)jniLongToPointer(display)),
        ((VkDisplayEventInfoEXT*)jniLongToPointer(pDisplayEventInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkFence*)jniLongToPointer(pFence))
    );
}

