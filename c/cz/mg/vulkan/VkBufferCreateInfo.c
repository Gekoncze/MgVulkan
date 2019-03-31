#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkBufferCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkBufferCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkBufferCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkBufferCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkBufferCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkBufferCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkBufferCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkBufferCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkBufferCreateInfo_getSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->size));
}

void Java_cz_mg_vulkan_vk_VkBufferCreateInfo_setSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    memcpy(&o->size, jniLongToPointer(valueAddress), sizeof(o->size));
}
jlong Java_cz_mg_vulkan_vk_VkBufferCreateInfo_getUsage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->usage));
}

void Java_cz_mg_vulkan_vk_VkBufferCreateInfo_setUsage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    memcpy(&o->usage, jniLongToPointer(valueAddress), sizeof(o->usage));
}
jlong Java_cz_mg_vulkan_vk_VkBufferCreateInfo_getSharingMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sharingMode));
}

void Java_cz_mg_vulkan_vk_VkBufferCreateInfo_setSharingMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sharingMode, jniLongToPointer(valueAddress), sizeof(o->sharingMode));
}
jlong Java_cz_mg_vulkan_vk_VkBufferCreateInfo_getQueueFamilyIndexCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->queueFamilyIndexCount));
}

void Java_cz_mg_vulkan_vk_VkBufferCreateInfo_setQueueFamilyIndexCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    memcpy(&o->queueFamilyIndexCount, jniLongToPointer(valueAddress), sizeof(o->queueFamilyIndexCount));
}
jlong Java_cz_mg_vulkan_vk_VkBufferCreateInfo_getPQueueFamilyIndices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pQueueFamilyIndices));
}

void Java_cz_mg_vulkan_vk_VkBufferCreateInfo_setPQueueFamilyIndices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCreateInfo* o = (VkBufferCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pQueueFamilyIndices, jniLongToPointer(valueAddress), sizeof(o->pQueueFamilyIndices));
}

