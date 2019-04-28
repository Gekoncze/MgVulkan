#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkTrimCommandPoolKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong commandPool, jlong flags){
    (void)env;
    (void)jc;
    PFN_vkTrimCommandPoolKHR f = (PFN_vkTrimCommandPoolKHR)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkCommandPool*)jniLongToPointer(commandPool)),
        *((VkCommandPoolTrimFlags*)jniLongToPointer(flags))
    );
}


void Java_cz_mg_vulkan_PFNvkTrimCommandPoolKHR_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong commandPool, jint flags){
    (void)env;
    (void)jc;
    PFN_vkTrimCommandPoolKHR f = (PFN_vkTrimCommandPoolKHR)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkCommandPool*)jniLongToPointer(commandPool)),
        (VkCommandPoolTrimFlags)flags
    );
}

