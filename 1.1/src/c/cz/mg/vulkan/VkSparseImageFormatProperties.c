#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSparseImageFormatProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSparseImageFormatProperties);
}

jlong Java_cz_mg_vulkan_VkSparseImageFormatProperties_getAspectMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageFormatProperties* o = (VkSparseImageFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->aspectMask);
}

void Java_cz_mg_vulkan_VkSparseImageFormatProperties_setAspectMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageFormatProperties* o = (VkSparseImageFormatProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->aspectMask, valuePointer, sizeof(o->aspectMask));
}

jlong Java_cz_mg_vulkan_VkSparseImageFormatProperties_getImageGranularity(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageFormatProperties* o = (VkSparseImageFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageGranularity);
}

void Java_cz_mg_vulkan_VkSparseImageFormatProperties_setImageGranularity(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageFormatProperties* o = (VkSparseImageFormatProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageGranularity, valuePointer, sizeof(o->imageGranularity));
}

jlong Java_cz_mg_vulkan_VkSparseImageFormatProperties_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageFormatProperties* o = (VkSparseImageFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkSparseImageFormatProperties_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageFormatProperties* o = (VkSparseImageFormatProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}


