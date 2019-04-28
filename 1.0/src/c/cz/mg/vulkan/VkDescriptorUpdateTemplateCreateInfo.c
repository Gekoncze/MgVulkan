#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorUpdateTemplateCreateInfo);
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_getDescriptorUpdateEntryCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorUpdateEntryCount);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_setDescriptorUpdateEntryCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorUpdateEntryCount, valuePointer, sizeof(o->descriptorUpdateEntryCount));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_getPDescriptorUpdateEntriesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pDescriptorUpdateEntries);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_setPDescriptorUpdateEntriesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDescriptorUpdateEntries, &valuePointer, sizeof(o->pDescriptorUpdateEntries));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_getTemplateTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->templateType);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_setTemplateTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->templateType, valuePointer, sizeof(o->templateType));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_getDescriptorSetLayoutNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorSetLayout);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_setDescriptorSetLayoutNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorSetLayout, valuePointer, sizeof(o->descriptorSetLayout));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_getPipelineBindPointNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->pipelineBindPoint);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_setPipelineBindPointNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pipelineBindPoint, valuePointer, sizeof(o->pipelineBindPoint));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_getPipelineLayoutNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->pipelineLayout);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_setPipelineLayoutNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pipelineLayout, valuePointer, sizeof(o->pipelineLayout));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_getSetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->set);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfo_setSetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->set, valuePointer, sizeof(o->set));
}


