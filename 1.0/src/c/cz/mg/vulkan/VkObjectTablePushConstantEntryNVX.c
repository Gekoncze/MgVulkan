#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkObjectTablePushConstantEntryNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkObjectTablePushConstantEntryNVX);
}

void Java_cz_mg_vulkan_VkObjectTablePushConstantEntryNVX_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkObjectTablePushConstantEntryNVX));
}

jlong Java_cz_mg_vulkan_VkObjectTablePushConstantEntryNVX_getTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTablePushConstantEntryNVX* o = (VkObjectTablePushConstantEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->type);
}

void Java_cz_mg_vulkan_VkObjectTablePushConstantEntryNVX_setTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTablePushConstantEntryNVX* o = (VkObjectTablePushConstantEntryNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->type, valuePointer, sizeof(o->type));
}

jlong Java_cz_mg_vulkan_VkObjectTablePushConstantEntryNVX_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTablePushConstantEntryNVX* o = (VkObjectTablePushConstantEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkObjectTablePushConstantEntryNVX_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTablePushConstantEntryNVX* o = (VkObjectTablePushConstantEntryNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkObjectTablePushConstantEntryNVX_getPipelineLayoutNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTablePushConstantEntryNVX* o = (VkObjectTablePushConstantEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->pipelineLayout);
}

void Java_cz_mg_vulkan_VkObjectTablePushConstantEntryNVX_setPipelineLayoutNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTablePushConstantEntryNVX* o = (VkObjectTablePushConstantEntryNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pipelineLayout, valuePointer, sizeof(o->pipelineLayout));
}

jlong Java_cz_mg_vulkan_VkObjectTablePushConstantEntryNVX_getStageFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTablePushConstantEntryNVX* o = (VkObjectTablePushConstantEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->stageFlags);
}

void Java_cz_mg_vulkan_VkObjectTablePushConstantEntryNVX_setStageFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTablePushConstantEntryNVX* o = (VkObjectTablePushConstantEntryNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->stageFlags, valuePointer, sizeof(o->stageFlags));
}


