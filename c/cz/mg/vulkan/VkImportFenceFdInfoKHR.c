#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkImportFenceFdInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImportFenceFdInfoKHR);
}

jlong Java_cz_mg_vulkan_vk_VkImportFenceFdInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkImportFenceFdInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkImportFenceFdInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkImportFenceFdInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkImportFenceFdInfoKHR_getFence(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->fence));
}

void Java_cz_mg_vulkan_vk_VkImportFenceFdInfoKHR_setFence(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    memcpy(&o->fence, jniLongToPointer(valueAddress), sizeof(o->fence));
}
jlong Java_cz_mg_vulkan_vk_VkImportFenceFdInfoKHR_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkImportFenceFdInfoKHR_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkImportFenceFdInfoKHR_getHandleType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->handleType));
}

void Java_cz_mg_vulkan_vk_VkImportFenceFdInfoKHR_setHandleType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    memcpy(&o->handleType, jniLongToPointer(valueAddress), sizeof(o->handleType));
}
jlong Java_cz_mg_vulkan_vk_VkImportFenceFdInfoKHR_getFd(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->fd));
}

void Java_cz_mg_vulkan_vk_VkImportFenceFdInfoKHR_setFd(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    memcpy(&o->fd, jniLongToPointer(valueAddress), sizeof(o->fd));
}

