#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDescriptorSetVariableDescriptorCountLayoutSupportEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT);
}

jlong Java_cz_mg_vulkan_vk_VkDescriptorSetVariableDescriptorCountLayoutSupportEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetVariableDescriptorCountLayoutSupportEXT* o = (VkDescriptorSetVariableDescriptorCountLayoutSupportEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetVariableDescriptorCountLayoutSupportEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetVariableDescriptorCountLayoutSupportEXT* o = (VkDescriptorSetVariableDescriptorCountLayoutSupportEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorSetVariableDescriptorCountLayoutSupportEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetVariableDescriptorCountLayoutSupportEXT* o = (VkDescriptorSetVariableDescriptorCountLayoutSupportEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetVariableDescriptorCountLayoutSupportEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetVariableDescriptorCountLayoutSupportEXT* o = (VkDescriptorSetVariableDescriptorCountLayoutSupportEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorSetVariableDescriptorCountLayoutSupportEXT_getMaxVariableDescriptorCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetVariableDescriptorCountLayoutSupportEXT* o = (VkDescriptorSetVariableDescriptorCountLayoutSupportEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxVariableDescriptorCount));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetVariableDescriptorCountLayoutSupportEXT_setMaxVariableDescriptorCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetVariableDescriptorCountLayoutSupportEXT* o = (VkDescriptorSetVariableDescriptorCountLayoutSupportEXT*)jniLongToPointer(address);
    memcpy(&o->maxVariableDescriptorCount, jniLongToPointer(valueAddress), sizeof(o->maxVariableDescriptorCount));
}

