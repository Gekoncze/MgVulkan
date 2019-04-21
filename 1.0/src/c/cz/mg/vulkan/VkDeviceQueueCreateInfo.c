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

jlong Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_getQueueFamilyIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->queueFamilyIndex);
}

void Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_setQueueFamilyIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queueFamilyIndex, valuePointer, sizeof(o->queueFamilyIndex));
}

jlong Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_getQueueCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->queueCount);
}

void Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_setQueueCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queueCount, valuePointer, sizeof(o->queueCount));
}

jlong Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_getPQueuePriorities(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pQueuePriorities);
}

void Java_cz_mg_vulkan_VkDeviceQueueCreateInfo_setPQueuePriorities(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceQueueCreateInfo* o = (VkDeviceQueueCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pQueuePriorities, &valuePointer, sizeof(o->pQueuePriorities));
}


