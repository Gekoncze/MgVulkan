#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkObjectTablePushConstantEntryNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkObjectTablePushConstantEntryNVX);
}

jlong Java_cz_mg_vulkan_vk_VkObjectTablePushConstantEntryNVX_getType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTablePushConstantEntryNVX* o = (VkObjectTablePushConstantEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->type));
}

void Java_cz_mg_vulkan_vk_VkObjectTablePushConstantEntryNVX_setType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTablePushConstantEntryNVX* o = (VkObjectTablePushConstantEntryNVX*)jniLongToPointer(address);
    memcpy(&o->type, jniLongToPointer(valueAddress), sizeof(o->type));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTablePushConstantEntryNVX_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTablePushConstantEntryNVX* o = (VkObjectTablePushConstantEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkObjectTablePushConstantEntryNVX_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTablePushConstantEntryNVX* o = (VkObjectTablePushConstantEntryNVX*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTablePushConstantEntryNVX_getPipelineLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTablePushConstantEntryNVX* o = (VkObjectTablePushConstantEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pipelineLayout));
}

void Java_cz_mg_vulkan_vk_VkObjectTablePushConstantEntryNVX_setPipelineLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTablePushConstantEntryNVX* o = (VkObjectTablePushConstantEntryNVX*)jniLongToPointer(address);
    memcpy(&o->pipelineLayout, jniLongToPointer(valueAddress), sizeof(o->pipelineLayout));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTablePushConstantEntryNVX_getStageFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTablePushConstantEntryNVX* o = (VkObjectTablePushConstantEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->stageFlags));
}

void Java_cz_mg_vulkan_vk_VkObjectTablePushConstantEntryNVX_setStageFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTablePushConstantEntryNVX* o = (VkObjectTablePushConstantEntryNVX*)jniLongToPointer(address);
    memcpy(&o->stageFlags, jniLongToPointer(valueAddress), sizeof(o->stageFlags));
}

