#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkAllocateCommandBuffers_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pAllocateInfo, jlong pCommandBuffers){
    (void)env;
    (void)jc;
    PFN_vkAllocateCommandBuffers f = (PFN_vkAllocateCommandBuffers)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkCommandBufferAllocateInfo*)jniLongToPointer(pAllocateInfo)),
        ((VkCommandBuffer*)jniLongToPointer(pCommandBuffers))
    );
}

