#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkUpdateDescriptorSets_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong descriptorWriteCount, jlong pDescriptorWrites, jlong descriptorCopyCount, jlong pDescriptorCopies){
    (void)env;
    (void)jc;
    PFN_vkUpdateDescriptorSets f = (PFN_vkUpdateDescriptorSets)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((uint32_t*)jniLongToPointer(descriptorWriteCount)),
        ((VkWriteDescriptorSet*)jniLongToPointer(pDescriptorWrites)),
        *((uint32_t*)jniLongToPointer(descriptorCopyCount)),
        ((VkCopyDescriptorSet*)jniLongToPointer(pDescriptorCopies))
    );
}
