#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSparseImageFormatInfo2_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceSparseImageFormatInfo2);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSparseImageFormatInfo2_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2* o = (VkPhysicalDeviceSparseImageFormatInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSparseImageFormatInfo2_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2* o = (VkPhysicalDeviceSparseImageFormatInfo2*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSparseImageFormatInfo2_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2* o = (VkPhysicalDeviceSparseImageFormatInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSparseImageFormatInfo2_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2* o = (VkPhysicalDeviceSparseImageFormatInfo2*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSparseImageFormatInfo2_getFormat(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2* o = (VkPhysicalDeviceSparseImageFormatInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->format));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSparseImageFormatInfo2_setFormat(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2* o = (VkPhysicalDeviceSparseImageFormatInfo2*)jniLongToPointer(address);
    memcpy(&o->format, jniLongToPointer(valueAddress), sizeof(o->format));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSparseImageFormatInfo2_getType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2* o = (VkPhysicalDeviceSparseImageFormatInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->type));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSparseImageFormatInfo2_setType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2* o = (VkPhysicalDeviceSparseImageFormatInfo2*)jniLongToPointer(address);
    memcpy(&o->type, jniLongToPointer(valueAddress), sizeof(o->type));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSparseImageFormatInfo2_getSamples(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2* o = (VkPhysicalDeviceSparseImageFormatInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->samples));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSparseImageFormatInfo2_setSamples(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2* o = (VkPhysicalDeviceSparseImageFormatInfo2*)jniLongToPointer(address);
    memcpy(&o->samples, jniLongToPointer(valueAddress), sizeof(o->samples));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSparseImageFormatInfo2_getUsage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2* o = (VkPhysicalDeviceSparseImageFormatInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->usage));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSparseImageFormatInfo2_setUsage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2* o = (VkPhysicalDeviceSparseImageFormatInfo2*)jniLongToPointer(address);
    memcpy(&o->usage, jniLongToPointer(valueAddress), sizeof(o->usage));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSparseImageFormatInfo2_getTiling(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2* o = (VkPhysicalDeviceSparseImageFormatInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->tiling));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSparseImageFormatInfo2_setTiling(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2* o = (VkPhysicalDeviceSparseImageFormatInfo2*)jniLongToPointer(address);
    memcpy(&o->tiling, jniLongToPointer(valueAddress), sizeof(o->tiling));
}

