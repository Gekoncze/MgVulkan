#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdDrawIndirect_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong buffer, jlong offset, jint drawCount, jint stride){
    (void)env;
    (void)jc;
    PFN_vkCmdDrawIndirect f = (PFN_vkCmdDrawIndirect)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkBuffer*)jniLongToPointer(buffer)),
        (VkDeviceSize)offset,
        (uint32_t)drawCount,
        (uint32_t)stride
    );
}

