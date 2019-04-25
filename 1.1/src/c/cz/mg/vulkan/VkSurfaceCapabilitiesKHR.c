#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSurfaceCapabilitiesKHR);
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getMinImageCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->minImageCount);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setMinImageCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minImageCount, valuePointer, sizeof(o->minImageCount));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getMaxImageCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageCount);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setMaxImageCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageCount, valuePointer, sizeof(o->maxImageCount));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getCurrentExtentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->currentExtent);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setCurrentExtentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->currentExtent, valuePointer, sizeof(o->currentExtent));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getMinImageExtentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->minImageExtent);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setMinImageExtentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minImageExtent, valuePointer, sizeof(o->minImageExtent));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getMaxImageExtentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageExtent);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setMaxImageExtentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageExtent, valuePointer, sizeof(o->maxImageExtent));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getMaxImageArrayLayersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageArrayLayers);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setMaxImageArrayLayersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageArrayLayers, valuePointer, sizeof(o->maxImageArrayLayers));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getSupportedTransformsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedTransforms);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setSupportedTransformsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedTransforms, valuePointer, sizeof(o->supportedTransforms));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getCurrentTransformNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->currentTransform);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setCurrentTransformNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->currentTransform, valuePointer, sizeof(o->currentTransform));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getSupportedCompositeAlphaNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedCompositeAlpha);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setSupportedCompositeAlphaNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedCompositeAlpha, valuePointer, sizeof(o->supportedCompositeAlpha));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getSupportedUsageFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedUsageFlags);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setSupportedUsageFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedUsageFlags, valuePointer, sizeof(o->supportedUsageFlags));
}


