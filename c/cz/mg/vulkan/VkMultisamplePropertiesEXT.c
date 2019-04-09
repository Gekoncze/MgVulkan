#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkMultisamplePropertiesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkMultisamplePropertiesEXT);
}

jlong Java_cz_mg_vulkan_VkMultisamplePropertiesEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMultisamplePropertiesEXT* o = (VkMultisamplePropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkMultisamplePropertiesEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMultisamplePropertiesEXT* o = (VkMultisamplePropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkMultisamplePropertiesEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMultisamplePropertiesEXT* o = (VkMultisamplePropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkMultisamplePropertiesEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMultisamplePropertiesEXT* o = (VkMultisamplePropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkMultisamplePropertiesEXT_getMaxSampleLocationGridSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMultisamplePropertiesEXT* o = (VkMultisamplePropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSampleLocationGridSize);
}

void Java_cz_mg_vulkan_VkMultisamplePropertiesEXT_setMaxSampleLocationGridSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMultisamplePropertiesEXT* o = (VkMultisamplePropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSampleLocationGridSize, valuePointer, sizeof(o->maxSampleLocationGridSize));
}


