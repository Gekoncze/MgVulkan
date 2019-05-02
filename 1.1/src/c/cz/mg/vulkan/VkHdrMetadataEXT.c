#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkHdrMetadataEXT);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkHdrMetadataEXT));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getDisplayPrimaryRedNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->displayPrimaryRed);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setDisplayPrimaryRedNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->displayPrimaryRed, valuePointer, sizeof(o->displayPrimaryRed));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getDisplayPrimaryGreenNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->displayPrimaryGreen);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setDisplayPrimaryGreenNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->displayPrimaryGreen, valuePointer, sizeof(o->displayPrimaryGreen));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getDisplayPrimaryBlueNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->displayPrimaryBlue);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setDisplayPrimaryBlueNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->displayPrimaryBlue, valuePointer, sizeof(o->displayPrimaryBlue));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getWhitePointNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->whitePoint);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setWhitePointNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->whitePoint, valuePointer, sizeof(o->whitePoint));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getMaxLuminanceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxLuminance);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setMaxLuminanceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxLuminance, valuePointer, sizeof(o->maxLuminance));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getMinLuminanceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->minLuminance);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setMinLuminanceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minLuminance, valuePointer, sizeof(o->minLuminance));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getMaxContentLightLevelNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxContentLightLevel);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setMaxContentLightLevelNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxContentLightLevel, valuePointer, sizeof(o->maxContentLightLevel));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getMaxFrameAverageLightLevelNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxFrameAverageLightLevel);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setMaxFrameAverageLightLevelNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxFrameAverageLightLevel, valuePointer, sizeof(o->maxFrameAverageLightLevel));
}


