#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_getCoverageModulationMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->coverageModulationMode);
}

void Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_setCoverageModulationMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->coverageModulationMode, valuePointer, sizeof(o->coverageModulationMode));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_getCoverageModulationTableEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->coverageModulationTableEnable);
}

void Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_setCoverageModulationTableEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->coverageModulationTableEnable, valuePointer, sizeof(o->coverageModulationTableEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_getCoverageModulationTableCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->coverageModulationTableCount);
}

void Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_setCoverageModulationTableCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->coverageModulationTableCount, valuePointer, sizeof(o->coverageModulationTableCount));
}

jlong Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_getPCoverageModulationTable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(o->pCoverageModulationTable);
}

void Java_cz_mg_vulkan_VkPipelineCoverageModulationStateCreateInfoNV_setPCoverageModulationTable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pCoverageModulationTable, &valuePointer, sizeof(o->pCoverageModulationTable));
}


