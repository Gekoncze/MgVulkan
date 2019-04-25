#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseImageFormatInfo2KHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceSparseImageFormatInfo2KHR);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseImageFormatInfo2KHR_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2KHR* o = (VkPhysicalDeviceSparseImageFormatInfo2KHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseImageFormatInfo2KHR_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2KHR* o = (VkPhysicalDeviceSparseImageFormatInfo2KHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseImageFormatInfo2KHR_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2KHR* o = (VkPhysicalDeviceSparseImageFormatInfo2KHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseImageFormatInfo2KHR_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2KHR* o = (VkPhysicalDeviceSparseImageFormatInfo2KHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseImageFormatInfo2KHR_getFormatNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2KHR* o = (VkPhysicalDeviceSparseImageFormatInfo2KHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->format);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseImageFormatInfo2KHR_setFormatNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2KHR* o = (VkPhysicalDeviceSparseImageFormatInfo2KHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->format, valuePointer, sizeof(o->format));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseImageFormatInfo2KHR_getTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2KHR* o = (VkPhysicalDeviceSparseImageFormatInfo2KHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->type);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseImageFormatInfo2KHR_setTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2KHR* o = (VkPhysicalDeviceSparseImageFormatInfo2KHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->type, valuePointer, sizeof(o->type));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseImageFormatInfo2KHR_getSamplesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2KHR* o = (VkPhysicalDeviceSparseImageFormatInfo2KHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->samples);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseImageFormatInfo2KHR_setSamplesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2KHR* o = (VkPhysicalDeviceSparseImageFormatInfo2KHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->samples, valuePointer, sizeof(o->samples));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseImageFormatInfo2KHR_getUsageNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2KHR* o = (VkPhysicalDeviceSparseImageFormatInfo2KHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->usage);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseImageFormatInfo2KHR_setUsageNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2KHR* o = (VkPhysicalDeviceSparseImageFormatInfo2KHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->usage, valuePointer, sizeof(o->usage));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseImageFormatInfo2KHR_getTilingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2KHR* o = (VkPhysicalDeviceSparseImageFormatInfo2KHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->tiling);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseImageFormatInfo2KHR_setTilingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseImageFormatInfo2KHR* o = (VkPhysicalDeviceSparseImageFormatInfo2KHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->tiling, valuePointer, sizeof(o->tiling));
}


