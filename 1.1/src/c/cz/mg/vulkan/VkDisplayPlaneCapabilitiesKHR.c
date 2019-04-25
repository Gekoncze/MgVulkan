#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDisplayPlaneCapabilitiesKHR);
}

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getSupportedAlphaNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedAlpha);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setSupportedAlphaNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedAlpha, valuePointer, sizeof(o->supportedAlpha));
}

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getMinSrcPositionNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->minSrcPosition);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setMinSrcPositionNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minSrcPosition, valuePointer, sizeof(o->minSrcPosition));
}

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getMaxSrcPositionNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSrcPosition);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setMaxSrcPositionNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSrcPosition, valuePointer, sizeof(o->maxSrcPosition));
}

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getMinSrcExtentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->minSrcExtent);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setMinSrcExtentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minSrcExtent, valuePointer, sizeof(o->minSrcExtent));
}

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getMaxSrcExtentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSrcExtent);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setMaxSrcExtentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSrcExtent, valuePointer, sizeof(o->maxSrcExtent));
}

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getMinDstPositionNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->minDstPosition);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setMinDstPositionNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minDstPosition, valuePointer, sizeof(o->minDstPosition));
}

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getMaxDstPositionNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDstPosition);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setMaxDstPositionNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDstPosition, valuePointer, sizeof(o->maxDstPosition));
}

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getMinDstExtentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->minDstExtent);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setMinDstExtentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minDstExtent, valuePointer, sizeof(o->minDstExtent));
}

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getMaxDstExtentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDstExtent);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setMaxDstExtentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDstExtent, valuePointer, sizeof(o->maxDstExtent));
}


