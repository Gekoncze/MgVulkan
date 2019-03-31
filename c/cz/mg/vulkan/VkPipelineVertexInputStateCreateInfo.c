#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineVertexInputStateCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineVertexInputStateCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineVertexInputStateCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPipelineVertexInputStateCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineVertexInputStateCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPipelineVertexInputStateCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineVertexInputStateCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkPipelineVertexInputStateCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineVertexInputStateCreateInfo_getVertexBindingDescriptionCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->vertexBindingDescriptionCount));
}

void Java_cz_mg_vulkan_vk_VkPipelineVertexInputStateCreateInfo_setVertexBindingDescriptionCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->vertexBindingDescriptionCount, jniLongToPointer(valueAddress), sizeof(o->vertexBindingDescriptionCount));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineVertexInputStateCreateInfo_getPVertexBindingDescriptions(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pVertexBindingDescriptions));
}

void Java_cz_mg_vulkan_vk_VkPipelineVertexInputStateCreateInfo_setPVertexBindingDescriptions(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pVertexBindingDescriptions, jniLongToPointer(valueAddress), sizeof(o->pVertexBindingDescriptions));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineVertexInputStateCreateInfo_getVertexAttributeDescriptionCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->vertexAttributeDescriptionCount));
}

void Java_cz_mg_vulkan_vk_VkPipelineVertexInputStateCreateInfo_setVertexAttributeDescriptionCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->vertexAttributeDescriptionCount, jniLongToPointer(valueAddress), sizeof(o->vertexAttributeDescriptionCount));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineVertexInputStateCreateInfo_getPVertexAttributeDescriptions(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pVertexAttributeDescriptions));
}

void Java_cz_mg_vulkan_vk_VkPipelineVertexInputStateCreateInfo_setPVertexAttributeDescriptions(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pVertexAttributeDescriptions, jniLongToPointer(valueAddress), sizeof(o->pVertexAttributeDescriptions));
}

