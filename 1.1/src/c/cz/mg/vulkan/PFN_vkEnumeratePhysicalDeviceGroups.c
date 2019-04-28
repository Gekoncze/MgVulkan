#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkEnumeratePhysicalDeviceGroups_callNative(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong pPhysicalDeviceGroupCount, jlong pPhysicalDeviceGroupProperties, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkEnumeratePhysicalDeviceGroups f = (PFN_vkEnumeratePhysicalDeviceGroups)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkInstance*)jniLongToPointer(instance)),
        ((uint32_t*)jniLongToPointer(pPhysicalDeviceGroupCount)),
        ((VkPhysicalDeviceGroupProperties*)jniLongToPointer(pPhysicalDeviceGroupProperties))
    );
}


jint Java_cz_mg_vulkan_PFNvkEnumeratePhysicalDeviceGroups_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong pPhysicalDeviceGroupCount, jlong pPhysicalDeviceGroupProperties){
    (void)env;
    (void)jc;
    PFN_vkEnumeratePhysicalDeviceGroups f = (PFN_vkEnumeratePhysicalDeviceGroups)jniLongToFunctionPointer(address);
    return f(
        *((VkInstance*)jniLongToPointer(instance)),
        ((uint32_t*)jniLongToPointer(pPhysicalDeviceGroupCount)),
        ((VkPhysicalDeviceGroupProperties*)jniLongToPointer(pPhysicalDeviceGroupProperties))
    );
}

