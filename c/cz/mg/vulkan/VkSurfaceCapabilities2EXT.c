#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSurfaceCapabilities2EXT);
}

jlong Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_getMinImageCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minImageCount));
}

void Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_setMinImageCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    memcpy(&o->minImageCount, jniLongToPointer(valueAddress), sizeof(o->minImageCount));
}
jlong Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_getMaxImageCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxImageCount));
}

void Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_setMaxImageCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    memcpy(&o->maxImageCount, jniLongToPointer(valueAddress), sizeof(o->maxImageCount));
}
jlong Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_getCurrentExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->currentExtent));
}

void Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_setCurrentExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    memcpy(&o->currentExtent, jniLongToPointer(valueAddress), sizeof(o->currentExtent));
}
jlong Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_getMinImageExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minImageExtent));
}

void Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_setMinImageExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    memcpy(&o->minImageExtent, jniLongToPointer(valueAddress), sizeof(o->minImageExtent));
}
jlong Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_getMaxImageExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxImageExtent));
}

void Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_setMaxImageExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    memcpy(&o->maxImageExtent, jniLongToPointer(valueAddress), sizeof(o->maxImageExtent));
}
jlong Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_getMaxImageArrayLayers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxImageArrayLayers));
}

void Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_setMaxImageArrayLayers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    memcpy(&o->maxImageArrayLayers, jniLongToPointer(valueAddress), sizeof(o->maxImageArrayLayers));
}
jlong Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_getSupportedTransforms(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->supportedTransforms));
}

void Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_setSupportedTransforms(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    memcpy(&o->supportedTransforms, jniLongToPointer(valueAddress), sizeof(o->supportedTransforms));
}
jlong Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_getCurrentTransform(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->currentTransform));
}

void Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_setCurrentTransform(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    memcpy(&o->currentTransform, jniLongToPointer(valueAddress), sizeof(o->currentTransform));
}
jlong Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_getSupportedCompositeAlpha(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->supportedCompositeAlpha));
}

void Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_setSupportedCompositeAlpha(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    memcpy(&o->supportedCompositeAlpha, jniLongToPointer(valueAddress), sizeof(o->supportedCompositeAlpha));
}
jlong Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_getSupportedUsageFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->supportedUsageFlags));
}

void Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_setSupportedUsageFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    memcpy(&o->supportedUsageFlags, jniLongToPointer(valueAddress), sizeof(o->supportedUsageFlags));
}
jlong Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_getSupportedSurfaceCounters(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->supportedSurfaceCounters));
}

void Java_cz_mg_vulkan_vk_VkSurfaceCapabilities2EXT_setSupportedSurfaceCounters(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2EXT* o = (VkSurfaceCapabilities2EXT*)jniLongToPointer(address);
    memcpy(&o->supportedSurfaceCounters, jniLongToPointer(valueAddress), sizeof(o->supportedSurfaceCounters));
}

