#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdSetDepthBias_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong depthBiasConstantFactor, jlong depthBiasClamp, jlong depthBiasSlopeFactor){
    (void)env;
    (void)jc;
    PFN_vkCmdSetDepthBias f = (PFN_vkCmdSetDepthBias)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((float*)jniLongToPointer(depthBiasConstantFactor)),
        *((float*)jniLongToPointer(depthBiasClamp)),
        *((float*)jniLongToPointer(depthBiasSlopeFactor))
    );
}


void Java_cz_mg_vulkan_PFNvkCmdSetDepthBias_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jfloat depthBiasConstantFactor, jfloat depthBiasClamp, jfloat depthBiasSlopeFactor){
    (void)env;
    (void)jc;
    PFN_vkCmdSetDepthBias f = (PFN_vkCmdSetDepthBias)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (float)depthBiasConstantFactor,
        (float)depthBiasClamp,
        (float)depthBiasSlopeFactor
    );
}

