#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationConservativeStateCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineRasterizationConservativeStateCreateInfoEXT);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationConservativeStateCreateInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationConservativeStateCreateInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationConservativeStateCreateInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationConservativeStateCreateInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationConservativeStateCreateInfoEXT_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationConservativeStateCreateInfoEXT_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationConservativeStateCreateInfoEXT_getConservativeRasterizationMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->conservativeRasterizationMode));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationConservativeStateCreateInfoEXT_setConservativeRasterizationMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->conservativeRasterizationMode, jniLongToPointer(valueAddress), sizeof(o->conservativeRasterizationMode));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationConservativeStateCreateInfoEXT_getExtraPrimitiveOverestimationSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->extraPrimitiveOverestimationSize));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationConservativeStateCreateInfoEXT_setExtraPrimitiveOverestimationSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->extraPrimitiveOverestimationSize, jniLongToPointer(valueAddress), sizeof(o->extraPrimitiveOverestimationSize));
}

