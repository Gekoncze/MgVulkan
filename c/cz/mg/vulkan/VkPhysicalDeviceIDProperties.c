#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceIDProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceIDProperties);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceIDProperties_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceIDProperties_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceIDProperties_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceIDProperties_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceIDProperties_getDeviceUUID(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->deviceUUID));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceIDProperties_setDeviceUUID(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    memcpy(o->deviceUUID, jniLongToPointer(valueAddress), sizeof(o->deviceUUID));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceIDProperties_getDriverUUID(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->driverUUID));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceIDProperties_setDriverUUID(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    memcpy(o->driverUUID, jniLongToPointer(valueAddress), sizeof(o->driverUUID));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceIDProperties_getDeviceLUID(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->deviceLUID));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceIDProperties_setDeviceLUID(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    memcpy(o->deviceLUID, jniLongToPointer(valueAddress), sizeof(o->deviceLUID));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceIDProperties_getDeviceNodeMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->deviceNodeMask));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceIDProperties_setDeviceNodeMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    memcpy(&o->deviceNodeMask, jniLongToPointer(valueAddress), sizeof(o->deviceNodeMask));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceIDProperties_getDeviceLUIDValid(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->deviceLUIDValid));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceIDProperties_setDeviceLUIDValid(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceIDProperties* o = (VkPhysicalDeviceIDProperties*)jniLongToPointer(address);
    memcpy(&o->deviceLUIDValid, jniLongToPointer(valueAddress), sizeof(o->deviceLUIDValid));
}

