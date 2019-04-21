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

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getMinImageCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->minImageCount);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setMinImageCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minImageCount, valuePointer, sizeof(o->minImageCount));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getMaxImageCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageCount);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setMaxImageCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageCount, valuePointer, sizeof(o->maxImageCount));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getCurrentExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->currentExtent);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setCurrentExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->currentExtent, valuePointer, sizeof(o->currentExtent));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getMinImageExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->minImageExtent);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setMinImageExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minImageExtent, valuePointer, sizeof(o->minImageExtent));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getMaxImageExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageExtent);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setMaxImageExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageExtent, valuePointer, sizeof(o->maxImageExtent));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getMaxImageArrayLayers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageArrayLayers);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setMaxImageArrayLayers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageArrayLayers, valuePointer, sizeof(o->maxImageArrayLayers));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getSupportedTransforms(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedTransforms);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setSupportedTransforms(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedTransforms, valuePointer, sizeof(o->supportedTransforms));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getCurrentTransform(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->currentTransform);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setCurrentTransform(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->currentTransform, valuePointer, sizeof(o->currentTransform));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getSupportedCompositeAlpha(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedCompositeAlpha);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setSupportedCompositeAlpha(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedCompositeAlpha, valuePointer, sizeof(o->supportedCompositeAlpha));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_getSupportedUsageFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedUsageFlags);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilitiesKHR_setSupportedUsageFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilitiesKHR* o = (VkSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedUsageFlags, valuePointer, sizeof(o->supportedUsageFlags));
}


