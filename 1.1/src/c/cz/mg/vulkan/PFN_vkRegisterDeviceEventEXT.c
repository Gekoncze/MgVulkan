#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkRegisterDeviceEventEXT_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pDeviceEventInfo, jlong pAllocator, jlong pFence){
    (void)env;
    (void)jc;
    PFN_vkRegisterDeviceEventEXT f = (PFN_vkRegisterDeviceEventEXT)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkDeviceEventInfoEXT*)jniLongToPointer(pDeviceEventInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkFence*)jniLongToPointer(pFence))
    );
}

