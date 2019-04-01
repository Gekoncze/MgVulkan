#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkBindSparseInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkBindSparseInfo);
}

jlong Java_cz_mg_vulkan_vk_VkBindSparseInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkBindSparseInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkBindSparseInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkBindSparseInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkBindSparseInfo_getWaitSemaphoreCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->waitSemaphoreCount);
}

void Java_cz_mg_vulkan_vk_VkBindSparseInfo_setWaitSemaphoreCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->waitSemaphoreCount, valuePointer, sizeof(o->waitSemaphoreCount));
}

jlong Java_cz_mg_vulkan_vk_VkBindSparseInfo_getPWaitSemaphores(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pWaitSemaphores);
}

void Java_cz_mg_vulkan_vk_VkBindSparseInfo_setPWaitSemaphores(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pWaitSemaphores, &valuePointer, sizeof(o->pWaitSemaphores));
}

jlong Java_cz_mg_vulkan_vk_VkBindSparseInfo_getBufferBindCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->bufferBindCount);
}

void Java_cz_mg_vulkan_vk_VkBindSparseInfo_setBufferBindCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->bufferBindCount, valuePointer, sizeof(o->bufferBindCount));
}

jlong Java_cz_mg_vulkan_vk_VkBindSparseInfo_getPBufferBinds(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pBufferBinds);
}

void Java_cz_mg_vulkan_vk_VkBindSparseInfo_setPBufferBinds(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pBufferBinds, &valuePointer, sizeof(o->pBufferBinds));
}

jlong Java_cz_mg_vulkan_vk_VkBindSparseInfo_getImageOpaqueBindCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageOpaqueBindCount);
}

void Java_cz_mg_vulkan_vk_VkBindSparseInfo_setImageOpaqueBindCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageOpaqueBindCount, valuePointer, sizeof(o->imageOpaqueBindCount));
}

jlong Java_cz_mg_vulkan_vk_VkBindSparseInfo_getPImageOpaqueBinds(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pImageOpaqueBinds);
}

void Java_cz_mg_vulkan_vk_VkBindSparseInfo_setPImageOpaqueBinds(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pImageOpaqueBinds, &valuePointer, sizeof(o->pImageOpaqueBinds));
}

jlong Java_cz_mg_vulkan_vk_VkBindSparseInfo_getImageBindCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageBindCount);
}

void Java_cz_mg_vulkan_vk_VkBindSparseInfo_setImageBindCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageBindCount, valuePointer, sizeof(o->imageBindCount));
}

jlong Java_cz_mg_vulkan_vk_VkBindSparseInfo_getPImageBinds(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pImageBinds);
}

void Java_cz_mg_vulkan_vk_VkBindSparseInfo_setPImageBinds(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pImageBinds, &valuePointer, sizeof(o->pImageBinds));
}

jlong Java_cz_mg_vulkan_vk_VkBindSparseInfo_getSignalSemaphoreCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->signalSemaphoreCount);
}

void Java_cz_mg_vulkan_vk_VkBindSparseInfo_setSignalSemaphoreCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->signalSemaphoreCount, valuePointer, sizeof(o->signalSemaphoreCount));
}

jlong Java_cz_mg_vulkan_vk_VkBindSparseInfo_getPSignalSemaphores(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pSignalSemaphores);
}

void Java_cz_mg_vulkan_vk_VkBindSparseInfo_setPSignalSemaphores(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSignalSemaphores, &valuePointer, sizeof(o->pSignalSemaphores));
}


