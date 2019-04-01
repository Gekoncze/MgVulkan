#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkQueryPoolCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkQueryPoolCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkQueryPoolCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkQueryPoolCreateInfo* o = (VkQueryPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkQueryPoolCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkQueryPoolCreateInfo* o = (VkQueryPoolCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkQueryPoolCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkQueryPoolCreateInfo* o = (VkQueryPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkQueryPoolCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkQueryPoolCreateInfo* o = (VkQueryPoolCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkQueryPoolCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkQueryPoolCreateInfo* o = (VkQueryPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_vk_VkQueryPoolCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkQueryPoolCreateInfo* o = (VkQueryPoolCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_vk_VkQueryPoolCreateInfo_getQueryType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkQueryPoolCreateInfo* o = (VkQueryPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->queryType);
}

void Java_cz_mg_vulkan_vk_VkQueryPoolCreateInfo_setQueryType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkQueryPoolCreateInfo* o = (VkQueryPoolCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queryType, valuePointer, sizeof(o->queryType));
}

jlong Java_cz_mg_vulkan_vk_VkQueryPoolCreateInfo_getQueryCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkQueryPoolCreateInfo* o = (VkQueryPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->queryCount);
}

void Java_cz_mg_vulkan_vk_VkQueryPoolCreateInfo_setQueryCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkQueryPoolCreateInfo* o = (VkQueryPoolCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queryCount, valuePointer, sizeof(o->queryCount));
}

jlong Java_cz_mg_vulkan_vk_VkQueryPoolCreateInfo_getPipelineStatistics(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkQueryPoolCreateInfo* o = (VkQueryPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->pipelineStatistics);
}

void Java_cz_mg_vulkan_vk_VkQueryPoolCreateInfo_setPipelineStatistics(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkQueryPoolCreateInfo* o = (VkQueryPoolCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pipelineStatistics, valuePointer, sizeof(o->pipelineStatistics));
}


