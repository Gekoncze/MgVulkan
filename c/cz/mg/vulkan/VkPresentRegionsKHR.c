#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPresentRegionsKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPresentRegionsKHR);
}

jlong Java_cz_mg_vulkan_vk_VkPresentRegionsKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentRegionsKHR* o = (VkPresentRegionsKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkPresentRegionsKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentRegionsKHR* o = (VkPresentRegionsKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkPresentRegionsKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentRegionsKHR* o = (VkPresentRegionsKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkPresentRegionsKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentRegionsKHR* o = (VkPresentRegionsKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkPresentRegionsKHR_getSwapchainCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentRegionsKHR* o = (VkPresentRegionsKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->swapchainCount);
}

void Java_cz_mg_vulkan_vk_VkPresentRegionsKHR_setSwapchainCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentRegionsKHR* o = (VkPresentRegionsKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->swapchainCount, valuePointer, sizeof(o->swapchainCount));
}

jlong Java_cz_mg_vulkan_vk_VkPresentRegionsKHR_getPRegions(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentRegionsKHR* o = (VkPresentRegionsKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pRegions);
}

void Java_cz_mg_vulkan_vk_VkPresentRegionsKHR_setPRegions(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentRegionsKHR* o = (VkPresentRegionsKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pRegions, &valuePointer, sizeof(o->pRegions));
}


