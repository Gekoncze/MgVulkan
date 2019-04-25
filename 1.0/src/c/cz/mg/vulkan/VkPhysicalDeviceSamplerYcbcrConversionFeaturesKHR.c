#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR* o = (VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR* o = (VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR* o = (VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR* o = (VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR_getSamplerYcbcrConversionNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR* o = (VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->samplerYcbcrConversion);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR_setSamplerYcbcrConversionNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR* o = (VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->samplerYcbcrConversion, valuePointer, sizeof(o->samplerYcbcrConversion));
}


