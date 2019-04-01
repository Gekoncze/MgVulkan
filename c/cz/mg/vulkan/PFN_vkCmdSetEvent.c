#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdSetEvent_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong event, jlong stageMask){
    (void)env;
    (void)jc;
    PFN_vkCmdSetEvent f = (PFN_vkCmdSetEvent)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkEvent*)jniLongToPointer(event)),
        *((VkPipelineStageFlags*)jniLongToPointer(stageMask))
    );
}
