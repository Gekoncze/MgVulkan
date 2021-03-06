#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkObjectTableDescriptorSetEntryNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkObjectTableDescriptorSetEntryNVX);
}

void Java_cz_mg_vulkan_VkObjectTableDescriptorSetEntryNVX_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkObjectTableDescriptorSetEntryNVX));
}

jlong Java_cz_mg_vulkan_VkObjectTableDescriptorSetEntryNVX_getTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableDescriptorSetEntryNVX* o = (VkObjectTableDescriptorSetEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->type);
}

void Java_cz_mg_vulkan_VkObjectTableDescriptorSetEntryNVX_setTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableDescriptorSetEntryNVX* o = (VkObjectTableDescriptorSetEntryNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->type, valuePointer, sizeof(o->type));
}

jlong Java_cz_mg_vulkan_VkObjectTableDescriptorSetEntryNVX_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableDescriptorSetEntryNVX* o = (VkObjectTableDescriptorSetEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkObjectTableDescriptorSetEntryNVX_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableDescriptorSetEntryNVX* o = (VkObjectTableDescriptorSetEntryNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkObjectTableDescriptorSetEntryNVX_getPipelineLayoutNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableDescriptorSetEntryNVX* o = (VkObjectTableDescriptorSetEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->pipelineLayout);
}

void Java_cz_mg_vulkan_VkObjectTableDescriptorSetEntryNVX_setPipelineLayoutNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableDescriptorSetEntryNVX* o = (VkObjectTableDescriptorSetEntryNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pipelineLayout, valuePointer, sizeof(o->pipelineLayout));
}

jlong Java_cz_mg_vulkan_VkObjectTableDescriptorSetEntryNVX_getDescriptorSetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableDescriptorSetEntryNVX* o = (VkObjectTableDescriptorSetEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorSet);
}

void Java_cz_mg_vulkan_VkObjectTableDescriptorSetEntryNVX_setDescriptorSetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableDescriptorSetEntryNVX* o = (VkObjectTableDescriptorSetEntryNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorSet, valuePointer, sizeof(o->descriptorSet));
}


