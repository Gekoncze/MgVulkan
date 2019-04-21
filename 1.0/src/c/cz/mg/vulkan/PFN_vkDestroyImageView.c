#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkDestroyImageView_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong imageView, jlong pAllocator){
    (void)env;
    (void)jc;
    PFN_vkDestroyImageView f = (PFN_vkDestroyImageView)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkImageView*)jniLongToPointer(imageView)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator))
    );
}
