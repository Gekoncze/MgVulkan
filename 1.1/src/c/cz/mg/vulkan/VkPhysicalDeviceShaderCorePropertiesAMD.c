#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceShaderCorePropertiesAMD);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPhysicalDeviceShaderCorePropertiesAMD));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getShaderEngineCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderEngineCount);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setShaderEngineCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderEngineCount, valuePointer, sizeof(o->shaderEngineCount));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getShaderArraysPerEngineCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderArraysPerEngineCount);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setShaderArraysPerEngineCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderArraysPerEngineCount, valuePointer, sizeof(o->shaderArraysPerEngineCount));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getComputeUnitsPerShaderArrayNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->computeUnitsPerShaderArray);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setComputeUnitsPerShaderArrayNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->computeUnitsPerShaderArray, valuePointer, sizeof(o->computeUnitsPerShaderArray));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getSimdPerComputeUnitNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->simdPerComputeUnit);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setSimdPerComputeUnitNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->simdPerComputeUnit, valuePointer, sizeof(o->simdPerComputeUnit));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getWavefrontsPerSimdNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->wavefrontsPerSimd);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setWavefrontsPerSimdNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->wavefrontsPerSimd, valuePointer, sizeof(o->wavefrontsPerSimd));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getWavefrontSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->wavefrontSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setWavefrontSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->wavefrontSize, valuePointer, sizeof(o->wavefrontSize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getSgprsPerSimdNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->sgprsPerSimd);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setSgprsPerSimdNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sgprsPerSimd, valuePointer, sizeof(o->sgprsPerSimd));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getMinSgprAllocationNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->minSgprAllocation);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setMinSgprAllocationNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minSgprAllocation, valuePointer, sizeof(o->minSgprAllocation));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getMaxSgprAllocationNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSgprAllocation);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setMaxSgprAllocationNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSgprAllocation, valuePointer, sizeof(o->maxSgprAllocation));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getSgprAllocationGranularityNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->sgprAllocationGranularity);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setSgprAllocationGranularityNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sgprAllocationGranularity, valuePointer, sizeof(o->sgprAllocationGranularity));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getVgprsPerSimdNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->vgprsPerSimd);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setVgprsPerSimdNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->vgprsPerSimd, valuePointer, sizeof(o->vgprsPerSimd));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getMinVgprAllocationNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->minVgprAllocation);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setMinVgprAllocationNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minVgprAllocation, valuePointer, sizeof(o->minVgprAllocation));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getMaxVgprAllocationNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxVgprAllocation);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setMaxVgprAllocationNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxVgprAllocation, valuePointer, sizeof(o->maxVgprAllocation));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getVgprAllocationGranularityNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->vgprAllocationGranularity);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setVgprAllocationGranularityNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->vgprAllocationGranularity, valuePointer, sizeof(o->vgprAllocationGranularity));
}


