#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdSetLineWidth_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong lineWidth){
    (void)env;
    (void)jc;
    PFN_vkCmdSetLineWidth f = (PFN_vkCmdSetLineWidth)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((float*)jniLongToPointer(lineWidth))
    );
}
