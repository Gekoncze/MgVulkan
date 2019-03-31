#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkObjectTablePipelineEntryNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkObjectTablePipelineEntryNVX);
}

jlong Java_cz_mg_vulkan_vk_VkObjectTablePipelineEntryNVX_getType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTablePipelineEntryNVX* o = (VkObjectTablePipelineEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->type));
}

void Java_cz_mg_vulkan_vk_VkObjectTablePipelineEntryNVX_setType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTablePipelineEntryNVX* o = (VkObjectTablePipelineEntryNVX*)jniLongToPointer(address);
    memcpy(&o->type, jniLongToPointer(valueAddress), sizeof(o->type));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTablePipelineEntryNVX_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTablePipelineEntryNVX* o = (VkObjectTablePipelineEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkObjectTablePipelineEntryNVX_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTablePipelineEntryNVX* o = (VkObjectTablePipelineEntryNVX*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTablePipelineEntryNVX_getPipeline(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTablePipelineEntryNVX* o = (VkObjectTablePipelineEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pipeline));
}

void Java_cz_mg_vulkan_vk_VkObjectTablePipelineEntryNVX_setPipeline(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTablePipelineEntryNVX* o = (VkObjectTablePipelineEntryNVX*)jniLongToPointer(address);
    memcpy(&o->pipeline, jniLongToPointer(valueAddress), sizeof(o->pipeline));
}

