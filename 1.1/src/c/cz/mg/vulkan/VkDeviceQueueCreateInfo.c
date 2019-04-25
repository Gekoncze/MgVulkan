#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceQueueCreateInfo);
}

jlong Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_getQueueFamilyIndexNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->queueFamilyIndex);
}

void Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_setQueueFamilyIndexNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queueFamilyIndex, valuePointer, sizeof(o->queueFamilyIndex));
}

jlong Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_getQueueCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->queueCount);
}

void Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_setQueueCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queueCount, valuePointer, sizeof(o->queueCount));
}

jlong Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_getPQueuePrioritiesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pQueuePriorities);
}

void Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_setPQueuePrioritiesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pQueuePriorities, &valuePointer, sizeof(o->pQueuePriorities));
}


