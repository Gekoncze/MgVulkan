#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdDispatchBaseKHX_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong baseGroupX, jlong baseGroupY, jlong baseGroupZ, jlong groupCountX, jlong groupCountY, jlong groupCountZ){
    (void)env;
    (void)jc;
    PFN_vkCmdDispatchBaseKHX f = (PFN_vkCmdDispatchBaseKHX)jniLongToFunctionPointer(address);
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
