#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkEnumeratePhysicalDevices_call(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong pPhysicalDeviceCount, jlong pPhysicalDevices, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkEnumeratePhysicalDevices f = (PFN_vkEnumeratePhysicalDevices)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkInstance*)jniLongToPointer(instance)),
        ((uint32_t*)jniLongToPointer(pPhysicalDeviceCount)),
        ((VkPhysicalDevice*)jniLongToPointer(pPhysicalDevices))
    );
}
