#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkQueueFamilyProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkQueueFamilyProperties);
}

jlong Java_cz_mg_vulkan_vk_VkQueueFamilyProperties_getQueueFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties* o = (VkQueueFamilyProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->queueFlags));
}

void Java_cz_mg_vulkan_vk_VkQueueFamilyProperties_setQueueFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties* o = (VkQueueFamilyProperties*)jniLongToPointer(address);
    memcpy(&o->queueFlags, jniLongToPointer(valueAddress), sizeof(o->queueFlags));
}
jlong Java_cz_mg_vulkan_vk_VkQueueFamilyProperties_getQueueCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties* o = (VkQueueFamilyProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->queueCount));
}

void Java_cz_mg_vulkan_vk_VkQueueFamilyProperties_setQueueCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties* o = (VkQueueFamilyProperties*)jniLongToPointer(address);
    memcpy(&o->queueCount, jniLongToPointer(valueAddress), sizeof(o->queueCount));
}
jlong Java_cz_mg_vulkan_vk_VkQueueFamilyProperties_getTimestampValidBits(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties* o = (VkQueueFamilyProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->timestampValidBits));
}

void Java_cz_mg_vulkan_vk_VkQueueFamilyProperties_setTimestampValidBits(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties* o = (VkQueueFamilyProperties*)jniLongToPointer(address);
    memcpy(&o->timestampValidBits, jniLongToPointer(valueAddress), sizeof(o->timestampValidBits));
}
jlong Java_cz_mg_vulkan_vk_VkQueueFamilyProperties_getMinImageTransferGranularity(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties* o = (VkQueueFamilyProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minImageTransferGranularity));
}

void Java_cz_mg_vulkan_vk_VkQueueFamilyProperties_setMinImageTransferGranularity(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties* o = (VkQueueFamilyProperties*)jniLongToPointer(address);
    memcpy(&o->minImageTransferGranularity, jniLongToPointer(valueAddress), sizeof(o->minImageTransferGranularity));
}

