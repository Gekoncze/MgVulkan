#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdDispatchBaseKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jint baseGroupX, jint baseGroupY, jint baseGroupZ, jint groupCountX, jint groupCountY, jint groupCountZ){
    (void)env;
    (void)jc;
    PFN_vkCmdDispatchBaseKHR f = (PFN_vkCmdDispatchBaseKHR)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (uint32_t)baseGroupX,
        (uint32_t)baseGroupY,
        (uint32_t)baseGroupZ,
        (uint32_t)groupCountX,
        (uint32_t)groupCountY,
        (uint32_t)groupCountZ
    );
}

