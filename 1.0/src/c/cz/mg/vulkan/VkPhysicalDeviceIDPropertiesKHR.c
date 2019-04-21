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

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_getDeviceUUID(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->deviceUUID);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_setDeviceUUID(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->deviceUUID, valuePointer, sizeof(o->deviceUUID));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_getDriverUUID(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->driverUUID);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_setDriverUUID(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->driverUUID, valuePointer, sizeof(o->driverUUID));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_getDeviceLUID(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->deviceLUID);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_setDeviceLUID(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->deviceLUID, valuePointer, sizeof(o->deviceLUID));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_getDeviceNodeMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceNodeMask);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_setDeviceNodeMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceNodeMask, valuePointer, sizeof(o->deviceNodeMask));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_getDeviceLUIDValid(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceLUIDValid);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDPropertiesKHR_setDeviceLUIDValid(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDPropertiesKHR* o = (VkPhysicalDeviceIDPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceLUIDValid, valuePointer, sizeof(o->deviceLUIDValid));
}


