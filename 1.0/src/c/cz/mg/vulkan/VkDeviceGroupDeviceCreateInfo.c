#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceGroupDeviceCreateInfo);
}

void Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfo_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkDeviceGroupDeviceCreateInfo));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfo* o = (VkDeviceGroupDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfo* o = (VkDeviceGroupDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfo* o = (VkDeviceGroupDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfo* o = (VkDeviceGroupDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfo_getPhysicalDeviceCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfo* o = (VkDeviceGroupDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->physicalDeviceCount);
}

void Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfo_setPhysicalDeviceCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfo* o = (VkDeviceGroupDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->physicalDeviceCount, valuePointer, sizeof(o->physicalDeviceCount));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfo_getPPhysicalDevicesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfo* o = (VkDeviceGroupDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pPhysicalDevices);
}

void Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfo_setPPhysicalDevicesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfo* o = (VkDeviceGroupDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pPhysicalDevices, &valuePointer, sizeof(o->pPhysicalDevices));
}


