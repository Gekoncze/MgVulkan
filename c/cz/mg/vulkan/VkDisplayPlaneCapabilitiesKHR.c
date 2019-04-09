#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getSupportedAlpha(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedAlpha);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setSupportedAlpha(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedAlpha, valuePointer, sizeof(o->supportedAlpha));
}

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getMinSrcPosition(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->minSrcPosition);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setMinSrcPosition(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minSrcPosition, valuePointer, sizeof(o->minSrcPosition));
}

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getMaxSrcPosition(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSrcPosition);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setMaxSrcPosition(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSrcPosition, valuePointer, sizeof(o->maxSrcPosition));
}

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getMinSrcExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->minSrcExtent);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setMinSrcExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minSrcExtent, valuePointer, sizeof(o->minSrcExtent));
}

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getMaxSrcExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSrcExtent);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setMaxSrcExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSrcExtent, valuePointer, sizeof(o->maxSrcExtent));
}

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getMinDstPosition(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->minDstPosition);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setMinDstPosition(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minDstPosition, valuePointer, sizeof(o->minDstPosition));
}

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getMaxDstPosition(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDstPosition);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setMaxDstPosition(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDstPosition, valuePointer, sizeof(o->maxDstPosition));
}

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getMinDstExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->minDstExtent);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setMinDstExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minDstExtent, valuePointer, sizeof(o->minDstExtent));
}

jlong Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_getMaxDstExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDstExtent);
}

void Java_cz_mg_vulkan_VkDisplayPlaneCapabilitiesKHR_setMaxDstExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDstExtent, valuePointer, sizeof(o->maxDstExtent));
}


