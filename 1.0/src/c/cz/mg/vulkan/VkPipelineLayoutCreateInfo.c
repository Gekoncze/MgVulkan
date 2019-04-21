#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineLayoutCreateInfo);
}

jlong Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_getSetLayoutCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->setLayoutCount);
}

void Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_setSetLayoutCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->setLayoutCount, valuePointer, sizeof(o->setLayoutCount));
}

jlong Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_getPSetLayouts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pSetLayouts);
}

void Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_setPSetLayouts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSetLayouts, &valuePointer, sizeof(o->pSetLayouts));
}

jlong Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_getPushConstantRangeCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->pushConstantRangeCount);
}

void Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_setPushConstantRangeCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pushConstantRangeCount, valuePointer, sizeof(o->pushConstantRangeCount));
}

jlong Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_getPPushConstantRanges(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pPushConstantRanges);
}

void Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_setPPushConstantRanges(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pPushConstantRanges, &valuePointer, sizeof(o->pPushConstantRanges));
}


