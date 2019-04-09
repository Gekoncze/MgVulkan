#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkEnumerateDeviceLayerProperties_call(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pPropertyCount, jlong pProperties, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkEnumerateDeviceLayerProperties f = (PFN_vkEnumerateDeviceLayerProperties)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((uint32_t*)jniLongToPointer(pPropertyCount)),
        ((VkLayerProperties*)jniLongToPointer(pProperties))
    );
}
