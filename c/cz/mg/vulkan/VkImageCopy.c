#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkImageCopy_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageCopy);
}

jlong Java_cz_mg_vulkan_vk_VkImageCopy_getSrcSubresource(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcSubresource);
}

void Java_cz_mg_vulkan_vk_VkImageCopy_setSrcSubresource(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcSubresource, valuePointer, sizeof(o->srcSubresource));
}

jlong Java_cz_mg_vulkan_vk_VkImageCopy_getSrcOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcOffset);
}

void Java_cz_mg_vulkan_vk_VkImageCopy_setSrcOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcOffset, valuePointer, sizeof(o->srcOffset));
}

jlong Java_cz_mg_vulkan_vk_VkImageCopy_getDstSubresource(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstSubresource);
}

void Java_cz_mg_vulkan_vk_VkImageCopy_setDstSubresource(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstSubresource, valuePointer, sizeof(o->dstSubresource));
}

jlong Java_cz_mg_vulkan_vk_VkImageCopy_getDstOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstOffset);
}

void Java_cz_mg_vulkan_vk_VkImageCopy_setDstOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstOffset, valuePointer, sizeof(o->dstOffset));
}

jlong Java_cz_mg_vulkan_vk_VkImageCopy_getExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->extent);
}

void Java_cz_mg_vulkan_vk_VkImageCopy_setExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->extent, valuePointer, sizeof(o->extent));
}


