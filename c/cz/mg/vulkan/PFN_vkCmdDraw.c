#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdDraw_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong vertexCount, jlong instanceCount, jlong firstVertex, jlong firstInstance){
    (void)env;
    (void)jc;
    PFN_vkCmdDraw f = (PFN_vkCmdDraw)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((uint32_t*)jniLongToPointer(vertexCount)),
        *((uint32_t*)jniLongToPointer(instanceCount)),
        *((uint32_t*)jniLongToPointer(firstVertex)),
        *((uint32_t*)jniLongToPointer(firstInstance))
    );
}
