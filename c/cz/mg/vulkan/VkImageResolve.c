#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkImageResolve_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageResolve);
}

jlong Java_cz_mg_vulkan_vk_VkImageResolve_getSrcSubresource(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageResolve* o = (VkImageResolve*)jniLongToPointer(address);
    return jniPointerToLong(&(o->srcSubresource));
}

void Java_cz_mg_vulkan_vk_VkImageResolve_setSrcSubresource(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageResolve* o = (VkImageResolve*)jniLongToPointer(address);
    memcpy(&o->srcSubresource, jniLongToPointer(valueAddress), sizeof(o->srcSubresource));
}
jlong Java_cz_mg_vulkan_vk_VkImageResolve_getSrcOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageResolve* o = (VkImageResolve*)jniLongToPointer(address);
    return jniPointerToLong(&(o->srcOffset));
}

void Java_cz_mg_vulkan_vk_VkImageResolve_setSrcOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageResolve* o = (VkImageResolve*)jniLongToPointer(address);
    memcpy(&o->srcOffset, jniLongToPointer(valueAddress), sizeof(o->srcOffset));
}
jlong Java_cz_mg_vulkan_vk_VkImageResolve_getDstSubresource(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageResolve* o = (VkImageResolve*)jniLongToPointer(address);
    return jniPointerToLong(&(o->dstSubresource));
}

void Java_cz_mg_vulkan_vk_VkImageResolve_setDstSubresource(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageResolve* o = (VkImageResolve*)jniLongToPointer(address);
    memcpy(&o->dstSubresource, jniLongToPointer(valueAddress), sizeof(o->dstSubresource));
}
jlong Java_cz_mg_vulkan_vk_VkImageResolve_getDstOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageResolve* o = (VkImageResolve*)jniLongToPointer(address);
    return jniPointerToLong(&(o->dstOffset));
}

void Java_cz_mg_vulkan_vk_VkImageResolve_setDstOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageResolve* o = (VkImageResolve*)jniLongToPointer(address);
    memcpy(&o->dstOffset, jniLongToPointer(valueAddress), sizeof(o->dstOffset));
}
jlong Java_cz_mg_vulkan_vk_VkImageResolve_getExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageResolve* o = (VkImageResolve*)jniLongToPointer(address);
    return jniPointerToLong(&(o->extent));
}

void Java_cz_mg_vulkan_vk_VkImageResolve_setExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageResolve* o = (VkImageResolve*)jniLongToPointer(address);
    memcpy(&o->extent, jniLongToPointer(valueAddress), sizeof(o->extent));
}

