#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkResetCommandPool_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong commandPool, jint flags){
    (void)env;
    (void)jc;
    PFN_vkResetCommandPool f = (PFN_vkResetCommandPool)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkCommandPool*)jniLongToPointer(commandPool)),
        (VkCommandPoolResetFlags)flags
    );
}

