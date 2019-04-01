#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCreateValidationCacheEXT_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pValidationCache, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkCreateValidationCacheEXT f = (PFN_vkCreateValidationCacheEXT)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkValidationCacheCreateInfoEXT*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkValidationCacheEXT*)jniLongToPointer(pValidationCache))
    );
}
