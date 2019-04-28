#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkBindBufferMemory_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong buffer, jlong memory, jlong memoryOffset, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkBindBufferMemory f = (PFN_vkBindBufferMemory)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkBuffer*)jniLongToPointer(buffer)),
        *((VkDeviceMemory*)jniLongToPointer(memory)),
        *((VkDeviceSize*)jniLongToPointer(memoryOffset))
    );
}


jint Java_cz_mg_vulkan_PFNvkBindBufferMemory_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong buffer, jlong memory, jlong memoryOffset){
    (void)env;
    (void)jc;
    PFN_vkBindBufferMemory f = (PFN_vkBindBufferMemory)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkBuffer*)jniLongToPointer(buffer)),
        *((VkDeviceMemory*)jniLongToPointer(memory)),
        (VkDeviceSize)memoryOffset
    );
}

