#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkDestroyBufferView_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong bufferView, jlong pAllocator){
    (void)env;
    (void)jc;
    PFN_vkDestroyBufferView f = (PFN_vkDestroyBufferView)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkBufferView*)jniLongToPointer(bufferView)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator))
    );
}
