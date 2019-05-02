#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDisplayModePropertiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDisplayModePropertiesKHR);
}

void Java_cz_mg_vulkan_VkDisplayModePropertiesKHR_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkDisplayModePropertiesKHR));
}

jlong Java_cz_mg_vulkan_VkDisplayModePropertiesKHR_getDisplayModeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayModePropertiesKHR* o = (VkDisplayModePropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->displayMode);
}

void Java_cz_mg_vulkan_VkDisplayModePropertiesKHR_setDisplayModeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayModePropertiesKHR* o = (VkDisplayModePropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->displayMode, valuePointer, sizeof(o->displayMode));
}

jlong Java_cz_mg_vulkan_VkDisplayModePropertiesKHR_getParametersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayModePropertiesKHR* o = (VkDisplayModePropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->parameters);
}

void Java_cz_mg_vulkan_VkDisplayModePropertiesKHR_setParametersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayModePropertiesKHR* o = (VkDisplayModePropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->parameters, valuePointer, sizeof(o->parameters));
}


