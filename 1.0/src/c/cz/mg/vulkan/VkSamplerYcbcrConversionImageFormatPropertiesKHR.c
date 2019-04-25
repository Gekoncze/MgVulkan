#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionImageFormatPropertiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSamplerYcbcrConversionImageFormatPropertiesKHR);
}

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionImageFormatPropertiesKHR_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionImageFormatPropertiesKHR* o = (VkSamplerYcbcrConversionImageFormatPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkSamplerYcbcrConversionImageFormatPropertiesKHR_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionImageFormatPropertiesKHR* o = (VkSamplerYcbcrConversionImageFormatPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionImageFormatPropertiesKHR_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionImageFormatPropertiesKHR* o = (VkSamplerYcbcrConversionImageFormatPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkSamplerYcbcrConversionImageFormatPropertiesKHR_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionImageFormatPropertiesKHR* o = (VkSamplerYcbcrConversionImageFormatPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionImageFormatPropertiesKHR_getCombinedImageSamplerDescriptorCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionImageFormatPropertiesKHR* o = (VkSamplerYcbcrConversionImageFormatPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->combinedImageSamplerDescriptorCount);
}

void Java_cz_mg_vulkan_VkSamplerYcbcrConversionImageFormatPropertiesKHR_setCombinedImageSamplerDescriptorCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionImageFormatPropertiesKHR* o = (VkSamplerYcbcrConversionImageFormatPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->combinedImageSamplerDescriptorCount, valuePointer, sizeof(o->combinedImageSamplerDescriptorCount));
}


