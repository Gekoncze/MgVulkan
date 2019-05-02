#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntry_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorUpdateTemplateEntry);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntry_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkDescriptorUpdateTemplateEntry));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntry_getDstBindingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstBinding);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntry_setDstBindingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstBinding, valuePointer, sizeof(o->dstBinding));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntry_getDstArrayElementNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstArrayElement);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntry_setDstArrayElementNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstArrayElement, valuePointer, sizeof(o->dstArrayElement));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntry_getDescriptorCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorCount);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntry_setDescriptorCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorCount, valuePointer, sizeof(o->descriptorCount));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntry_getDescriptorTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorType);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntry_setDescriptorTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorType, valuePointer, sizeof(o->descriptorType));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntry_getOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    return jniPointerToLong(&o->offset);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntry_setOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->offset, valuePointer, sizeof(o->offset));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntry_getStrideNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    return jniPointerToLong(&o->stride);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntry_setStrideNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->stride, valuePointer, sizeof(o->stride));
}


