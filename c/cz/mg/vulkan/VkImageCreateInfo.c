#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getImageType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageType);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setImageType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageType, valuePointer, sizeof(o->imageType));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getFormat(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->format);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setFormat(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->format, valuePointer, sizeof(o->format));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->extent);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->extent, valuePointer, sizeof(o->extent));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getMipLevels(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->mipLevels);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setMipLevels(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->mipLevels, valuePointer, sizeof(o->mipLevels));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getArrayLayers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->arrayLayers);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setArrayLayers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->arrayLayers, valuePointer, sizeof(o->arrayLayers));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getSamples(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->samples);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setSamples(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->samples, valuePointer, sizeof(o->samples));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getTiling(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->tiling);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setTiling(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->tiling, valuePointer, sizeof(o->tiling));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getUsage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->usage);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setUsage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->usage, valuePointer, sizeof(o->usage));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getSharingMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sharingMode);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setSharingMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sharingMode, valuePointer, sizeof(o->sharingMode));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getQueueFamilyIndexCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->queueFamilyIndexCount);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setQueueFamilyIndexCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queueFamilyIndexCount, valuePointer, sizeof(o->queueFamilyIndexCount));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getPQueueFamilyIndices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pQueueFamilyIndices);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setPQueueFamilyIndices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pQueueFamilyIndices, &valuePointer, sizeof(o->pQueueFamilyIndices));
}

jlong Java_cz_mg_vulkan_VkImageCreateInfo_getInitialLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->initialLayout);
}

void Java_cz_mg_vulkan_VkImageCreateInfo_setInitialLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->initialLayout, valuePointer, sizeof(o->initialLayout));
}


