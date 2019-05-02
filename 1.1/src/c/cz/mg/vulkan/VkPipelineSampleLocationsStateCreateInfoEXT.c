#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineSampleLocationsStateCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineSampleLocationsStateCreateInfoEXT);
}

void Java_cz_mg_vulkan_VkPipelineSampleLocationsStateCreateInfoEXT_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPipelineSampleLocationsStateCreateInfoEXT));
}

jlong Java_cz_mg_vulkan_VkPipelineSampleLocationsStateCreateInfoEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineSampleLocationsStateCreateInfoEXT* o = (VkPipelineSampleLocationsStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineSampleLocationsStateCreateInfoEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineSampleLocationsStateCreateInfoEXT* o = (VkPipelineSampleLocationsStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineSampleLocationsStateCreateInfoEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineSampleLocationsStateCreateInfoEXT* o = (VkPipelineSampleLocationsStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineSampleLocationsStateCreateInfoEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineSampleLocationsStateCreateInfoEXT* o = (VkPipelineSampleLocationsStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineSampleLocationsStateCreateInfoEXT_getSampleLocationsEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineSampleLocationsStateCreateInfoEXT* o = (VkPipelineSampleLocationsStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleLocationsEnable);
}

void Java_cz_mg_vulkan_VkPipelineSampleLocationsStateCreateInfoEXT_setSampleLocationsEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineSampleLocationsStateCreateInfoEXT* o = (VkPipelineSampleLocationsStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleLocationsEnable, valuePointer, sizeof(o->sampleLocationsEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineSampleLocationsStateCreateInfoEXT_getSampleLocationsInfoNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineSampleLocationsStateCreateInfoEXT* o = (VkPipelineSampleLocationsStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleLocationsInfo);
}

void Java_cz_mg_vulkan_VkPipelineSampleLocationsStateCreateInfoEXT_setSampleLocationsInfoNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineSampleLocationsStateCreateInfoEXT* o = (VkPipelineSampleLocationsStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleLocationsInfo, valuePointer, sizeof(o->sampleLocationsInfo));
}


