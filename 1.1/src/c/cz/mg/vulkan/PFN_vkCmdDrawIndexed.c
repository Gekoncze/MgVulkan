#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdDrawIndexed_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jint indexCount, jint instanceCount, jint firstIndex, jint vertexOffset, jint firstInstance){
    (void)env;
    (void)jc;
    PFN_vkCmdDrawIndexed f = (PFN_vkCmdDrawIndexed)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (uint32_t)indexCount,
        (uint32_t)instanceCount,
        (uint32_t)firstIndex,
        (int32_t)vertexOffset,
        (uint32_t)firstInstance
    );
}

