#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkAcquireNextImageInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkAcquireNextImageInfoKHR);
}

jlong Java_cz_mg_vulkan_vk_VkAcquireNextImageInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkAcquireNextImageInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkAcquireNextImageInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkAcquireNextImageInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkAcquireNextImageInfoKHR_getSwapchain(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->swapchain));
}

void Java_cz_mg_vulkan_vk_VkAcquireNextImageInfoKHR_setSwapchain(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    memcpy(&o->swapchain, jniLongToPointer(valueAddress), sizeof(o->swapchain));
}
jlong Java_cz_mg_vulkan_vk_VkAcquireNextImageInfoKHR_getTimeout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->timeout));
}

void Java_cz_mg_vulkan_vk_VkAcquireNextImageInfoKHR_setTimeout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    memcpy(&o->timeout, jniLongToPointer(valueAddress), sizeof(o->timeout));
}
jlong Java_cz_mg_vulkan_vk_VkAcquireNextImageInfoKHR_getSemaphore(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->semaphore));
}

void Java_cz_mg_vulkan_vk_VkAcquireNextImageInfoKHR_setSemaphore(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    memcpy(&o->semaphore, jniLongToPointer(valueAddress), sizeof(o->semaphore));
}
jlong Java_cz_mg_vulkan_vk_VkAcquireNextImageInfoKHR_getFence(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->fence));
}

void Java_cz_mg_vulkan_vk_VkAcquireNextImageInfoKHR_setFence(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    memcpy(&o->fence, jniLongToPointer(valueAddress), sizeof(o->fence));
}
jlong Java_cz_mg_vulkan_vk_VkAcquireNextImageInfoKHR_getDeviceMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->deviceMask));
}

void Java_cz_mg_vulkan_vk_VkAcquireNextImageInfoKHR_setDeviceMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    memcpy(&o->deviceMask, jniLongToPointer(valueAddress), sizeof(o->deviceMask));
}

