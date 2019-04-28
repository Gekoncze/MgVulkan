#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdSetViewportWScalingNV_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jint firstViewport, jint viewportCount, jlong pViewportWScalings){
    (void)env;
    (void)jc;
    PFN_vkCmdSetViewportWScalingNV f = (PFN_vkCmdSetViewportWScalingNV)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (uint32_t)firstViewport,
        (uint32_t)viewportCount,
        ((VkViewportWScalingNV*)jniLongToPointer(pViewportWScalings))
    );
}

