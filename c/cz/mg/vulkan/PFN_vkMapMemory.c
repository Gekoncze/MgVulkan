#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkMapMemory_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong memory, jlong offset, jlong size, jlong flags, jlong ppData, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkMapMemory f = (PFN_vkMapMemory)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkDeviceMemory*)jniLongToPointer(memory)),
        *((VkDeviceSize*)jniLongToPointer(offset)),
        *((VkDeviceSize*)jniLongToPointer(size)),
        *((VkMemoryMapFlags*)jniLongToPointer(flags)),
        ((void**)jniLongToPointer(ppData))
    );
}
