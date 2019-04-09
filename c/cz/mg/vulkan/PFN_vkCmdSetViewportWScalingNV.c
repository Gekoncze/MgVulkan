#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdSetViewportWScalingNV_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong firstViewport, jlong viewportCount, jlong pViewportWScalings){
    (void)env;
    (void)jc;
    PFN_vkCmdSetViewportWScalingNV f = (PFN_vkCmdSetViewportWScalingNV)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((uint32_t*)jniLongToPointer(firstViewport)),
        *((uint32_t*)jniLongToPointer(viewportCount)),
        ((VkViewportWScalingNV*)jniLongToPointer(pViewportWScalings))
    );
}
