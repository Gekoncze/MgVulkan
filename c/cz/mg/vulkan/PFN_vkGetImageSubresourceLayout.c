#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetImageSubresourceLayout_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong image, jlong pSubresource, jlong pLayout){
    (void)env;
    (void)jc;
    PFN_vkGetImageSubresourceLayout f = (PFN_vkGetImageSubresourceLayout)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkImage*)jniLongToPointer(image)),
        ((VkImageSubresource*)jniLongToPointer(pSubresource)),
        ((VkSubresourceLayout*)jniLongToPointer(pLayout))
    );
}
