#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateEntry_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorUpdateTemplateEntry);
}

jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateEntry_getDstBinding(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    return jniPointerToLong(&(o->dstBinding));
}

void Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateEntry_setDstBinding(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    memcpy(&o->dstBinding, jniLongToPointer(valueAddress), sizeof(o->dstBinding));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateEntry_getDstArrayElement(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    return jniPointerToLong(&(o->dstArrayElement));
}

void Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateEntry_setDstArrayElement(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    memcpy(&o->dstArrayElement, jniLongToPointer(valueAddress), sizeof(o->dstArrayElement));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateEntry_getDescriptorCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorCount));
}

void Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateEntry_setDescriptorCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    memcpy(&o->descriptorCount, jniLongToPointer(valueAddress), sizeof(o->descriptorCount));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateEntry_getDescriptorType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorType));
}

void Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateEntry_setDescriptorType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    memcpy(&o->descriptorType, jniLongToPointer(valueAddress), sizeof(o->descriptorType));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateEntry_getOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    return jniPointerToLong(&(o->offset));
}

void Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateEntry_setOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    memcpy(&o->offset, jniLongToPointer(valueAddress), sizeof(o->offset));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateEntry_getStride(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    return jniPointerToLong(&(o->stride));
}

void Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateEntry_setStride(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateEntry* o = (VkDescriptorUpdateTemplateEntry*)jniLongToPointer(address);
    memcpy(&o->stride, jniLongToPointer(valueAddress), sizeof(o->stride));
}

