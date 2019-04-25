#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorSetLayoutBindingFlagsCreateInfoEXT);
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBindingFlagsCreateInfoEXT* o = (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBindingFlagsCreateInfoEXT* o = (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBindingFlagsCreateInfoEXT* o = (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBindingFlagsCreateInfoEXT* o = (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_getBindingCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBindingFlagsCreateInfoEXT* o = (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->bindingCount);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_setBindingCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBindingFlagsCreateInfoEXT* o = (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->bindingCount, valuePointer, sizeof(o->bindingCount));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_getPBindingFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBindingFlagsCreateInfoEXT* o = (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pBindingFlags);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutBindingFlagsCreateInfoEXT_setPBindingFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutBindingFlagsCreateInfoEXT* o = (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pBindingFlags, &valuePointer, sizeof(o->pBindingFlags));
}


