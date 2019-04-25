#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceProperties);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceProperties_getApiVersionNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->apiVersion);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceProperties_setApiVersionNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->apiVersion, valuePointer, sizeof(o->apiVersion));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceProperties_getDriverVersionNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->driverVersion);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceProperties_setDriverVersionNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->driverVersion, valuePointer, sizeof(o->driverVersion));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceProperties_getVendorIDNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->vendorID);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceProperties_setVendorIDNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->vendorID, valuePointer, sizeof(o->vendorID));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceProperties_getDeviceIDNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceID);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceProperties_setDeviceIDNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceID, valuePointer, sizeof(o->deviceID));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceProperties_getDeviceTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceProperties_setDeviceTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceType, valuePointer, sizeof(o->deviceType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceProperties_getDeviceNameNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->deviceName);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceProperties_setDeviceNameNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->deviceName, valuePointer, sizeof(o->deviceName));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceProperties_getPipelineCacheUUIDNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->pipelineCacheUUID);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceProperties_setPipelineCacheUUIDNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->pipelineCacheUUID, valuePointer, sizeof(o->pipelineCacheUUID));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceProperties_getLimitsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->limits);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceProperties_setLimitsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->limits, valuePointer, sizeof(o->limits));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceProperties_getSparsePropertiesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseProperties);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceProperties_setSparsePropertiesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProperties* o = (VkPhysicalDeviceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseProperties, valuePointer, sizeof(o->sparseProperties));
}


