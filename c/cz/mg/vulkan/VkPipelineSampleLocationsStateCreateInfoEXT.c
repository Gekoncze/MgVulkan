#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineSampleLocationsStateCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineSampleLocationsStateCreateInfoEXT);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineSampleLocationsStateCreateInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineSampleLocationsStateCreateInfoEXT* o = (VkPipelineSampleLocationsStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPipelineSampleLocationsStateCreateInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineSampleLocationsStateCreateInfoEXT* o = (VkPipelineSampleLocationsStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineSampleLocationsStateCreateInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineSampleLocationsStateCreateInfoEXT* o = (VkPipelineSampleLocationsStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPipelineSampleLocationsStateCreateInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineSampleLocationsStateCreateInfoEXT* o = (VkPipelineSampleLocationsStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineSampleLocationsStateCreateInfoEXT_getSampleLocationsEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineSampleLocationsStateCreateInfoEXT* o = (VkPipelineSampleLocationsStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sampleLocationsEnable));
}

void Java_cz_mg_vulkan_vk_VkPipelineSampleLocationsStateCreateInfoEXT_setSampleLocationsEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineSampleLocationsStateCreateInfoEXT* o = (VkPipelineSampleLocationsStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->sampleLocationsEnable, jniLongToPointer(valueAddress), sizeof(o->sampleLocationsEnable));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineSampleLocationsStateCreateInfoEXT_getSampleLocationsInfo(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineSampleLocationsStateCreateInfoEXT* o = (VkPipelineSampleLocationsStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sampleLocationsInfo));
}

void Java_cz_mg_vulkan_vk_VkPipelineSampleLocationsStateCreateInfoEXT_setSampleLocationsInfo(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineSampleLocationsStateCreateInfoEXT* o = (VkPipelineSampleLocationsStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->sampleLocationsInfo, jniLongToPointer(valueAddress), sizeof(o->sampleLocationsInfo));
}

