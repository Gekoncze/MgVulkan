#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getPrimitiveOverestimationSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->primitiveOverestimationSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setPrimitiveOverestimationSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->primitiveOverestimationSize, valuePointer, sizeof(o->primitiveOverestimationSize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getMaxExtraPrimitiveOverestimationSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxExtraPrimitiveOverestimationSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setMaxExtraPrimitiveOverestimationSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxExtraPrimitiveOverestimationSize, valuePointer, sizeof(o->maxExtraPrimitiveOverestimationSize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getExtraPrimitiveOverestimationSizeGranularity(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->extraPrimitiveOverestimationSizeGranularity);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setExtraPrimitiveOverestimationSizeGranularity(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->extraPrimitiveOverestimationSizeGranularity, valuePointer, sizeof(o->extraPrimitiveOverestimationSizeGranularity));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getPrimitiveUnderestimation(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->primitiveUnderestimation);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setPrimitiveUnderestimation(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->primitiveUnderestimation, valuePointer, sizeof(o->primitiveUnderestimation));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getConservativePointAndLineRasterization(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->conservativePointAndLineRasterization);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setConservativePointAndLineRasterization(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->conservativePointAndLineRasterization, valuePointer, sizeof(o->conservativePointAndLineRasterization));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getDegenerateTrianglesRasterized(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->degenerateTrianglesRasterized);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setDegenerateTrianglesRasterized(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->degenerateTrianglesRasterized, valuePointer, sizeof(o->degenerateTrianglesRasterized));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getDegenerateLinesRasterized(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->degenerateLinesRasterized);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setDegenerateLinesRasterized(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->degenerateLinesRasterized, valuePointer, sizeof(o->degenerateLinesRasterized));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getFullyCoveredFragmentShaderInputVariable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->fullyCoveredFragmentShaderInputVariable);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setFullyCoveredFragmentShaderInputVariable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->fullyCoveredFragmentShaderInputVariable, valuePointer, sizeof(o->fullyCoveredFragmentShaderInputVariable));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getConservativeRasterizationPostDepthCoverage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->conservativeRasterizationPostDepthCoverage);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setConservativeRasterizationPostDepthCoverage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->conservativeRasterizationPostDepthCoverage, valuePointer, sizeof(o->conservativeRasterizationPostDepthCoverage));
}


