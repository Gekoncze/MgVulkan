#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkQueueFamilyProperties2_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkQueueFamilyProperties2);
}

jlong Java_cz_mg_vulkan_vk_VkQueueFamilyProperties2_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties2* o = (VkQueueFamilyProperties2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkQueueFamilyProperties2_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties2* o = (VkQueueFamilyProperties2*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkQueueFamilyProperties2_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties2* o = (VkQueueFamilyProperties2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkQueueFamilyProperties2_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties2* o = (VkQueueFamilyProperties2*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkQueueFamilyProperties2_getQueueFamilyProperties(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties2* o = (VkQueueFamilyProperties2*)jniLongToPointer(address);
    return jniPointerToLong(&(o->queueFamilyProperties));
}

void Java_cz_mg_vulkan_vk_VkQueueFamilyProperties2_setQueueFamilyProperties(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkQueueFamilyProperties2* o = (VkQueueFamilyProperties2*)jniLongToPointer(address);
    memcpy(&o->queueFamilyProperties, jniLongToPointer(valueAddress), sizeof(o->queueFamilyProperties));
}

