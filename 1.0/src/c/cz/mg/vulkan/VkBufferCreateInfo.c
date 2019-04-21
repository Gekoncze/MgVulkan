#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkBufferCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkBufferCreateInfo);
}

jlong Java_cz_mg_vulkan_VkBufferCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkBufferCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkBufferCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkBufferCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkBufferCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkBufferCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkBufferCreateInfo_getSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->size);
}

void Java_cz_mg_vulkan_VkBufferCreateInfo_setSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->size, valuePointer, sizeof(o->size));
}

jlong Java_cz_mg_vulkan_VkBufferCreateInfo_getUsage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->usage);
}

void Java_cz_mg_vulkan_VkBufferCreateInfo_setUsage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->usage, valuePointer, sizeof(o->usage));
}

jlong Java_cz_mg_vulkan_VkBufferCreateInfo_getSharingMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sharingMode);
}

void Java_cz_mg_vulkan_VkBufferCreateInfo_setSharingMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sharingMode, valuePointer, sizeof(o->sharingMode));
}

jlong Java_cz_mg_vulkan_VkBufferCreateInfo_getQueueFamilyIndexCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->queueFamilyIndexCount);
}

void Java_cz_mg_vulkan_VkBufferCreateInfo_setQueueFamilyIndexCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queueFamilyIndexCount, valuePointer, sizeof(o->queueFamilyIndexCount));
}

jlong Java_cz_mg_vulkan_VkBufferCreateInfo_getPQueueFamilyIndices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pQueueFamilyIndices);
}

void Java_cz_mg_vulkan_VkBufferCreateInfo_setPQueueFamilyIndices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pQueueFamilyIndices, &valuePointer, sizeof(o->pQueueFamilyIndices));
}


