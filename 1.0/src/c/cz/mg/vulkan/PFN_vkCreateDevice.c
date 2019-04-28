#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkCreateDevice_callNative(JNIEnv* env, jclass jc, jlong address, jlong physicalDevice, jlong pCreateInfo, jlong pAllocator, jlong pDevice){
    (void)env;
    (void)jc;
    PFN_vkCreateDevice f = (PFN_vkCreateDevice)jniLongToFunctionPointer(address);
    return f(
        *((VkPhysicalDevice*)jniLongToPointer(physicalDevice)),
        ((VkDeviceCreateInfo*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkDevice*)jniLongToPointer(pDevice))
    );
}

