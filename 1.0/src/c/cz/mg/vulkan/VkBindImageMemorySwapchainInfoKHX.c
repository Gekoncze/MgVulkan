#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkBindImageMemorySwapchainInfoKHX);
}

jlong Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemorySwapchainInfoKHX* o = (VkBindImageMemorySwapchainInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemorySwapchainInfoKHX* o = (VkBindImageMemorySwapchainInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemorySwapchainInfoKHX* o = (VkBindImageMemorySwapchainInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemorySwapchainInfoKHX* o = (VkBindImageMemorySwapchainInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHX_getSwapchain(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemorySwapchainInfoKHX* o = (VkBindImageMemorySwapchainInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->swapchain);
}

void Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHX_setSwapchain(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemorySwapchainInfoKHX* o = (VkBindImageMemorySwapchainInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->swapchain, valuePointer, sizeof(o->swapchain));
}

jlong Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHX_getImageIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemorySwapchainInfoKHX* o = (VkBindImageMemorySwapchainInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageIndex);
}

void Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHX_setImageIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemorySwapchainInfoKHX* o = (VkBindImageMemorySwapchainInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageIndex, valuePointer, sizeof(o->imageIndex));
}


