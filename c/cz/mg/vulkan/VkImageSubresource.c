#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkImageSubresource_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageSubresource);
}

jlong Java_cz_mg_vulkan_vk_VkImageSubresource_getAspectMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    return jniPointerToLong(&(o->aspectMask));
}

void Java_cz_mg_vulkan_vk_VkImageSubresource_setAspectMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    memcpy(&o->aspectMask, jniLongToPointer(valueAddress), sizeof(o->aspectMask));
}
jlong Java_cz_mg_vulkan_vk_VkImageSubresource_getMipLevel(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    return jniPointerToLong(&(o->mipLevel));
}

void Java_cz_mg_vulkan_vk_VkImageSubresource_setMipLevel(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    memcpy(&o->mipLevel, jniLongToPointer(valueAddress), sizeof(o->mipLevel));
}
jlong Java_cz_mg_vulkan_vk_VkImageSubresource_getArrayLayer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    return jniPointerToLong(&(o->arrayLayer));
}

void Java_cz_mg_vulkan_vk_VkImageSubresource_setArrayLayer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageSubresource* o = (VkImageSubresource*)jniLongToPointer(address);
    memcpy(&o->arrayLayer, jniLongToPointer(valueAddress), sizeof(o->arrayLayer));
}

