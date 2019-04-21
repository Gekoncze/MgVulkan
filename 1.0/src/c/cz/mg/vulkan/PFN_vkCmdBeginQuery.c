#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdBeginQuery_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong queryPool, jlong query, jlong flags){
    (void)env;
    (void)jc;
    PFN_vkCmdBeginQuery f = (PFN_vkCmdBeginQuery)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkQueryPool*)jniLongToPointer(queryPool)),
        *((uint32_t*)jniLongToPointer(query)),
        *((VkQueryControlFlags*)jniLongToPointer(flags))
    );
}
