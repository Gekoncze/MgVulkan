#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkBeginCommandBuffer_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong pBeginInfo){
    (void)env;
    (void)jc;
    PFN_vkBeginCommandBuffer f = (PFN_vkBeginCommandBuffer)jniLongToFunctionPointer(address);
    return f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        ((VkCommandBufferBeginInfo*)jniLongToPointer(pBeginInfo))
    );
}

