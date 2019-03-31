#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdSetDiscardRectangleEXT_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong firstDiscardRectangle, jlong discardRectangleCount, jlong pDiscardRectangles){
    (void)env;
    (void)jc;
    PFN_vkCmdSetDiscardRectangleEXT f = (PFN_vkCmdSetDiscardRectangleEXT)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((uint32_t*)jniLongToPointer(firstDiscardRectangle)),
        *((uint32_t*)jniLongToPointer(discardRectangleCount)),
        ((VkRect2D*)jniLongToPointer(pDiscardRectangles))
    );
}
