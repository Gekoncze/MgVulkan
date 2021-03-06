#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdBindVertexBuffers_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jint firstBinding, jint bindingCount, jlong pBuffers, jlong pOffsets){
    (void)env;
    (void)jc;
    PFN_vkCmdBindVertexBuffers f = (PFN_vkCmdBindVertexBuffers)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (uint32_t)firstBinding,
        (uint32_t)bindingCount,
        ((VkBuffer*)jniLongToPointer(pBuffers)),
        ((VkDeviceSize*)jniLongToPointer(pOffsets))
    );
}

