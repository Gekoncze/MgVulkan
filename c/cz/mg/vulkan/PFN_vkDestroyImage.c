#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkDestroyImage_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong image, jlong pAllocator){
    (void)env;
    (void)jc;
    PFN_vkDestroyImage f = (PFN_vkDestroyImage)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkImage*)jniLongToPointer(image)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator))
    );
}
