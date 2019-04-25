#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkImageFormatProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageFormatProperties);
}

jlong Java_cz_mg_vulkan_VkImageFormatProperties_getMaxExtentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxExtent);
}

void Java_cz_mg_vulkan_VkImageFormatProperties_setMaxExtentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxExtent, valuePointer, sizeof(o->maxExtent));
}

jlong Java_cz_mg_vulkan_VkImageFormatProperties_getMaxMipLevelsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxMipLevels);
}

void Java_cz_mg_vulkan_VkImageFormatProperties_setMaxMipLevelsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxMipLevels, valuePointer, sizeof(o->maxMipLevels));
}

jlong Java_cz_mg_vulkan_VkImageFormatProperties_getMaxArrayLayersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxArrayLayers);
}

void Java_cz_mg_vulkan_VkImageFormatProperties_setMaxArrayLayersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxArrayLayers, valuePointer, sizeof(o->maxArrayLayers));
}

jlong Java_cz_mg_vulkan_VkImageFormatProperties_getSampleCountsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleCounts);
}

void Java_cz_mg_vulkan_VkImageFormatProperties_setSampleCountsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleCounts, valuePointer, sizeof(o->sampleCounts));
}

jlong Java_cz_mg_vulkan_VkImageFormatProperties_getMaxResourceSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxResourceSize);
}

void Java_cz_mg_vulkan_VkImageFormatProperties_setMaxResourceSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxResourceSize, valuePointer, sizeof(o->maxResourceSize));
}


