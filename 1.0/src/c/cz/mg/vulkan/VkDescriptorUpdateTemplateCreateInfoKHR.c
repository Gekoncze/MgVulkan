#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorUpdateTemplateCreateInfoKHR);
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_getDescriptorUpdateEntryCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorUpdateEntryCount);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_setDescriptorUpdateEntryCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorUpdateEntryCount, valuePointer, sizeof(o->descriptorUpdateEntryCount));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_getPDescriptorUpdateEntries(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pDescriptorUpdateEntries);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_setPDescriptorUpdateEntries(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDescriptorUpdateEntries, &valuePointer, sizeof(o->pDescriptorUpdateEntries));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_getTemplateType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->templateType);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_setTemplateType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->templateType, valuePointer, sizeof(o->templateType));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_getDescriptorSetLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorSetLayout);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_setDescriptorSetLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorSetLayout, valuePointer, sizeof(o->descriptorSetLayout));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_getPipelineBindPoint(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->pipelineBindPoint);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_setPipelineBindPoint(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pipelineBindPoint, valuePointer, sizeof(o->pipelineBindPoint));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_getPipelineLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->pipelineLayout);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_setPipelineLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pipelineLayout, valuePointer, sizeof(o->pipelineLayout));
}

jlong Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_getSet(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->set);
}

void Java_cz_mg_vulkan_VkDescriptorUpdateTemplateCreateInfoKHR_setSet(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorUpdateTemplateCreateInfoKHR* o = (VkDescriptorUpdateTemplateCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->set, valuePointer, sizeof(o->set));
}


