#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdExecuteCommands_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jint commandBufferCount, jlong pCommandBuffers){
    (void)env;
    (void)jc;
    PFN_vkCmdExecuteCommands f = (PFN_vkCmdExecuteCommands)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (uint32_t)commandBufferCount,
        ((VkCommandBuffer*)jniLongToPointer(pCommandBuffers))
    );
}

