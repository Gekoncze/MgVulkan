#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkDestroyIndirectCommandsLayoutNVX_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong indirectCommandsLayout, jlong pAllocator){
    (void)env;
    (void)jc;
    PFN_vkDestroyIndirectCommandsLayoutNVX f = (PFN_vkDestroyIndirectCommandsLayoutNVX)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkIndirectCommandsLayoutNVX*)jniLongToPointer(indirectCommandsLayout)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator))
    );
}
