#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDisplayModePropertiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDisplayModePropertiesKHR);
}

jlong Java_cz_mg_vulkan_vk_VkDisplayModePropertiesKHR_getDisplayMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayModePropertiesKHR* o = (VkDisplayModePropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->displayMode);
}

void Java_cz_mg_vulkan_vk_VkDisplayModePropertiesKHR_setDisplayMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayModePropertiesKHR* o = (VkDisplayModePropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->displayMode, valuePointer, sizeof(o->displayMode));
}

jlong Java_cz_mg_vulkan_vk_VkDisplayModePropertiesKHR_getParameters(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayModePropertiesKHR* o = (VkDisplayModePropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->parameters);
}

void Java_cz_mg_vulkan_vk_VkDisplayModePropertiesKHR_setParameters(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayModePropertiesKHR* o = (VkDisplayModePropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->parameters, valuePointer, sizeof(o->parameters));
}


