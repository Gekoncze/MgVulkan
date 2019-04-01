#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkClearAttachment_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkClearAttachment);
}

jlong Java_cz_mg_vulkan_vk_VkClearAttachment_getAspectMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearAttachment* o = (VkClearAttachment*)jniLongToPointer(address);
    return jniPointerToLong(&o->aspectMask);
}

void Java_cz_mg_vulkan_vk_VkClearAttachment_setAspectMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearAttachment* o = (VkClearAttachment*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->aspectMask, valuePointer, sizeof(o->aspectMask));
}

jlong Java_cz_mg_vulkan_vk_VkClearAttachment_getColorAttachment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearAttachment* o = (VkClearAttachment*)jniLongToPointer(address);
    return jniPointerToLong(&o->colorAttachment);
}

void Java_cz_mg_vulkan_vk_VkClearAttachment_setColorAttachment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearAttachment* o = (VkClearAttachment*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->colorAttachment, valuePointer, sizeof(o->colorAttachment));
}

jlong Java_cz_mg_vulkan_vk_VkClearAttachment_getClearValue(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearAttachment* o = (VkClearAttachment*)jniLongToPointer(address);
    return jniPointerToLong(&o->clearValue);
}

void Java_cz_mg_vulkan_vk_VkClearAttachment_setClearValue(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearAttachment* o = (VkClearAttachment*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->clearValue, valuePointer, sizeof(o->clearValue));
}


