#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkClearAttachment_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkClearAttachment);
}

jlong Java_cz_mg_vulkan_VkClearAttachment_getAspectMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearAttachment* o = (VkClearAttachment*)jniLongToPointer(address);
    return jniPointerToLong(&o->aspectMask);
}

void Java_cz_mg_vulkan_VkClearAttachment_setAspectMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearAttachment* o = (VkClearAttachment*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->aspectMask, valuePointer, sizeof(o->aspectMask));
}

jlong Java_cz_mg_vulkan_VkClearAttachment_getColorAttachmentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearAttachment* o = (VkClearAttachment*)jniLongToPointer(address);
    return jniPointerToLong(&o->colorAttachment);
}

void Java_cz_mg_vulkan_VkClearAttachment_setColorAttachmentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearAttachment* o = (VkClearAttachment*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->colorAttachment, valuePointer, sizeof(o->colorAttachment));
}

jlong Java_cz_mg_vulkan_VkClearAttachment_getClearValueNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearAttachment* o = (VkClearAttachment*)jniLongToPointer(address);
    return jniPointerToLong(&o->clearValue);
}

void Java_cz_mg_vulkan_VkClearAttachment_setClearValueNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearAttachment* o = (VkClearAttachment*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->clearValue, valuePointer, sizeof(o->clearValue));
}


