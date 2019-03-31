#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSwapchainCreateInfoKHR);
}

jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getSurface(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->surface));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setSurface(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->surface, jniLongToPointer(valueAddress), sizeof(o->surface));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getMinImageCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minImageCount));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setMinImageCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->minImageCount, jniLongToPointer(valueAddress), sizeof(o->minImageCount));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getImageFormat(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageFormat));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setImageFormat(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->imageFormat, jniLongToPointer(valueAddress), sizeof(o->imageFormat));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getImageColorSpace(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageColorSpace));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setImageColorSpace(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->imageColorSpace, jniLongToPointer(valueAddress), sizeof(o->imageColorSpace));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getImageExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageExtent));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setImageExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->imageExtent, jniLongToPointer(valueAddress), sizeof(o->imageExtent));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getImageArrayLayers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageArrayLayers));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setImageArrayLayers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->imageArrayLayers, jniLongToPointer(valueAddress), sizeof(o->imageArrayLayers));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getImageUsage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageUsage));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setImageUsage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->imageUsage, jniLongToPointer(valueAddress), sizeof(o->imageUsage));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getImageSharingMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageSharingMode));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setImageSharingMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->imageSharingMode, jniLongToPointer(valueAddress), sizeof(o->imageSharingMode));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getQueueFamilyIndexCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->queueFamilyIndexCount));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setQueueFamilyIndexCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->queueFamilyIndexCount, jniLongToPointer(valueAddress), sizeof(o->queueFamilyIndexCount));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getPQueueFamilyIndices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pQueueFamilyIndices));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setPQueueFamilyIndices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->pQueueFamilyIndices, jniLongToPointer(valueAddress), sizeof(o->pQueueFamilyIndices));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getPreTransform(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->preTransform));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setPreTransform(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->preTransform, jniLongToPointer(valueAddress), sizeof(o->preTransform));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getCompositeAlpha(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->compositeAlpha));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setCompositeAlpha(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->compositeAlpha, jniLongToPointer(valueAddress), sizeof(o->compositeAlpha));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getPresentMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->presentMode));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setPresentMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->presentMode, jniLongToPointer(valueAddress), sizeof(o->presentMode));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getClipped(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->clipped));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setClipped(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->clipped, jniLongToPointer(valueAddress), sizeof(o->clipped));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_getOldSwapchain(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->oldSwapchain));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCreateInfoKHR_setOldSwapchain(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCreateInfoKHR* o = (VkSwapchainCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->oldSwapchain, jniLongToPointer(valueAddress), sizeof(o->oldSwapchain));
}

