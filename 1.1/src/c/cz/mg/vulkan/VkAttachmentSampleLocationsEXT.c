#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkAttachmentSampleLocationsEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkAttachmentSampleLocationsEXT);
}

jlong Java_cz_mg_vulkan_VkAttachmentSampleLocationsEXT_getAttachmentIndexNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentSampleLocationsEXT* o = (VkAttachmentSampleLocationsEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->attachmentIndex);
}

void Java_cz_mg_vulkan_VkAttachmentSampleLocationsEXT_setAttachmentIndexNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentSampleLocationsEXT* o = (VkAttachmentSampleLocationsEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->attachmentIndex, valuePointer, sizeof(o->attachmentIndex));
}

jlong Java_cz_mg_vulkan_VkAttachmentSampleLocationsEXT_getSampleLocationsInfoNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentSampleLocationsEXT* o = (VkAttachmentSampleLocationsEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleLocationsInfo);
}

void Java_cz_mg_vulkan_VkAttachmentSampleLocationsEXT_setSampleLocationsInfoNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentSampleLocationsEXT* o = (VkAttachmentSampleLocationsEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleLocationsInfo, valuePointer, sizeof(o->sampleLocationsInfo));
}


