#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkDestroyFramebuffer_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong framebuffer, jlong pAllocator){
    (void)env;
    (void)jc;
    PFN_vkDestroyFramebuffer f = (PFN_vkDestroyFramebuffer)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkFramebuffer*)jniLongToPointer(framebuffer)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator))
    );
}



