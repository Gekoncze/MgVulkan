#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdSetStencilWriteMask_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong faceMask, jlong writeMask){
    (void)env;
    (void)jc;
    PFN_vkCmdSetStencilWriteMask f = (PFN_vkCmdSetStencilWriteMask)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkStencilFaceFlags*)jniLongToPointer(faceMask)),
        *((uint32_t*)jniLongToPointer(writeMask))
    );
}
