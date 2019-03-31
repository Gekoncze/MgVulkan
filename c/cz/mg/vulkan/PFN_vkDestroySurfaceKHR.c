#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkDestroySurfaceKHR_call(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong surface, jlong pAllocator){
    (void)env;
    (void)jc;
    PFN_vkDestroySurfaceKHR f = (PFN_vkDestroySurfaceKHR)jniLongToFunctionPointer(address);
    f(
        *((VkInstance*)jniLongToPointer(instance)),
        *((VkSurfaceKHR*)jniLongToPointer(surface)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator))
    );
}
