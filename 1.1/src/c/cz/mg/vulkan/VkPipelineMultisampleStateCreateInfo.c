#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineMultisampleStateCreateInfo);
}

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getRasterizationSamplesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->rasterizationSamples);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setRasterizationSamplesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->rasterizationSamples, valuePointer, sizeof(o->rasterizationSamples));
}

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getSampleShadingEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleShadingEnable);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setSampleShadingEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleShadingEnable, valuePointer, sizeof(o->sampleShadingEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getMinSampleShadingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->minSampleShading);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setMinSampleShadingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minSampleShading, valuePointer, sizeof(o->minSampleShading));
}

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getPSampleMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pSampleMask);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setPSampleMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSampleMask, &valuePointer, sizeof(o->pSampleMask));
}

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getAlphaToCoverageEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->alphaToCoverageEnable);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setAlphaToCoverageEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->alphaToCoverageEnable, valuePointer, sizeof(o->alphaToCoverageEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getAlphaToOneEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->alphaToOneEnable);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setAlphaToOneEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->alphaToOneEnable, valuePointer, sizeof(o->alphaToOneEnable));
}


