#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSwapchainCreateInfoKHR);
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getSurface(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->surface);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setSurface(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->surface, valuePointer, sizeof(o->surface));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getMinImageCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->minImageCount);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setMinImageCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minImageCount, valuePointer, sizeof(o->minImageCount));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getImageFormat(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageFormat);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setImageFormat(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageFormat, valuePointer, sizeof(o->imageFormat));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getImageColorSpace(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageColorSpace);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setImageColorSpace(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageColorSpace, valuePointer, sizeof(o->imageColorSpace));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getImageExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageExtent);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setImageExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageExtent, valuePointer, sizeof(o->imageExtent));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getImageArrayLayers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageArrayLayers);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setImageArrayLayers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageArrayLayers, valuePointer, sizeof(o->imageArrayLayers));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getImageUsage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageUsage);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setImageUsage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageUsage, valuePointer, sizeof(o->imageUsage));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getImageSharingMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageSharingMode);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setImageSharingMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageSharingMode, valuePointer, sizeof(o->imageSharingMode));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getQueueFamilyIndexCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->queueFamilyIndexCount);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setQueueFamilyIndexCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queueFamilyIndexCount, valuePointer, sizeof(o->queueFamilyIndexCount));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getPQueueFamilyIndices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pQueueFamilyIndices);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setPQueueFamilyIndices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pQueueFamilyIndices, &valuePointer, sizeof(o->pQueueFamilyIndices));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getPreTransform(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->preTransform);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setPreTransform(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->preTransform, valuePointer, sizeof(o->preTransform));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getCompositeAlpha(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->compositeAlpha);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setCompositeAlpha(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->compositeAlpha, valuePointer, sizeof(o->compositeAlpha));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getPresentMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->presentMode);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setPresentMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->presentMode, valuePointer, sizeof(o->presentMode));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getClipped(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->clipped);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setClipped(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->clipped, valuePointer, sizeof(o->clipped));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getOldSwapchain(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->oldSwapchain);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setOldSwapchain(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->oldSwapchain, valuePointer, sizeof(o->oldSwapchain));
}


