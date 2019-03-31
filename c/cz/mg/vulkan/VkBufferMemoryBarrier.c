#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkBufferMemoryBarrier);
}

jlong Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_getSrcAccessMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->srcAccessMask));
}

void Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_setSrcAccessMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->srcAccessMask, jniLongToPointer(valueAddress), sizeof(o->srcAccessMask));
}
jlong Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_getDstAccessMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->dstAccessMask));
}

void Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_setDstAccessMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->dstAccessMask, jniLongToPointer(valueAddress), sizeof(o->dstAccessMask));
}
jlong Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_getSrcQueueFamilyIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->srcQueueFamilyIndex));
}

void Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_setSrcQueueFamilyIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->srcQueueFamilyIndex, jniLongToPointer(valueAddress), sizeof(o->srcQueueFamilyIndex));
}
jlong Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_getDstQueueFamilyIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->dstQueueFamilyIndex));
}

void Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_setDstQueueFamilyIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->dstQueueFamilyIndex, jniLongToPointer(valueAddress), sizeof(o->dstQueueFamilyIndex));
}
jlong Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_getBuffer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->buffer));
}

void Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_setBuffer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->buffer, jniLongToPointer(valueAddress), sizeof(o->buffer));
}
jlong Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_getOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->offset));
}

void Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_setOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->offset, jniLongToPointer(valueAddress), sizeof(o->offset));
}
jlong Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_getSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->size));
}

void Java_cz_mg_vulkan_vk_VkBufferMemoryBarrier_setSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferMemoryBarrier* o = (VkBufferMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->size, jniLongToPointer(valueAddress), sizeof(o->size));
}

