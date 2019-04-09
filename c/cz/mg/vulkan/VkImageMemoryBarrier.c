#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getSrcAccessMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcAccessMask);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setSrcAccessMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcAccessMask, valuePointer, sizeof(o->srcAccessMask));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getDstAccessMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstAccessMask);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setDstAccessMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstAccessMask, valuePointer, sizeof(o->dstAccessMask));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getOldLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->oldLayout);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setOldLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->oldLayout, valuePointer, sizeof(o->oldLayout));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getNewLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->newLayout);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setNewLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->newLayout, valuePointer, sizeof(o->newLayout));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getSrcQueueFamilyIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcQueueFamilyIndex);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setSrcQueueFamilyIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcQueueFamilyIndex, valuePointer, sizeof(o->srcQueueFamilyIndex));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getDstQueueFamilyIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstQueueFamilyIndex);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setDstQueueFamilyIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstQueueFamilyIndex, valuePointer, sizeof(o->dstQueueFamilyIndex));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getImage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->image);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setImage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->image, valuePointer, sizeof(o->image));
}

jlong Java_cz_mg_vulkan_VkImageMemoryBarrier_getSubresourceRange(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    return jniPointerToLong(&o->subresourceRange);
}

void Java_cz_mg_vulkan_VkImageMemoryBarrier_setSubresourceRange(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageMemoryBarrier* o = (VkImageMemoryBarrier*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subresourceRange, valuePointer, sizeof(o->subresourceRange));
}


