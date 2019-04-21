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

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getRobustBufferAccess(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->robustBufferAccess);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setRobustBufferAccess(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->robustBufferAccess, valuePointer, sizeof(o->robustBufferAccess));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getFullDrawIndexUint32(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->fullDrawIndexUint32);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setFullDrawIndexUint32(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->fullDrawIndexUint32, valuePointer, sizeof(o->fullDrawIndexUint32));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getImageCubeArray(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageCubeArray);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setImageCubeArray(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageCubeArray, valuePointer, sizeof(o->imageCubeArray));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getIndependentBlend(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->independentBlend);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setIndependentBlend(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->independentBlend, valuePointer, sizeof(o->independentBlend));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getGeometryShader(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->geometryShader);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setGeometryShader(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->geometryShader, valuePointer, sizeof(o->geometryShader));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getTessellationShader(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->tessellationShader);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setTessellationShader(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->tessellationShader, valuePointer, sizeof(o->tessellationShader));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSampleRateShading(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleRateShading);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSampleRateShading(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleRateShading, valuePointer, sizeof(o->sampleRateShading));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getDualSrcBlend(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->dualSrcBlend);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setDualSrcBlend(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dualSrcBlend, valuePointer, sizeof(o->dualSrcBlend));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getLogicOp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->logicOp);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setLogicOp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->logicOp, valuePointer, sizeof(o->logicOp));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getMultiDrawIndirect(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->multiDrawIndirect);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setMultiDrawIndirect(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->multiDrawIndirect, valuePointer, sizeof(o->multiDrawIndirect));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getDrawIndirectFirstInstance(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->drawIndirectFirstInstance);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setDrawIndirectFirstInstance(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->drawIndirectFirstInstance, valuePointer, sizeof(o->drawIndirectFirstInstance));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getDepthClamp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthClamp);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setDepthClamp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthClamp, valuePointer, sizeof(o->depthClamp));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getDepthBiasClamp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthBiasClamp);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setDepthBiasClamp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthBiasClamp, valuePointer, sizeof(o->depthBiasClamp));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getFillModeNonSolid(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->fillModeNonSolid);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setFillModeNonSolid(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->fillModeNonSolid, valuePointer, sizeof(o->fillModeNonSolid));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getDepthBounds(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthBounds);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setDepthBounds(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthBounds, valuePointer, sizeof(o->depthBounds));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getWideLines(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->wideLines);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setWideLines(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->wideLines, valuePointer, sizeof(o->wideLines));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getLargePoints(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->largePoints);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setLargePoints(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->largePoints, valuePointer, sizeof(o->largePoints));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getAlphaToOne(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->alphaToOne);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setAlphaToOne(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->alphaToOne, valuePointer, sizeof(o->alphaToOne));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getMultiViewport(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->multiViewport);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setMultiViewport(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->multiViewport, valuePointer, sizeof(o->multiViewport));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSamplerAnisotropy(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->samplerAnisotropy);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSamplerAnisotropy(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->samplerAnisotropy, valuePointer, sizeof(o->samplerAnisotropy));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getTextureCompressionETC2(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->textureCompressionETC2);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setTextureCompressionETC2(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->textureCompressionETC2, valuePointer, sizeof(o->textureCompressionETC2));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getTextureCompressionASTC_LDR(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->textureCompressionASTC_LDR);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setTextureCompressionASTC_LDR(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->textureCompressionASTC_LDR, valuePointer, sizeof(o->textureCompressionASTC_LDR));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getTextureCompressionBC(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->textureCompressionBC);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setTextureCompressionBC(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->textureCompressionBC, valuePointer, sizeof(o->textureCompressionBC));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getOcclusionQueryPrecise(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->occlusionQueryPrecise);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setOcclusionQueryPrecise(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->occlusionQueryPrecise, valuePointer, sizeof(o->occlusionQueryPrecise));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getPipelineStatisticsQuery(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->pipelineStatisticsQuery);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setPipelineStatisticsQuery(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pipelineStatisticsQuery, valuePointer, sizeof(o->pipelineStatisticsQuery));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getVertexPipelineStoresAndAtomics(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->vertexPipelineStoresAndAtomics);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setVertexPipelineStoresAndAtomics(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->vertexPipelineStoresAndAtomics, valuePointer, sizeof(o->vertexPipelineStoresAndAtomics));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getFragmentStoresAndAtomics(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->fragmentStoresAndAtomics);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setFragmentStoresAndAtomics(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->fragmentStoresAndAtomics, valuePointer, sizeof(o->fragmentStoresAndAtomics));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderTessellationAndGeometryPointSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderTessellationAndGeometryPointSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderTessellationAndGeometryPointSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderTessellationAndGeometryPointSize, valuePointer, sizeof(o->shaderTessellationAndGeometryPointSize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderImageGatherExtended(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderImageGatherExtended);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderImageGatherExtended(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderImageGatherExtended, valuePointer, sizeof(o->shaderImageGatherExtended));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderStorageImageExtendedFormats(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageImageExtendedFormats);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderStorageImageExtendedFormats(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageImageExtendedFormats, valuePointer, sizeof(o->shaderStorageImageExtendedFormats));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderStorageImageMultisample(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageImageMultisample);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderStorageImageMultisample(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageImageMultisample, valuePointer, sizeof(o->shaderStorageImageMultisample));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderStorageImageReadWithoutFormat(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageImageReadWithoutFormat);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderStorageImageReadWithoutFormat(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageImageReadWithoutFormat, valuePointer, sizeof(o->shaderStorageImageReadWithoutFormat));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderStorageImageWriteWithoutFormat(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageImageWriteWithoutFormat);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderStorageImageWriteWithoutFormat(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageImageWriteWithoutFormat, valuePointer, sizeof(o->shaderStorageImageWriteWithoutFormat));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderUniformBufferArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderUniformBufferArrayDynamicIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderUniformBufferArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderUniformBufferArrayDynamicIndexing, valuePointer, sizeof(o->shaderUniformBufferArrayDynamicIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderSampledImageArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderSampledImageArrayDynamicIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderSampledImageArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderSampledImageArrayDynamicIndexing, valuePointer, sizeof(o->shaderSampledImageArrayDynamicIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderStorageBufferArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageBufferArrayDynamicIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderStorageBufferArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageBufferArrayDynamicIndexing, valuePointer, sizeof(o->shaderStorageBufferArrayDynamicIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderStorageImageArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageImageArrayDynamicIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderStorageImageArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageImageArrayDynamicIndexing, valuePointer, sizeof(o->shaderStorageImageArrayDynamicIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderClipDistance(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderClipDistance);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderClipDistance(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderClipDistance, valuePointer, sizeof(o->shaderClipDistance));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderCullDistance(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderCullDistance);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderCullDistance(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderCullDistance, valuePointer, sizeof(o->shaderCullDistance));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderFloat64(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderFloat64);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderFloat64(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderFloat64, valuePointer, sizeof(o->shaderFloat64));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderInt64(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderInt64);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderInt64(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderInt64, valuePointer, sizeof(o->shaderInt64));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderInt16(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderInt16);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderInt16(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderInt16, valuePointer, sizeof(o->shaderInt16));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderResourceResidency(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderResourceResidency);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderResourceResidency(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderResourceResidency, valuePointer, sizeof(o->shaderResourceResidency));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getShaderResourceMinLod(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderResourceMinLod);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setShaderResourceMinLod(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderResourceMinLod, valuePointer, sizeof(o->shaderResourceMinLod));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseBinding(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseBinding);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseBinding(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseBinding, valuePointer, sizeof(o->sparseBinding));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseResidencyBuffer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseResidencyBuffer);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseResidencyBuffer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseResidencyBuffer, valuePointer, sizeof(o->sparseResidencyBuffer));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseResidencyImage2D(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseResidencyImage2D);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseResidencyImage2D(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseResidencyImage2D, valuePointer, sizeof(o->sparseResidencyImage2D));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseResidencyImage3D(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseResidencyImage3D);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseResidencyImage3D(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseResidencyImage3D, valuePointer, sizeof(o->sparseResidencyImage3D));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseResidency2Samples(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseResidency2Samples);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseResidency2Samples(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseResidency2Samples, valuePointer, sizeof(o->sparseResidency2Samples));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseResidency4Samples(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseResidency4Samples);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseResidency4Samples(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseResidency4Samples, valuePointer, sizeof(o->sparseResidency4Samples));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseResidency8Samples(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseResidency8Samples);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseResidency8Samples(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseResidency8Samples, valuePointer, sizeof(o->sparseResidency8Samples));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseResidency16Samples(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseResidency16Samples);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseResidency16Samples(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseResidency16Samples, valuePointer, sizeof(o->sparseResidency16Samples));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getSparseResidencyAliased(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseResidencyAliased);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setSparseResidencyAliased(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseResidencyAliased, valuePointer, sizeof(o->sparseResidencyAliased));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getVariableMultisampleRate(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->variableMultisampleRate);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setVariableMultisampleRate(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->variableMultisampleRate, valuePointer, sizeof(o->variableMultisampleRate));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_getInheritedQueries(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->inheritedQueries);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceFeatures_setInheritedQueries(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->inheritedQueries, valuePointer, sizeof(o->inheritedQueries));
}


