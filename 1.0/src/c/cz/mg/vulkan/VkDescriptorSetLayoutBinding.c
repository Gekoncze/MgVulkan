#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorSetLayoutBinding);
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_getBinding(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    return jniPointerToLong(&o->binding);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_setBinding(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->binding, valuePointer, sizeof(o->binding));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_getDescriptorType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorType);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_setDescriptorType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorType, valuePointer, sizeof(o->descriptorType));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_getDescriptorCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorCount);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_setDescriptorCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorCount, valuePointer, sizeof(o->descriptorCount));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_getStageFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    return jniPointerToLong(&o->stageFlags);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_setStageFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->stageFlags, valuePointer, sizeof(o->stageFlags));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_getPImmutableSamplers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    return jniPointerToLong(o->pImmutableSamplers);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_setPImmutableSamplers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pImmutableSamplers, &valuePointer, sizeof(o->pImmutableSamplers));
}


