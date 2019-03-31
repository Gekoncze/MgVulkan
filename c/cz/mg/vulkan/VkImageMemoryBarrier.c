#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageMemoryBarrier);
}

jlong Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_getSrcAccessMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->srcAccessMask));
}

void Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_setSrcAccessMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->srcAccessMask, jniLongToPointer(valueAddress), sizeof(o->srcAccessMask));
}
jlong Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_getDstAccessMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->dstAccessMask));
}

void Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_setDstAccessMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->dstAccessMask, jniLongToPointer(valueAddress), sizeof(o->dstAccessMask));
}
jlong Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_getOldLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->oldLayout));
}

void Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_setOldLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->oldLayout, jniLongToPointer(valueAddress), sizeof(o->oldLayout));
}
jlong Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_getNewLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->newLayout));
}

void Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_setNewLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->newLayout, jniLongToPointer(valueAddress), sizeof(o->newLayout));
}
jlong Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_getSrcQueueFamilyIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->srcQueueFamilyIndex));
}

void Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_setSrcQueueFamilyIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->srcQueueFamilyIndex, jniLongToPointer(valueAddress), sizeof(o->srcQueueFamilyIndex));
}
jlong Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_getDstQueueFamilyIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->dstQueueFamilyIndex));
}

void Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_setDstQueueFamilyIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->dstQueueFamilyIndex, jniLongToPointer(valueAddress), sizeof(o->dstQueueFamilyIndex));
}
jlong Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_getImage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->image));
}

void Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_setImage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->image, jniLongToPointer(valueAddress), sizeof(o->image));
}
jlong Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_getSubresourceRange(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&(o->subresourceRange));
}

void Java_cz_mg_vulkan_vk_VkImageMemoryBarrier_setSubresourceRange(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    memcpy(&o->subresourceRange, jniLongToPointer(valueAddress), sizeof(o->subresourceRange));
}

