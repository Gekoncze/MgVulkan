#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineLayoutCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineLayoutCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineLayoutCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPipelineLayoutCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineLayoutCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPipelineLayoutCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineLayoutCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkPipelineLayoutCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineLayoutCreateInfo_getSetLayoutCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->setLayoutCount));
}

void Java_cz_mg_vulkan_vk_VkPipelineLayoutCreateInfo_setSetLayoutCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    memcpy(&o->setLayoutCount, jniLongToPointer(valueAddress), sizeof(o->setLayoutCount));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineLayoutCreateInfo_getPSetLayouts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pSetLayouts));
}

void Java_cz_mg_vulkan_vk_VkPipelineLayoutCreateInfo_setPSetLayouts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pSetLayouts, jniLongToPointer(valueAddress), sizeof(o->pSetLayouts));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineLayoutCreateInfo_getPushConstantRangeCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pushConstantRangeCount));
}

void Java_cz_mg_vulkan_vk_VkPipelineLayoutCreateInfo_setPushConstantRangeCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pushConstantRangeCount, jniLongToPointer(valueAddress), sizeof(o->pushConstantRangeCount));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineLayoutCreateInfo_getPPushConstantRanges(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pPushConstantRanges));
}

void Java_cz_mg_vulkan_vk_VkPipelineLayoutCreateInfo_setPPushConstantRanges(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pPushConstantRanges, jniLongToPointer(valueAddress), sizeof(o->pPushConstantRanges));
}

