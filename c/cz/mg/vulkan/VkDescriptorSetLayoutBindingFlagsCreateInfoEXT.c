#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorSetLayoutBindingFlagsCreateInfoEXT);
}

jlong Java_cz_mg_vulkan_vk_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBindingFlagsCreateInfoEXT* o = (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBindingFlagsCreateInfoEXT* o = (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBindingFlagsCreateInfoEXT* o = (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBindingFlagsCreateInfoEXT* o = (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_getBindingCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBindingFlagsCreateInfoEXT* o = (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->bindingCount));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_setBindingCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBindingFlagsCreateInfoEXT* o = (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->bindingCount, jniLongToPointer(valueAddress), sizeof(o->bindingCount));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_getPBindingFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBindingFlagsCreateInfoEXT* o = (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pBindingFlags));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_setPBindingFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBindingFlagsCreateInfoEXT* o = (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pBindingFlags, jniLongToPointer(valueAddress), sizeof(o->pBindingFlags));
}

