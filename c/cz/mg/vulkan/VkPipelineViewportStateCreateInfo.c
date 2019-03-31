#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineViewportStateCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineViewportStateCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineViewportStateCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPipelineViewportStateCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineViewportStateCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPipelineViewportStateCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineViewportStateCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkPipelineViewportStateCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineViewportStateCreateInfo_getViewportCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->viewportCount));
}

void Java_cz_mg_vulkan_vk_VkPipelineViewportStateCreateInfo_setViewportCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->viewportCount, jniLongToPointer(valueAddress), sizeof(o->viewportCount));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineViewportStateCreateInfo_getPViewports(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pViewports));
}

void Java_cz_mg_vulkan_vk_VkPipelineViewportStateCreateInfo_setPViewports(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pViewports, jniLongToPointer(valueAddress), sizeof(o->pViewports));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineViewportStateCreateInfo_getScissorCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->scissorCount));
}

void Java_cz_mg_vulkan_vk_VkPipelineViewportStateCreateInfo_setScissorCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->scissorCount, jniLongToPointer(valueAddress), sizeof(o->scissorCount));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineViewportStateCreateInfo_getPScissors(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pScissors));
}

void Java_cz_mg_vulkan_vk_VkPipelineViewportStateCreateInfo_setPScissors(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pScissors, jniLongToPointer(valueAddress), sizeof(o->pScissors));
}

