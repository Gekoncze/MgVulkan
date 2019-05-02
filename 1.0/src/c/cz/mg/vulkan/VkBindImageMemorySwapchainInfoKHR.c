#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkBindImageMemorySwapchainInfoKHR);
}

void Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHR_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkBindImageMemorySwapchainInfoKHR));
}

jlong Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHR_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemorySwapchainInfoKHR* o = (VkBindImageMemorySwapchainInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHR_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemorySwapchainInfoKHR* o = (VkBindImageMemorySwapchainInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHR_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemorySwapchainInfoKHR* o = (VkBindImageMemorySwapchainInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHR_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemorySwapchainInfoKHR* o = (VkBindImageMemorySwapchainInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHR_getSwapchainNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemorySwapchainInfoKHR* o = (VkBindImageMemorySwapchainInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->swapchain);
}

void Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHR_setSwapchainNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemorySwapchainInfoKHR* o = (VkBindImageMemorySwapchainInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->swapchain, valuePointer, sizeof(o->swapchain));
}

jlong Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHR_getImageIndexNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemorySwapchainInfoKHR* o = (VkBindImageMemorySwapchainInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageIndex);
}

void Java_cz_mg_vulkan_VkBindImageMemorySwapchainInfoKHR_setImageIndexNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemorySwapchainInfoKHR* o = (VkBindImageMemorySwapchainInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageIndex, valuePointer, sizeof(o->imageIndex));
}


