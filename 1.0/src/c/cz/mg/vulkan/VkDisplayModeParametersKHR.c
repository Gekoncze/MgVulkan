#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDisplayModeParametersKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDisplayModeParametersKHR);
}

jlong Java_cz_mg_vulkan_VkDisplayModeParametersKHR_getVisibleRegionNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayModeParametersKHR* o = (VkDisplayModeParametersKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->visibleRegion);
}

void Java_cz_mg_vulkan_VkDisplayModeParametersKHR_setVisibleRegionNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayModeParametersKHR* o = (VkDisplayModeParametersKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->visibleRegion, valuePointer, sizeof(o->visibleRegion));
}

jlong Java_cz_mg_vulkan_VkDisplayModeParametersKHR_getRefreshRateNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayModeParametersKHR* o = (VkDisplayModeParametersKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->refreshRate);
}

void Java_cz_mg_vulkan_VkDisplayModeParametersKHR_setRefreshRateNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayModeParametersKHR* o = (VkDisplayModeParametersKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->refreshRate, valuePointer, sizeof(o->refreshRate));
}


