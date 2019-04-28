#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdEndQuery_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong queryPool, jlong query){
    (void)env;
    (void)jc;
    PFN_vkCmdEndQuery f = (PFN_vkCmdEndQuery)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkQueryPool*)jniLongToPointer(queryPool)),
        *((uint32_t*)jniLongToPointer(query))
    );
}


void Java_cz_mg_vulkan_PFNvkCmdEndQuery_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong queryPool, jint query){
    (void)env;
    (void)jc;
    PFN_vkCmdEndQuery f = (PFN_vkCmdEndQuery)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkQueryPool*)jniLongToPointer(queryPool)),
        (uint32_t)query
    );
}

