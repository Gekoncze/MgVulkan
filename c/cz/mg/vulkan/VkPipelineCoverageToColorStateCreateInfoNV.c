#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineCoverageToColorStateCreateInfoNV_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineCoverageToColorStateCreateInfoNV);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineCoverageToColorStateCreateInfoNV_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkPipelineCoverageToColorStateCreateInfoNV_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineCoverageToColorStateCreateInfoNV_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkPipelineCoverageToColorStateCreateInfoNV_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineCoverageToColorStateCreateInfoNV_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_vk_VkPipelineCoverageToColorStateCreateInfoNV_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineCoverageToColorStateCreateInfoNV_getCoverageToColorEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->coverageToColorEnable);
}

void Java_cz_mg_vulkan_vk_VkPipelineCoverageToColorStateCreateInfoNV_setCoverageToColorEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->coverageToColorEnable, valuePointer, sizeof(o->coverageToColorEnable));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineCoverageToColorStateCreateInfoNV_getCoverageToColorLocation(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->coverageToColorLocation);
}

void Java_cz_mg_vulkan_vk_VkPipelineCoverageToColorStateCreateInfoNV_setCoverageToColorLocation(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->coverageToColorLocation, valuePointer, sizeof(o->coverageToColorLocation));
}


