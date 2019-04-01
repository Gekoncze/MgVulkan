#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceProperties);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_getApiVersion(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->apiVersion);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_setApiVersion(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->apiVersion, valuePointer, sizeof(o->apiVersion));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_getDriverVersion(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->driverVersion);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_setDriverVersion(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->driverVersion, valuePointer, sizeof(o->driverVersion));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_getVendorID(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->vendorID);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_setVendorID(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->vendorID, valuePointer, sizeof(o->vendorID));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_getDeviceID(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceID);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_setDeviceID(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceID, valuePointer, sizeof(o->deviceID));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_getDeviceType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceType);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_setDeviceType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceType, valuePointer, sizeof(o->deviceType));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_getDeviceName(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->deviceName);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_setDeviceName(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->deviceName, valuePointer, sizeof(o->deviceName));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_getPipelineCacheUUID(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->pipelineCacheUUID);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_setPipelineCacheUUID(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->pipelineCacheUUID, valuePointer, sizeof(o->pipelineCacheUUID));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_getLimits(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->limits);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_setLimits(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->limits, valuePointer, sizeof(o->limits));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_getSparseProperties(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseProperties);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceProperties_setSparseProperties(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseProperties, valuePointer, sizeof(o->sparseProperties));
}


