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

void Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPipelineLayoutCreateInfo));
}

jlong Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_getSetLayoutCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->setLayoutCount);
}

void Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_setSetLayoutCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->setLayoutCount, valuePointer, sizeof(o->setLayoutCount));
}

jlong Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_getPSetLayoutsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pSetLayouts);
}

void Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_setPSetLayoutsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSetLayouts, &valuePointer, sizeof(o->pSetLayouts));
}

jlong Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_getPushConstantRangeCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->pushConstantRangeCount);
}

void Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_setPushConstantRangeCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pushConstantRangeCount, valuePointer, sizeof(o->pushConstantRangeCount));
}

jlong Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_getPPushConstantRangesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pPushConstantRanges);
}

void Java_cz_mg_vulkan_VkPipelineLayoutCreateInfo_setPPushConstantRangesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineLayoutCreateInfo* o = (VkPipelineLayoutCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pPushConstantRanges, &valuePointer, sizeof(o->pPushConstantRanges));
}


