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

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getShaderEngineCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderEngineCount);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setShaderEngineCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderEngineCount, valuePointer, sizeof(o->shaderEngineCount));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getShaderArraysPerEngineCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderArraysPerEngineCount);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setShaderArraysPerEngineCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderArraysPerEngineCount, valuePointer, sizeof(o->shaderArraysPerEngineCount));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getComputeUnitsPerShaderArray(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->computeUnitsPerShaderArray);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setComputeUnitsPerShaderArray(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->computeUnitsPerShaderArray, valuePointer, sizeof(o->computeUnitsPerShaderArray));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getSimdPerComputeUnit(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->simdPerComputeUnit);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setSimdPerComputeUnit(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->simdPerComputeUnit, valuePointer, sizeof(o->simdPerComputeUnit));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getWavefrontsPerSimd(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->wavefrontsPerSimd);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setWavefrontsPerSimd(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->wavefrontsPerSimd, valuePointer, sizeof(o->wavefrontsPerSimd));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getWavefrontSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->wavefrontSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setWavefrontSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->wavefrontSize, valuePointer, sizeof(o->wavefrontSize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getSgprsPerSimd(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->sgprsPerSimd);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setSgprsPerSimd(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sgprsPerSimd, valuePointer, sizeof(o->sgprsPerSimd));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getMinSgprAllocation(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->minSgprAllocation);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setMinSgprAllocation(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minSgprAllocation, valuePointer, sizeof(o->minSgprAllocation));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getMaxSgprAllocation(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSgprAllocation);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setMaxSgprAllocation(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSgprAllocation, valuePointer, sizeof(o->maxSgprAllocation));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getSgprAllocationGranularity(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->sgprAllocationGranularity);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setSgprAllocationGranularity(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sgprAllocationGranularity, valuePointer, sizeof(o->sgprAllocationGranularity));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getVgprsPerSimd(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->vgprsPerSimd);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setVgprsPerSimd(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->vgprsPerSimd, valuePointer, sizeof(o->vgprsPerSimd));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getMinVgprAllocation(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->minVgprAllocation);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setMinVgprAllocation(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minVgprAllocation, valuePointer, sizeof(o->minVgprAllocation));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getMaxVgprAllocation(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxVgprAllocation);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setMaxVgprAllocation(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxVgprAllocation, valuePointer, sizeof(o->maxVgprAllocation));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_getVgprAllocationGranularity(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->vgprAllocationGranularity);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceShaderCorePropertiesAMD_setVgprAllocationGranularity(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceShaderCorePropertiesAMD* o = (VkPhysicalDeviceShaderCorePropertiesAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->vgprAllocationGranularity, valuePointer, sizeof(o->vgprAllocationGranularity));
}


