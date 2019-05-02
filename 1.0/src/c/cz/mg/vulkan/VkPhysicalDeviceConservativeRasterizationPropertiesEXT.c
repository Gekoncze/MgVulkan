#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceConservativeRasterizationPropertiesEXT);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPhysicalDeviceConservativeRasterizationPropertiesEXT));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getPrimitiveOverestimationSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->primitiveOverestimationSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setPrimitiveOverestimationSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->primitiveOverestimationSize, valuePointer, sizeof(o->primitiveOverestimationSize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getMaxExtraPrimitiveOverestimationSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxExtraPrimitiveOverestimationSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setMaxExtraPrimitiveOverestimationSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxExtraPrimitiveOverestimationSize, valuePointer, sizeof(o->maxExtraPrimitiveOverestimationSize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getExtraPrimitiveOverestimationSizeGranularityNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->extraPrimitiveOverestimationSizeGranularity);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setExtraPrimitiveOverestimationSizeGranularityNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->extraPrimitiveOverestimationSizeGranularity, valuePointer, sizeof(o->extraPrimitiveOverestimationSizeGranularity));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getPrimitiveUnderestimationNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->primitiveUnderestimation);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setPrimitiveUnderestimationNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->primitiveUnderestimation, valuePointer, sizeof(o->primitiveUnderestimation));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getConservativePointAndLineRasterizationNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->conservativePointAndLineRasterization);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setConservativePointAndLineRasterizationNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->conservativePointAndLineRasterization, valuePointer, sizeof(o->conservativePointAndLineRasterization));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getDegenerateTrianglesRasterizedNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->degenerateTrianglesRasterized);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setDegenerateTrianglesRasterizedNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->degenerateTrianglesRasterized, valuePointer, sizeof(o->degenerateTrianglesRasterized));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getDegenerateLinesRasterizedNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->degenerateLinesRasterized);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setDegenerateLinesRasterizedNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->degenerateLinesRasterized, valuePointer, sizeof(o->degenerateLinesRasterized));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getFullyCoveredFragmentShaderInputVariableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->fullyCoveredFragmentShaderInputVariable);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setFullyCoveredFragmentShaderInputVariableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->fullyCoveredFragmentShaderInputVariable, valuePointer, sizeof(o->fullyCoveredFragmentShaderInputVariable));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getConservativeRasterizationPostDepthCoverageNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->conservativeRasterizationPostDepthCoverage);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setConservativeRasterizationPostDepthCoverageNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->conservativeRasterizationPostDepthCoverage, valuePointer, sizeof(o->conservativeRasterizationPostDepthCoverage));
}


