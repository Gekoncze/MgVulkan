#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineRasterizationConservativeStateCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineRasterizationConservativeStateCreateInfoEXT);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationConservativeStateCreateInfoEXT_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPipelineRasterizationConservativeStateCreateInfoEXT));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationConservativeStateCreateInfoEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationConservativeStateCreateInfoEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationConservativeStateCreateInfoEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationConservativeStateCreateInfoEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationConservativeStateCreateInfoEXT_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationConservativeStateCreateInfoEXT_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationConservativeStateCreateInfoEXT_getConservativeRasterizationModeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->conservativeRasterizationMode);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationConservativeStateCreateInfoEXT_setConservativeRasterizationModeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->conservativeRasterizationMode, valuePointer, sizeof(o->conservativeRasterizationMode));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationConservativeStateCreateInfoEXT_getExtraPrimitiveOverestimationSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->extraPrimitiveOverestimationSize);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationConservativeStateCreateInfoEXT_setExtraPrimitiveOverestimationSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationConservativeStateCreateInfoEXT* o = (VkPipelineRasterizationConservativeStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->extraPrimitiveOverestimationSize, valuePointer, sizeof(o->extraPrimitiveOverestimationSize));
}


