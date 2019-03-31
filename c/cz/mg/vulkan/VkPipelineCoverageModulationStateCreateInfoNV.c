#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineCoverageModulationStateCreateInfoNV_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineCoverageModulationStateCreateInfoNV);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineCoverageModulationStateCreateInfoNV_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPipelineCoverageModulationStateCreateInfoNV_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineCoverageModulationStateCreateInfoNV_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPipelineCoverageModulationStateCreateInfoNV_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineCoverageModulationStateCreateInfoNV_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkPipelineCoverageModulationStateCreateInfoNV_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineCoverageModulationStateCreateInfoNV_getCoverageModulationMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->coverageModulationMode));
}

void Java_cz_mg_vulkan_vk_VkPipelineCoverageModulationStateCreateInfoNV_setCoverageModulationMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    memcpy(&o->coverageModulationMode, jniLongToPointer(valueAddress), sizeof(o->coverageModulationMode));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineCoverageModulationStateCreateInfoNV_getCoverageModulationTableEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->coverageModulationTableEnable));
}

void Java_cz_mg_vulkan_vk_VkPipelineCoverageModulationStateCreateInfoNV_setCoverageModulationTableEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    memcpy(&o->coverageModulationTableEnable, jniLongToPointer(valueAddress), sizeof(o->coverageModulationTableEnable));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineCoverageModulationStateCreateInfoNV_getCoverageModulationTableCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->coverageModulationTableCount));
}

void Java_cz_mg_vulkan_vk_VkPipelineCoverageModulationStateCreateInfoNV_setCoverageModulationTableCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    memcpy(&o->coverageModulationTableCount, jniLongToPointer(valueAddress), sizeof(o->coverageModulationTableCount));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineCoverageModulationStateCreateInfoNV_getPCoverageModulationTable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pCoverageModulationTable));
}

void Java_cz_mg_vulkan_vk_VkPipelineCoverageModulationStateCreateInfoNV_setPCoverageModulationTable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineCoverageModulationStateCreateInfoNV* o = (VkPipelineCoverageModulationStateCreateInfoNV*)jniLongToPointer(address);
    memcpy(&o->pCoverageModulationTable, jniLongToPointer(valueAddress), sizeof(o->pCoverageModulationTable));
}

