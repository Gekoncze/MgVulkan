#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkQueueWaitIdle_call(JNIEnv* env, jclass jc, jlong address, jlong queue, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkQueueWaitIdle f = (PFN_vkQueueWaitIdle)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkQueue*)jniLongToPointer(queue))
    );
}
