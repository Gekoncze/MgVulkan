#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorUpdateTemplateCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_getDescriptorUpdateEntryCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorUpdateEntryCount));
}

void Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_setDescriptorUpdateEntryCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->descriptorUpdateEntryCount, jniLongToPointer(valueAddress), sizeof(o->descriptorUpdateEntryCount));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_getPDescriptorUpdateEntries(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pDescriptorUpdateEntries));
}

void Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_setPDescriptorUpdateEntries(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pDescriptorUpdateEntries, jniLongToPointer(valueAddress), sizeof(o->pDescriptorUpdateEntries));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_getTemplateType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->templateType));
}

void Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_setTemplateType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->templateType, jniLongToPointer(valueAddress), sizeof(o->templateType));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_getDescriptorSetLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorSetLayout));
}

void Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_setDescriptorSetLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->descriptorSetLayout, jniLongToPointer(valueAddress), sizeof(o->descriptorSetLayout));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_getPipelineBindPoint(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pipelineBindPoint));
}

void Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_setPipelineBindPoint(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pipelineBindPoint, jniLongToPointer(valueAddress), sizeof(o->pipelineBindPoint));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_getPipelineLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pipelineLayout));
}

void Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_setPipelineLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pipelineLayout, jniLongToPointer(valueAddress), sizeof(o->pipelineLayout));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_getSet(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->set));
}

void Java_cz_mg_vulkan_vk_VkDescriptorUpdateTemplateCreateInfo_setSet(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfo* o = (VkDescriptorUpdateTemplateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->set, jniLongToPointer(valueAddress), sizeof(o->set));
}

