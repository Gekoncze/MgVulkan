#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdCopyBuffer_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong srcBuffer, jlong dstBuffer, jlong regionCount, jlong pRegions){
    (void)env;
    (void)jc;
    PFN_vkCmdCopyBuffer f = (PFN_vkCmdCopyBuffer)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkBuffer*)jniLongToPointer(srcBuffer)),
        *((VkBuffer*)jniLongToPointer(dstBuffer)),
        *((uint32_t*)jniLongToPointer(regionCount)),
        ((VkBufferCopy*)jniLongToPointer(pRegions))
    );
}
