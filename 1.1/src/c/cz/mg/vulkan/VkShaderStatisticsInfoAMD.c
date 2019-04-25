#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkShaderStatisticsInfoAMD_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkShaderStatisticsInfoAMD);
}

jlong Java_cz_mg_vulkan_VkShaderStatisticsInfoAMD_getShaderStageMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStageMask);
}

void Java_cz_mg_vulkan_VkShaderStatisticsInfoAMD_setShaderStageMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStageMask, valuePointer, sizeof(o->shaderStageMask));
}

jlong Java_cz_mg_vulkan_VkShaderStatisticsInfoAMD_getResourceUsageNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->resourceUsage);
}

void Java_cz_mg_vulkan_VkShaderStatisticsInfoAMD_setResourceUsageNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->resourceUsage, valuePointer, sizeof(o->resourceUsage));
}

jlong Java_cz_mg_vulkan_VkShaderStatisticsInfoAMD_getNumPhysicalVgprsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->numPhysicalVgprs);
}

void Java_cz_mg_vulkan_VkShaderStatisticsInfoAMD_setNumPhysicalVgprsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->numPhysicalVgprs, valuePointer, sizeof(o->numPhysicalVgprs));
}

jlong Java_cz_mg_vulkan_VkShaderStatisticsInfoAMD_getNumPhysicalSgprsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->numPhysicalSgprs);
}

void Java_cz_mg_vulkan_VkShaderStatisticsInfoAMD_setNumPhysicalSgprsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->numPhysicalSgprs, valuePointer, sizeof(o->numPhysicalSgprs));
}

jlong Java_cz_mg_vulkan_VkShaderStatisticsInfoAMD_getNumAvailableVgprsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->numAvailableVgprs);
}

void Java_cz_mg_vulkan_VkShaderStatisticsInfoAMD_setNumAvailableVgprsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->numAvailableVgprs, valuePointer, sizeof(o->numAvailableVgprs));
}

jlong Java_cz_mg_vulkan_VkShaderStatisticsInfoAMD_getNumAvailableSgprsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->numAvailableSgprs);
}

void Java_cz_mg_vulkan_VkShaderStatisticsInfoAMD_setNumAvailableSgprsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->numAvailableSgprs, valuePointer, sizeof(o->numAvailableSgprs));
}

jlong Java_cz_mg_vulkan_VkShaderStatisticsInfoAMD_getComputeWorkGroupSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    return jniPointerToLong(o->computeWorkGroupSize);
}

void Java_cz_mg_vulkan_VkShaderStatisticsInfoAMD_setComputeWorkGroupSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->computeWorkGroupSize, valuePointer, sizeof(o->computeWorkGroupSize));
}


