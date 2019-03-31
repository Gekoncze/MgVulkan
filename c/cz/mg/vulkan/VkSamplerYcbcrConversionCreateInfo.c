#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSamplerYcbcrConversionCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_getFormat(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->format));
}

void Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_setFormat(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    memcpy(&o->format, jniLongToPointer(valueAddress), sizeof(o->format));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_getYcbcrModel(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->ycbcrModel));
}

void Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_setYcbcrModel(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    memcpy(&o->ycbcrModel, jniLongToPointer(valueAddress), sizeof(o->ycbcrModel));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_getYcbcrRange(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->ycbcrRange));
}

void Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_setYcbcrRange(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    memcpy(&o->ycbcrRange, jniLongToPointer(valueAddress), sizeof(o->ycbcrRange));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_getComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->components));
}

void Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_setComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    memcpy(&o->components, jniLongToPointer(valueAddress), sizeof(o->components));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_getXChromaOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->xChromaOffset));
}

void Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_setXChromaOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    memcpy(&o->xChromaOffset, jniLongToPointer(valueAddress), sizeof(o->xChromaOffset));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_getYChromaOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->yChromaOffset));
}

void Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_setYChromaOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    memcpy(&o->yChromaOffset, jniLongToPointer(valueAddress), sizeof(o->yChromaOffset));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_getChromaFilter(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->chromaFilter));
}

void Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_setChromaFilter(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    memcpy(&o->chromaFilter, jniLongToPointer(valueAddress), sizeof(o->chromaFilter));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_getForceExplicitReconstruction(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->forceExplicitReconstruction));
}

void Java_cz_mg_vulkan_vk_VkSamplerYcbcrConversionCreateInfo_setForceExplicitReconstruction(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfo* o = (VkSamplerYcbcrConversionCreateInfo*)jniLongToPointer(address);
    memcpy(&o->forceExplicitReconstruction, jniLongToPointer(valueAddress), sizeof(o->forceExplicitReconstruction));
}

