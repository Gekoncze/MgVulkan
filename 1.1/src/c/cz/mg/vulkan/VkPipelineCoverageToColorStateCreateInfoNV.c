#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineCoverageToColorStateCreateInfoNV_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineCoverageToColorStateCreateInfoNV);
}

void Java_cz_mg_vulkan_VkPipelineCoverageToColorStateCreateInfoNV_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPipelineCoverageToColorStateCreateInfoNV));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageToColorStateCreateInfoNV_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineCoverageToColorStateCreateInfoNV_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageToColorStateCreateInfoNV_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineCoverageToColorStateCreateInfoNV_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageToColorStateCreateInfoNV_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineCoverageToColorStateCreateInfoNV_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageToColorStateCreateInfoNV_getCoverageToColorEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->coverageToColorEnable);
}

void Java_cz_mg_vulkan_VkPipelineCoverageToColorStateCreateInfoNV_setCoverageToColorEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->coverageToColorEnable, valuePointer, sizeof(o->coverageToColorEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageToColorStateCreateInfoNV_getCoverageToColorLocationNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->coverageToColorLocation);
}

void Java_cz_mg_vulkan_VkPipelineCoverageToColorStateCreateInfoNV_setCoverageToColorLocationNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageToColorStateCreateInfoNV* o = (VkPipelineCoverageToColorStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->coverageToColorLocation, valuePointer, sizeof(o->coverageToColorLocation));
}


