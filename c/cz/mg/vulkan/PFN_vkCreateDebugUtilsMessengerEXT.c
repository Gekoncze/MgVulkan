#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCreateDebugUtilsMessengerEXT_call(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong pCreateInfo, jlong pAllocator, jlong pMessenger, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkCreateDebugUtilsMessengerEXT f = (PFN_vkCreateDebugUtilsMessengerEXT)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkInstance*)jniLongToPointer(instance)),
        ((VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkDebugUtilsMessengerEXT*)jniLongToPointer(pMessenger))
    );
}
