#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdDraw_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jint vertexCount, jint instanceCount, jint firstVertex, jint firstInstance){
    (void)env;
    (void)jc;
    PFN_vkCmdDraw f = (PFN_vkCmdDraw)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (uint32_t)vertexCount,
        (uint32_t)instanceCount,
        (uint32_t)firstVertex,
        (uint32_t)firstInstance
    );
}

