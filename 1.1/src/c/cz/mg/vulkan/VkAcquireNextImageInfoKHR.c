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

jlong Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_getSwapchainNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->swapchain);
}

void Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_setSwapchainNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->swapchain, valuePointer, sizeof(o->swapchain));
}

jlong Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_getTimeoutNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->timeout);
}

void Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_setTimeoutNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->timeout, valuePointer, sizeof(o->timeout));
}

jlong Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_getSemaphoreNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->semaphore);
}

void Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_setSemaphoreNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->semaphore, valuePointer, sizeof(o->semaphore));
}

jlong Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_getFenceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->fence);
}

void Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_setFenceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->fence, valuePointer, sizeof(o->fence));
}

jlong Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_getDeviceMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceMask);
}

void Java_cz_mg_vulkan_VkAcquireNextImageInfoKHR_setDeviceMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAcquireNextImageInfoKHR* o = (VkAcquireNextImageInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceMask, valuePointer, sizeof(o->deviceMask));
}


