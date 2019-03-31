#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPresentInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPresentInfoKHR);
}

jlong Java_cz_mg_vulkan_vk_VkPresentInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPresentInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPresentInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPresentInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPresentInfoKHR_getWaitSemaphoreCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->waitSemaphoreCount));
}

void Java_cz_mg_vulkan_vk_VkPresentInfoKHR_setWaitSemaphoreCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    memcpy(&o->waitSemaphoreCount, jniLongToPointer(valueAddress), sizeof(o->waitSemaphoreCount));
}
jlong Java_cz_mg_vulkan_vk_VkPresentInfoKHR_getPWaitSemaphores(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pWaitSemaphores));
}

void Java_cz_mg_vulkan_vk_VkPresentInfoKHR_setPWaitSemaphores(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    memcpy(&o->pWaitSemaphores, jniLongToPointer(valueAddress), sizeof(o->pWaitSemaphores));
}
jlong Java_cz_mg_vulkan_vk_VkPresentInfoKHR_getSwapchainCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->swapchainCount));
}

void Java_cz_mg_vulkan_vk_VkPresentInfoKHR_setSwapchainCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    memcpy(&o->swapchainCount, jniLongToPointer(valueAddress), sizeof(o->swapchainCount));
}
jlong Java_cz_mg_vulkan_vk_VkPresentInfoKHR_getPSwapchains(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pSwapchains));
}

void Java_cz_mg_vulkan_vk_VkPresentInfoKHR_setPSwapchains(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    memcpy(&o->pSwapchains, jniLongToPointer(valueAddress), sizeof(o->pSwapchains));
}
jlong Java_cz_mg_vulkan_vk_VkPresentInfoKHR_getPImageIndices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pImageIndices));
}

void Java_cz_mg_vulkan_vk_VkPresentInfoKHR_setPImageIndices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    memcpy(&o->pImageIndices, jniLongToPointer(valueAddress), sizeof(o->pImageIndices));
}
jlong Java_cz_mg_vulkan_vk_VkPresentInfoKHR_getPResults(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pResults));
}

void Java_cz_mg_vulkan_vk_VkPresentInfoKHR_setPResults(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentInfoKHR* o = (VkPresentInfoKHR*)jniLongToPointer(address);
    memcpy(&o->pResults, jniLongToPointer(valueAddress), sizeof(o->pResults));
}

