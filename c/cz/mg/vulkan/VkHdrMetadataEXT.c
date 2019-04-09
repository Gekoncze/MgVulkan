#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getDisplayPrimaryRed(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->displayPrimaryRed);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setDisplayPrimaryRed(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->displayPrimaryRed, valuePointer, sizeof(o->displayPrimaryRed));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getDisplayPrimaryGreen(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->displayPrimaryGreen);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setDisplayPrimaryGreen(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->displayPrimaryGreen, valuePointer, sizeof(o->displayPrimaryGreen));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getDisplayPrimaryBlue(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->displayPrimaryBlue);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setDisplayPrimaryBlue(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->displayPrimaryBlue, valuePointer, sizeof(o->displayPrimaryBlue));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getWhitePoint(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->whitePoint);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setWhitePoint(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->whitePoint, valuePointer, sizeof(o->whitePoint));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getMaxLuminance(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxLuminance);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setMaxLuminance(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxLuminance, valuePointer, sizeof(o->maxLuminance));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getMinLuminance(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->minLuminance);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setMinLuminance(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minLuminance, valuePointer, sizeof(o->minLuminance));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getMaxContentLightLevel(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxContentLightLevel);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setMaxContentLightLevel(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxContentLightLevel, valuePointer, sizeof(o->maxContentLightLevel));
}

jlong Java_cz_mg_vulkan_VkHdrMetadataEXT_getMaxFrameAverageLightLevel(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxFrameAverageLightLevel);
}

void Java_cz_mg_vulkan_VkHdrMetadataEXT_setMaxFrameAverageLightLevel(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkHdrMetadataEXT* o = (VkHdrMetadataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxFrameAverageLightLevel, valuePointer, sizeof(o->maxFrameAverageLightLevel));
}


