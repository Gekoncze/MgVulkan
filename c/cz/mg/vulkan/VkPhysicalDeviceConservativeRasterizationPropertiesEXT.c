#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceConservativeRasterizationPropertiesEXT);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getPrimitiveOverestimationSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->primitiveOverestimationSize));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setPrimitiveOverestimationSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->primitiveOverestimationSize, jniLongToPointer(valueAddress), sizeof(o->primitiveOverestimationSize));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getMaxExtraPrimitiveOverestimationSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxExtraPrimitiveOverestimationSize));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setMaxExtraPrimitiveOverestimationSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxExtraPrimitiveOverestimationSize, jniLongToPointer(valueAddress), sizeof(o->maxExtraPrimitiveOverestimationSize));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getExtraPrimitiveOverestimationSizeGranularity(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->extraPrimitiveOverestimationSizeGranularity));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setExtraPrimitiveOverestimationSizeGranularity(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->extraPrimitiveOverestimationSizeGranularity, jniLongToPointer(valueAddress), sizeof(o->extraPrimitiveOverestimationSizeGranularity));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getPrimitiveUnderestimation(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->primitiveUnderestimation));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setPrimitiveUnderestimation(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->primitiveUnderestimation, jniLongToPointer(valueAddress), sizeof(o->primitiveUnderestimation));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getConservativePointAndLineRasterization(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->conservativePointAndLineRasterization));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setConservativePointAndLineRasterization(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->conservativePointAndLineRasterization, jniLongToPointer(valueAddress), sizeof(o->conservativePointAndLineRasterization));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getDegenerateTrianglesRasterized(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->degenerateTrianglesRasterized));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setDegenerateTrianglesRasterized(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->degenerateTrianglesRasterized, jniLongToPointer(valueAddress), sizeof(o->degenerateTrianglesRasterized));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getDegenerateLinesRasterized(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->degenerateLinesRasterized));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setDegenerateLinesRasterized(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->degenerateLinesRasterized, jniLongToPointer(valueAddress), sizeof(o->degenerateLinesRasterized));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getFullyCoveredFragmentShaderInputVariable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->fullyCoveredFragmentShaderInputVariable));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setFullyCoveredFragmentShaderInputVariable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->fullyCoveredFragmentShaderInputVariable, jniLongToPointer(valueAddress), sizeof(o->fullyCoveredFragmentShaderInputVariable));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_getConservativeRasterizationPostDepthCoverage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->conservativeRasterizationPostDepthCoverage));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceConservativeRasterizationPropertiesEXT_setConservativeRasterizationPostDepthCoverage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceConservativeRasterizationPropertiesEXT* o = (VkPhysicalDeviceConservativeRasterizationPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->conservativeRasterizationPostDepthCoverage, jniLongToPointer(valueAddress), sizeof(o->conservativeRasterizationPostDepthCoverage));
}

