#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceGroupProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceGroupProperties);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceGroupProperties_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceGroupProperties_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceGroupProperties_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceGroupProperties_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceGroupProperties_getPhysicalDeviceCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->physicalDeviceCount);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceGroupProperties_setPhysicalDeviceCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->physicalDeviceCount, valuePointer, sizeof(o->physicalDeviceCount));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceGroupProperties_getPhysicalDevices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->physicalDevices);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceGroupProperties_setPhysicalDevices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->physicalDevices, valuePointer, sizeof(o->physicalDevices));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceGroupProperties_getSubsetAllocation(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->subsetAllocation);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceGroupProperties_setSubsetAllocation(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceGroupProperties* o = (VkPhysicalDeviceGroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subsetAllocation, valuePointer, sizeof(o->subsetAllocation));
}


