#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkBindSparseInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkBindSparseInfo);
}

jlong Java_cz_mg_vulkan_VkBindSparseInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkBindSparseInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkBindSparseInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkBindSparseInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkBindSparseInfo_getWaitSemaphoreCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->waitSemaphoreCount);
}

void Java_cz_mg_vulkan_VkBindSparseInfo_setWaitSemaphoreCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->waitSemaphoreCount, valuePointer, sizeof(o->waitSemaphoreCount));
}

jlong Java_cz_mg_vulkan_VkBindSparseInfo_getPWaitSemaphoresNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pWaitSemaphores);
}

void Java_cz_mg_vulkan_VkBindSparseInfo_setPWaitSemaphoresNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pWaitSemaphores, &valuePointer, sizeof(o->pWaitSemaphores));
}

jlong Java_cz_mg_vulkan_VkBindSparseInfo_getBufferBindCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->bufferBindCount);
}

void Java_cz_mg_vulkan_VkBindSparseInfo_setBufferBindCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->bufferBindCount, valuePointer, sizeof(o->bufferBindCount));
}

jlong Java_cz_mg_vulkan_VkBindSparseInfo_getPBufferBindsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pBufferBinds);
}

void Java_cz_mg_vulkan_VkBindSparseInfo_setPBufferBindsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pBufferBinds, &valuePointer, sizeof(o->pBufferBinds));
}

jlong Java_cz_mg_vulkan_VkBindSparseInfo_getImageOpaqueBindCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageOpaqueBindCount);
}

void Java_cz_mg_vulkan_VkBindSparseInfo_setImageOpaqueBindCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageOpaqueBindCount, valuePointer, sizeof(o->imageOpaqueBindCount));
}

jlong Java_cz_mg_vulkan_VkBindSparseInfo_getPImageOpaqueBindsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pImageOpaqueBinds);
}

void Java_cz_mg_vulkan_VkBindSparseInfo_setPImageOpaqueBindsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pImageOpaqueBinds, &valuePointer, sizeof(o->pImageOpaqueBinds));
}

jlong Java_cz_mg_vulkan_VkBindSparseInfo_getImageBindCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageBindCount);
}

void Java_cz_mg_vulkan_VkBindSparseInfo_setImageBindCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageBindCount, valuePointer, sizeof(o->imageBindCount));
}

jlong Java_cz_mg_vulkan_VkBindSparseInfo_getPImageBindsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pImageBinds);
}

void Java_cz_mg_vulkan_VkBindSparseInfo_setPImageBindsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pImageBinds, &valuePointer, sizeof(o->pImageBinds));
}

jlong Java_cz_mg_vulkan_VkBindSparseInfo_getSignalSemaphoreCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->signalSemaphoreCount);
}

void Java_cz_mg_vulkan_VkBindSparseInfo_setSignalSemaphoreCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->signalSemaphoreCount, valuePointer, sizeof(o->signalSemaphoreCount));
}

jlong Java_cz_mg_vulkan_VkBindSparseInfo_getPSignalSemaphoresNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pSignalSemaphores);
}

void Java_cz_mg_vulkan_VkBindSparseInfo_setPSignalSemaphoresNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindSparseInfo* o = (VkBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSignalSemaphores, &valuePointer, sizeof(o->pSignalSemaphores));
}


