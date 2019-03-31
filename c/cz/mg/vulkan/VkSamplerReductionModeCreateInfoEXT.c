#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSamplerReductionModeCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSamplerReductionModeCreateInfoEXT);
}

jlong Java_cz_mg_vulkan_vk_VkSamplerReductionModeCreateInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerReductionModeCreateInfoEXT* o = (VkSamplerReductionModeCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkSamplerReductionModeCreateInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerReductionModeCreateInfoEXT* o = (VkSamplerReductionModeCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerReductionModeCreateInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerReductionModeCreateInfoEXT* o = (VkSamplerReductionModeCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkSamplerReductionModeCreateInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerReductionModeCreateInfoEXT* o = (VkSamplerReductionModeCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkSamplerReductionModeCreateInfoEXT_getReductionMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSamplerReductionModeCreateInfoEXT* o = (VkSamplerReductionModeCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->reductionMode));
}

void Java_cz_mg_vulkan_vk_VkSamplerReductionModeCreateInfoEXT_setReductionMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSamplerReductionModeCreateInfoEXT* o = (VkSamplerReductionModeCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->reductionMode, jniLongToPointer(valueAddress), sizeof(o->reductionMode));
}

