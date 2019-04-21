#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkImageSubresourceRange_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageSubresourceRange);
}

jlong Java_cz_mg_vulkan_VkImageSubresourceRange_getAspectMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    return jniPointerToLong(&o->aspectMask);
}

void Java_cz_mg_vulkan_VkImageSubresourceRange_setAspectMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->aspectMask, valuePointer, sizeof(o->aspectMask));
}

jlong Java_cz_mg_vulkan_VkImageSubresourceRange_getBaseMipLevel(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    return jniPointerToLong(&o->baseMipLevel);
}

void Java_cz_mg_vulkan_VkImageSubresourceRange_setBaseMipLevel(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->baseMipLevel, valuePointer, sizeof(o->baseMipLevel));
}

jlong Java_cz_mg_vulkan_VkImageSubresourceRange_getLevelCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    return jniPointerToLong(&o->levelCount);
}

void Java_cz_mg_vulkan_VkImageSubresourceRange_setLevelCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->levelCount, valuePointer, sizeof(o->levelCount));
}

jlong Java_cz_mg_vulkan_VkImageSubresourceRange_getBaseArrayLayer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    return jniPointerToLong(&o->baseArrayLayer);
}

void Java_cz_mg_vulkan_VkImageSubresourceRange_setBaseArrayLayer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->baseArrayLayer, valuePointer, sizeof(o->baseArrayLayer));
}

jlong Java_cz_mg_vulkan_VkImageSubresourceRange_getLayerCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    return jniPointerToLong(&o->layerCount);
}

void Java_cz_mg_vulkan_VkImageSubresourceRange_setLayerCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresourceRange* o = (VkImageSubresourceRange*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->layerCount, valuePointer, sizeof(o->layerCount));
}


