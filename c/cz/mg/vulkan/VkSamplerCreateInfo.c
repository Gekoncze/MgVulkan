#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSamplerCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getMagFilter(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->magFilter));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setMagFilter(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->magFilter, jniLongToPointer(valueAddress), sizeof(o->magFilter));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getMinFilter(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minFilter));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setMinFilter(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->minFilter, jniLongToPointer(valueAddress), sizeof(o->minFilter));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getMipmapMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->mipmapMode));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setMipmapMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->mipmapMode, jniLongToPointer(valueAddress), sizeof(o->mipmapMode));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getAddressModeU(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->addressModeU));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setAddressModeU(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->addressModeU, jniLongToPointer(valueAddress), sizeof(o->addressModeU));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getAddressModeV(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->addressModeV));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setAddressModeV(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->addressModeV, jniLongToPointer(valueAddress), sizeof(o->addressModeV));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getAddressModeW(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->addressModeW));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setAddressModeW(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->addressModeW, jniLongToPointer(valueAddress), sizeof(o->addressModeW));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getMipLodBias(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->mipLodBias));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setMipLodBias(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->mipLodBias, jniLongToPointer(valueAddress), sizeof(o->mipLodBias));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getAnisotropyEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->anisotropyEnable));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setAnisotropyEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->anisotropyEnable, jniLongToPointer(valueAddress), sizeof(o->anisotropyEnable));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getMaxAnisotropy(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxAnisotropy));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setMaxAnisotropy(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->maxAnisotropy, jniLongToPointer(valueAddress), sizeof(o->maxAnisotropy));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getCompareEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->compareEnable));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setCompareEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->compareEnable, jniLongToPointer(valueAddress), sizeof(o->compareEnable));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getCompareOp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->compareOp));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setCompareOp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->compareOp, jniLongToPointer(valueAddress), sizeof(o->compareOp));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getMinLod(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minLod));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setMinLod(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->minLod, jniLongToPointer(valueAddress), sizeof(o->minLod));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getMaxLod(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxLod));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setMaxLod(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->maxLod, jniLongToPointer(valueAddress), sizeof(o->maxLod));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getBorderColor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->borderColor));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setBorderColor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->borderColor, jniLongToPointer(valueAddress), sizeof(o->borderColor));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_getUnnormalizedCoordinates(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->unnormalizedCoordinates));
}

void Java_cz_mg_vulkan_vk_VkSamplerCreateInfo_setUnnormalizedCoordinates(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerCreateInfo* o = (VkSamplerCreateInfo*)jniLongToPointer(address);
    memcpy(&o->unnormalizedCoordinates, jniLongToPointer(valueAddress), sizeof(o->unnormalizedCoordinates));
}

