#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkDestroyDebugUtilsMessengerEXT_callNative(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong messenger, jlong pAllocator){
    (void)env;
    (void)jc;
    PFN_vkDestroyDebugUtilsMessengerEXT f = (PFN_vkDestroyDebugUtilsMessengerEXT)jniLongToFunctionPointer(address);
    f(
        *((VkInstance*)jniLongToPointer(instance)),
        *((VkDebugUtilsMessengerEXT*)jniLongToPointer(messenger)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator))
    );
}

