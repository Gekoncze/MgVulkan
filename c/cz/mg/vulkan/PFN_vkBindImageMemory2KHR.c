#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkBindImageMemory2KHR_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong bindInfoCount, jlong pBindInfos, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkBindImageMemory2KHR f = (PFN_vkBindImageMemory2KHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((uint32_t*)jniLongToPointer(bindInfoCount)),
        ((VkBindImageMemoryInfo*)jniLongToPointer(pBindInfos))
    );
}
