#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdSetEvent_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong event, jlong stageMask){
    (void)env;
    (void)jc;
    PFN_vkCmdSetEvent f = (PFN_vkCmdSetEvent)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkEvent*)jniLongToPointer(event)),
        *((VkPipelineStageFlags*)jniLongToPointer(stageMask))
    );
}


void Java_cz_mg_vulkan_PFNvkCmdSetEvent_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong event, jint stageMask){
    (void)env;
    (void)jc;
    PFN_vkCmdSetEvent f = (PFN_vkCmdSetEvent)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkEvent*)jniLongToPointer(event)),
        (VkPipelineStageFlags)stageMask
    );
}

