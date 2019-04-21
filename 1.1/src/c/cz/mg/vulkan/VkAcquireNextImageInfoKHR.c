#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkAcquireNextImageInfoKHR);
}

jlong Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_getSwapchain(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->swapchain);
}

void Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_setSwapchain(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->swapchain, valuePointer, sizeof(o->swapchain));
}

jlong Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_getTimeout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->timeout);
}

void Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_setTimeout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->timeout, valuePointer, sizeof(o->timeout));
}

jlong Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_getSemaphore(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->semaphore);
}

void Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_setSemaphore(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->semaphore, valuePointer, sizeof(o->semaphore));
}

jlong Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_getFence(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->fence);
}

void Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_setFence(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->fence, valuePointer, sizeof(o->fence));
}

jlong Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_getDeviceMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceMask);
}

void Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_setDeviceMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceMask, valuePointer, sizeof(o->deviceMask));
}


