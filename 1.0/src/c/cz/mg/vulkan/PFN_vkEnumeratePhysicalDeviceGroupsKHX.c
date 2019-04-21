#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkEnumeratePhysicalDeviceGroupsKHX_call(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong pPhysicalDeviceGroupCount, jlong pPhysicalDeviceGroupProperties, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkEnumeratePhysicalDeviceGroupsKHX f = (PFN_vkEnumeratePhysicalDeviceGroupsKHX)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkInstance*)jniLongToPointer(instance)),
        ((uint32_t*)jniLongToPointer(pPhysicalDeviceGroupCount)),
        ((VkPhysicalDeviceGroupPropertiesKHX*)jniLongToPointer(pPhysicalDeviceGroupProperties))
    );
}
