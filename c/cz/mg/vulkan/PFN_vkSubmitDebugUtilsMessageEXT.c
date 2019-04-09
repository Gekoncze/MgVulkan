#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkSubmitDebugUtilsMessageEXT_call(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong messageSeverity, jlong messageTypes, jlong pCallbackData){
    (void)env;
    (void)jc;
    PFN_vkSubmitDebugUtilsMessageEXT f = (PFN_vkSubmitDebugUtilsMessageEXT)jniLongToFunctionPointer(address);
    f(
        *((VkInstance*)jniLongToPointer(instance)),
        *((VkDebugUtilsMessageSeverityFlagBitsEXT*)jniLongToPointer(messageSeverity)),
        *((VkDebugUtilsMessageTypeFlagsEXT*)jniLongToPointer(messageTypes)),
        ((VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(pCallbackData))
    );
}
