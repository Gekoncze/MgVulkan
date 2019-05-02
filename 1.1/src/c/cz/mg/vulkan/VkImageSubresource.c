#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkImageSubresource_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageSubresource);
}

void Java_cz_mg_vulkan_VkImageSubresource_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkImageSubresource));
}

jlong Java_cz_mg_vulkan_VkImageSubresource_getAspectMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    return jniPointerToLong(&o->aspectMask);
}

void Java_cz_mg_vulkan_VkImageSubresource_setAspectMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->aspectMask, valuePointer, sizeof(o->aspectMask));
}

jlong Java_cz_mg_vulkan_VkImageSubresource_getMipLevelNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    return jniPointerToLong(&o->mipLevel);
}

void Java_cz_mg_vulkan_VkImageSubresource_setMipLevelNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->mipLevel, valuePointer, sizeof(o->mipLevel));
}

jlong Java_cz_mg_vulkan_VkImageSubresource_getArrayLayerNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    return jniPointerToLong(&o->arrayLayer);
}

void Java_cz_mg_vulkan_VkImageSubresource_setArrayLayerNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->arrayLayer, valuePointer, sizeof(o->arrayLayer));
}


