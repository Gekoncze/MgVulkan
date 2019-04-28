#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdDispatchBase_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong baseGroupX, jlong baseGroupY, jlong baseGroupZ, jlong groupCountX, jlong groupCountY, jlong groupCountZ){
    (void)env;
    (void)jc;
    PFN_vkCmdDispatchBase f = (PFN_vkCmdDispatchBase)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((uint32_t*)jniLongToPointer(baseGroupX)),
        *((uint32_t*)jniLongToPointer(baseGroupY)),
        *((uint32_t*)jniLongToPointer(baseGroupZ)),
        *((uint32_t*)jniLongToPointer(groupCountX)),
        *((uint32_t*)jniLongToPointer(groupCountY)),
        *((uint32_t*)jniLongToPointer(groupCountZ))
    );
}


void Java_cz_mg_vulkan_PFNvkCmdDispatchBase_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jint baseGroupX, jint baseGroupY, jint baseGroupZ, jint groupCountX, jint groupCountY, jint groupCountZ){
    (void)env;
    (void)jc;
    PFN_vkCmdDispatchBase f = (PFN_vkCmdDispatchBase)jniLongToFunctionPointer(address);
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

