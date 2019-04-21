#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkDestroyInstance_call(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong pAllocator){
    (void)env;
    (void)jc;
    PFN_vkDestroyInstance f = (PFN_vkDestroyInstance)jniLongToFunctionPointer(address);
    f(
        *((VkInstance*)jniLongToPointer(instance)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator))
    );
}
