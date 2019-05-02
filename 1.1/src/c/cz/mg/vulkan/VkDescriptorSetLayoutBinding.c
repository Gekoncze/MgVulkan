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

void Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkDescriptorSetLayoutBinding));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_getBindingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    return jniPointerToLong(&o->binding);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_setBindingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->binding, valuePointer, sizeof(o->binding));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_getDescriptorTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorType);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_setDescriptorTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorType, valuePointer, sizeof(o->descriptorType));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_getDescriptorCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorCount);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_setDescriptorCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorCount, valuePointer, sizeof(o->descriptorCount));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_getStageFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    return jniPointerToLong(&o->stageFlags);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_setStageFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->stageFlags, valuePointer, sizeof(o->stageFlags));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_getPImmutableSamplersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    return jniPointerToLong(o->pImmutableSamplers);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutBinding_setPImmutableSamplersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBinding* o = (VkDescriptorSetLayoutBinding*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pImmutableSamplers, &valuePointer, sizeof(o->pImmutableSamplers));
}


