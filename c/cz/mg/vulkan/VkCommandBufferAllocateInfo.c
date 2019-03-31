#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkCommandBufferAllocateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkCommandBufferAllocateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkCommandBufferAllocateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferAllocateInfo* o = (VkCommandBufferAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkCommandBufferAllocateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferAllocateInfo* o = (VkCommandBufferAllocateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkCommandBufferAllocateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferAllocateInfo* o = (VkCommandBufferAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkCommandBufferAllocateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferAllocateInfo* o = (VkCommandBufferAllocateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkCommandBufferAllocateInfo_getCommandPool(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferAllocateInfo* o = (VkCommandBufferAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->commandPool));
}

void Java_cz_mg_vulkan_vk_VkCommandBufferAllocateInfo_setCommandPool(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferAllocateInfo* o = (VkCommandBufferAllocateInfo*)jniLongToPointer(address);
    memcpy(&o->commandPool, jniLongToPointer(valueAddress), sizeof(o->commandPool));
}
jlong Java_cz_mg_vulkan_vk_VkCommandBufferAllocateInfo_getLevel(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferAllocateInfo* o = (VkCommandBufferAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->level));
}

void Java_cz_mg_vulkan_vk_VkCommandBufferAllocateInfo_setLevel(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferAllocateInfo* o = (VkCommandBufferAllocateInfo*)jniLongToPointer(address);
    memcpy(&o->level, jniLongToPointer(valueAddress), sizeof(o->level));
}
jlong Java_cz_mg_vulkan_vk_VkCommandBufferAllocateInfo_getCommandBufferCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferAllocateInfo* o = (VkCommandBufferAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->commandBufferCount));
}

void Java_cz_mg_vulkan_vk_VkCommandBufferAllocateInfo_setCommandBufferCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferAllocateInfo* o = (VkCommandBufferAllocateInfo*)jniLongToPointer(address);
    memcpy(&o->commandBufferCount, jniLongToPointer(valueAddress), sizeof(o->commandBufferCount));
}

