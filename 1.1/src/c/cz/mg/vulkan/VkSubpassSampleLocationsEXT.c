#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSubpassSampleLocationsEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSubpassSampleLocationsEXT);
}

void Java_cz_mg_vulkan_VkSubpassSampleLocationsEXT_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkSubpassSampleLocationsEXT));
}

jlong Java_cz_mg_vulkan_VkSubpassSampleLocationsEXT_getSubpassIndexNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassSampleLocationsEXT* o = (VkSubpassSampleLocationsEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->subpassIndex);
}

void Java_cz_mg_vulkan_VkSubpassSampleLocationsEXT_setSubpassIndexNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassSampleLocationsEXT* o = (VkSubpassSampleLocationsEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subpassIndex, valuePointer, sizeof(o->subpassIndex));
}

jlong Java_cz_mg_vulkan_VkSubpassSampleLocationsEXT_getSampleLocationsInfoNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassSampleLocationsEXT* o = (VkSubpassSampleLocationsEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleLocationsInfo);
}

void Java_cz_mg_vulkan_VkSubpassSampleLocationsEXT_setSampleLocationsInfoNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassSampleLocationsEXT* o = (VkSubpassSampleLocationsEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleLocationsInfo, valuePointer, sizeof(o->sampleLocationsInfo));
}


