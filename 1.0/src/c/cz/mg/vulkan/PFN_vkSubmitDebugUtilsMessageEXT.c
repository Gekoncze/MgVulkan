#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkSubmitDebugUtilsMessageEXT_callNative(JNIEnv* env, jclass jc, jlong address, jlong instance, jint messageSeverity, jint messageTypes, jlong pCallbackData){
    (void)env;
    (void)jc;
    PFN_vkSubmitDebugUtilsMessageEXT f = (PFN_vkSubmitDebugUtilsMessageEXT)jniLongToFunctionPointer(address);
    f(
        *((VkInstance*)jniLongToPointer(instance)),
        (VkDebugUtilsMessageSeverityFlagBitsEXT)messageSeverity,
        (VkDebugUtilsMessageTypeFlagsEXT)messageTypes,
        ((VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(pCallbackData))
    );
}

