#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkImageSubresourceRange_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageSubresourceRange);
}

jlong Java_cz_mg_vulkan_vk_VkImageSubresourceRange_getAspectMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    return jniPointerToLong(&(o->aspectMask));
}

void Java_cz_mg_vulkan_vk_VkImageSubresourceRange_setAspectMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    memcpy(&o->aspectMask, jniLongToPointer(valueAddress), sizeof(o->aspectMask));
}
jlong Java_cz_mg_vulkan_vk_VkImageSubresourceRange_getBaseMipLevel(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    return jniPointerToLong(&(o->baseMipLevel));
}

void Java_cz_mg_vulkan_vk_VkImageSubresourceRange_setBaseMipLevel(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    memcpy(&o->baseMipLevel, jniLongToPointer(valueAddress), sizeof(o->baseMipLevel));
}
jlong Java_cz_mg_vulkan_vk_VkImageSubresourceRange_getLevelCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    return jniPointerToLong(&(o->levelCount));
}

void Java_cz_mg_vulkan_vk_VkImageSubresourceRange_setLevelCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    memcpy(&o->levelCount, jniLongToPointer(valueAddress), sizeof(o->levelCount));
}
jlong Java_cz_mg_vulkan_vk_VkImageSubresourceRange_getBaseArrayLayer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    return jniPointerToLong(&(o->baseArrayLayer));
}

void Java_cz_mg_vulkan_vk_VkImageSubresourceRange_setBaseArrayLayer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    memcpy(&o->baseArrayLayer, jniLongToPointer(valueAddress), sizeof(o->baseArrayLayer));
}
jlong Java_cz_mg_vulkan_vk_VkImageSubresourceRange_getLayerCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    return jniPointerToLong(&(o->layerCount));
}

void Java_cz_mg_vulkan_vk_VkImageSubresourceRange_setLayerCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    memcpy(&o->layerCount, jniLongToPointer(valueAddress), sizeof(o->layerCount));
}

