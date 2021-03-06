#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkAttachmentReference_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkAttachmentReference);
}

void Java_cz_mg_vulkan_VkAttachmentReference_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkAttachmentReference));
}

jlong Java_cz_mg_vulkan_VkAttachmentReference_getAttachmentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentReference* o = (VkAttachmentReference*)jniLongToPointer(address);
    return jniPointerToLong(&o->attachment);
}

void Java_cz_mg_vulkan_VkAttachmentReference_setAttachmentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentReference* o = (VkAttachmentReference*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->attachment, valuePointer, sizeof(o->attachment));
}

jlong Java_cz_mg_vulkan_VkAttachmentReference_getLayoutNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentReference* o = (VkAttachmentReference*)jniLongToPointer(address);
    return jniPointerToLong(&o->layout);
}

void Java_cz_mg_vulkan_VkAttachmentReference_setLayoutNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentReference* o = (VkAttachmentReference*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->layout, valuePointer, sizeof(o->layout));
}


