#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceGroupProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceGroupProperties);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceGroupProperties_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPhysicalDeviceGroupProperties));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceGroupProperties_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceGroupProperties_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceGroupProperties_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceGroupProperties_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceGroupProperties_getPhysicalDeviceCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->physicalDeviceCount);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceGroupProperties_setPhysicalDeviceCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->physicalDeviceCount, valuePointer, sizeof(o->physicalDeviceCount));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceGroupProperties_getPhysicalDevicesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->physicalDevices);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceGroupProperties_setPhysicalDevicesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->physicalDevices, valuePointer, sizeof(o->physicalDevices));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceGroupProperties_getSubsetAllocationNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->subsetAllocation);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceGroupProperties_setSubsetAllocationNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subsetAllocation, valuePointer, sizeof(o->subsetAllocation));
}


