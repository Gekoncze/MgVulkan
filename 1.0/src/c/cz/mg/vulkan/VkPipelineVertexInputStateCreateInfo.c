#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineVertexInputStateCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineVertexInputStateCreateInfo);
}

void Java_cz_mg_vulkan_VkPipelineVertexInputStateCreateInfo_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPipelineVertexInputStateCreateInfo));
}

jlong Java_cz_mg_vulkan_VkPipelineVertexInputStateCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineVertexInputStateCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineVertexInputStateCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineVertexInputStateCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineVertexInputStateCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineVertexInputStateCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineVertexInputStateCreateInfo_getVertexBindingDescriptionCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->vertexBindingDescriptionCount);
}

void Java_cz_mg_vulkan_VkPipelineVertexInputStateCreateInfo_setVertexBindingDescriptionCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->vertexBindingDescriptionCount, valuePointer, sizeof(o->vertexBindingDescriptionCount));
}

jlong Java_cz_mg_vulkan_VkPipelineVertexInputStateCreateInfo_getPVertexBindingDescriptionsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pVertexBindingDescriptions);
}

void Java_cz_mg_vulkan_VkPipelineVertexInputStateCreateInfo_setPVertexBindingDescriptionsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pVertexBindingDescriptions, &valuePointer, sizeof(o->pVertexBindingDescriptions));
}

jlong Java_cz_mg_vulkan_VkPipelineVertexInputStateCreateInfo_getVertexAttributeDescriptionCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->vertexAttributeDescriptionCount);
}

void Java_cz_mg_vulkan_VkPipelineVertexInputStateCreateInfo_setVertexAttributeDescriptionCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->vertexAttributeDescriptionCount, valuePointer, sizeof(o->vertexAttributeDescriptionCount));
}

jlong Java_cz_mg_vulkan_VkPipelineVertexInputStateCreateInfo_getPVertexAttributeDescriptionsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pVertexAttributeDescriptions);
}

void Java_cz_mg_vulkan_VkPipelineVertexInputStateCreateInfo_setPVertexAttributeDescriptionsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputStateCreateInfo* o = (VkPipelineVertexInputStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pVertexAttributeDescriptions, &valuePointer, sizeof(o->pVertexAttributeDescriptions));
}


