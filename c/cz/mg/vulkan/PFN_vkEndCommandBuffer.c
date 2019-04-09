#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkEndCommandBuffer_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkEndCommandBuffer f = (PFN_vkEndCommandBuffer)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer))
    );
}
