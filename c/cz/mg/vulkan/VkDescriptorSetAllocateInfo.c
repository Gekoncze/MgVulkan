#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDescriptorSetAllocateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorSetAllocateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkDescriptorSetAllocateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetAllocateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorSetAllocateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetAllocateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorSetAllocateInfo_getDescriptorPool(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorPool));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetAllocateInfo_setDescriptorPool(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    memcpy(&o->descriptorPool, jniLongToPointer(valueAddress), sizeof(o->descriptorPool));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorSetAllocateInfo_getDescriptorSetCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorSetCount));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetAllocateInfo_setDescriptorSetCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    memcpy(&o->descriptorSetCount, jniLongToPointer(valueAddress), sizeof(o->descriptorSetCount));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorSetAllocateInfo_getPSetLayouts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pSetLayouts));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetAllocateInfo_setPSetLayouts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    memcpy(&o->pSetLayouts, jniLongToPointer(valueAddress), sizeof(o->pSetLayouts));
}

