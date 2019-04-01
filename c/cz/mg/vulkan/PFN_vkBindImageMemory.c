#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkBindImageMemory_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong image, jlong memory, jlong memoryOffset, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkBindImageMemory f = (PFN_vkBindImageMemory)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkImage*)jniLongToPointer(image)),
        *((VkDeviceMemory*)jniLongToPointer(memory)),
        *((VkDeviceSize*)jniLongToPointer(memoryOffset))
    );
}
