#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineDynamicStateCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineDynamicStateCreateInfo);
}

void Java_cz_mg_vulkan_VkPipelineDynamicStateCreateInfo_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPipelineDynamicStateCreateInfo));
}

jlong Java_cz_mg_vulkan_VkPipelineDynamicStateCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineDynamicStateCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineDynamicStateCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineDynamicStateCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineDynamicStateCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineDynamicStateCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineDynamicStateCreateInfo_getDynamicStateCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->dynamicStateCount);
}

void Java_cz_mg_vulkan_VkPipelineDynamicStateCreateInfo_setDynamicStateCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dynamicStateCount, valuePointer, sizeof(o->dynamicStateCount));
}

jlong Java_cz_mg_vulkan_VkPipelineDynamicStateCreateInfo_getPDynamicStatesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pDynamicStates);
}

void Java_cz_mg_vulkan_VkPipelineDynamicStateCreateInfo_setPDynamicStatesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDynamicStateCreateInfo* o = (VkPipelineDynamicStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDynamicStates, &valuePointer, sizeof(o->pDynamicStates));
}


