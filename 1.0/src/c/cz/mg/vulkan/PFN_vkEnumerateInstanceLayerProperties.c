#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkEnumerateInstanceLayerProperties_callNative(JNIEnv* env, jclass jc, jlong address, jlong pPropertyCount, jlong pProperties){
    (void)env;
    (void)jc;
    PFN_vkEnumerateInstanceLayerProperties f = (PFN_vkEnumerateInstanceLayerProperties)jniLongToFunctionPointer(address);
    return f(
        ((uint32_t*)jniLongToPointer(pPropertyCount)),
        ((VkLayerProperties*)jniLongToPointer(pProperties))
    );
}

