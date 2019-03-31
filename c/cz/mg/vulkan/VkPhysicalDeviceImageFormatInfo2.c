#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceImageFormatInfo2_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceImageFormatInfo2);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceImageFormatInfo2_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2* o = (VkPhysicalDeviceImageFormatInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceImageFormatInfo2_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2* o = (VkPhysicalDeviceImageFormatInfo2*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceImageFormatInfo2_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2* o = (VkPhysicalDeviceImageFormatInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceImageFormatInfo2_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2* o = (VkPhysicalDeviceImageFormatInfo2*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceImageFormatInfo2_getFormat(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2* o = (VkPhysicalDeviceImageFormatInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->format));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceImageFormatInfo2_setFormat(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2* o = (VkPhysicalDeviceImageFormatInfo2*)jniLongToPointer(address);
    memcpy(&o->format, jniLongToPointer(valueAddress), sizeof(o->format));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceImageFormatInfo2_getType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2* o = (VkPhysicalDeviceImageFormatInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->type));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceImageFormatInfo2_setType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2* o = (VkPhysicalDeviceImageFormatInfo2*)jniLongToPointer(address);
    memcpy(&o->type, jniLongToPointer(valueAddress), sizeof(o->type));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceImageFormatInfo2_getTiling(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2* o = (VkPhysicalDeviceImageFormatInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->tiling));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceImageFormatInfo2_setTiling(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2* o = (VkPhysicalDeviceImageFormatInfo2*)jniLongToPointer(address);
    memcpy(&o->tiling, jniLongToPointer(valueAddress), sizeof(o->tiling));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceImageFormatInfo2_getUsage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2* o = (VkPhysicalDeviceImageFormatInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->usage));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceImageFormatInfo2_setUsage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2* o = (VkPhysicalDeviceImageFormatInfo2*)jniLongToPointer(address);
    memcpy(&o->usage, jniLongToPointer(valueAddress), sizeof(o->usage));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceImageFormatInfo2_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2* o = (VkPhysicalDeviceImageFormatInfo2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceImageFormatInfo2_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2* o = (VkPhysicalDeviceImageFormatInfo2*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}

