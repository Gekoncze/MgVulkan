#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkSetHdrMetadataEXT_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jint swapchainCount, jlong pSwapchains, jlong pMetadata){
    (void)env;
    (void)jc;
    PFN_vkSetHdrMetadataEXT f = (PFN_vkSetHdrMetadataEXT)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        (uint32_t)swapchainCount,
        ((VkSwapchainKHR*)jniLongToPointer(pSwapchains)),
        ((VkHdrMetadataEXT*)jniLongToPointer(pMetadata))
    );
}

