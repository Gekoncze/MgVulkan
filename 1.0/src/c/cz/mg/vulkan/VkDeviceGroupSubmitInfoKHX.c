#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfoKHX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceGroupSubmitInfoKHX);
}

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfoKHX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfoKHX* o = (VkDeviceGroupSubmitInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDeviceGroupSubmitInfoKHX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfoKHX* o = (VkDeviceGroupSubmitInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfoKHX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfoKHX* o = (VkDeviceGroupSubmitInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDeviceGroupSubmitInfoKHX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfoKHX* o = (VkDeviceGroupSubmitInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfoKHX_getWaitSemaphoreCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfoKHX* o = (VkDeviceGroupSubmitInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->waitSemaphoreCount);
}

void Java_cz_mg_vulkan_VkDeviceGroupSubmitInfoKHX_setWaitSemaphoreCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfoKHX* o = (VkDeviceGroupSubmitInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->waitSemaphoreCount, valuePointer, sizeof(o->waitSemaphoreCount));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfoKHX_getPWaitSemaphoreDeviceIndices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfoKHX* o = (VkDeviceGroupSubmitInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pWaitSemaphoreDeviceIndices);
}

void Java_cz_mg_vulkan_VkDeviceGroupSubmitInfoKHX_setPWaitSemaphoreDeviceIndices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfoKHX* o = (VkDeviceGroupSubmitInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pWaitSemaphoreDeviceIndices, &valuePointer, sizeof(o->pWaitSemaphoreDeviceIndices));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfoKHX_getCommandBufferCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfoKHX* o = (VkDeviceGroupSubmitInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->commandBufferCount);
}

void Java_cz_mg_vulkan_VkDeviceGroupSubmitInfoKHX_setCommandBufferCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfoKHX* o = (VkDeviceGroupSubmitInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->commandBufferCount, valuePointer, sizeof(o->commandBufferCount));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfoKHX_getPCommandBufferDeviceMasks(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfoKHX* o = (VkDeviceGroupSubmitInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pCommandBufferDeviceMasks);
}

void Java_cz_mg_vulkan_VkDeviceGroupSubmitInfoKHX_setPCommandBufferDeviceMasks(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfoKHX* o = (VkDeviceGroupSubmitInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pCommandBufferDeviceMasks, &valuePointer, sizeof(o->pCommandBufferDeviceMasks));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfoKHX_getSignalSemaphoreCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfoKHX* o = (VkDeviceGroupSubmitInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->signalSemaphoreCount);
}

void Java_cz_mg_vulkan_VkDeviceGroupSubmitInfoKHX_setSignalSemaphoreCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfoKHX* o = (VkDeviceGroupSubmitInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->signalSemaphoreCount, valuePointer, sizeof(o->signalSemaphoreCount));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupSubmitInfoKHX_getPSignalSemaphoreDeviceIndices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfoKHX* o = (VkDeviceGroupSubmitInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pSignalSemaphoreDeviceIndices);
}

void Java_cz_mg_vulkan_VkDeviceGroupSubmitInfoKHX_setPSignalSemaphoreDeviceIndices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupSubmitInfoKHX* o = (VkDeviceGroupSubmitInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSignalSemaphoreDeviceIndices, &valuePointer, sizeof(o->pSignalSemaphoreDeviceIndices));
}


