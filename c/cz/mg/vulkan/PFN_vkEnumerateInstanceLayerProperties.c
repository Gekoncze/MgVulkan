#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkEnumerateInstanceLayerProperties_call(JNIEnv* env, jclass jc, jlong address, jlong pPropertyCount, jlong pProperties, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkEnumerateInstanceLayerProperties f = (PFN_vkEnumerateInstanceLayerProperties)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        ((uint32_t*)jniLongToPointer(pPropertyCount)),
        ((VkLayerProperties*)jniLongToPointer(pProperties))
    );
}
