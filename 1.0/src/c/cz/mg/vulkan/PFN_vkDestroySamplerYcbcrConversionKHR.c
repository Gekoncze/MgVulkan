#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkDestroySamplerYcbcrConversionKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong ycbcrConversion, jlong pAllocator){
    (void)env;
    (void)jc;
    PFN_vkDestroySamplerYcbcrConversionKHR f = (PFN_vkDestroySamplerYcbcrConversionKHR)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkSamplerYcbcrConversion*)jniLongToPointer(ycbcrConversion)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator))
    );
}

