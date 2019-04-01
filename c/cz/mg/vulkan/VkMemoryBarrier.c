#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkMemoryBarrier_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkMemoryBarrier);
}

jlong Java_cz_mg_vulkan_vk_VkMemoryBarrier_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryBarrier* o = (VkMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkMemoryBarrier_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryBarrier* o = (VkMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkMemoryBarrier_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryBarrier* o = (VkMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkMemoryBarrier_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryBarrier* o = (VkMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkMemoryBarrier_getSrcAccessMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryBarrier* o = (VkMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcAccessMask);
}

void Java_cz_mg_vulkan_vk_VkMemoryBarrier_setSrcAccessMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryBarrier* o = (VkMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcAccessMask, valuePointer, sizeof(o->srcAccessMask));
}

jlong Java_cz_mg_vulkan_vk_VkMemoryBarrier_getDstAccessMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryBarrier* o = (VkMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstAccessMask);
}

void Java_cz_mg_vulkan_vk_VkMemoryBarrier_setDstAccessMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryBarrier* o = (VkMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstAccessMask, valuePointer, sizeof(o->dstAccessMask));
}


