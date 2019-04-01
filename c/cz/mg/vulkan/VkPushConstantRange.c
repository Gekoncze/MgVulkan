#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPushConstantRange_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPushConstantRange);
}

jlong Java_cz_mg_vulkan_vk_VkPushConstantRange_getStageFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPushConstantRange* o = (VkPushConstantRange*)jniLongToPointer(address);
    return jniPointerToLong(&o->stageFlags);
}

void Java_cz_mg_vulkan_vk_VkPushConstantRange_setStageFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPushConstantRange* o = (VkPushConstantRange*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->stageFlags, valuePointer, sizeof(o->stageFlags));
}

jlong Java_cz_mg_vulkan_vk_VkPushConstantRange_getOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPushConstantRange* o = (VkPushConstantRange*)jniLongToPointer(address);
    return jniPointerToLong(&o->offset);
}

void Java_cz_mg_vulkan_vk_VkPushConstantRange_setOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPushConstantRange* o = (VkPushConstantRange*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->offset, valuePointer, sizeof(o->offset));
}

jlong Java_cz_mg_vulkan_vk_VkPushConstantRange_getSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPushConstantRange* o = (VkPushConstantRange*)jniLongToPointer(address);
    return jniPointerToLong(&o->size);
}

void Java_cz_mg_vulkan_vk_VkPushConstantRange_setSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPushConstantRange* o = (VkPushConstantRange*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->size, valuePointer, sizeof(o->size));
}


