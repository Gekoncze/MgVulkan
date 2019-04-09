#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeatures_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeatures* o = (VkPhysicalDeviceSamplerYcbcrConversionFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeatures_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeatures* o = (VkPhysicalDeviceSamplerYcbcrConversionFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeatures_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeatures* o = (VkPhysicalDeviceSamplerYcbcrConversionFeatures*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeatures_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeatures* o = (VkPhysicalDeviceSamplerYcbcrConversionFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeatures_getSamplerYcbcrConversion(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeatures* o = (VkPhysicalDeviceSamplerYcbcrConversionFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->samplerYcbcrConversion);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSamplerYcbcrConversionFeatures_setSamplerYcbcrConversion(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerYcbcrConversionFeatures* o = (VkPhysicalDeviceSamplerYcbcrConversionFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->samplerYcbcrConversion, valuePointer, sizeof(o->samplerYcbcrConversion));
}


