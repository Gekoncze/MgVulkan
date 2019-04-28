#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkMapMemory_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong memory, jlong offset, jlong size, jint flags, jlong ppData){
    (void)env;
    (void)jc;
    PFN_vkMapMemory f = (PFN_vkMapMemory)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkDeviceMemory*)jniLongToPointer(memory)),
        (VkDeviceSize)offset,
        (VkDeviceSize)size,
        (VkMemoryMapFlags)flags,
        ((void**)jniLongToPointer(ppData))
    );
}

