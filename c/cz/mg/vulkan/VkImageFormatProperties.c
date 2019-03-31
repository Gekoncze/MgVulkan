#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkImageFormatProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageFormatProperties);
}

jlong Java_cz_mg_vulkan_vk_VkImageFormatProperties_getMaxExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxExtent));
}

void Java_cz_mg_vulkan_vk_VkImageFormatProperties_setMaxExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    memcpy(&o->maxExtent, jniLongToPointer(valueAddress), sizeof(o->maxExtent));
}
jlong Java_cz_mg_vulkan_vk_VkImageFormatProperties_getMaxMipLevels(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxMipLevels));
}

void Java_cz_mg_vulkan_vk_VkImageFormatProperties_setMaxMipLevels(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    memcpy(&o->maxMipLevels, jniLongToPointer(valueAddress), sizeof(o->maxMipLevels));
}
jlong Java_cz_mg_vulkan_vk_VkImageFormatProperties_getMaxArrayLayers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxArrayLayers));
}

void Java_cz_mg_vulkan_vk_VkImageFormatProperties_setMaxArrayLayers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    memcpy(&o->maxArrayLayers, jniLongToPointer(valueAddress), sizeof(o->maxArrayLayers));
}
jlong Java_cz_mg_vulkan_vk_VkImageFormatProperties_getSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sampleCounts));
}

void Java_cz_mg_vulkan_vk_VkImageFormatProperties_setSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    memcpy(&o->sampleCounts, jniLongToPointer(valueAddress), sizeof(o->sampleCounts));
}
jlong Java_cz_mg_vulkan_vk_VkImageFormatProperties_getMaxResourceSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxResourceSize));
}

void Java_cz_mg_vulkan_vk_VkImageFormatProperties_setMaxResourceSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties* o = (VkImageFormatProperties*)jniLongToPointer(address);
    memcpy(&o->maxResourceSize, jniLongToPointer(valueAddress), sizeof(o->maxResourceSize));
}

