#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSparseImageFormatProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSparseImageFormatProperties);
}

jlong Java_cz_mg_vulkan_vk_VkSparseImageFormatProperties_getAspectMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageFormatProperties* o = (VkSparseImageFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->aspectMask));
}

void Java_cz_mg_vulkan_vk_VkSparseImageFormatProperties_setAspectMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageFormatProperties* o = (VkSparseImageFormatProperties*)jniLongToPointer(address);
    memcpy(&o->aspectMask, jniLongToPointer(valueAddress), sizeof(o->aspectMask));
}
jlong Java_cz_mg_vulkan_vk_VkSparseImageFormatProperties_getImageGranularity(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageFormatProperties* o = (VkSparseImageFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageGranularity));
}

void Java_cz_mg_vulkan_vk_VkSparseImageFormatProperties_setImageGranularity(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageFormatProperties* o = (VkSparseImageFormatProperties*)jniLongToPointer(address);
    memcpy(&o->imageGranularity, jniLongToPointer(valueAddress), sizeof(o->imageGranularity));
}
jlong Java_cz_mg_vulkan_vk_VkSparseImageFormatProperties_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageFormatProperties* o = (VkSparseImageFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkSparseImageFormatProperties_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageFormatProperties* o = (VkSparseImageFormatProperties*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}

