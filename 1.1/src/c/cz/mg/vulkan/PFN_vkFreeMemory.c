#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkFreeMemory_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong memory, jlong pAllocator){
    (void)env;
    (void)jc;
    PFN_vkFreeMemory f = (PFN_vkFreeMemory)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkDeviceMemory*)jniLongToPointer(memory)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator))
    );
}

