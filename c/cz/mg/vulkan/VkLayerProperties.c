#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkLayerProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkLayerProperties);
}

jlong Java_cz_mg_vulkan_vk_VkLayerProperties_getLayerName(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkLayerProperties* o = (VkLayerProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->layerName));
}

void Java_cz_mg_vulkan_vk_VkLayerProperties_setLayerName(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkLayerProperties* o = (VkLayerProperties*)jniLongToPointer(address);
    memcpy(o->layerName, jniLongToPointer(valueAddress), sizeof(o->layerName));
}
jlong Java_cz_mg_vulkan_vk_VkLayerProperties_getSpecVersion(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkLayerProperties* o = (VkLayerProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->specVersion));
}

void Java_cz_mg_vulkan_vk_VkLayerProperties_setSpecVersion(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkLayerProperties* o = (VkLayerProperties*)jniLongToPointer(address);
    memcpy(&o->specVersion, jniLongToPointer(valueAddress), sizeof(o->specVersion));
}
jlong Java_cz_mg_vulkan_vk_VkLayerProperties_getImplementationVersion(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkLayerProperties* o = (VkLayerProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->implementationVersion));
}

void Java_cz_mg_vulkan_vk_VkLayerProperties_setImplementationVersion(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkLayerProperties* o = (VkLayerProperties*)jniLongToPointer(address);
    memcpy(&o->implementationVersion, jniLongToPointer(valueAddress), sizeof(o->implementationVersion));
}
jlong Java_cz_mg_vulkan_vk_VkLayerProperties_getDescription(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkLayerProperties* o = (VkLayerProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->description));
}

void Java_cz_mg_vulkan_vk_VkLayerProperties_setDescription(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkLayerProperties* o = (VkLayerProperties*)jniLongToPointer(address);
    memcpy(o->description, jniLongToPointer(valueAddress), sizeof(o->description));
}

