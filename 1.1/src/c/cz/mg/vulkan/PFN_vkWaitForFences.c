#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkWaitForFences_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jint fenceCount, jlong pFences, jint waitAll, jlong timeout){
    (void)env;
    (void)jc;
    PFN_vkWaitForFences f = (PFN_vkWaitForFences)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        (uint32_t)fenceCount,
        ((VkFence*)jniLongToPointer(pFences)),
        (VkBool32)waitAll,
        (uint64_t)timeout
    );
}

