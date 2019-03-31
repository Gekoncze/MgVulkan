#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkResetCommandPool_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong commandPool, jlong flags, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkResetCommandPool f = (PFN_vkResetCommandPool)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkCommandPool*)jniLongToPointer(commandPool)),
        *((VkCommandPoolResetFlags*)jniLongToPointer(flags))
    );
}
