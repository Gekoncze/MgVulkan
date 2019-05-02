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

void Java_cz_mg_vulkan_VkShaderResourceUsageAMD_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkShaderResourceUsageAMD));
}

jlong Java_cz_mg_vulkan_VkShaderResourceUsageAMD_getNumUsedVgprsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->numUsedVgprs);
}

void Java_cz_mg_vulkan_VkShaderResourceUsageAMD_setNumUsedVgprsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->numUsedVgprs, valuePointer, sizeof(o->numUsedVgprs));
}

jlong Java_cz_mg_vulkan_VkShaderResourceUsageAMD_getNumUsedSgprsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->numUsedSgprs);
}

void Java_cz_mg_vulkan_VkShaderResourceUsageAMD_setNumUsedSgprsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->numUsedSgprs, valuePointer, sizeof(o->numUsedSgprs));
}

jlong Java_cz_mg_vulkan_VkShaderResourceUsageAMD_getLdsSizePerLocalWorkGroupNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->ldsSizePerLocalWorkGroup);
}

void Java_cz_mg_vulkan_VkShaderResourceUsageAMD_setLdsSizePerLocalWorkGroupNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->ldsSizePerLocalWorkGroup, valuePointer, sizeof(o->ldsSizePerLocalWorkGroup));
}

jlong Java_cz_mg_vulkan_VkShaderResourceUsageAMD_getLdsUsageSizeInBytesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->ldsUsageSizeInBytes);
}

void Java_cz_mg_vulkan_VkShaderResourceUsageAMD_setLdsUsageSizeInBytesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->ldsUsageSizeInBytes, valuePointer, sizeof(o->ldsUsageSizeInBytes));
}

jlong Java_cz_mg_vulkan_VkShaderResourceUsageAMD_getScratchMemUsageInBytesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->scratchMemUsageInBytes);
}

void Java_cz_mg_vulkan_VkShaderResourceUsageAMD_setScratchMemUsageInBytesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderResourceUsageAMD* o = (VkShaderResourceUsageAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->scratchMemUsageInBytes, valuePointer, sizeof(o->scratchMemUsageInBytes));
}


