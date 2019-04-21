#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkQueueInsertDebugUtilsLabelEXT_call(JNIEnv* env, jclass jc, jlong address, jlong queue, jlong pLabelInfo){
    (void)env;
    (void)jc;
    PFN_vkQueueInsertDebugUtilsLabelEXT f = (PFN_vkQueueInsertDebugUtilsLabelEXT)jniLongToFunctionPointer(address);
    f(
        *((VkQueue*)jniLongToPointer(queue)),
        ((VkDebugUtilsLabelEXT*)jniLongToPointer(pLabelInfo))
    );
}
