#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdSetDiscardRectangleEXT_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jint firstDiscardRectangle, jint discardRectangleCount, jlong pDiscardRectangles){
    (void)env;
    (void)jc;
    PFN_vkCmdSetDiscardRectangleEXT f = (PFN_vkCmdSetDiscardRectangleEXT)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (uint32_t)firstDiscardRectangle,
        (uint32_t)discardRectangleCount,
        ((VkRect2D*)jniLongToPointer(pDiscardRectangles))
    );
}

