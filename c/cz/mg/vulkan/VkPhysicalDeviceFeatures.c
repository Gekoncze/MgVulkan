#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceFeatures);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getRobustBufferAccess(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->robustBufferAccess));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setRobustBufferAccess(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->robustBufferAccess, jniLongToPointer(valueAddress), sizeof(o->robustBufferAccess));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getFullDrawIndexUint32(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->fullDrawIndexUint32));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setFullDrawIndexUint32(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->fullDrawIndexUint32, jniLongToPointer(valueAddress), sizeof(o->fullDrawIndexUint32));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getImageCubeArray(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageCubeArray));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setImageCubeArray(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->imageCubeArray, jniLongToPointer(valueAddress), sizeof(o->imageCubeArray));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getIndependentBlend(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->independentBlend));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setIndependentBlend(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->independentBlend, jniLongToPointer(valueAddress), sizeof(o->independentBlend));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getGeometryShader(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->geometryShader));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setGeometryShader(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->geometryShader, jniLongToPointer(valueAddress), sizeof(o->geometryShader));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getTessellationShader(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->tessellationShader));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setTessellationShader(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->tessellationShader, jniLongToPointer(valueAddress), sizeof(o->tessellationShader));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getSampleRateShading(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sampleRateShading));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setSampleRateShading(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->sampleRateShading, jniLongToPointer(valueAddress), sizeof(o->sampleRateShading));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getDualSrcBlend(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->dualSrcBlend));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setDualSrcBlend(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->dualSrcBlend, jniLongToPointer(valueAddress), sizeof(o->dualSrcBlend));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getLogicOp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->logicOp));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setLogicOp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->logicOp, jniLongToPointer(valueAddress), sizeof(o->logicOp));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getMultiDrawIndirect(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->multiDrawIndirect));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setMultiDrawIndirect(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->multiDrawIndirect, jniLongToPointer(valueAddress), sizeof(o->multiDrawIndirect));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getDrawIndirectFirstInstance(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->drawIndirectFirstInstance));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setDrawIndirectFirstInstance(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->drawIndirectFirstInstance, jniLongToPointer(valueAddress), sizeof(o->drawIndirectFirstInstance));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getDepthClamp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->depthClamp));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setDepthClamp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->depthClamp, jniLongToPointer(valueAddress), sizeof(o->depthClamp));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getDepthBiasClamp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->depthBiasClamp));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setDepthBiasClamp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->depthBiasClamp, jniLongToPointer(valueAddress), sizeof(o->depthBiasClamp));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getFillModeNonSolid(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->fillModeNonSolid));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setFillModeNonSolid(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->fillModeNonSolid, jniLongToPointer(valueAddress), sizeof(o->fillModeNonSolid));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getDepthBounds(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->depthBounds));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setDepthBounds(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->depthBounds, jniLongToPointer(valueAddress), sizeof(o->depthBounds));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getWideLines(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->wideLines));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setWideLines(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->wideLines, jniLongToPointer(valueAddress), sizeof(o->wideLines));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getLargePoints(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->largePoints));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setLargePoints(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->largePoints, jniLongToPointer(valueAddress), sizeof(o->largePoints));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getAlphaToOne(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->alphaToOne));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setAlphaToOne(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->alphaToOne, jniLongToPointer(valueAddress), sizeof(o->alphaToOne));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getMultiViewport(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->multiViewport));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setMultiViewport(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->multiViewport, jniLongToPointer(valueAddress), sizeof(o->multiViewport));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getSamplerAnisotropy(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->samplerAnisotropy));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setSamplerAnisotropy(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->samplerAnisotropy, jniLongToPointer(valueAddress), sizeof(o->samplerAnisotropy));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getTextureCompressionETC2(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->textureCompressionETC2));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setTextureCompressionETC2(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->textureCompressionETC2, jniLongToPointer(valueAddress), sizeof(o->textureCompressionETC2));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getTextureCompressionASTC_LDR(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->textureCompressionASTC_LDR));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setTextureCompressionASTC_LDR(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->textureCompressionASTC_LDR, jniLongToPointer(valueAddress), sizeof(o->textureCompressionASTC_LDR));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getTextureCompressionBC(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->textureCompressionBC));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setTextureCompressionBC(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->textureCompressionBC, jniLongToPointer(valueAddress), sizeof(o->textureCompressionBC));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getOcclusionQueryPrecise(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->occlusionQueryPrecise));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setOcclusionQueryPrecise(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->occlusionQueryPrecise, jniLongToPointer(valueAddress), sizeof(o->occlusionQueryPrecise));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getPipelineStatisticsQuery(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pipelineStatisticsQuery));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setPipelineStatisticsQuery(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->pipelineStatisticsQuery, jniLongToPointer(valueAddress), sizeof(o->pipelineStatisticsQuery));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getVertexPipelineStoresAndAtomics(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->vertexPipelineStoresAndAtomics));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setVertexPipelineStoresAndAtomics(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->vertexPipelineStoresAndAtomics, jniLongToPointer(valueAddress), sizeof(o->vertexPipelineStoresAndAtomics));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getFragmentStoresAndAtomics(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->fragmentStoresAndAtomics));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setFragmentStoresAndAtomics(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->fragmentStoresAndAtomics, jniLongToPointer(valueAddress), sizeof(o->fragmentStoresAndAtomics));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getShaderTessellationAndGeometryPointSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderTessellationAndGeometryPointSize));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setShaderTessellationAndGeometryPointSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->shaderTessellationAndGeometryPointSize, jniLongToPointer(valueAddress), sizeof(o->shaderTessellationAndGeometryPointSize));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getShaderImageGatherExtended(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderImageGatherExtended));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setShaderImageGatherExtended(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->shaderImageGatherExtended, jniLongToPointer(valueAddress), sizeof(o->shaderImageGatherExtended));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getShaderStorageImageExtendedFormats(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderStorageImageExtendedFormats));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setShaderStorageImageExtendedFormats(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->shaderStorageImageExtendedFormats, jniLongToPointer(valueAddress), sizeof(o->shaderStorageImageExtendedFormats));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getShaderStorageImageMultisample(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderStorageImageMultisample));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setShaderStorageImageMultisample(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->shaderStorageImageMultisample, jniLongToPointer(valueAddress), sizeof(o->shaderStorageImageMultisample));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getShaderStorageImageReadWithoutFormat(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderStorageImageReadWithoutFormat));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setShaderStorageImageReadWithoutFormat(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->shaderStorageImageReadWithoutFormat, jniLongToPointer(valueAddress), sizeof(o->shaderStorageImageReadWithoutFormat));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getShaderStorageImageWriteWithoutFormat(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderStorageImageWriteWithoutFormat));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setShaderStorageImageWriteWithoutFormat(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->shaderStorageImageWriteWithoutFormat, jniLongToPointer(valueAddress), sizeof(o->shaderStorageImageWriteWithoutFormat));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getShaderUniformBufferArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderUniformBufferArrayDynamicIndexing));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setShaderUniformBufferArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->shaderUniformBufferArrayDynamicIndexing, jniLongToPointer(valueAddress), sizeof(o->shaderUniformBufferArrayDynamicIndexing));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getShaderSampledImageArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderSampledImageArrayDynamicIndexing));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setShaderSampledImageArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->shaderSampledImageArrayDynamicIndexing, jniLongToPointer(valueAddress), sizeof(o->shaderSampledImageArrayDynamicIndexing));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getShaderStorageBufferArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderStorageBufferArrayDynamicIndexing));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setShaderStorageBufferArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->shaderStorageBufferArrayDynamicIndexing, jniLongToPointer(valueAddress), sizeof(o->shaderStorageBufferArrayDynamicIndexing));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getShaderStorageImageArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderStorageImageArrayDynamicIndexing));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setShaderStorageImageArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->shaderStorageImageArrayDynamicIndexing, jniLongToPointer(valueAddress), sizeof(o->shaderStorageImageArrayDynamicIndexing));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getShaderClipDistance(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderClipDistance));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setShaderClipDistance(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->shaderClipDistance, jniLongToPointer(valueAddress), sizeof(o->shaderClipDistance));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getShaderCullDistance(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderCullDistance));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setShaderCullDistance(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->shaderCullDistance, jniLongToPointer(valueAddress), sizeof(o->shaderCullDistance));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getShaderFloat64(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderFloat64));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setShaderFloat64(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->shaderFloat64, jniLongToPointer(valueAddress), sizeof(o->shaderFloat64));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getShaderInt64(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderInt64));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setShaderInt64(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->shaderInt64, jniLongToPointer(valueAddress), sizeof(o->shaderInt64));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getShaderInt16(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderInt16));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setShaderInt16(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->shaderInt16, jniLongToPointer(valueAddress), sizeof(o->shaderInt16));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getShaderResourceResidency(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderResourceResidency));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setShaderResourceResidency(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->shaderResourceResidency, jniLongToPointer(valueAddress), sizeof(o->shaderResourceResidency));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getShaderResourceMinLod(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderResourceMinLod));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setShaderResourceMinLod(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->shaderResourceMinLod, jniLongToPointer(valueAddress), sizeof(o->shaderResourceMinLod));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getSparseBinding(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sparseBinding));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setSparseBinding(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->sparseBinding, jniLongToPointer(valueAddress), sizeof(o->sparseBinding));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getSparseResidencyBuffer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sparseResidencyBuffer));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setSparseResidencyBuffer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->sparseResidencyBuffer, jniLongToPointer(valueAddress), sizeof(o->sparseResidencyBuffer));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getSparseResidencyImage2D(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sparseResidencyImage2D));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setSparseResidencyImage2D(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->sparseResidencyImage2D, jniLongToPointer(valueAddress), sizeof(o->sparseResidencyImage2D));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getSparseResidencyImage3D(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sparseResidencyImage3D));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setSparseResidencyImage3D(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->sparseResidencyImage3D, jniLongToPointer(valueAddress), sizeof(o->sparseResidencyImage3D));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getSparseResidency2Samples(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sparseResidency2Samples));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setSparseResidency2Samples(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->sparseResidency2Samples, jniLongToPointer(valueAddress), sizeof(o->sparseResidency2Samples));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getSparseResidency4Samples(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sparseResidency4Samples));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setSparseResidency4Samples(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->sparseResidency4Samples, jniLongToPointer(valueAddress), sizeof(o->sparseResidency4Samples));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getSparseResidency8Samples(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sparseResidency8Samples));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setSparseResidency8Samples(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->sparseResidency8Samples, jniLongToPointer(valueAddress), sizeof(o->sparseResidency8Samples));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getSparseResidency16Samples(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sparseResidency16Samples));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setSparseResidency16Samples(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->sparseResidency16Samples, jniLongToPointer(valueAddress), sizeof(o->sparseResidency16Samples));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getSparseResidencyAliased(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sparseResidencyAliased));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setSparseResidencyAliased(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->sparseResidencyAliased, jniLongToPointer(valueAddress), sizeof(o->sparseResidencyAliased));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getVariableMultisampleRate(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->variableMultisampleRate));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setVariableMultisampleRate(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->variableMultisampleRate, jniLongToPointer(valueAddress), sizeof(o->variableMultisampleRate));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_getInheritedQueries(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->inheritedQueries));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceFeatures_setInheritedQueries(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceFeatures* o = (VkPhysicalDeviceFeatures*)jniLongToPointer(address);
    memcpy(&o->inheritedQueries, jniLongToPointer(valueAddress), sizeof(o->inheritedQueries));
}

