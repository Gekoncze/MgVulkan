#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkImportSemaphoreFdInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImportSemaphoreFdInfoKHR);
}

jlong Java_cz_mg_vulkan_vk_VkImportSemaphoreFdInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportSemaphoreFdInfoKHR* o = (VkImportSemaphoreFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkImportSemaphoreFdInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportSemaphoreFdInfoKHR* o = (VkImportSemaphoreFdInfoKHR*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkImportSemaphoreFdInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportSemaphoreFdInfoKHR* o = (VkImportSemaphoreFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkImportSemaphoreFdInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportSemaphoreFdInfoKHR* o = (VkImportSemaphoreFdInfoKHR*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkImportSemaphoreFdInfoKHR_getSemaphore(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportSemaphoreFdInfoKHR* o = (VkImportSemaphoreFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->semaphore));
}

void Java_cz_mg_vulkan_vk_VkImportSemaphoreFdInfoKHR_setSemaphore(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportSemaphoreFdInfoKHR* o = (VkImportSemaphoreFdInfoKHR*)jniLongToPointer(address);
    memcpy(&o->semaphore, jniLongToPointer(valueAddress), sizeof(o->semaphore));
}
jlong Java_cz_mg_vulkan_vk_VkImportSemaphoreFdInfoKHR_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportSemaphoreFdInfoKHR* o = (VkImportSemaphoreFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkImportSemaphoreFdInfoKHR_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportSemaphoreFdInfoKHR* o = (VkImportSemaphoreFdInfoKHR*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkImportSemaphoreFdInfoKHR_getHandleType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportSemaphoreFdInfoKHR* o = (VkImportSemaphoreFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->handleType));
}

void Java_cz_mg_vulkan_vk_VkImportSemaphoreFdInfoKHR_setHandleType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportSemaphoreFdInfoKHR* o = (VkImportSemaphoreFdInfoKHR*)jniLongToPointer(address);
    memcpy(&o->handleType, jniLongToPointer(valueAddress), sizeof(o->handleType));
}
jlong Java_cz_mg_vulkan_vk_VkImportSemaphoreFdInfoKHR_getFd(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportSemaphoreFdInfoKHR* o = (VkImportSemaphoreFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->fd));
}

void Java_cz_mg_vulkan_vk_VkImportSemaphoreFdInfoKHR_setFd(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportSemaphoreFdInfoKHR* o = (VkImportSemaphoreFdInfoKHR*)jniLongToPointer(address);
    memcpy(&o->fd, jniLongToPointer(valueAddress), sizeof(o->fd));
}

