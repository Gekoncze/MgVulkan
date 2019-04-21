#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorSetLayoutCreateInfo);
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutCreateInfo* o = (VkDescriptorSetLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutCreateInfo* o = (VkDescriptorSetLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutCreateInfo* o = (VkDescriptorSetLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutCreateInfo* o = (VkDescriptorSetLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutCreateInfo* o = (VkDescriptorSetLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutCreateInfo* o = (VkDescriptorSetLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutCreateInfo_getBindingCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutCreateInfo* o = (VkDescriptorSetLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->bindingCount);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutCreateInfo_setBindingCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutCreateInfo* o = (VkDescriptorSetLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->bindingCount, valuePointer, sizeof(o->bindingCount));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetLayoutCreateInfo_getPBindings(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutCreateInfo* o = (VkDescriptorSetLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pBindings);
}

void Java_cz_mg_vulkan_VkDescriptorSetLayoutCreateInfo_setPBindings(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutCreateInfo* o = (VkDescriptorSetLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pBindings, &valuePointer, sizeof(o->pBindings));
}


