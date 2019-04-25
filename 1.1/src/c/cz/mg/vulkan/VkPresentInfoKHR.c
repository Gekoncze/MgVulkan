#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPresentInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPresentInfoKHR);
}

jlong Java_cz_mg_vulkan_VkPresentInfoKHR_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPresentInfoKHR_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPresentInfoKHR_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPresentInfoKHR_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPresentInfoKHR_getWaitSemaphoreCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->waitSemaphoreCount);
}

void Java_cz_mg_vulkan_VkPresentInfoKHR_setWaitSemaphoreCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->waitSemaphoreCount, valuePointer, sizeof(o->waitSemaphoreCount));
}

jlong Java_cz_mg_vulkan_VkPresentInfoKHR_getPWaitSemaphoresNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pWaitSemaphores);
}

void Java_cz_mg_vulkan_VkPresentInfoKHR_setPWaitSemaphoresNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pWaitSemaphores, &valuePointer, sizeof(o->pWaitSemaphores));
}

jlong Java_cz_mg_vulkan_VkPresentInfoKHR_getSwapchainCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->swapchainCount);
}

void Java_cz_mg_vulkan_VkPresentInfoKHR_setSwapchainCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->swapchainCount, valuePointer, sizeof(o->swapchainCount));
}

jlong Java_cz_mg_vulkan_VkPresentInfoKHR_getPSwapchainsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pSwapchains);
}

void Java_cz_mg_vulkan_VkPresentInfoKHR_setPSwapchainsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSwapchains, &valuePointer, sizeof(o->pSwapchains));
}

jlong Java_cz_mg_vulkan_VkPresentInfoKHR_getPImageIndicesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pImageIndices);
}

void Java_cz_mg_vulkan_VkPresentInfoKHR_setPImageIndicesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pImageIndices, &valuePointer, sizeof(o->pImageIndices));
}

jlong Java_cz_mg_vulkan_VkPresentInfoKHR_getPResultsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pResults);
}

void Java_cz_mg_vulkan_VkPresentInfoKHR_setPResultsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pResults, &valuePointer, sizeof(o->pResults));
}


