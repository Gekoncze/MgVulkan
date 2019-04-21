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

jlong Java_cz_mg_vulkan_VkImageSubresource_getAspectMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    return jniPointerToLong(&o->aspectMask);
}

void Java_cz_mg_vulkan_VkImageSubresource_setAspectMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->aspectMask, valuePointer, sizeof(o->aspectMask));
}

jlong Java_cz_mg_vulkan_VkImageSubresource_getMipLevel(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    return jniPointerToLong(&o->mipLevel);
}

void Java_cz_mg_vulkan_VkImageSubresource_setMipLevel(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->mipLevel, valuePointer, sizeof(o->mipLevel));
}

jlong Java_cz_mg_vulkan_VkImageSubresource_getArrayLayer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    return jniPointerToLong(&o->arrayLayer);
}

void Java_cz_mg_vulkan_VkImageSubresource_setArrayLayer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->arrayLayer, valuePointer, sizeof(o->arrayLayer));
}


