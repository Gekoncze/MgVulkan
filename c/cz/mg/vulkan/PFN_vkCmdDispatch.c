#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdDispatch_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong groupCountX, jlong groupCountY, jlong groupCountZ){
    (void)env;
    (void)jc;
    PFN_vkCmdDispatch f = (PFN_vkCmdDispatch)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((uint32_t*)jniLongToPointer(groupCountX)),
        *((uint32_t*)jniLongToPointer(groupCountY)),
        *((uint32_t*)jniLongToPointer(groupCountZ))
    );
}
