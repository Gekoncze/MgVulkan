#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkImageCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkImageCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkImageCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkImageCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkImageCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkImageCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkImageCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkImageCreateInfo_getImageType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageType));
}

void Java_cz_mg_vulkan_vk_VkImageCreateInfo_setImageType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    memcpy(&o->imageType, jniLongToPointer(valueAddress), sizeof(o->imageType));
}
jlong Java_cz_mg_vulkan_vk_VkImageCreateInfo_getFormat(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->format));
}

void Java_cz_mg_vulkan_vk_VkImageCreateInfo_setFormat(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    memcpy(&o->format, jniLongToPointer(valueAddress), sizeof(o->format));
}
jlong Java_cz_mg_vulkan_vk_VkImageCreateInfo_getExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->extent));
}

void Java_cz_mg_vulkan_vk_VkImageCreateInfo_setExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    memcpy(&o->extent, jniLongToPointer(valueAddress), sizeof(o->extent));
}
jlong Java_cz_mg_vulkan_vk_VkImageCreateInfo_getMipLevels(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->mipLevels));
}

void Java_cz_mg_vulkan_vk_VkImageCreateInfo_setMipLevels(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    memcpy(&o->mipLevels, jniLongToPointer(valueAddress), sizeof(o->mipLevels));
}
jlong Java_cz_mg_vulkan_vk_VkImageCreateInfo_getArrayLayers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->arrayLayers));
}

void Java_cz_mg_vulkan_vk_VkImageCreateInfo_setArrayLayers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    memcpy(&o->arrayLayers, jniLongToPointer(valueAddress), sizeof(o->arrayLayers));
}
jlong Java_cz_mg_vulkan_vk_VkImageCreateInfo_getSamples(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->samples));
}

void Java_cz_mg_vulkan_vk_VkImageCreateInfo_setSamples(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    memcpy(&o->samples, jniLongToPointer(valueAddress), sizeof(o->samples));
}
jlong Java_cz_mg_vulkan_vk_VkImageCreateInfo_getTiling(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->tiling));
}

void Java_cz_mg_vulkan_vk_VkImageCreateInfo_setTiling(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    memcpy(&o->tiling, jniLongToPointer(valueAddress), sizeof(o->tiling));
}
jlong Java_cz_mg_vulkan_vk_VkImageCreateInfo_getUsage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->usage));
}

void Java_cz_mg_vulkan_vk_VkImageCreateInfo_setUsage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    memcpy(&o->usage, jniLongToPointer(valueAddress), sizeof(o->usage));
}
jlong Java_cz_mg_vulkan_vk_VkImageCreateInfo_getSharingMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sharingMode));
}

void Java_cz_mg_vulkan_vk_VkImageCreateInfo_setSharingMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sharingMode, jniLongToPointer(valueAddress), sizeof(o->sharingMode));
}
jlong Java_cz_mg_vulkan_vk_VkImageCreateInfo_getQueueFamilyIndexCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->queueFamilyIndexCount));
}

void Java_cz_mg_vulkan_vk_VkImageCreateInfo_setQueueFamilyIndexCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    memcpy(&o->queueFamilyIndexCount, jniLongToPointer(valueAddress), sizeof(o->queueFamilyIndexCount));
}
jlong Java_cz_mg_vulkan_vk_VkImageCreateInfo_getPQueueFamilyIndices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pQueueFamilyIndices));
}

void Java_cz_mg_vulkan_vk_VkImageCreateInfo_setPQueueFamilyIndices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pQueueFamilyIndices, jniLongToPointer(valueAddress), sizeof(o->pQueueFamilyIndices));
}
jlong Java_cz_mg_vulkan_vk_VkImageCreateInfo_getInitialLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->initialLayout));
}

void Java_cz_mg_vulkan_vk_VkImageCreateInfo_setInitialLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCreateInfo* o = (VkImageCreateInfo*)jniLongToPointer(address);
    memcpy(&o->initialLayout, jniLongToPointer(valueAddress), sizeof(o->initialLayout));
}

