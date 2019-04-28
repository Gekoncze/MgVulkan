#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkFreeCommandBuffers_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong commandPool, jint commandBufferCount, jlong pCommandBuffers){
    (void)env;
    (void)jc;
    PFN_vkFreeCommandBuffers f = (PFN_vkFreeCommandBuffers)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkCommandPool*)jniLongToPointer(commandPool)),
        (uint32_t)commandBufferCount,
        ((VkCommandBuffer*)jniLongToPointer(pCommandBuffers))
    );
}

