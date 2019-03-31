#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdDrawIndexed_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong indexCount, jlong instanceCount, jlong firstIndex, jlong vertexOffset, jlong firstInstance){
    (void)env;
    (void)jc;
    PFN_vkCmdDrawIndexed f = (PFN_vkCmdDrawIndexed)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((uint32_t*)jniLongToPointer(indexCount)),
        *((uint32_t*)jniLongToPointer(instanceCount)),
        *((uint32_t*)jniLongToPointer(firstIndex)),
        *((int32_t*)jniLongToPointer(vertexOffset)),
        *((uint32_t*)jniLongToPointer(firstInstance))
    );
}
