#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceGroupPropertiesKHX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceGroupPropertiesKHX);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceGroupPropertiesKHX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupPropertiesKHX* o = (VkPhysicalDeviceGroupPropertiesKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceGroupPropertiesKHX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupPropertiesKHX* o = (VkPhysicalDeviceGroupPropertiesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceGroupPropertiesKHX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupPropertiesKHX* o = (VkPhysicalDeviceGroupPropertiesKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceGroupPropertiesKHX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupPropertiesKHX* o = (VkPhysicalDeviceGroupPropertiesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceGroupPropertiesKHX_getPhysicalDeviceCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupPropertiesKHX* o = (VkPhysicalDeviceGroupPropertiesKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->physicalDeviceCount);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceGroupPropertiesKHX_setPhysicalDeviceCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupPropertiesKHX* o = (VkPhysicalDeviceGroupPropertiesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->physicalDeviceCount, valuePointer, sizeof(o->physicalDeviceCount));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceGroupPropertiesKHX_getPhysicalDevices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupPropertiesKHX* o = (VkPhysicalDeviceGroupPropertiesKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->physicalDevices);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceGroupPropertiesKHX_setPhysicalDevices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupPropertiesKHX* o = (VkPhysicalDeviceGroupPropertiesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->physicalDevices, valuePointer, sizeof(o->physicalDevices));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceGroupPropertiesKHX_getSubsetAllocation(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupPropertiesKHX* o = (VkPhysicalDeviceGroupPropertiesKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->subsetAllocation);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceGroupPropertiesKHX_setSubsetAllocation(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupPropertiesKHX* o = (VkPhysicalDeviceGroupPropertiesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subsetAllocation, valuePointer, sizeof(o->subsetAllocation));
}


