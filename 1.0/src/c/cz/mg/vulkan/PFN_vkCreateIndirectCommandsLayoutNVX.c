#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkCreateIndirectCommandsLayoutNVX_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pCreateInfo, jlong pAllocator, jlong pIndirectCommandsLayout){
    (void)env;
    (void)jc;
    PFN_vkCreateIndirectCommandsLayoutNVX f = (PFN_vkCreateIndirectCommandsLayoutNVX)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(pCreateInfo)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator)),
        ((VkIndirectCommandsLayoutNVX*)jniLongToPointer(pIndirectCommandsLayout))
    );
}

