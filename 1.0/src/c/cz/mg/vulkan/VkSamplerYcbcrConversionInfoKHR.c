#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSamplerYcbcrConversionInfoKHR);
}

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionInfoKHR* o = (VkSamplerYcbcrConversionInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkSamplerYcbcrConversionInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionInfoKHR* o = (VkSamplerYcbcrConversionInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionInfoKHR* o = (VkSamplerYcbcrConversionInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkSamplerYcbcrConversionInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionInfoKHR* o = (VkSamplerYcbcrConversionInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkSamplerYcbcrConversionInfoKHR_getConversion(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionInfoKHR* o = (VkSamplerYcbcrConversionInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->conversion);
}

void Java_cz_mg_vulkan_VkSamplerYcbcrConversionInfoKHR_setConversion(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerYcbcrConversionInfoKHR* o = (VkSamplerYcbcrConversionInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->conversion, valuePointer, sizeof(o->conversion));
}


