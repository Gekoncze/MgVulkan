#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdSetScissor_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong firstScissor, jlong scissorCount, jlong pScissors){
    (void)env;
    (void)jc;
    PFN_vkCmdSetScissor f = (PFN_vkCmdSetScissor)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((uint32_t*)jniLongToPointer(firstScissor)),
        *((uint32_t*)jniLongToPointer(scissorCount)),
        ((VkRect2D*)jniLongToPointer(pScissors))
    );
}
