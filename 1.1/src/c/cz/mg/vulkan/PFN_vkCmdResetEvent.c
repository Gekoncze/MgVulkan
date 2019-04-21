#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdResetEvent_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong event, jlong stageMask){
    (void)env;
    (void)jc;
    PFN_vkCmdResetEvent f = (PFN_vkCmdResetEvent)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkEvent*)jniLongToPointer(event)),
        *((VkPipelineStageFlags*)jniLongToPointer(stageMask))
    );
}
