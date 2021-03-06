#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkReleaseDisplayEXT_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong display){
    (void)env;
    (void)jc;
    PFN_vkReleaseDisplayEXT f = (PFN_vkReleaseDisplayEXT)jniLongToFunctionPointer(address);
    return f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        *((VkDisplayKHR*)jniLongToPointer(display))
    );
}

