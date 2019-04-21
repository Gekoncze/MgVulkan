#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkShaderResourceUsageAMD_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkShaderResourceUsageAMD);
}

jlong Java_cz_mg_vulkan_VkShaderResourceUsageAMD_getNumUsedVgprs(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->numUsedVgprs);
}

void Java_cz_mg_vulkan_VkShaderResourceUsageAMD_setNumUsedVgprs(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->numUsedVgprs, valuePointer, sizeof(o->numUsedVgprs));
}

jlong Java_cz_mg_vulkan_VkShaderResourceUsageAMD_getNumUsedSgprs(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->numUsedSgprs);
}

void Java_cz_mg_vulkan_VkShaderResourceUsageAMD_setNumUsedSgprs(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->numUsedSgprs, valuePointer, sizeof(o->numUsedSgprs));
}

jlong Java_cz_mg_vulkan_VkShaderResourceUsageAMD_getLdsSizePerLocalWorkGroup(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->ldsSizePerLocalWorkGroup);
}

void Java_cz_mg_vulkan_VkShaderResourceUsageAMD_setLdsSizePerLocalWorkGroup(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->ldsSizePerLocalWorkGroup, valuePointer, sizeof(o->ldsSizePerLocalWorkGroup));
}

jlong Java_cz_mg_vulkan_VkShaderResourceUsageAMD_getLdsUsageSizeInBytes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->ldsUsageSizeInBytes);
}

void Java_cz_mg_vulkan_VkShaderResourceUsageAMD_setLdsUsageSizeInBytes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->ldsUsageSizeInBytes, valuePointer, sizeof(o->ldsUsageSizeInBytes));
}

jlong Java_cz_mg_vulkan_VkShaderResourceUsageAMD_getScratchMemUsageInBytes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->scratchMemUsageInBytes);
}

void Java_cz_mg_vulkan_VkShaderResourceUsageAMD_setScratchMemUsageInBytes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->scratchMemUsageInBytes, valuePointer, sizeof(o->scratchMemUsageInBytes));
}


