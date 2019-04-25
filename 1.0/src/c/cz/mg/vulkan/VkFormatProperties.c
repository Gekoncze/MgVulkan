#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkFormatProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkFormatProperties);
}

jlong Java_cz_mg_vulkan_VkFormatProperties_getLinearTilingFeaturesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFormatProperties* o = (VkFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->linearTilingFeatures);
}

void Java_cz_mg_vulkan_VkFormatProperties_setLinearTilingFeaturesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFormatProperties* o = (VkFormatProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->linearTilingFeatures, valuePointer, sizeof(o->linearTilingFeatures));
}

jlong Java_cz_mg_vulkan_VkFormatProperties_getOptimalTilingFeaturesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFormatProperties* o = (VkFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->optimalTilingFeatures);
}

void Java_cz_mg_vulkan_VkFormatProperties_setOptimalTilingFeaturesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFormatProperties* o = (VkFormatProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->optimalTilingFeatures, valuePointer, sizeof(o->optimalTilingFeatures));
}

jlong Java_cz_mg_vulkan_VkFormatProperties_getBufferFeaturesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFormatProperties* o = (VkFormatProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->bufferFeatures);
}

void Java_cz_mg_vulkan_VkFormatProperties_setBufferFeaturesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFormatProperties* o = (VkFormatProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->bufferFeatures, valuePointer, sizeof(o->bufferFeatures));
}


