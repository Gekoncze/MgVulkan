#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkGetMemoryFdPropertiesKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jint handleType, jint fd, jlong pMemoryFdProperties){
    (void)env;
    (void)jc;
    PFN_vkGetMemoryFdPropertiesKHR f = (PFN_vkGetMemoryFdPropertiesKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        (VkExternalMemoryHandleTypeFlagBits)handleType,
        (int)fd,
        ((VkMemoryFdPropertiesKHR*)jniLongToPointer(pMemoryFdProperties))
    );
}

