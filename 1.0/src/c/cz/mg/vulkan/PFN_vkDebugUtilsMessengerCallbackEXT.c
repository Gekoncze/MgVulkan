#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkDebugUtilsMessengerCallbackEXT_callNative(JNIEnv* env, jclass jc, jlong address, jlong messageSeverity, jlong messageType, jlong pCallbackData, jlong pUserData, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkDebugUtilsMessengerCallbackEXT f = (PFN_vkDebugUtilsMessengerCallbackEXT)jniLongToFunctionPointer(address);
    VkBool32* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDebugUtilsMessageSeverityFlagBitsEXT*)jniLongToPointer(messageSeverity)),
        *((VkDebugUtilsMessageTypeFlagsEXT*)jniLongToPointer(messageType)),
        ((VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(pCallbackData)),
        ((void*)jniLongToPointer(pUserData))
    );
}


jint Java_cz_mg_vulkan_PFNvkDebugUtilsMessengerCallbackEXT_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jint messageSeverity, jint messageType, jlong pCallbackData, jlong pUserData){
    (void)env;
    (void)jc;
    PFN_vkDebugUtilsMessengerCallbackEXT f = (PFN_vkDebugUtilsMessengerCallbackEXT)jniLongToFunctionPointer(address);
    return f(
        (VkDebugUtilsMessageSeverityFlagBitsEXT)messageSeverity,
        (VkDebugUtilsMessageTypeFlagsEXT)messageType,
        ((VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(pCallbackData)),
        ((void*)jniLongToPointer(pUserData))
    );
}

