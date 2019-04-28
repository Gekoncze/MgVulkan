#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkEnumerateInstanceVersion_callNative(JNIEnv* env, jclass jc, jlong address, jlong pApiVersion, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkEnumerateInstanceVersion f = (PFN_vkEnumerateInstanceVersion)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        ((uint32_t*)jniLongToPointer(pApiVersion))
    );
}


jint Java_cz_mg_vulkan_PFNvkEnumerateInstanceVersion_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong pApiVersion){
    (void)env;
    (void)jc;
    PFN_vkEnumerateInstanceVersion f = (PFN_vkEnumerateInstanceVersion)jniLongToFunctionPointer(address);
    return f(
        ((uint32_t*)jniLongToPointer(pApiVersion))
    );
}

