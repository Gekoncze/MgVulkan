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

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getRasterizationSamples(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->rasterizationSamples);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setRasterizationSamples(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->rasterizationSamples, valuePointer, sizeof(o->rasterizationSamples));
}

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getSampleShadingEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleShadingEnable);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setSampleShadingEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleShadingEnable, valuePointer, sizeof(o->sampleShadingEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getMinSampleShading(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->minSampleShading);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setMinSampleShading(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minSampleShading, valuePointer, sizeof(o->minSampleShading));
}

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getPSampleMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pSampleMask);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setPSampleMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSampleMask, &valuePointer, sizeof(o->pSampleMask));
}

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getAlphaToCoverageEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->alphaToCoverageEnable);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setAlphaToCoverageEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->alphaToCoverageEnable, valuePointer, sizeof(o->alphaToCoverageEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_getAlphaToOneEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->alphaToOneEnable);
}

void Java_cz_mg_vulkan_VkPipelineMultisampleStateCreateInfo_setAlphaToOneEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->alphaToOneEnable, valuePointer, sizeof(o->alphaToOneEnable));
}


