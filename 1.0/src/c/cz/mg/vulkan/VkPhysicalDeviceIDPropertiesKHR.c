#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceIDPropertiesKHR);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_getDeviceUUIDNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->deviceUUID);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_setDeviceUUIDNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->deviceUUID, valuePointer, sizeof(o->deviceUUID));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_getDriverUUIDNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->driverUUID);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_setDriverUUIDNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->driverUUID, valuePointer, sizeof(o->driverUUID));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_getDeviceLUIDNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->deviceLUID);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_setDeviceLUIDNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->deviceLUID, valuePointer, sizeof(o->deviceLUID));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_getDeviceNodeMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceNodeMask);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_setDeviceNodeMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceNodeMask, valuePointer, sizeof(o->deviceNodeMask));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_getDeviceLUIDValidNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceLUIDValid);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_setDeviceLUIDValidNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceLUIDValid, valuePointer, sizeof(o->deviceLUIDValid));
}


