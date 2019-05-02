#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineCoverageModulationStateCreateInfoNV);
}

void Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPipelineCoverageModulationStateCreateInfoNV));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_getCoverageModulationModeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->coverageModulationMode);
}

void Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_setCoverageModulationModeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->coverageModulationMode, valuePointer, sizeof(o->coverageModulationMode));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_getCoverageModulationTableEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->coverageModulationTableEnable);
}

void Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_setCoverageModulationTableEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->coverageModulationTableEnable, valuePointer, sizeof(o->coverageModulationTableEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_getCoverageModulationTableCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->coverageModulationTableCount);
}

void Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_setCoverageModulationTableCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->coverageModulationTableCount, valuePointer, sizeof(o->coverageModulationTableCount));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_getPCoverageModulationTableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(o->pCoverageModulationTable);
}

void Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_setPCoverageModulationTableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pCoverageModulationTable, &valuePointer, sizeof(o->pCoverageModulationTable));
}


