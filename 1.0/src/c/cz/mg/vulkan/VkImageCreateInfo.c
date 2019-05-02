#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkImageCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageCreateInfo);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkImageCreateInfo));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getImageTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageType);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setImageTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageType, valuePointer, sizeof(o->imageType));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getFormatNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->format);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setFormatNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->format, valuePointer, sizeof(o->format));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getExtentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->extent);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setExtentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->extent, valuePointer, sizeof(o->extent));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getMipLevelsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->mipLevels);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setMipLevelsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->mipLevels, valuePointer, sizeof(o->mipLevels));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getArrayLayersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->arrayLayers);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setArrayLayersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->arrayLayers, valuePointer, sizeof(o->arrayLayers));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getSamplesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->samples);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setSamplesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->samples, valuePointer, sizeof(o->samples));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getTilingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->tiling);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setTilingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->tiling, valuePointer, sizeof(o->tiling));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getUsageNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->usage);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setUsageNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->usage, valuePointer, sizeof(o->usage));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getSharingModeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sharingMode);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setSharingModeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sharingMode, valuePointer, sizeof(o->sharingMode));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getQueueFamilyIndexCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->queueFamilyIndexCount);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setQueueFamilyIndexCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queueFamilyIndexCount, valuePointer, sizeof(o->queueFamilyIndexCount));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getPQueueFamilyIndicesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pQueueFamilyIndices);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setPQueueFamilyIndicesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pQueueFamilyIndices, &valuePointer, sizeof(o->pQueueFamilyIndices));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getInitialLayoutNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->initialLayout);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setInitialLayoutNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->initialLayout, valuePointer, sizeof(o->initialLayout));
}


