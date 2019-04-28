#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdSetDeviceMaskKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong deviceMask){
    (void)env;
    (void)jc;
    PFN_vkCmdSetDeviceMaskKHR f = (PFN_vkCmdSetDeviceMaskKHR)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((uint32_t*)jniLongToPointer(deviceMask))
    );
}


void Java_cz_mg_vulkan_PFNvkCmdSetDeviceMaskKHR_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jint deviceMask){
    (void)env;
    (void)jc;
    PFN_vkCmdSetDeviceMaskKHR f = (PFN_vkCmdSetDeviceMaskKHR)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        (uint32_t)deviceMask
    );
}

