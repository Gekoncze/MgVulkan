#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineMultisampleStateCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_getRasterizationSamples(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->rasterizationSamples));
}

void Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_setRasterizationSamples(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->rasterizationSamples, jniLongToPointer(valueAddress), sizeof(o->rasterizationSamples));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_getSampleShadingEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sampleShadingEnable));
}

void Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_setSampleShadingEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sampleShadingEnable, jniLongToPointer(valueAddress), sizeof(o->sampleShadingEnable));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_getMinSampleShading(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minSampleShading));
}

void Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_setMinSampleShading(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->minSampleShading, jniLongToPointer(valueAddress), sizeof(o->minSampleShading));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_getPSampleMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pSampleMask));
}

void Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_setPSampleMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pSampleMask, jniLongToPointer(valueAddress), sizeof(o->pSampleMask));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_getAlphaToCoverageEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->alphaToCoverageEnable));
}

void Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_setAlphaToCoverageEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->alphaToCoverageEnable, jniLongToPointer(valueAddress), sizeof(o->alphaToCoverageEnable));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_getAlphaToOneEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->alphaToOneEnable));
}

void Java_cz_mg_vulkan_vk_VkPipelineMultisampleStateCreateInfo_setAlphaToOneEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineMultisampleStateCreateInfo* o = (VkPipelineMultisampleStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->alphaToOneEnable, jniLongToPointer(valueAddress), sizeof(o->alphaToOneEnable));
}

