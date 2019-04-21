#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntryKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorUpdateTemplateEntryKHR);
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntryKHR_getDstBinding(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntryKHR* o = (VkDescriptorUpdateTemplateEntryKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstBinding);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntryKHR_setDstBinding(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntryKHR* o = (VkDescriptorUpdateTemplateEntryKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstBinding, valuePointer, sizeof(o->dstBinding));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntryKHR_getDstArrayElement(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntryKHR* o = (VkDescriptorUpdateTemplateEntryKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstArrayElement);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntryKHR_setDstArrayElement(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntryKHR* o = (VkDescriptorUpdateTemplateEntryKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstArrayElement, valuePointer, sizeof(o->dstArrayElement));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntryKHR_getDescriptorCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntryKHR* o = (VkDescriptorUpdateTemplateEntryKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorCount);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntryKHR_setDescriptorCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntryKHR* o = (VkDescriptorUpdateTemplateEntryKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorCount, valuePointer, sizeof(o->descriptorCount));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntryKHR_getDescriptorType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntryKHR* o = (VkDescriptorUpdateTemplateEntryKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorType);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntryKHR_setDescriptorType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntryKHR* o = (VkDescriptorUpdateTemplateEntryKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorType, valuePointer, sizeof(o->descriptorType));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntryKHR_getOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntryKHR* o = (VkDescriptorUpdateTemplateEntryKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->offset);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntryKHR_setOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntryKHR* o = (VkDescriptorUpdateTemplateEntryKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->offset, valuePointer, sizeof(o->offset));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntryKHR_getStride(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntryKHR* o = (VkDescriptorUpdateTemplateEntryKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->stride);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateEntryKHR_setStride(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntryKHR* o = (VkDescriptorUpdateTemplateEntryKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->stride, valuePointer, sizeof(o->stride));
}


