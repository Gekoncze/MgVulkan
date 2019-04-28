#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkDebugReportCallbackEXT_callNative(JNIEnv* env, jclass jc, jlong address, jint flags, jint objectType, jlong object, jlong location, jint messageCode, jlong pLayerPrefix, jlong pMessage, jlong pUserData){
    (void)env;
    (void)jc;
    PFN_vkDebugReportCallbackEXT f = (PFN_vkDebugReportCallbackEXT)jniLongToFunctionPointer(address);
    return f(
        (VkDebugReportFlagsEXT)flags,
        (VkDebugReportObjectTypeEXT)objectType,
        (uint64_t)object,
        (size_t)location,
        (int32_t)messageCode,
        ((char*)jniLongToPointer(pLayerPrefix)),
        ((char*)jniLongToPointer(pMessage)),
        ((void*)jniLongToPointer(pUserData))
    );
}

