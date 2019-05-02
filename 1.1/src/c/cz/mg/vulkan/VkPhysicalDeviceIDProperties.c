#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceIDProperties);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDProperties_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPhysicalDeviceIDProperties));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDProperties_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDProperties_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDProperties_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDProperties_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDProperties_getDeviceUUIDNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->deviceUUID);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDProperties_setDeviceUUIDNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->deviceUUID, valuePointer, sizeof(o->deviceUUID));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDProperties_getDriverUUIDNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->driverUUID);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDProperties_setDriverUUIDNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->driverUUID, valuePointer, sizeof(o->driverUUID));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDProperties_getDeviceLUIDNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->deviceLUID);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDProperties_setDeviceLUIDNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->deviceLUID, valuePointer, sizeof(o->deviceLUID));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDProperties_getDeviceNodeMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceNodeMask);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDProperties_setDeviceNodeMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceNodeMask, valuePointer, sizeof(o->deviceNodeMask));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceIDProperties_getDeviceLUIDValidNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceLUIDValid);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceIDProperties_setDeviceLUIDValidNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceLUIDValid, valuePointer, sizeof(o->deviceLUIDValid));
}


