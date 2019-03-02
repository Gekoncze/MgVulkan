package cz.mg.vulkan.structures;

import cz.mg.vulkan.flags.*;
import cz.mg.vulkan.jna.structures.*;
import static cz.mg.vulkan.jna.Vk.*;


public class VulkanPhysicalDeviceLimits {
    public final VkPhysicalDeviceLimits structure;

    public VulkanPhysicalDeviceLimits() {
        this(new VkPhysicalDeviceLimits());
    }

    public VulkanPhysicalDeviceLimits(VkPhysicalDeviceLimits structure) {
        if(structure == null) throw new IllegalArgumentException();
        this.structure = structure;
    }

    public int getMaxImageDimension1D(){
        return structure.maxImageDimension1D.intValue();
    }

    public int getMaxImageDimension2D(){
        return structure.maxImageDimension2D.intValue();
    }

    public int getMaxImageDimension3D(){
        return structure.maxImageDimension3D.intValue();
    }

    public int getMaxImageDimensionCube(){
        return structure.maxImageDimensionCube.intValue();
    }

    public int getMaxImageArrayLayers(){
        return structure.maxImageArrayLayers.intValue();
    }

    public int getMaxTexelBufferElements(){
        return structure.maxTexelBufferElements.intValue();
    }

    public int getMaxUniformBufferRange(){
        return structure.maxUniformBufferRange.intValue();
    }

    public int getMaxStorageBufferRange(){
        return structure.maxStorageBufferRange.intValue();
    }

    public int getMaxPushConstantsSize(){
        return structure.maxPushConstantsSize.intValue();
    }

    public int getMaxMemoryAllocationCount(){
        return structure.maxMemoryAllocationCount.intValue();
    }

    public int getMaxSamplerAllocationCount(){
        return structure.maxSamplerAllocationCount.intValue();
    }

    public long getBufferImageGranularity(){
        return structure.bufferImageGranularity.longValue();
    }

    public long getSparseAddressSpaceSize(){
        return structure.sparseAddressSpaceSize.longValue();
    }

    public int getMaxBoundDescriptorSets(){
        return structure.maxBoundDescriptorSets.intValue();
    }

    public int getMaxPerStageDescriptorSamplers(){
        return structure.maxPerStageDescriptorSamplers.intValue();
    }

    public int getMaxPerStageDescriptorUniformBuffers(){
        return structure.maxPerStageDescriptorUniformBuffers.intValue();
    }

    public int getMaxPerStageDescriptorStorageBuffers(){
        return structure.maxPerStageDescriptorStorageBuffers.intValue();
    }

    public int getMaxPerStageDescriptorSampledImages(){
        return structure.maxPerStageDescriptorSampledImages.intValue();
    }

    public int getMaxPerStageDescriptorStorageImages(){
        return structure.maxPerStageDescriptorStorageImages.intValue();
    }

    public int getMaxPerStageDescriptorInputAttachments(){
        return structure.maxPerStageDescriptorInputAttachments.intValue();
    }

    public int getMaxPerStageResources(){
        return structure.maxPerStageResources.intValue();
    }

    public int getMaxDescriptorSetSamplers(){
        return structure.maxDescriptorSetSamplers.intValue();
    }

    public int getMaxDescriptorSetUniformBuffers(){
        return structure.maxDescriptorSetUniformBuffers.intValue();
    }

    public int getMaxDescriptorSetUniformBuffersDynamic(){
        return structure.maxDescriptorSetUniformBuffersDynamic.intValue();
    }

    public int getMaxDescriptorSetStorageBuffers(){
        return structure.maxDescriptorSetStorageBuffers.intValue();
    }

    public int getMaxDescriptorSetStorageBuffersDynamic(){
        return structure.maxDescriptorSetStorageBuffersDynamic.intValue();
    }

    public int getMaxDescriptorSetSampledImages(){
        return structure.maxDescriptorSetSampledImages.intValue();
    }

    public int getMaxDescriptorSetStorageImages(){
        return structure.maxDescriptorSetStorageImages.intValue();
    }

    public int getMaxDescriptorSetInputAttachments(){
        return structure.maxDescriptorSetInputAttachments.intValue();
    }

    public int getMaxVertexInputAttributes(){
        return structure.maxVertexInputAttributes.intValue();
    }

    public int getMaxVertexInputBindings(){
        return structure.maxVertexInputBindings.intValue();
    }

    public int getMaxVertexInputAttributeOffset(){
        return structure.maxVertexInputAttributeOffset.intValue();
    }

    public int getMaxVertexInputBindingStride(){
        return structure.maxVertexInputBindingStride.intValue();
    }

    public int getMaxVertexOutputComponents(){
        return structure.maxVertexOutputComponents.intValue();
    }

    public int getMaxTessellationGenerationLevel(){
        return structure.maxTessellationGenerationLevel.intValue();
    }

    public int getMaxTessellationPatchSize(){
        return structure.maxTessellationPatchSize.intValue();
    }

    public int getMaxTessellationControlPerVertexInputComponents(){
        return structure.maxTessellationControlPerVertexInputComponents.intValue();
    }

    public int getMaxTessellationControlPerVertexOutputComponents(){
        return structure.maxTessellationControlPerVertexOutputComponents.intValue();
    }

    public int getMaxTessellationControlPerPatchOutputComponents(){
        return structure.maxTessellationControlPerPatchOutputComponents.intValue();
    }

    public int getMaxTessellationControlTotalOutputComponents(){
        return structure.maxTessellationControlTotalOutputComponents.intValue();
    }

    public int getMaxTessellationEvaluationInputComponents(){
        return structure.maxTessellationEvaluationInputComponents.intValue();
    }

    public int getMaxTessellationEvaluationOutputComponents(){
        return structure.maxTessellationEvaluationOutputComponents.intValue();
    }

    public int getMaxGeometryShaderInvocations(){
        return structure.maxGeometryShaderInvocations.intValue();
    }

    public int getMaxGeometryInputComponents(){
        return structure.maxGeometryInputComponents.intValue();
    }

    public int getMaxGeometryOutputComponents(){
        return structure.maxGeometryOutputComponents.intValue();
    }

    public int getMaxGeometryOutputVertices(){
        return structure.maxGeometryOutputVertices.intValue();
    }

    public int getMaxGeometryTotalOutputComponents(){
        return structure.maxGeometryTotalOutputComponents.intValue();
    }

    public int getMaxFragmentInputComponents(){
        return structure.maxFragmentInputComponents.intValue();
    }

    public int getMaxFragmentOutputAttachments(){
        return structure.maxFragmentOutputAttachments.intValue();
    }

    public int getMaxFragmentDualSrcAttachments(){
        return structure.maxFragmentDualSrcAttachments.intValue();
    }

    public int getMaxFragmentCombinedOutputResources(){
        return structure.maxFragmentCombinedOutputResources.intValue();
    }

    public int getMaxComputeSharedMemorySize(){
        return structure.maxComputeSharedMemorySize.intValue();
    }

    public int[] getMaxComputeWorkGroupCount(){
        return new int[]{
                structure.maxComputeWorkGroupCount[0].intValue(),
                structure.maxComputeWorkGroupCount[1].intValue(),
                structure.maxComputeWorkGroupCount[2].intValue()
        };
    }

    public int getMaxComputeWorkGroupInvocations(){
        return structure.maxComputeWorkGroupInvocations.intValue();
    }

    public int[] getMaxComputeWorkGroupSize(){
        return new int[]{
                structure.maxComputeWorkGroupSize[0].intValue(),
                structure.maxComputeWorkGroupSize[1].intValue(),
                structure.maxComputeWorkGroupSize[2].intValue()
        };
    }

    public int getSubPixelPrecisionBits(){
        return structure.subPixelPrecisionBits.intValue();
    }

    public int getSubTexelPrecisionBits(){
        return structure.subTexelPrecisionBits.intValue();
    }

    public int getMipmapPrecisionBits(){
        return structure.mipmapPrecisionBits.intValue();
    }

    public int getMaxDrawIndexedIndexValue(){
        return structure.maxDrawIndexedIndexValue.intValue();
    }

    public int getMaxDrawIndirectCount(){
        return structure.maxDrawIndirectCount.intValue();
    }

    public float getMaxSamplerLodBias(){
        return structure.maxSamplerLodBias;
    }

    public float getMaxSamplerAnisotropy(){
        return structure.maxSamplerAnisotropy;
    }

    public int getMaxViewports(){
        return structure.maxViewports.intValue();
    }

    public int[] getMaxViewportDimensions(){
        return new int[]{
                structure.maxViewportDimensions[0].intValue(),
                structure.maxViewportDimensions[1].intValue()
        };
    }

    public float[] getViewportBoundsRange(){
        return structure.viewportBoundsRange;
    }

    public int getViewportSubPixelBits(){
        return structure.viewportSubPixelBits.intValue();
    }

    public long getMinMemoryMapAlignment(){
        return structure.minMemoryMapAlignment.longValue();
    }

    public long getMinTexelBufferOffsetAlignment(){
        return structure.minTexelBufferOffsetAlignment.longValue();
    }

    public long getMinUniformBufferOffsetAlignment(){
        return structure.minUniformBufferOffsetAlignment.longValue();
    }

    public long getMinStorageBufferOffsetAlignment(){
        return structure.minStorageBufferOffsetAlignment.longValue();
    }

    public int getMinTexelOffset(){
        return structure.minTexelOffset.intValue();
    }

    public int getMaxTexelOffset(){
        return structure.maxTexelOffset.intValue();
    }

    public int getMinTexelGatherOffset(){
        return structure.minTexelGatherOffset.intValue();
    }

    public int getMaxTexelGatherOffset(){
        return structure.maxTexelGatherOffset.intValue();
    }

    public float getMinInterpolationOffset(){
        return structure.minInterpolationOffset;
    }

    public float getMaxInterpolationOffset(){
        return structure.maxInterpolationOffset;
    }

    public int getSubPixelInterpolationOffsetBits(){
        return structure.subPixelInterpolationOffsetBits.intValue();
    }

    public int getMaxFramebufferWidth(){
        return structure.maxFramebufferWidth.intValue();
    }

    public int getMaxFramebufferHeight(){
        return structure.maxFramebufferHeight.intValue();
    }

    public int getMaxFramebufferLayers(){
        return structure.maxFramebufferLayers.intValue();
    }

    public VulkanSampleCountFlags getFramebufferColorSampleCounts(){
        return new VulkanSampleCountFlags(structure.framebufferColorSampleCounts);
    }

    public VulkanSampleCountFlags getFramebufferDepthSampleCounts(){
        return new VulkanSampleCountFlags(structure.framebufferDepthSampleCounts);
    }

    public VulkanSampleCountFlags getFramebufferStencilSampleCounts(){
        return new VulkanSampleCountFlags(structure.framebufferStencilSampleCounts);
    }

    public VulkanSampleCountFlags getFramebufferNoAttachmentsSampleCounts(){
        return new VulkanSampleCountFlags(structure.framebufferNoAttachmentsSampleCounts);
    }

    public int getMaxColorAttachments(){
        return structure.maxColorAttachments.intValue();
    }

    public VulkanSampleCountFlags getSampledImageColorSampleCounts(){
        return new VulkanSampleCountFlags(structure.sampledImageColorSampleCounts);
    }

    public VulkanSampleCountFlags getSampledImageIntegerSampleCounts(){
        return new VulkanSampleCountFlags(structure.sampledImageIntegerSampleCounts);
    }

    public VulkanSampleCountFlags getSampledImageDepthSampleCounts(){
        return new VulkanSampleCountFlags(structure.sampledImageDepthSampleCounts);
    }

    public VulkanSampleCountFlags getSampledImageStencilSampleCounts(){
        return new VulkanSampleCountFlags(structure.sampledImageStencilSampleCounts);
    }

    public VulkanSampleCountFlags getStorageImageSampleCounts(){
        return new VulkanSampleCountFlags(structure.storageImageSampleCounts);
    }

    public int getMaxSampleMaskWords(){
        return structure.maxSampleMaskWords.intValue();
    }

    public boolean isTimestampComputeAndGraphics(){
        return structure.timestampComputeAndGraphics.intValue() == VK_FALSE ? false : true;
    }

    public float getTimestampPeriod(){
        return structure.timestampPeriod;
    }

    public int getMaxClipDistances(){
        return structure.maxClipDistances.intValue();
    }

    public int getMaxCullDistances(){
        return structure.maxCullDistances.intValue();
    }

    public int getMaxCombinedClipAndCullDistances(){
        return structure.maxCombinedClipAndCullDistances.intValue();
    }

    public int getDiscreteQueuePriorities(){
        return structure.discreteQueuePriorities.intValue();
    }

    public float[] getPointSizeRange(){
        return structure.pointSizeRange;
    }

    public float[] getLineWidthRange(){
        return structure.lineWidthRange;
    }

    public float getPointSizeGranularity(){
        return structure.pointSizeGranularity;
    }

    public float getLineWidthGranularity(){
        return structure.lineWidthGranularity;
    }

    public boolean isStrictLines(){
        return structure.strictLines.intValue() == VK_FALSE ? false : true;
    }

    public boolean isStandardSampleLocations(){
        return structure.standardSampleLocations.intValue() == VK_FALSE ? false : true;
    }

    public long getOptimalBufferCopyOffsetAlignment(){
        return structure.optimalBufferCopyOffsetAlignment.longValue();
    }

    public long getOptimalBufferCopyRowPitchAlignment(){
        return structure.optimalBufferCopyRowPitchAlignment.longValue();
    }

    public long getNonCoherentAtomSize(){
        return structure.nonCoherentAtomSize.longValue();
    }
}
