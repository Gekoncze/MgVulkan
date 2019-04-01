#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineDynamicStateCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineDynamicStateCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDynamicStateCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkPipelineDynamicStateCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDynamicStateCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkPipelineDynamicStateCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDynamicStateCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_vk_VkPipelineDynamicStateCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDynamicStateCreateInfo_getDynamicStateCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->dynamicStateCount);
}

void Java_cz_mg_vulkan_vk_VkPipelineDynamicStateCreateInfo_setDynamicStateCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dynamicStateCount, valuePointer, sizeof(o->dynamicStateCount));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDynamicStateCreateInfo_getPDynamicStates(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pDynamicStates);
}

void Java_cz_mg_vulkan_vk_VkPipelineDynamicStateCreateInfo_setPDynamicStates(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDynamicStates, &valuePointer, sizeof(o->pDynamicStates));
}


