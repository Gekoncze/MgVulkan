#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkValidationCacheCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkValidationCacheCreateInfoEXT);
}

jlong Java_cz_mg_vulkan_vk_VkValidationCacheCreateInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkValidationCacheCreateInfoEXT* o = (VkValidationCacheCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkValidationCacheCreateInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkValidationCacheCreateInfoEXT* o = (VkValidationCacheCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkValidationCacheCreateInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkValidationCacheCreateInfoEXT* o = (VkValidationCacheCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkValidationCacheCreateInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkValidationCacheCreateInfoEXT* o = (VkValidationCacheCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkValidationCacheCreateInfoEXT_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkValidationCacheCreateInfoEXT* o = (VkValidationCacheCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_vk_VkValidationCacheCreateInfoEXT_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkValidationCacheCreateInfoEXT* o = (VkValidationCacheCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_vk_VkValidationCacheCreateInfoEXT_getInitialDataSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkValidationCacheCreateInfoEXT* o = (VkValidationCacheCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->initialDataSize);
}

void Java_cz_mg_vulkan_vk_VkValidationCacheCreateInfoEXT_setInitialDataSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkValidationCacheCreateInfoEXT* o = (VkValidationCacheCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->initialDataSize, valuePointer, sizeof(o->initialDataSize));
}

jlong Java_cz_mg_vulkan_vk_VkValidationCacheCreateInfoEXT_getPInitialData(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkValidationCacheCreateInfoEXT* o = (VkValidationCacheCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pInitialData);
}

void Java_cz_mg_vulkan_vk_VkValidationCacheCreateInfoEXT_setPInitialData(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkValidationCacheCreateInfoEXT* o = (VkValidationCacheCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pInitialData, &valuePointer, sizeof(o->pInitialData));
}


