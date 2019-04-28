#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdSetStencilCompareMask_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong faceMask, jlong compareMask){
    (void)env;
    (void)jc;
    PFN_vkCmdSetStencilCompareMask f = (PFN_vkCmdSetStencilCompareMask)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkStencilFaceFlags*)jniLongToPointer(faceMask)),
        *((uint32_t*)jniLongToPointer(compareMask))
    );
}


void Java_cz_mg_vulkan_PFNvkCmdSetStencilCompareMask_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jint faceMask, jint compareMask){
    (void)env;
    (void)jc;
    PFN_vkCmdSetStencilCompareMask f = (PFN_vkCmdSetStencilCompareMask)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (VkStencilFaceFlags)faceMask,
        (uint32_t)compareMask
    );
}

