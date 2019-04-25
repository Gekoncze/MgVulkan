#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageMemoryBarrier);
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getSrcAccessMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcAccessMask);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setSrcAccessMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcAccessMask, valuePointer, sizeof(o->srcAccessMask));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getDstAccessMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstAccessMask);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setDstAccessMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstAccessMask, valuePointer, sizeof(o->dstAccessMask));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getOldLayoutNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->oldLayout);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setOldLayoutNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->oldLayout, valuePointer, sizeof(o->oldLayout));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getNewLayoutNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->newLayout);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setNewLayoutNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->newLayout, valuePointer, sizeof(o->newLayout));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getSrcQueueFamilyIndexNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcQueueFamilyIndex);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setSrcQueueFamilyIndexNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcQueueFamilyIndex, valuePointer, sizeof(o->srcQueueFamilyIndex));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getDstQueueFamilyIndexNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstQueueFamilyIndex);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setDstQueueFamilyIndexNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstQueueFamilyIndex, valuePointer, sizeof(o->dstQueueFamilyIndex));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getImageNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->image);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setImageNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->image, valuePointer, sizeof(o->image));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getSubresourceRangeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->subresourceRange);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setSubresourceRangeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subresourceRange, valuePointer, sizeof(o->subresourceRange));
}


