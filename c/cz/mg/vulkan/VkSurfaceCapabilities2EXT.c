#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getMinImageCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->minImageCount);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setMinImageCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minImageCount, valuePointer, sizeof(o->minImageCount));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getMaxImageCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageCount);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setMaxImageCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageCount, valuePointer, sizeof(o->maxImageCount));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getCurrentExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->currentExtent);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setCurrentExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->currentExtent, valuePointer, sizeof(o->currentExtent));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getMinImageExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->minImageExtent);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setMinImageExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minImageExtent, valuePointer, sizeof(o->minImageExtent));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getMaxImageExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageExtent);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setMaxImageExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageExtent, valuePointer, sizeof(o->maxImageExtent));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getMaxImageArrayLayers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageArrayLayers);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setMaxImageArrayLayers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageArrayLayers, valuePointer, sizeof(o->maxImageArrayLayers));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getSupportedTransforms(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedTransforms);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setSupportedTransforms(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedTransforms, valuePointer, sizeof(o->supportedTransforms));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getCurrentTransform(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->currentTransform);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setCurrentTransform(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->currentTransform, valuePointer, sizeof(o->currentTransform));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getSupportedCompositeAlpha(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedCompositeAlpha);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setSupportedCompositeAlpha(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedCompositeAlpha, valuePointer, sizeof(o->supportedCompositeAlpha));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getSupportedUsageFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedUsageFlags);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setSupportedUsageFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedUsageFlags, valuePointer, sizeof(o->supportedUsageFlags));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_getSupportedSurfaceCounters(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedSurfaceCounters);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2EXT_setSupportedSurfaceCounters(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedSurfaceCounters, valuePointer, sizeof(o->supportedSurfaceCounters));
}


