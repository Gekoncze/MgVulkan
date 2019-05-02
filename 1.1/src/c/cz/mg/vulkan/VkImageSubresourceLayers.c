#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkImageSubresourceLayers_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageSubresourceLayers);
}

void Java_cz_mg_vulkan_VkImageSubresourceLayers_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkImageSubresourceLayers));
}

jlong Java_cz_mg_vulkan_VkImageSubresourceLayers_getAspectMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    return jniPointerToLong(&o->aspectMask);
}

void Java_cz_mg_vulkan_VkImageSubresourceLayers_setAspectMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->aspectMask, valuePointer, sizeof(o->aspectMask));
}

jlong Java_cz_mg_vulkan_VkImageSubresourceLayers_getMipLevelNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    return jniPointerToLong(&o->mipLevel);
}

void Java_cz_mg_vulkan_VkImageSubresourceLayers_setMipLevelNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->mipLevel, valuePointer, sizeof(o->mipLevel));
}

jlong Java_cz_mg_vulkan_VkImageSubresourceLayers_getBaseArrayLayerNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    return jniPointerToLong(&o->baseArrayLayer);
}

void Java_cz_mg_vulkan_VkImageSubresourceLayers_setBaseArrayLayerNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->baseArrayLayer, valuePointer, sizeof(o->baseArrayLayer));
}

jlong Java_cz_mg_vulkan_VkImageSubresourceLayers_getLayerCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    return jniPointerToLong(&o->layerCount);
}

void Java_cz_mg_vulkan_VkImageSubresourceLayers_setLayerCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->layerCount, valuePointer, sizeof(o->layerCount));
}


