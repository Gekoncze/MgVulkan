#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceImageFormatInfo2KHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceImageFormatInfo2KHR);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceImageFormatInfo2KHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2KHR* o = (VkPhysicalDeviceImageFormatInfo2KHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceImageFormatInfo2KHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2KHR* o = (VkPhysicalDeviceImageFormatInfo2KHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceImageFormatInfo2KHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2KHR* o = (VkPhysicalDeviceImageFormatInfo2KHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceImageFormatInfo2KHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2KHR* o = (VkPhysicalDeviceImageFormatInfo2KHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceImageFormatInfo2KHR_getFormat(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2KHR* o = (VkPhysicalDeviceImageFormatInfo2KHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->format);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceImageFormatInfo2KHR_setFormat(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2KHR* o = (VkPhysicalDeviceImageFormatInfo2KHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->format, valuePointer, sizeof(o->format));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceImageFormatInfo2KHR_getType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2KHR* o = (VkPhysicalDeviceImageFormatInfo2KHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->type);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceImageFormatInfo2KHR_setType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2KHR* o = (VkPhysicalDeviceImageFormatInfo2KHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->type, valuePointer, sizeof(o->type));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceImageFormatInfo2KHR_getTiling(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2KHR* o = (VkPhysicalDeviceImageFormatInfo2KHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->tiling);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceImageFormatInfo2KHR_setTiling(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2KHR* o = (VkPhysicalDeviceImageFormatInfo2KHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->tiling, valuePointer, sizeof(o->tiling));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceImageFormatInfo2KHR_getUsage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2KHR* o = (VkPhysicalDeviceImageFormatInfo2KHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->usage);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceImageFormatInfo2KHR_setUsage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2KHR* o = (VkPhysicalDeviceImageFormatInfo2KHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->usage, valuePointer, sizeof(o->usage));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceImageFormatInfo2KHR_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2KHR* o = (VkPhysicalDeviceImageFormatInfo2KHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceImageFormatInfo2KHR_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceImageFormatInfo2KHR* o = (VkPhysicalDeviceImageFormatInfo2KHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}


