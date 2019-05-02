#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceGroupSubmitInfo);
}

void Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkDeviceGroupSubmitInfo));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfo* o = (VkDeviceGroupSubmitInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfo* o = (VkDeviceGroupSubmitInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfo* o = (VkDeviceGroupSubmitInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfo* o = (VkDeviceGroupSubmitInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_getWaitSemaphoreCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfo* o = (VkDeviceGroupSubmitInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->waitSemaphoreCount);
}

void Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_setWaitSemaphoreCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfo* o = (VkDeviceGroupSubmitInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->waitSemaphoreCount, valuePointer, sizeof(o->waitSemaphoreCount));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_getPWaitSemaphoreDeviceIndicesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfo* o = (VkDeviceGroupSubmitInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pWaitSemaphoreDeviceIndices);
}

void Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_setPWaitSemaphoreDeviceIndicesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfo* o = (VkDeviceGroupSubmitInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pWaitSemaphoreDeviceIndices, &valuePointer, sizeof(o->pWaitSemaphoreDeviceIndices));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_getCommandBufferCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfo* o = (VkDeviceGroupSubmitInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->commandBufferCount);
}

void Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_setCommandBufferCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfo* o = (VkDeviceGroupSubmitInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->commandBufferCount, valuePointer, sizeof(o->commandBufferCount));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_getPCommandBufferDeviceMasksNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfo* o = (VkDeviceGroupSubmitInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pCommandBufferDeviceMasks);
}

void Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_setPCommandBufferDeviceMasksNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfo* o = (VkDeviceGroupSubmitInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pCommandBufferDeviceMasks, &valuePointer, sizeof(o->pCommandBufferDeviceMasks));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_getSignalSemaphoreCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfo* o = (VkDeviceGroupSubmitInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->signalSemaphoreCount);
}

void Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_setSignalSemaphoreCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfo* o = (VkDeviceGroupSubmitInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->signalSemaphoreCount, valuePointer, sizeof(o->signalSemaphoreCount));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_getPSignalSemaphoreDeviceIndicesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfo* o = (VkDeviceGroupSubmitInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pSignalSemaphoreDeviceIndices);
}

void Java_cz_mg_vulkan_VkDeviceGroupSubmitInfo_setPSignalSemaphoreDeviceIndicesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfo* o = (VkDeviceGroupSubmitInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSignalSemaphoreDeviceIndices, &valuePointer, sizeof(o->pSignalSemaphoreDeviceIndices));
}


