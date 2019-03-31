#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkAttachmentSampleLocationsEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkAttachmentSampleLocationsEXT);
}

jlong Java_cz_mg_vulkan_vk_VkAttachmentSampleLocationsEXT_getAttachmentIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentSampleLocationsEXT* o = (VkAttachmentSampleLocationsEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->attachmentIndex));
}

void Java_cz_mg_vulkan_vk_VkAttachmentSampleLocationsEXT_setAttachmentIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentSampleLocationsEXT* o = (VkAttachmentSampleLocationsEXT*)jniLongToPointer(address);
    memcpy(&o->attachmentIndex, jniLongToPointer(valueAddress), sizeof(o->attachmentIndex));
}
jlong Java_cz_mg_vulkan_vk_VkAttachmentSampleLocationsEXT_getSampleLocationsInfo(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentSampleLocationsEXT* o = (VkAttachmentSampleLocationsEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sampleLocationsInfo));
}

void Java_cz_mg_vulkan_vk_VkAttachmentSampleLocationsEXT_setSampleLocationsInfo(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentSampleLocationsEXT* o = (VkAttachmentSampleLocationsEXT*)jniLongToPointer(address);
    memcpy(&o->sampleLocationsInfo, jniLongToPointer(valueAddress), sizeof(o->sampleLocationsInfo));
}

