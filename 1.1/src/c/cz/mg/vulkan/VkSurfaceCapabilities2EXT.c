#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSurfaceCapabilities2EXT);
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getMinImageCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->minImageCount);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setMinImageCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minImageCount, valuePointer, sizeof(o->minImageCount));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getMaxImageCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageCount);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setMaxImageCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageCount, valuePointer, sizeof(o->maxImageCount));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getCurrentExtentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->currentExtent);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setCurrentExtentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->currentExtent, valuePointer, sizeof(o->currentExtent));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getMinImageExtentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->minImageExtent);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setMinImageExtentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minImageExtent, valuePointer, sizeof(o->minImageExtent));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getMaxImageExtentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageExtent);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setMaxImageExtentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageExtent, valuePointer, sizeof(o->maxImageExtent));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getMaxImageArrayLayersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageArrayLayers);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setMaxImageArrayLayersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageArrayLayers, valuePointer, sizeof(o->maxImageArrayLayers));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getSupportedTransformsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedTransforms);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setSupportedTransformsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedTransforms, valuePointer, sizeof(o->supportedTransforms));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getCurrentTransformNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->currentTransform);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setCurrentTransformNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->currentTransform, valuePointer, sizeof(o->currentTransform));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getSupportedCompositeAlphaNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedCompositeAlpha);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setSupportedCompositeAlphaNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedCompositeAlpha, valuePointer, sizeof(o->supportedCompositeAlpha));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getSupportedUsageFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedUsageFlags);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setSupportedUsageFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedUsageFlags, valuePointer, sizeof(o->supportedUsageFlags));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getSupportedSurfaceCountersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedSurfaceCounters);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setSupportedSurfaceCountersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedSurfaceCounters, valuePointer, sizeof(o->supportedSurfaceCounters));
}


