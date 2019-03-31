#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSemaphoreGetFdInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSemaphoreGetFdInfoKHR);
}

jlong Java_cz_mg_vulkan_vk_VkSemaphoreGetFdInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSemaphoreGetFdInfoKHR* o = (VkSemaphoreGetFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkSemaphoreGetFdInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSemaphoreGetFdInfoKHR* o = (VkSemaphoreGetFdInfoKHR*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkSemaphoreGetFdInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSemaphoreGetFdInfoKHR* o = (VkSemaphoreGetFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkSemaphoreGetFdInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSemaphoreGetFdInfoKHR* o = (VkSemaphoreGetFdInfoKHR*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkSemaphoreGetFdInfoKHR_getSemaphore(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSemaphoreGetFdInfoKHR* o = (VkSemaphoreGetFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->semaphore));
}

void Java_cz_mg_vulkan_vk_VkSemaphoreGetFdInfoKHR_setSemaphore(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSemaphoreGetFdInfoKHR* o = (VkSemaphoreGetFdInfoKHR*)jniLongToPointer(address);
    memcpy(&o->semaphore, jniLongToPointer(valueAddress), sizeof(o->semaphore));
}
jlong Java_cz_mg_vulkan_vk_VkSemaphoreGetFdInfoKHR_getHandleType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSemaphoreGetFdInfoKHR* o = (VkSemaphoreGetFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->handleType));
}

void Java_cz_mg_vulkan_vk_VkSemaphoreGetFdInfoKHR_setHandleType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSemaphoreGetFdInfoKHR* o = (VkSemaphoreGetFdInfoKHR*)jniLongToPointer(address);
    memcpy(&o->handleType, jniLongToPointer(valueAddress), sizeof(o->handleType));
}

