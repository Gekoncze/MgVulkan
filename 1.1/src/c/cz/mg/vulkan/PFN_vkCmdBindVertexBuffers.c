#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdBindVertexBuffers_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong firstBinding, jlong bindingCount, jlong pBuffers, jlong pOffsets){
    (void)env;
    (void)jc;
    PFN_vkCmdBindVertexBuffers f = (PFN_vkCmdBindVertexBuffers)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((uint32_t*)jniLongToPointer(firstBinding)),
        *((uint32_t*)jniLongToPointer(bindingCount)),
        ((VkBuffer*)jniLongToPointer(pBuffers)),
        ((VkDeviceSize*)jniLongToPointer(pOffsets))
    );
}
