#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkAttachmentReference_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkAttachmentReference);
}

jlong Java_cz_mg_vulkan_vk_VkAttachmentReference_getAttachment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentReference* o = (VkAttachmentReference*)jniLongToPointer(address);
    return jniPointerToLong(&(o->attachment));
}

void Java_cz_mg_vulkan_vk_VkAttachmentReference_setAttachment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentReference* o = (VkAttachmentReference*)jniLongToPointer(address);
    memcpy(&o->attachment, jniLongToPointer(valueAddress), sizeof(o->attachment));
}
jlong Java_cz_mg_vulkan_vk_VkAttachmentReference_getLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentReference* o = (VkAttachmentReference*)jniLongToPointer(address);
    return jniPointerToLong(&(o->layout));
}

void Java_cz_mg_vulkan_vk_VkAttachmentReference_setLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentReference* o = (VkAttachmentReference*)jniLongToPointer(address);
    memcpy(&o->layout, jniLongToPointer(valueAddress), sizeof(o->layout));
}

