#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkMemoryAllocateFlagsInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkMemoryAllocateFlagsInfo);
}

jlong Java_cz_mg_vulkan_vk_VkMemoryAllocateFlagsInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateFlagsInfo* o = (VkMemoryAllocateFlagsInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkMemoryAllocateFlagsInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateFlagsInfo* o = (VkMemoryAllocateFlagsInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkMemoryAllocateFlagsInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateFlagsInfo* o = (VkMemoryAllocateFlagsInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkMemoryAllocateFlagsInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateFlagsInfo* o = (VkMemoryAllocateFlagsInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkMemoryAllocateFlagsInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateFlagsInfo* o = (VkMemoryAllocateFlagsInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_vk_VkMemoryAllocateFlagsInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateFlagsInfo* o = (VkMemoryAllocateFlagsInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_vk_VkMemoryAllocateFlagsInfo_getDeviceMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateFlagsInfo* o = (VkMemoryAllocateFlagsInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceMask);
}

void Java_cz_mg_vulkan_vk_VkMemoryAllocateFlagsInfo_setDeviceMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateFlagsInfo* o = (VkMemoryAllocateFlagsInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceMask, valuePointer, sizeof(o->deviceMask));
}


