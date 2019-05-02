#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkQueueFamilyProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkQueueFamilyProperties);
}

void Java_cz_mg_vulkan_VkQueueFamilyProperties_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkQueueFamilyProperties));
}

jlong Java_cz_mg_vulkan_VkQueueFamilyProperties_getQueueFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties* o = (VkQueueFamilyProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->queueFlags);
}

void Java_cz_mg_vulkan_VkQueueFamilyProperties_setQueueFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties* o = (VkQueueFamilyProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queueFlags, valuePointer, sizeof(o->queueFlags));
}

jlong Java_cz_mg_vulkan_VkQueueFamilyProperties_getQueueCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties* o = (VkQueueFamilyProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->queueCount);
}

void Java_cz_mg_vulkan_VkQueueFamilyProperties_setQueueCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties* o = (VkQueueFamilyProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queueCount, valuePointer, sizeof(o->queueCount));
}

jlong Java_cz_mg_vulkan_VkQueueFamilyProperties_getTimestampValidBitsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties* o = (VkQueueFamilyProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->timestampValidBits);
}

void Java_cz_mg_vulkan_VkQueueFamilyProperties_setTimestampValidBitsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties* o = (VkQueueFamilyProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->timestampValidBits, valuePointer, sizeof(o->timestampValidBits));
}

jlong Java_cz_mg_vulkan_VkQueueFamilyProperties_getMinImageTransferGranularityNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties* o = (VkQueueFamilyProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->minImageTransferGranularity);
}

void Java_cz_mg_vulkan_VkQueueFamilyProperties_setMinImageTransferGranularityNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties* o = (VkQueueFamilyProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minImageTransferGranularity, valuePointer, sizeof(o->minImageTransferGranularity));
}


