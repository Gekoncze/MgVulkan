#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkLayerProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkLayerProperties);
}

void Java_cz_mg_vulkan_VkLayerProperties_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkLayerProperties));
}

jlong Java_cz_mg_vulkan_VkLayerProperties_getLayerNameNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkLayerProperties* o = (VkLayerProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->layerName);
}

void Java_cz_mg_vulkan_VkLayerProperties_setLayerNameNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkLayerProperties* o = (VkLayerProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->layerName, valuePointer, sizeof(o->layerName));
}

jlong Java_cz_mg_vulkan_VkLayerProperties_getSpecVersionNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkLayerProperties* o = (VkLayerProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->specVersion);
}

void Java_cz_mg_vulkan_VkLayerProperties_setSpecVersionNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkLayerProperties* o = (VkLayerProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->specVersion, valuePointer, sizeof(o->specVersion));
}

jlong Java_cz_mg_vulkan_VkLayerProperties_getImplementationVersionNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkLayerProperties* o = (VkLayerProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->implementationVersion);
}

void Java_cz_mg_vulkan_VkLayerProperties_setImplementationVersionNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkLayerProperties* o = (VkLayerProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->implementationVersion, valuePointer, sizeof(o->implementationVersion));
}

jlong Java_cz_mg_vulkan_VkLayerProperties_getDescriptionNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkLayerProperties* o = (VkLayerProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->description);
}

void Java_cz_mg_vulkan_VkLayerProperties_setDescriptionNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkLayerProperties* o = (VkLayerProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->description, valuePointer, sizeof(o->description));
}


