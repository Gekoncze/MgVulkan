#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeatures_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceSamplerYcbcrConversionFeatures);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeatures_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPhysicalDeviceSamplerYcbcrConversionFeatures));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeatures_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeatures* o = (VkPhysicalDeviceSamplerYcbcrConversionFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeatures_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeatures* o = (VkPhysicalDeviceSamplerYcbcrConversionFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeatures_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeatures* o = (VkPhysicalDeviceSamplerYcbcrConversionFeatures*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeatures_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeatures* o = (VkPhysicalDeviceSamplerYcbcrConversionFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeatures_getSamplerYcbcrConversionNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeatures* o = (VkPhysicalDeviceSamplerYcbcrConversionFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->samplerYcbcrConversion);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeatures_setSamplerYcbcrConversionNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeatures* o = (VkPhysicalDeviceSamplerYcbcrConversionFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->samplerYcbcrConversion, valuePointer, sizeof(o->samplerYcbcrConversion));
}


