#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDescriptorSetVariableDescriptorCountAllocateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT);
}

jlong Java_cz_mg_vulkan_vk_VkDescriptorSetVariableDescriptorCountAllocateInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetVariableDescriptorCountAllocateInfoEXT* o = (VkDescriptorSetVariableDescriptorCountAllocateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetVariableDescriptorCountAllocateInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetVariableDescriptorCountAllocateInfoEXT* o = (VkDescriptorSetVariableDescriptorCountAllocateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorSetVariableDescriptorCountAllocateInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetVariableDescriptorCountAllocateInfoEXT* o = (VkDescriptorSetVariableDescriptorCountAllocateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetVariableDescriptorCountAllocateInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetVariableDescriptorCountAllocateInfoEXT* o = (VkDescriptorSetVariableDescriptorCountAllocateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorSetVariableDescriptorCountAllocateInfoEXT_getDescriptorSetCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetVariableDescriptorCountAllocateInfoEXT* o = (VkDescriptorSetVariableDescriptorCountAllocateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorSetCount));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetVariableDescriptorCountAllocateInfoEXT_setDescriptorSetCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetVariableDescriptorCountAllocateInfoEXT* o = (VkDescriptorSetVariableDescriptorCountAllocateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->descriptorSetCount, jniLongToPointer(valueAddress), sizeof(o->descriptorSetCount));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorSetVariableDescriptorCountAllocateInfoEXT_getPDescriptorCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetVariableDescriptorCountAllocateInfoEXT* o = (VkDescriptorSetVariableDescriptorCountAllocateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pDescriptorCounts));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetVariableDescriptorCountAllocateInfoEXT_setPDescriptorCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetVariableDescriptorCountAllocateInfoEXT* o = (VkDescriptorSetVariableDescriptorCountAllocateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pDescriptorCounts, jniLongToPointer(valueAddress), sizeof(o->pDescriptorCounts));
}

