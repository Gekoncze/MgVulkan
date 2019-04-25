#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSamplerCreateInfo);
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getMagFilterNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->magFilter);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setMagFilterNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->magFilter, valuePointer, sizeof(o->magFilter));
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getMinFilterNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->minFilter);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setMinFilterNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minFilter, valuePointer, sizeof(o->minFilter));
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getMipmapModeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->mipmapMode);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setMipmapModeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->mipmapMode, valuePointer, sizeof(o->mipmapMode));
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getAddressModeUNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->addressModeU);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setAddressModeUNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->addressModeU, valuePointer, sizeof(o->addressModeU));
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getAddressModeVNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->addressModeV);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setAddressModeVNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->addressModeV, valuePointer, sizeof(o->addressModeV));
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getAddressModeWNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->addressModeW);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setAddressModeWNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->addressModeW, valuePointer, sizeof(o->addressModeW));
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getMipLodBiasNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->mipLodBias);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setMipLodBiasNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->mipLodBias, valuePointer, sizeof(o->mipLodBias));
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getAnisotropyEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->anisotropyEnable);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setAnisotropyEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->anisotropyEnable, valuePointer, sizeof(o->anisotropyEnable));
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getMaxAnisotropyNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxAnisotropy);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setMaxAnisotropyNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxAnisotropy, valuePointer, sizeof(o->maxAnisotropy));
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getCompareEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->compareEnable);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setCompareEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->compareEnable, valuePointer, sizeof(o->compareEnable));
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getCompareOpNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->compareOp);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setCompareOpNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->compareOp, valuePointer, sizeof(o->compareOp));
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getMinLodNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->minLod);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setMinLodNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minLod, valuePointer, sizeof(o->minLod));
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getMaxLodNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxLod);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setMaxLodNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxLod, valuePointer, sizeof(o->maxLod));
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getBorderColorNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->borderColor);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setBorderColorNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->borderColor, valuePointer, sizeof(o->borderColor));
}

jlong Java_cz_mg_vulkan_VkSamplerCreateInfo_getUnnormalizedCoordinatesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->unnormalizedCoordinates);
}

void Java_cz_mg_vulkan_VkSamplerCreateInfo_setUnnormalizedCoordinatesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->unnormalizedCoordinates, valuePointer, sizeof(o->unnormalizedCoordinates));
}


