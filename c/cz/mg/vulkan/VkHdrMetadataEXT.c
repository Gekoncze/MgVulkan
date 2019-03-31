#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkHdrMetadataEXT);
}

jlong Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_getDisplayPrimaryRed(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->displayPrimaryRed));
}

void Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_setDisplayPrimaryRed(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    memcpy(&o->displayPrimaryRed, jniLongToPointer(valueAddress), sizeof(o->displayPrimaryRed));
}
jlong Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_getDisplayPrimaryGreen(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->displayPrimaryGreen));
}

void Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_setDisplayPrimaryGreen(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    memcpy(&o->displayPrimaryGreen, jniLongToPointer(valueAddress), sizeof(o->displayPrimaryGreen));
}
jlong Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_getDisplayPrimaryBlue(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->displayPrimaryBlue));
}

void Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_setDisplayPrimaryBlue(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    memcpy(&o->displayPrimaryBlue, jniLongToPointer(valueAddress), sizeof(o->displayPrimaryBlue));
}
jlong Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_getWhitePoint(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->whitePoint));
}

void Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_setWhitePoint(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    memcpy(&o->whitePoint, jniLongToPointer(valueAddress), sizeof(o->whitePoint));
}
jlong Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_getMaxLuminance(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxLuminance));
}

void Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_setMaxLuminance(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    memcpy(&o->maxLuminance, jniLongToPointer(valueAddress), sizeof(o->maxLuminance));
}
jlong Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_getMinLuminance(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minLuminance));
}

void Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_setMinLuminance(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    memcpy(&o->minLuminance, jniLongToPointer(valueAddress), sizeof(o->minLuminance));
}
jlong Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_getMaxContentLightLevel(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxContentLightLevel));
}

void Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_setMaxContentLightLevel(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    memcpy(&o->maxContentLightLevel, jniLongToPointer(valueAddress), sizeof(o->maxContentLightLevel));
}
jlong Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_getMaxFrameAverageLightLevel(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxFrameAverageLightLevel));
}

void Java_cz_mg_vulkan_vk_VkHdrMetadataEXT_setMaxFrameAverageLightLevel(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    memcpy(&o->maxFrameAverageLightLevel, jniLongToPointer(valueAddress), sizeof(o->maxFrameAverageLightLevel));
}

