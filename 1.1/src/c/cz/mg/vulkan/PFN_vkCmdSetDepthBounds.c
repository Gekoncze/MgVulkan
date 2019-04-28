#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdSetDepthBounds_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong minDepthBounds, jlong maxDepthBounds){
    (void)env;
    (void)jc;
    PFN_vkCmdSetDepthBounds f = (PFN_vkCmdSetDepthBounds)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((float*)jniLongToPointer(minDepthBounds)),
        *((float*)jniLongToPointer(maxDepthBounds))
    );
}


void Java_cz_mg_vulkan_PFNvkCmdSetDepthBounds_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jfloat minDepthBounds, jfloat maxDepthBounds){
    (void)env;
    (void)jc;
    PFN_vkCmdSetDepthBounds f = (PFN_vkCmdSetDepthBounds)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (float)minDepthBounds,
        (float)maxDepthBounds
    );
}

