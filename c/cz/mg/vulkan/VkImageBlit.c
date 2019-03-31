#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkImageBlit_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageBlit);
}

jlong Java_cz_mg_vulkan_vk_VkImageBlit_getSrcSubresource(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    return jniPointerToLong(&(o->srcSubresource));
}

void Java_cz_mg_vulkan_vk_VkImageBlit_setSrcSubresource(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    memcpy(&o->srcSubresource, jniLongToPointer(valueAddress), sizeof(o->srcSubresource));
}
jlong Java_cz_mg_vulkan_vk_VkImageBlit_getSrcOffsets(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    return jniPointerToLong(&(o->srcOffsets));
}

void Java_cz_mg_vulkan_vk_VkImageBlit_setSrcOffsets(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    memcpy(o->srcOffsets, jniLongToPointer(valueAddress), sizeof(o->srcOffsets));
}
jlong Java_cz_mg_vulkan_vk_VkImageBlit_getDstSubresource(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    return jniPointerToLong(&(o->dstSubresource));
}

void Java_cz_mg_vulkan_vk_VkImageBlit_setDstSubresource(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    memcpy(&o->dstSubresource, jniLongToPointer(valueAddress), sizeof(o->dstSubresource));
}
jlong Java_cz_mg_vulkan_vk_VkImageBlit_getDstOffsets(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    return jniPointerToLong(&(o->dstOffsets));
}

void Java_cz_mg_vulkan_vk_VkImageBlit_setDstOffsets(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    memcpy(o->dstOffsets, jniLongToPointer(valueAddress), sizeof(o->dstOffsets));
}

