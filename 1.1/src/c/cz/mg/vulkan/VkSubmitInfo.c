#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSubmitInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSubmitInfo);
}

jlong Java_cz_mg_vulkan_VkSubmitInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkSubmitInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkSubmitInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkSubmitInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkSubmitInfo_getWaitSemaphoreCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->waitSemaphoreCount);
}

void Java_cz_mg_vulkan_VkSubmitInfo_setWaitSemaphoreCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->waitSemaphoreCount, valuePointer, sizeof(o->waitSemaphoreCount));
}

jlong Java_cz_mg_vulkan_VkSubmitInfo_getPWaitSemaphores(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pWaitSemaphores);
}

void Java_cz_mg_vulkan_VkSubmitInfo_setPWaitSemaphores(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pWaitSemaphores, &valuePointer, sizeof(o->pWaitSemaphores));
}

jlong Java_cz_mg_vulkan_VkSubmitInfo_getPWaitDstStageMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pWaitDstStageMask);
}

void Java_cz_mg_vulkan_VkSubmitInfo_setPWaitDstStageMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pWaitDstStageMask, &valuePointer, sizeof(o->pWaitDstStageMask));
}

jlong Java_cz_mg_vulkan_VkSubmitInfo_getCommandBufferCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->commandBufferCount);
}

void Java_cz_mg_vulkan_VkSubmitInfo_setCommandBufferCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->commandBufferCount, valuePointer, sizeof(o->commandBufferCount));
}

jlong Java_cz_mg_vulkan_VkSubmitInfo_getPCommandBuffers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pCommandBuffers);
}

void Java_cz_mg_vulkan_VkSubmitInfo_setPCommandBuffers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pCommandBuffers, &valuePointer, sizeof(o->pCommandBuffers));
}

jlong Java_cz_mg_vulkan_VkSubmitInfo_getSignalSemaphoreCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->signalSemaphoreCount);
}

void Java_cz_mg_vulkan_VkSubmitInfo_setSignalSemaphoreCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->signalSemaphoreCount, valuePointer, sizeof(o->signalSemaphoreCount));
}

jlong Java_cz_mg_vulkan_VkSubmitInfo_getPSignalSemaphores(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pSignalSemaphores);
}

void Java_cz_mg_vulkan_VkSubmitInfo_setPSignalSemaphores(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubmitInfo* o = (VkSubmitInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSignalSemaphores, &valuePointer, sizeof(o->pSignalSemaphores));
}


