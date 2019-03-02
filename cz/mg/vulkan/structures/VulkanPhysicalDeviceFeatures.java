package cz.mg.vulkan.structures;

import cz.mg.vulkan.jna.structures.*;
import static cz.mg.vulkan.jna.Vk.*;


public class VulkanPhysicalDeviceFeatures {
    public final VkPhysicalDeviceFeatures structure;

    public VulkanPhysicalDeviceFeatures() {
        structure = new VkPhysicalDeviceFeatures();
    }

    public VulkanPhysicalDeviceFeatures(VkPhysicalDeviceFeatures structure) {
        this.structure = structure;
    }

    public boolean isRobustBufferAccess(){
        return structure.robustBufferAccess.intValue() == VK_FALSE ? false : true;
    }

    public boolean isFullDrawIndexUint32(){
        return structure.fullDrawIndexUint32.intValue() == VK_FALSE ? false : true;
    }

    public boolean isImageCubeArray(){
        return structure.imageCubeArray.intValue() == VK_FALSE ? false : true;
    }

    public boolean isIndependentBlend(){
        return structure.independentBlend.intValue() == VK_FALSE ? false : true;
    }

    public boolean isGeometryShader(){
        return structure.geometryShader.intValue() == VK_FALSE ? false : true;
    }

    public boolean isTessellationShader(){
        return structure.tessellationShader.intValue() == VK_FALSE ? false : true;
    }

    public boolean isSampleRateShading(){
        return structure.sampleRateShading.intValue() == VK_FALSE ? false : true;
    }

    public boolean isDualSrcBlend(){
        return structure.dualSrcBlend.intValue() == VK_FALSE ? false : true;
    }

    public boolean isLogicOp(){
        return structure.logicOp.intValue() == VK_FALSE ? false : true;
    }

    public boolean isMultiDrawIndirect(){
        return structure.multiDrawIndirect.intValue() == VK_FALSE ? false : true;
    }

    public boolean isDrawIndirectFirstInstance(){
        return structure.drawIndirectFirstInstance.intValue() == VK_FALSE ? false : true;
    }

    public boolean isDepthClamp(){
        return structure.depthClamp.intValue() == VK_FALSE ? false : true;
    }

    public boolean isDepthBiasClamp(){
        return structure.depthBiasClamp.intValue() == VK_FALSE ? false : true;
    }

    public boolean isFillModeNonSolid(){
        return structure.fillModeNonSolid.intValue() == VK_FALSE ? false : true;
    }

    public boolean isDepthBounds(){
        return structure.depthBounds.intValue() == VK_FALSE ? false : true;
    }

    public boolean isWideLines(){
        return structure.wideLines.intValue() == VK_FALSE ? false : true;
    }

    public boolean isLargePoints(){
        return structure.largePoints.intValue() == VK_FALSE ? false : true;
    }

    public boolean isAlphaToOne(){
        return structure.alphaToOne.intValue() == VK_FALSE ? false : true;
    }

    public boolean isMultiViewport(){
        return structure.multiViewport.intValue() == VK_FALSE ? false : true;
    }

    public boolean isSamplerAnisotropy(){
        return structure.samplerAnisotropy.intValue() == VK_FALSE ? false : true;
    }

    public boolean isTextureCompressionETC2(){
        return structure.textureCompressionETC2.intValue() == VK_FALSE ? false : true;
    }

    public boolean isTextureCompressionASTC_LDR(){
        return structure.textureCompressionASTC_LDR.intValue() == VK_FALSE ? false : true;
    }

    public boolean isTextureCompressionBC(){
        return structure.textureCompressionBC.intValue() == VK_FALSE ? false : true;
    }

    public boolean isOcclusionQueryPrecise(){
        return structure.occlusionQueryPrecise.intValue() == VK_FALSE ? false : true;
    }

    public boolean isPipelineStatisticsQuery(){
        return structure.pipelineStatisticsQuery.intValue() == VK_FALSE ? false : true;
    }

    public boolean isVertexPipelineStoresAndAtomics(){
        return structure.vertexPipelineStoresAndAtomics.intValue() == VK_FALSE ? false : true;
    }

    public boolean isFragmentStoresAndAtomics(){
        return structure.fragmentStoresAndAtomics.intValue() == VK_FALSE ? false : true;
    }

    public boolean isShaderTessellationAndGeometryPointSize(){
        return structure.shaderTessellationAndGeometryPointSize.intValue() == VK_FALSE ? false : true;
    }

    public boolean isShaderImageGatherExtended(){
        return structure.shaderImageGatherExtended.intValue() == VK_FALSE ? false : true;
    }

    public boolean isShaderStorageImageExtendedFormats(){
        return structure.shaderStorageImageExtendedFormats.intValue() == VK_FALSE ? false : true;
    }

    public boolean isShaderStorageImageMultisample(){
        return structure.shaderStorageImageMultisample.intValue() == VK_FALSE ? false : true;
    }

    public boolean isShaderStorageImageReadWithoutFormat(){
        return structure.shaderStorageImageReadWithoutFormat.intValue() == VK_FALSE ? false : true;
    }

    public boolean isShaderStorageImageWriteWithoutFormat(){
        return structure.shaderStorageImageWriteWithoutFormat.intValue() == VK_FALSE ? false : true;
    }

    public boolean isShaderUniformBufferArrayDynamicIndexing(){
        return structure.shaderUniformBufferArrayDynamicIndexing.intValue() == VK_FALSE ? false : true;
    }

    public boolean isShaderSampledImageArrayDynamicIndexing(){
        return structure.shaderSampledImageArrayDynamicIndexing.intValue() == VK_FALSE ? false : true;
    }

    public boolean isShaderStorageBufferArrayDynamicIndexing(){
        return structure.shaderStorageBufferArrayDynamicIndexing.intValue() == VK_FALSE ? false : true;
    }

    public boolean isShaderStorageImageArrayDynamicIndexing(){
        return structure.shaderStorageImageArrayDynamicIndexing.intValue() == VK_FALSE ? false : true;
    }

    public boolean isShaderClipDistance(){
        return structure.shaderClipDistance.intValue() == VK_FALSE ? false : true;
    }

    public boolean isShaderCullDistance(){
        return structure.shaderCullDistance.intValue() == VK_FALSE ? false : true;
    }

    public boolean isShaderFloat64(){
        return structure.shaderFloat64.intValue() == VK_FALSE ? false : true;
    }

    public boolean isShaderInt64(){
        return structure.shaderInt64.intValue() == VK_FALSE ? false : true;
    }

    public boolean isShaderInt16(){
        return structure.shaderInt16.intValue() == VK_FALSE ? false : true;
    }

    public boolean isShaderResourceResidency(){
        return structure.shaderResourceResidency.intValue() == VK_FALSE ? false : true;
    }

    public boolean isShaderResourceMinLod(){
        return structure.shaderResourceMinLod.intValue() == VK_FALSE ? false : true;
    }

    public boolean isSparseBinding(){
        return structure.sparseBinding.intValue() == VK_FALSE ? false : true;
    }

    public boolean isSparseResidencyBuffer(){
        return structure.sparseResidencyBuffer.intValue() == VK_FALSE ? false : true;
    }

    public boolean isSparseResidencyImage2D(){
        return structure.sparseResidencyImage2D.intValue() == VK_FALSE ? false : true;
    }

    public boolean isSparseResidencyImage3D(){
        return structure.sparseResidencyImage3D.intValue() == VK_FALSE ? false : true;
    }

    public boolean isSparseResidency2Samples(){
        return structure.sparseResidency2Samples.intValue() == VK_FALSE ? false : true;
    }

    public boolean isSparseResidency4Samples(){
        return structure.sparseResidency4Samples.intValue() == VK_FALSE ? false : true;
    }

    public boolean isSparseResidency8Samples(){
        return structure.sparseResidency8Samples.intValue() == VK_FALSE ? false : true;
    }

    public boolean isSparseResidency16Samples(){
        return structure.sparseResidency16Samples.intValue() == VK_FALSE ? false : true;
    }

    public boolean isSparseResidencyAliased(){
        return structure.sparseResidencyAliased.intValue() == VK_FALSE ? false : true;
    }

    public boolean isVariableMultisampleRate(){
        return structure.variableMultisampleRate.intValue() == VK_FALSE ? false : true;
    }

    public boolean isInheritedQueries(){
        return structure.inheritedQueries.intValue() == VK_FALSE ? false : true;
    }
}
