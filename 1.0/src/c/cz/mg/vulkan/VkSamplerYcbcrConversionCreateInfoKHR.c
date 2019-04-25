#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSamplerYcbcrConversionCreateInfoKHR);
}

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_getFormatNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->format);
}

void Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_setFormatNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->format, valuePointer, sizeof(o->format));
}

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_getYcbcrModelNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->ycbcrModel);
}

void Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_setYcbcrModelNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->ycbcrModel, valuePointer, sizeof(o->ycbcrModel));
}

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_getYcbcrRangeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->ycbcrRange);
}

void Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_setYcbcrRangeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->ycbcrRange, valuePointer, sizeof(o->ycbcrRange));
}

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_getComponentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->components);
}

void Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_setComponentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->components, valuePointer, sizeof(o->components));
}

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_getXChromaOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->xChromaOffset);
}

void Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_setXChromaOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->xChromaOffset, valuePointer, sizeof(o->xChromaOffset));
}

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_getYChromaOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->yChromaOffset);
}

void Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_setYChromaOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->yChromaOffset, valuePointer, sizeof(o->yChromaOffset));
}

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_getChromaFilterNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->chromaFilter);
}

void Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_setChromaFilterNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->chromaFilter, valuePointer, sizeof(o->chromaFilter));
}

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_getForceExplicitReconstructionNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->forceExplicitReconstruction);
}

void Java_cz_mg_vulkan_VkSamplerYcbcrConversionCreateInfoKHR_setForceExplicitReconstructionNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionCreateInfoKHR* o = (VkSamplerYcbcrConversionCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->forceExplicitReconstruction, valuePointer, sizeof(o->forceExplicitReconstruction));
}


