#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDeviceGroupPresentInfoKHX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceGroupPresentInfoKHX);
}

jlong Java_cz_mg_vulkan_VkDeviceGroupPresentInfoKHX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentInfoKHX* o = (VkDeviceGroupPresentInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDeviceGroupPresentInfoKHX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentInfoKHX* o = (VkDeviceGroupPresentInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupPresentInfoKHX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentInfoKHX* o = (VkDeviceGroupPresentInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDeviceGroupPresentInfoKHX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentInfoKHX* o = (VkDeviceGroupPresentInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupPresentInfoKHX_getSwapchainCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentInfoKHX* o = (VkDeviceGroupPresentInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->swapchainCount);
}

void Java_cz_mg_vulkan_VkDeviceGroupPresentInfoKHX_setSwapchainCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentInfoKHX* o = (VkDeviceGroupPresentInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->swapchainCount, valuePointer, sizeof(o->swapchainCount));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupPresentInfoKHX_getPDeviceMasks(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentInfoKHX* o = (VkDeviceGroupPresentInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pDeviceMasks);
}

void Java_cz_mg_vulkan_VkDeviceGroupPresentInfoKHX_setPDeviceMasks(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentInfoKHX* o = (VkDeviceGroupPresentInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDeviceMasks, &valuePointer, sizeof(o->pDeviceMasks));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupPresentInfoKHX_getMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentInfoKHX* o = (VkDeviceGroupPresentInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->mode);
}

void Java_cz_mg_vulkan_VkDeviceGroupPresentInfoKHX_setMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentInfoKHX* o = (VkDeviceGroupPresentInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->mode, valuePointer, sizeof(o->mode));
}


