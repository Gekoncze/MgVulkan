#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkImageSubresourceLayers_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageSubresourceLayers);
}

jlong Java_cz_mg_vulkan_vk_VkImageSubresourceLayers_getAspectMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    return jniPointerToLong(&(o->aspectMask));
}

void Java_cz_mg_vulkan_vk_VkImageSubresourceLayers_setAspectMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    memcpy(&o->aspectMask, jniLongToPointer(valueAddress), sizeof(o->aspectMask));
}
jlong Java_cz_mg_vulkan_vk_VkImageSubresourceLayers_getMipLevel(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    return jniPointerToLong(&(o->mipLevel));
}

void Java_cz_mg_vulkan_vk_VkImageSubresourceLayers_setMipLevel(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    memcpy(&o->mipLevel, jniLongToPointer(valueAddress), sizeof(o->mipLevel));
}
jlong Java_cz_mg_vulkan_vk_VkImageSubresourceLayers_getBaseArrayLayer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    return jniPointerToLong(&(o->baseArrayLayer));
}

void Java_cz_mg_vulkan_vk_VkImageSubresourceLayers_setBaseArrayLayer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    memcpy(&o->baseArrayLayer, jniLongToPointer(valueAddress), sizeof(o->baseArrayLayer));
}
jlong Java_cz_mg_vulkan_vk_VkImageSubresourceLayers_getLayerCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    return jniPointerToLong(&(o->layerCount));
}

void Java_cz_mg_vulkan_vk_VkImageSubresourceLayers_setLayerCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    memcpy(&o->layerCount, jniLongToPointer(valueAddress), sizeof(o->layerCount));
}

