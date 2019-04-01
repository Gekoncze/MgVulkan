#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDeviceGroupDeviceCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceGroupDeviceCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkDeviceGroupDeviceCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfo* o = (VkDeviceGroupDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkDeviceGroupDeviceCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfo* o = (VkDeviceGroupDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkDeviceGroupDeviceCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfo* o = (VkDeviceGroupDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkDeviceGroupDeviceCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfo* o = (VkDeviceGroupDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkDeviceGroupDeviceCreateInfo_getPhysicalDeviceCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfo* o = (VkDeviceGroupDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->physicalDeviceCount);
}

void Java_cz_mg_vulkan_vk_VkDeviceGroupDeviceCreateInfo_setPhysicalDeviceCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfo* o = (VkDeviceGroupDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->physicalDeviceCount, valuePointer, sizeof(o->physicalDeviceCount));
}

jlong Java_cz_mg_vulkan_vk_VkDeviceGroupDeviceCreateInfo_getPPhysicalDevices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfo* o = (VkDeviceGroupDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pPhysicalDevices);
}

void Java_cz_mg_vulkan_vk_VkDeviceGroupDeviceCreateInfo_setPPhysicalDevices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfo* o = (VkDeviceGroupDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pPhysicalDevices, &valuePointer, sizeof(o->pPhysicalDevices));
}


