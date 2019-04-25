#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceFeatures);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getRobustBufferAccessNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->robustBufferAccess);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setRobustBufferAccessNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->robustBufferAccess, valuePointer, sizeof(o->robustBufferAccess));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getFullDrawIndexUint32Native(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->fullDrawIndexUint32);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setFullDrawIndexUint32Native(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->fullDrawIndexUint32, valuePointer, sizeof(o->fullDrawIndexUint32));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getImageCubeArrayNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageCubeArray);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setImageCubeArrayNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageCubeArray, valuePointer, sizeof(o->imageCubeArray));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getIndependentBlendNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->independentBlend);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setIndependentBlendNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->independentBlend, valuePointer, sizeof(o->independentBlend));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getGeometryShaderNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->geometryShader);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setGeometryShaderNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->geometryShader, valuePointer, sizeof(o->geometryShader));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getTessellationShaderNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->tessellationShader);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setTessellationShaderNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->tessellationShader, valuePointer, sizeof(o->tessellationShader));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSampleRateShadingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleRateShading);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSampleRateShadingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleRateShading, valuePointer, sizeof(o->sampleRateShading));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getDualSrcBlendNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->dualSrcBlend);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setDualSrcBlendNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dualSrcBlend, valuePointer, sizeof(o->dualSrcBlend));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getLogicOpNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->logicOp);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setLogicOpNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->logicOp, valuePointer, sizeof(o->logicOp));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getMultiDrawIndirectNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->multiDrawIndirect);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setMultiDrawIndirectNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->multiDrawIndirect, valuePointer, sizeof(o->multiDrawIndirect));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getDrawIndirectFirstInstanceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->drawIndirectFirstInstance);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setDrawIndirectFirstInstanceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->drawIndirectFirstInstance, valuePointer, sizeof(o->drawIndirectFirstInstance));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getDepthClampNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthClamp);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setDepthClampNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthClamp, valuePointer, sizeof(o->depthClamp));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getDepthBiasClampNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthBiasClamp);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setDepthBiasClampNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthBiasClamp, valuePointer, sizeof(o->depthBiasClamp));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getFillModeNonSolidNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->fillModeNonSolid);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setFillModeNonSolidNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->fillModeNonSolid, valuePointer, sizeof(o->fillModeNonSolid));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getDepthBoundsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthBounds);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setDepthBoundsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthBounds, valuePointer, sizeof(o->depthBounds));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getWideLinesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->wideLines);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setWideLinesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->wideLines, valuePointer, sizeof(o->wideLines));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getLargePointsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->largePoints);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setLargePointsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->largePoints, valuePointer, sizeof(o->largePoints));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getAlphaToOneNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->alphaToOne);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setAlphaToOneNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->alphaToOne, valuePointer, sizeof(o->alphaToOne));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getMultiViewportNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->multiViewport);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setMultiViewportNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->multiViewport, valuePointer, sizeof(o->multiViewport));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSamplerAnisotropyNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->samplerAnisotropy);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSamplerAnisotropyNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->samplerAnisotropy, valuePointer, sizeof(o->samplerAnisotropy));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getTextureCompressionETC2Native(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->textureCompressionETC2);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setTextureCompressionETC2Native(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->textureCompressionETC2, valuePointer, sizeof(o->textureCompressionETC2));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getTextureCompressionASTC_LDRNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->textureCompressionASTC_LDR);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setTextureCompressionASTC_LDRNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->textureCompressionASTC_LDR, valuePointer, sizeof(o->textureCompressionASTC_LDR));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getTextureCompressionBCNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->textureCompressionBC);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setTextureCompressionBCNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->textureCompressionBC, valuePointer, sizeof(o->textureCompressionBC));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getOcclusionQueryPreciseNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->occlusionQueryPrecise);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setOcclusionQueryPreciseNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->occlusionQueryPrecise, valuePointer, sizeof(o->occlusionQueryPrecise));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getPipelineStatisticsQueryNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->pipelineStatisticsQuery);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setPipelineStatisticsQueryNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pipelineStatisticsQuery, valuePointer, sizeof(o->pipelineStatisticsQuery));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getVertexPipelineStoresAndAtomicsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->vertexPipelineStoresAndAtomics);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setVertexPipelineStoresAndAtomicsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->vertexPipelineStoresAndAtomics, valuePointer, sizeof(o->vertexPipelineStoresAndAtomics));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getFragmentStoresAndAtomicsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->fragmentStoresAndAtomics);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setFragmentStoresAndAtomicsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->fragmentStoresAndAtomics, valuePointer, sizeof(o->fragmentStoresAndAtomics));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderTessellationAndGeometryPointSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderTessellationAndGeometryPointSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderTessellationAndGeometryPointSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderTessellationAndGeometryPointSize, valuePointer, sizeof(o->shaderTessellationAndGeometryPointSize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderImageGatherExtendedNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderImageGatherExtended);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderImageGatherExtendedNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderImageGatherExtended, valuePointer, sizeof(o->shaderImageGatherExtended));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderStorageImageExtendedFormatsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageImageExtendedFormats);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderStorageImageExtendedFormatsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageImageExtendedFormats, valuePointer, sizeof(o->shaderStorageImageExtendedFormats));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderStorageImageMultisampleNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageImageMultisample);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderStorageImageMultisampleNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageImageMultisample, valuePointer, sizeof(o->shaderStorageImageMultisample));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderStorageImageReadWithoutFormatNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageImageReadWithoutFormat);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderStorageImageReadWithoutFormatNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageImageReadWithoutFormat, valuePointer, sizeof(o->shaderStorageImageReadWithoutFormat));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderStorageImageWriteWithoutFormatNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageImageWriteWithoutFormat);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderStorageImageWriteWithoutFormatNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageImageWriteWithoutFormat, valuePointer, sizeof(o->shaderStorageImageWriteWithoutFormat));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderUniformBufferArrayDynamicIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderUniformBufferArrayDynamicIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderUniformBufferArrayDynamicIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderUniformBufferArrayDynamicIndexing, valuePointer, sizeof(o->shaderUniformBufferArrayDynamicIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderSampledImageArrayDynamicIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderSampledImageArrayDynamicIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderSampledImageArrayDynamicIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderSampledImageArrayDynamicIndexing, valuePointer, sizeof(o->shaderSampledImageArrayDynamicIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderStorageBufferArrayDynamicIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageBufferArrayDynamicIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderStorageBufferArrayDynamicIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageBufferArrayDynamicIndexing, valuePointer, sizeof(o->shaderStorageBufferArrayDynamicIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderStorageImageArrayDynamicIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageImageArrayDynamicIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderStorageImageArrayDynamicIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageImageArrayDynamicIndexing, valuePointer, sizeof(o->shaderStorageImageArrayDynamicIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderClipDistanceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderClipDistance);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderClipDistanceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderClipDistance, valuePointer, sizeof(o->shaderClipDistance));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderCullDistanceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderCullDistance);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderCullDistanceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderCullDistance, valuePointer, sizeof(o->shaderCullDistance));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderFloat64Native(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderFloat64);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderFloat64Native(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderFloat64, valuePointer, sizeof(o->shaderFloat64));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderInt64Native(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderInt64);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderInt64Native(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderInt64, valuePointer, sizeof(o->shaderInt64));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderInt16Native(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderInt16);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderInt16Native(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderInt16, valuePointer, sizeof(o->shaderInt16));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderResourceResidencyNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderResourceResidency);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderResourceResidencyNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderResourceResidency, valuePointer, sizeof(o->shaderResourceResidency));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderResourceMinLodNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderResourceMinLod);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderResourceMinLodNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderResourceMinLod, valuePointer, sizeof(o->shaderResourceMinLod));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseBindingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseBinding);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseBindingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseBinding, valuePointer, sizeof(o->sparseBinding));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseResidencyBufferNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseResidencyBuffer);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseResidencyBufferNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseResidencyBuffer, valuePointer, sizeof(o->sparseResidencyBuffer));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseResidencyImage2DNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseResidencyImage2D);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseResidencyImage2DNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseResidencyImage2D, valuePointer, sizeof(o->sparseResidencyImage2D));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseResidencyImage3DNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseResidencyImage3D);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseResidencyImage3DNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseResidencyImage3D, valuePointer, sizeof(o->sparseResidencyImage3D));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseResidency2SamplesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseResidency2Samples);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseResidency2SamplesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseResidency2Samples, valuePointer, sizeof(o->sparseResidency2Samples));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseResidency4SamplesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseResidency4Samples);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseResidency4SamplesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseResidency4Samples, valuePointer, sizeof(o->sparseResidency4Samples));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseResidency8SamplesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseResidency8Samples);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseResidency8SamplesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseResidency8Samples, valuePointer, sizeof(o->sparseResidency8Samples));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseResidency16SamplesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseResidency16Samples);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseResidency16SamplesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseResidency16Samples, valuePointer, sizeof(o->sparseResidency16Samples));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseResidencyAliasedNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseResidencyAliased);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseResidencyAliasedNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseResidencyAliased, valuePointer, sizeof(o->sparseResidencyAliased));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getVariableMultisampleRateNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->variableMultisampleRate);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setVariableMultisampleRateNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->variableMultisampleRate, valuePointer, sizeof(o->variableMultisampleRate));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getInheritedQueriesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->inheritedQueries);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setInheritedQueriesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->inheritedQueries, valuePointer, sizeof(o->inheritedQueries));
}


