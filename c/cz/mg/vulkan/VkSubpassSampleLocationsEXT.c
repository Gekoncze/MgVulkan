#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSubpassSampleLocationsEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSubpassSampleLocationsEXT);
}

jlong Java_cz_mg_vulkan_vk_VkSubpassSampleLocationsEXT_getSubpassIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassSampleLocationsEXT* o = (VkSubpassSampleLocationsEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->subpassIndex);
}

void Java_cz_mg_vulkan_vk_VkSubpassSampleLocationsEXT_setSubpassIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassSampleLocationsEXT* o = (VkSubpassSampleLocationsEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subpassIndex, valuePointer, sizeof(o->subpassIndex));
}

jlong Java_cz_mg_vulkan_vk_VkSubpassSampleLocationsEXT_getSampleLocationsInfo(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassSampleLocationsEXT* o = (VkSubpassSampleLocationsEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleLocationsInfo);
}

void Java_cz_mg_vulkan_vk_VkSubpassSampleLocationsEXT_setSampleLocationsInfo(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassSampleLocationsEXT* o = (VkSubpassSampleLocationsEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleLocationsInfo, valuePointer, sizeof(o->sampleLocationsInfo));
}


