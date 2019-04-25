#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDescriptorSetAllocateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorSetAllocateInfo);
}

jlong Java_cz_mg_vulkan_VkDescriptorSetAllocateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDescriptorSetAllocateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetAllocateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDescriptorSetAllocateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetAllocateInfo_getDescriptorPoolNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorPool);
}

void Java_cz_mg_vulkan_VkDescriptorSetAllocateInfo_setDescriptorPoolNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorPool, valuePointer, sizeof(o->descriptorPool));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetAllocateInfo_getDescriptorSetCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorSetCount);
}

void Java_cz_mg_vulkan_VkDescriptorSetAllocateInfo_setDescriptorSetCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorSetCount, valuePointer, sizeof(o->descriptorSetCount));
}

jlong Java_cz_mg_vulkan_VkDescriptorSetAllocateInfo_getPSetLayoutsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pSetLayouts);
}

void Java_cz_mg_vulkan_VkDescriptorSetAllocateInfo_setPSetLayoutsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetAllocateInfo* o = (VkDescriptorSetAllocateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSetLayouts, &valuePointer, sizeof(o->pSetLayouts));
}


