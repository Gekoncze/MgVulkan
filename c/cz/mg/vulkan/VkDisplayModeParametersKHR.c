#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDisplayModeParametersKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDisplayModeParametersKHR);
}

jlong Java_cz_mg_vulkan_vk_VkDisplayModeParametersKHR_getVisibleRegion(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayModeParametersKHR* o = (VkDisplayModeParametersKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->visibleRegion);
}

void Java_cz_mg_vulkan_vk_VkDisplayModeParametersKHR_setVisibleRegion(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayModeParametersKHR* o = (VkDisplayModeParametersKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->visibleRegion, valuePointer, sizeof(o->visibleRegion));
}

jlong Java_cz_mg_vulkan_vk_VkDisplayModeParametersKHR_getRefreshRate(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayModeParametersKHR* o = (VkDisplayModeParametersKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->refreshRate);
}

void Java_cz_mg_vulkan_vk_VkDisplayModeParametersKHR_setRefreshRate(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayModeParametersKHR* o = (VkDisplayModeParametersKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->refreshRate, valuePointer, sizeof(o->refreshRate));
}


