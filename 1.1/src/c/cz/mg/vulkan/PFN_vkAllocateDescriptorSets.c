#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkAllocateDescriptorSets_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pAllocateInfo, jlong pDescriptorSets){
    (void)env;
    (void)jc;
    PFN_vkAllocateDescriptorSets f = (PFN_vkAllocateDescriptorSets)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkDescriptorSetAllocateInfo*)jniLongToPointer(pAllocateInfo)),
        ((VkDescriptorSet*)jniLongToPointer(pDescriptorSets))
    );
}

