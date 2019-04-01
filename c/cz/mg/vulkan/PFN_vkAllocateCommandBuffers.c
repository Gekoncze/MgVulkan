#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkAllocateCommandBuffers_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pAllocateInfo, jlong pCommandBuffers, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkAllocateCommandBuffers f = (PFN_vkAllocateCommandBuffers)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkCommandBufferAllocateInfo*)jniLongToPointer(pAllocateInfo)),
        ((VkCommandBuffer*)jniLongToPointer(pCommandBuffers))
    );
}
