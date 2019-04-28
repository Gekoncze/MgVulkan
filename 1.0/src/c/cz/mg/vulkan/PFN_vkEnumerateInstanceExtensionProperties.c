#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkEnumerateInstanceExtensionProperties_callNative(JNIEnv* env, jclass jc, jlong address, jlong pLayerName, jlong pPropertyCount, jlong pProperties, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkEnumerateInstanceExtensionProperties f = (PFN_vkEnumerateInstanceExtensionProperties)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        ((char*)jniLongToPointer(pLayerName)),
        ((uint32_t*)jniLongToPointer(pPropertyCount)),
        ((VkExtensionProperties*)jniLongToPointer(pProperties))
    );
}


jint Java_cz_mg_vulkan_PFNvkEnumerateInstanceExtensionProperties_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong pLayerName, jlong pPropertyCount, jlong pProperties){
    (void)env;
    (void)jc;
    PFN_vkEnumerateInstanceExtensionProperties f = (PFN_vkEnumerateInstanceExtensionProperties)jniLongToFunctionPointer(address);
    return f(
        ((char*)jniLongToPointer(pLayerName)),
        ((uint32_t*)jniLongToPointer(pPropertyCount)),
        ((VkExtensionProperties*)jniLongToPointer(pProperties))
    );
}

