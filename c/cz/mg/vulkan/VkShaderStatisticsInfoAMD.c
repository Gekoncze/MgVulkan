#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkShaderStatisticsInfoAMD_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkShaderStatisticsInfoAMD);
}

jlong Java_cz_mg_vulkan_vk_VkShaderStatisticsInfoAMD_getShaderStageMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStageMask);
}

void Java_cz_mg_vulkan_vk_VkShaderStatisticsInfoAMD_setShaderStageMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStageMask, valuePointer, sizeof(o->shaderStageMask));
}

jlong Java_cz_mg_vulkan_vk_VkShaderStatisticsInfoAMD_getResourceUsage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->resourceUsage);
}

void Java_cz_mg_vulkan_vk_VkShaderStatisticsInfoAMD_setResourceUsage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->resourceUsage, valuePointer, sizeof(o->resourceUsage));
}

jlong Java_cz_mg_vulkan_vk_VkShaderStatisticsInfoAMD_getNumPhysicalVgprs(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->numPhysicalVgprs);
}

void Java_cz_mg_vulkan_vk_VkShaderStatisticsInfoAMD_setNumPhysicalVgprs(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->numPhysicalVgprs, valuePointer, sizeof(o->numPhysicalVgprs));
}

jlong Java_cz_mg_vulkan_vk_VkShaderStatisticsInfoAMD_getNumPhysicalSgprs(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->numPhysicalSgprs);
}

void Java_cz_mg_vulkan_vk_VkShaderStatisticsInfoAMD_setNumPhysicalSgprs(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->numPhysicalSgprs, valuePointer, sizeof(o->numPhysicalSgprs));
}

jlong Java_cz_mg_vulkan_vk_VkShaderStatisticsInfoAMD_getNumAvailableVgprs(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->numAvailableVgprs);
}

void Java_cz_mg_vulkan_vk_VkShaderStatisticsInfoAMD_setNumAvailableVgprs(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->numAvailableVgprs, valuePointer, sizeof(o->numAvailableVgprs));
}

jlong Java_cz_mg_vulkan_vk_VkShaderStatisticsInfoAMD_getNumAvailableSgprs(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->numAvailableSgprs);
}

void Java_cz_mg_vulkan_vk_VkShaderStatisticsInfoAMD_setNumAvailableSgprs(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->numAvailableSgprs, valuePointer, sizeof(o->numAvailableSgprs));
}

jlong Java_cz_mg_vulkan_vk_VkShaderStatisticsInfoAMD_getComputeWorkGroupSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    return jniPointerToLong(o->computeWorkGroupSize);
}

void Java_cz_mg_vulkan_vk_VkShaderStatisticsInfoAMD_setComputeWorkGroupSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderStatisticsInfoAMD* o = (VkShaderStatisticsInfoAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->computeWorkGroupSize, valuePointer, sizeof(o->computeWorkGroupSize));
}


