#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkImageSubresourceLayers_getAspectMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    return jniPointerToLong(&o->aspectMask);
}

void Java_cz_mg_vulkan_VkImageSubresourceLayers_setAspectMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->aspectMask, valuePointer, sizeof(o->aspectMask));
}

jlong Java_cz_mg_vulkan_VkImageSubresourceLayers_getMipLevel(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    return jniPointerToLong(&o->mipLevel);
}

void Java_cz_mg_vulkan_VkImageSubresourceLayers_setMipLevel(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->mipLevel, valuePointer, sizeof(o->mipLevel));
}

jlong Java_cz_mg_vulkan_VkImageSubresourceLayers_getBaseArrayLayer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    return jniPointerToLong(&o->baseArrayLayer);
}

void Java_cz_mg_vulkan_VkImageSubresourceLayers_setBaseArrayLayer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->baseArrayLayer, valuePointer, sizeof(o->baseArrayLayer));
}

jlong Java_cz_mg_vulkan_VkImageSubresourceLayers_getLayerCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    return jniPointerToLong(&o->layerCount);
}

void Java_cz_mg_vulkan_VkImageSubresourceLayers_setLayerCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceLayers* o = (VkImageSubresourceLayers*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->layerCount, valuePointer, sizeof(o->layerCount));
}


