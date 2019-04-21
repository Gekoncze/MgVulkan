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

jlong Java_cz_mg_vulkan_VkAttachmentReference_getAttachment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentReference* o = (VkAttachmentReference*)jniLongToPointer(address);
    return jniPointerToLong(&o->attachment);
}

void Java_cz_mg_vulkan_VkAttachmentReference_setAttachment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentReference* o = (VkAttachmentReference*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->attachment, valuePointer, sizeof(o->attachment));
}

jlong Java_cz_mg_vulkan_VkAttachmentReference_getLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentReference* o = (VkAttachmentReference*)jniLongToPointer(address);
    return jniPointerToLong(&o->layout);
}

void Java_cz_mg_vulkan_VkAttachmentReference_setLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentReference* o = (VkAttachmentReference*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->layout, valuePointer, sizeof(o->layout));
}


