#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkObjectTableDescriptorSetEntryNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkObjectTableDescriptorSetEntryNVX);
}

jlong Java_cz_mg_vulkan_vk_VkObjectTableDescriptorSetEntryNVX_getType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableDescriptorSetEntryNVX* o = (VkObjectTableDescriptorSetEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->type));
}

void Java_cz_mg_vulkan_vk_VkObjectTableDescriptorSetEntryNVX_setType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableDescriptorSetEntryNVX* o = (VkObjectTableDescriptorSetEntryNVX*)jniLongToPointer(address);
    memcpy(&o->type, jniLongToPointer(valueAddress), sizeof(o->type));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTableDescriptorSetEntryNVX_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableDescriptorSetEntryNVX* o = (VkObjectTableDescriptorSetEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkObjectTableDescriptorSetEntryNVX_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableDescriptorSetEntryNVX* o = (VkObjectTableDescriptorSetEntryNVX*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTableDescriptorSetEntryNVX_getPipelineLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableDescriptorSetEntryNVX* o = (VkObjectTableDescriptorSetEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pipelineLayout));
}

void Java_cz_mg_vulkan_vk_VkObjectTableDescriptorSetEntryNVX_setPipelineLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableDescriptorSetEntryNVX* o = (VkObjectTableDescriptorSetEntryNVX*)jniLongToPointer(address);
    memcpy(&o->pipelineLayout, jniLongToPointer(valueAddress), sizeof(o->pipelineLayout));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTableDescriptorSetEntryNVX_getDescriptorSet(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableDescriptorSetEntryNVX* o = (VkObjectTableDescriptorSetEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorSet));
}

void Java_cz_mg_vulkan_vk_VkObjectTableDescriptorSetEntryNVX_setDescriptorSet(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableDescriptorSetEntryNVX* o = (VkObjectTableDescriptorSetEntryNVX*)jniLongToPointer(address);
    memcpy(&o->descriptorSet, jniLongToPointer(valueAddress), sizeof(o->descriptorSet));
}

