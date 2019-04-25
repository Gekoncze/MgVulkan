#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

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

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getSurfaceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->surface);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setSurfaceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->surface, valuePointer, sizeof(o->surface));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getMinImageCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->minImageCount);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setMinImageCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minImageCount, valuePointer, sizeof(o->minImageCount));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getImageFormatNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageFormat);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setImageFormatNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageFormat, valuePointer, sizeof(o->imageFormat));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getImageColorSpaceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageColorSpace);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setImageColorSpaceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageColorSpace, valuePointer, sizeof(o->imageColorSpace));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getImageExtentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageExtent);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setImageExtentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageExtent, valuePointer, sizeof(o->imageExtent));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getImageArrayLayersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageArrayLayers);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setImageArrayLayersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageArrayLayers, valuePointer, sizeof(o->imageArrayLayers));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getImageUsageNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageUsage);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setImageUsageNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageUsage, valuePointer, sizeof(o->imageUsage));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getImageSharingModeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageSharingMode);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setImageSharingModeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageSharingMode, valuePointer, sizeof(o->imageSharingMode));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getQueueFamilyIndexCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->queueFamilyIndexCount);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setQueueFamilyIndexCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queueFamilyIndexCount, valuePointer, sizeof(o->queueFamilyIndexCount));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getPQueueFamilyIndicesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pQueueFamilyIndices);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setPQueueFamilyIndicesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pQueueFamilyIndices, &valuePointer, sizeof(o->pQueueFamilyIndices));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getPreTransformNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->preTransform);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setPreTransformNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->preTransform, valuePointer, sizeof(o->preTransform));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getCompositeAlphaNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->compositeAlpha);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setCompositeAlphaNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->compositeAlpha, valuePointer, sizeof(o->compositeAlpha));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getPresentModeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->presentMode);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setPresentModeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->presentMode, valuePointer, sizeof(o->presentMode));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getClippedNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->clipped);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setClippedNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->clipped, valuePointer, sizeof(o->clipped));
}

jlong Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_getOldSwapchainNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->oldSwapchain);
}

void Java_cz_mg_vulkan_VkSwapchainCreateInfoKHR_setOldSwapchainNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->oldSwapchain, valuePointer, sizeof(o->oldSwapchain));
}


