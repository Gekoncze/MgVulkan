#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkInputAttachmentAspectReference_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkInputAttachmentAspectReference);
}

jlong Java_cz_mg_vulkan_VkInputAttachmentAspectReference_getSubpass(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInputAttachmentAspectReference* o = (VkInputAttachmentAspectReference*)jniLongToPointer(address);
    return jniPointerToLong(&o->subpass);
}

void Java_cz_mg_vulkan_VkInputAttachmentAspectReference_setSubpass(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInputAttachmentAspectReference* o = (VkInputAttachmentAspectReference*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subpass, valuePointer, sizeof(o->subpass));
}

jlong Java_cz_mg_vulkan_VkInputAttachmentAspectReference_getInputAttachmentIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInputAttachmentAspectReference* o = (VkInputAttachmentAspectReference*)jniLongToPointer(address);
    return jniPointerToLong(&o->inputAttachmentIndex);
}

void Java_cz_mg_vulkan_VkInputAttachmentAspectReference_setInputAttachmentIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInputAttachmentAspectReference* o = (VkInputAttachmentAspectReference*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->inputAttachmentIndex, valuePointer, sizeof(o->inputAttachmentIndex));
}

jlong Java_cz_mg_vulkan_VkInputAttachmentAspectReference_getAspectMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInputAttachmentAspectReference* o = (VkInputAttachmentAspectReference*)jniLongToPointer(address);
    return jniPointerToLong(&o->aspectMask);
}

void Java_cz_mg_vulkan_VkInputAttachmentAspectReference_setAspectMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInputAttachmentAspectReference* o = (VkInputAttachmentAspectReference*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->aspectMask, valuePointer, sizeof(o->aspectMask));
}


