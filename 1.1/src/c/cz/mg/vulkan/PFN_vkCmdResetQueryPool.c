#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdResetQueryPool_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong queryPool, jint firstQuery, jint queryCount){
    (void)env;
    (void)jc;
    PFN_vkCmdResetQueryPool f = (PFN_vkCmdResetQueryPool)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkQueryPool*)jniLongToPointer(queryPool)),
        (uint32_t)firstQuery,
        (uint32_t)queryCount
    );
}

