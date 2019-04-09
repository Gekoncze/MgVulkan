#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkDestroyDebugReportCallbackEXT_call(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong callback, jlong pAllocator){
    (void)env;
    (void)jc;
    PFN_vkDestroyDebugReportCallbackEXT f = (PFN_vkDestroyDebugReportCallbackEXT)jniLongToFunctionPointer(address);
    f(
        *((VkInstance*)jniLongToPointer(instance)),
        *((VkDebugReportCallbackEXT*)jniLongToPointer(callback)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator))
    );
}
