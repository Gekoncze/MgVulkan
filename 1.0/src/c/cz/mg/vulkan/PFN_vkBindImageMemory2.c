#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkBindImageMemory2_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jint bindInfoCount, jlong pBindInfos){
    (void)env;
    (void)jc;
    PFN_vkBindImageMemory2 f = (PFN_vkBindImageMemory2)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        (uint32_t)bindInfoCount,
        ((VkBindImageMemoryInfo*)jniLongToPointer(pBindInfos))
    );
}

