package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceLimits extends VulkanObject {
    public VulkanPhysicalDeviceLimits(){
        super(new VkPhysicalDeviceLimits());
    }

    public VulkanPhysicalDeviceLimits(VkPhysicalDeviceLimits vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceLimits getVk(){
        return (VkPhysicalDeviceLimits) super.getVk();
    }

    public VulkanPhysicalDeviceLimits(VulkanUInt32 maxImageDimension1D, VulkanUInt32 maxImageDimension2D, VulkanUInt32 maxImageDimension3D, VulkanUInt32 maxImageDimensionCube, VulkanUInt32 maxImageArrayLayers, VulkanUInt32 maxTexelBufferElements, VulkanUInt32 maxUniformBufferRange, VulkanUInt32 maxStorageBufferRange, VulkanUInt32 maxPushConstantsSize, VulkanUInt32 maxMemoryAllocationCount, VulkanUInt32 maxSamplerAllocationCount, VulkanDeviceSize bufferImageGranularity, VulkanDeviceSize sparseAddressSpaceSize, VulkanUInt32 maxBoundDescriptorSets, VulkanUInt32 maxPerStageDescriptorSamplers, VulkanUInt32 maxPerStageDescriptorUniformBuffers, VulkanUInt32 maxPerStageDescriptorStorageBuffers, VulkanUInt32 maxPerStageDescriptorSampledImages, VulkanUInt32 maxPerStageDescriptorStorageImages, VulkanUInt32 maxPerStageDescriptorInputAttachments, VulkanUInt32 maxPerStageResources, VulkanUInt32 maxDescriptorSetSamplers, VulkanUInt32 maxDescriptorSetUniformBuffers, VulkanUInt32 maxDescriptorSetUniformBuffersDynamic, VulkanUInt32 maxDescriptorSetStorageBuffers, VulkanUInt32 maxDescriptorSetStorageBuffersDynamic, VulkanUInt32 maxDescriptorSetSampledImages, VulkanUInt32 maxDescriptorSetStorageImages, VulkanUInt32 maxDescriptorSetInputAttachments, VulkanUInt32 maxVertexInputAttributes, VulkanUInt32 maxVertexInputBindings, VulkanUInt32 maxVertexInputAttributeOffset, VulkanUInt32 maxVertexInputBindingStride, VulkanUInt32 maxVertexOutputComponents, VulkanUInt32 maxTessellationGenerationLevel, VulkanUInt32 maxTessellationPatchSize, VulkanUInt32 maxTessellationControlPerVertexInputComponents, VulkanUInt32 maxTessellationControlPerVertexOutputComponents, VulkanUInt32 maxTessellationControlPerPatchOutputComponents, VulkanUInt32 maxTessellationControlTotalOutputComponents, VulkanUInt32 maxTessellationEvaluationInputComponents, VulkanUInt32 maxTessellationEvaluationOutputComponents, VulkanUInt32 maxGeometryShaderInvocations, VulkanUInt32 maxGeometryInputComponents, VulkanUInt32 maxGeometryOutputComponents, VulkanUInt32 maxGeometryOutputVertices, VulkanUInt32 maxGeometryTotalOutputComponents, VulkanUInt32 maxFragmentInputComponents, VulkanUInt32 maxFragmentOutputAttachments, VulkanUInt32 maxFragmentDualSrcAttachments, VulkanUInt32 maxFragmentCombinedOutputResources, VulkanUInt32 maxComputeSharedMemorySize, VulkanUInt32 maxComputeWorkGroupCount, VulkanUInt32 maxComputeWorkGroupInvocations, VulkanUInt32 maxComputeWorkGroupSize, VulkanUInt32 subPixelPrecisionBits, VulkanUInt32 subTexelPrecisionBits, VulkanUInt32 mipmapPrecisionBits, VulkanUInt32 maxDrawIndexedIndexValue, VulkanUInt32 maxDrawIndirectCount, VulkanFloat maxSamplerLodBias, VulkanFloat maxSamplerAnisotropy, VulkanUInt32 maxViewports, VulkanUInt32 maxViewportDimensions, VulkanFloat viewportBoundsRange, VulkanUInt32 viewportSubPixelBits, VulkanSize minMemoryMapAlignment, VulkanDeviceSize minTexelBufferOffsetAlignment, VulkanDeviceSize minUniformBufferOffsetAlignment, VulkanDeviceSize minStorageBufferOffsetAlignment, VulkanInt32 minTexelOffset, VulkanUInt32 maxTexelOffset, VulkanInt32 minTexelGatherOffset, VulkanUInt32 maxTexelGatherOffset, VulkanFloat minInterpolationOffset, VulkanFloat maxInterpolationOffset, VulkanUInt32 subPixelInterpolationOffsetBits, VulkanUInt32 maxFramebufferWidth, VulkanUInt32 maxFramebufferHeight, VulkanUInt32 maxFramebufferLayers, VulkanSampleCountFlags framebufferColorSampleCounts, VulkanSampleCountFlags framebufferDepthSampleCounts, VulkanSampleCountFlags framebufferStencilSampleCounts, VulkanSampleCountFlags framebufferNoAttachmentsSampleCounts, VulkanUInt32 maxColorAttachments, VulkanSampleCountFlags sampledImageColorSampleCounts, VulkanSampleCountFlags sampledImageIntegerSampleCounts, VulkanSampleCountFlags sampledImageDepthSampleCounts, VulkanSampleCountFlags sampledImageStencilSampleCounts, VulkanSampleCountFlags storageImageSampleCounts, VulkanUInt32 maxSampleMaskWords, VulkanBool32 timestampComputeAndGraphics, VulkanFloat timestampPeriod, VulkanUInt32 maxClipDistances, VulkanUInt32 maxCullDistances, VulkanUInt32 maxCombinedClipAndCullDistances, VulkanUInt32 discreteQueuePriorities, VulkanFloat pointSizeRange, VulkanFloat lineWidthRange, VulkanFloat pointSizeGranularity, VulkanFloat lineWidthGranularity, VulkanBool32 strictLines, VulkanBool32 standardSampleLocations, VulkanDeviceSize optimalBufferCopyOffsetAlignment, VulkanDeviceSize optimalBufferCopyRowPitchAlignment, VulkanDeviceSize nonCoherentAtomSize) {
        super(new VkPhysicalDeviceLimits(maxImageDimension1D.getVk(), maxImageDimension2D.getVk(), maxImageDimension3D.getVk(), maxImageDimensionCube.getVk(), maxImageArrayLayers.getVk(), maxTexelBufferElements.getVk(), maxUniformBufferRange.getVk(), maxStorageBufferRange.getVk(), maxPushConstantsSize.getVk(), maxMemoryAllocationCount.getVk(), maxSamplerAllocationCount.getVk(), bufferImageGranularity.getVk(), sparseAddressSpaceSize.getVk(), maxBoundDescriptorSets.getVk(), maxPerStageDescriptorSamplers.getVk(), maxPerStageDescriptorUniformBuffers.getVk(), maxPerStageDescriptorStorageBuffers.getVk(), maxPerStageDescriptorSampledImages.getVk(), maxPerStageDescriptorStorageImages.getVk(), maxPerStageDescriptorInputAttachments.getVk(), maxPerStageResources.getVk(), maxDescriptorSetSamplers.getVk(), maxDescriptorSetUniformBuffers.getVk(), maxDescriptorSetUniformBuffersDynamic.getVk(), maxDescriptorSetStorageBuffers.getVk(), maxDescriptorSetStorageBuffersDynamic.getVk(), maxDescriptorSetSampledImages.getVk(), maxDescriptorSetStorageImages.getVk(), maxDescriptorSetInputAttachments.getVk(), maxVertexInputAttributes.getVk(), maxVertexInputBindings.getVk(), maxVertexInputAttributeOffset.getVk(), maxVertexInputBindingStride.getVk(), maxVertexOutputComponents.getVk(), maxTessellationGenerationLevel.getVk(), maxTessellationPatchSize.getVk(), maxTessellationControlPerVertexInputComponents.getVk(), maxTessellationControlPerVertexOutputComponents.getVk(), maxTessellationControlPerPatchOutputComponents.getVk(), maxTessellationControlTotalOutputComponents.getVk(), maxTessellationEvaluationInputComponents.getVk(), maxTessellationEvaluationOutputComponents.getVk(), maxGeometryShaderInvocations.getVk(), maxGeometryInputComponents.getVk(), maxGeometryOutputComponents.getVk(), maxGeometryOutputVertices.getVk(), maxGeometryTotalOutputComponents.getVk(), maxFragmentInputComponents.getVk(), maxFragmentOutputAttachments.getVk(), maxFragmentDualSrcAttachments.getVk(), maxFragmentCombinedOutputResources.getVk(), maxComputeSharedMemorySize.getVk(), maxComputeWorkGroupCount.getVk(), maxComputeWorkGroupInvocations.getVk(), maxComputeWorkGroupSize.getVk(), subPixelPrecisionBits.getVk(), subTexelPrecisionBits.getVk(), mipmapPrecisionBits.getVk(), maxDrawIndexedIndexValue.getVk(), maxDrawIndirectCount.getVk(), maxSamplerLodBias.getVk(), maxSamplerAnisotropy.getVk(), maxViewports.getVk(), maxViewportDimensions.getVk(), viewportBoundsRange.getVk(), viewportSubPixelBits.getVk(), minMemoryMapAlignment.getVk(), minTexelBufferOffsetAlignment.getVk(), minUniformBufferOffsetAlignment.getVk(), minStorageBufferOffsetAlignment.getVk(), minTexelOffset.getVk(), maxTexelOffset.getVk(), minTexelGatherOffset.getVk(), maxTexelGatherOffset.getVk(), minInterpolationOffset.getVk(), maxInterpolationOffset.getVk(), subPixelInterpolationOffsetBits.getVk(), maxFramebufferWidth.getVk(), maxFramebufferHeight.getVk(), maxFramebufferLayers.getVk(), framebufferColorSampleCounts.getVk(), framebufferDepthSampleCounts.getVk(), framebufferStencilSampleCounts.getVk(), framebufferNoAttachmentsSampleCounts.getVk(), maxColorAttachments.getVk(), sampledImageColorSampleCounts.getVk(), sampledImageIntegerSampleCounts.getVk(), sampledImageDepthSampleCounts.getVk(), sampledImageStencilSampleCounts.getVk(), storageImageSampleCounts.getVk(), maxSampleMaskWords.getVk(), timestampComputeAndGraphics.getVk(), timestampPeriod.getVk(), maxClipDistances.getVk(), maxCullDistances.getVk(), maxCombinedClipAndCullDistances.getVk(), discreteQueuePriorities.getVk(), pointSizeRange.getVk(), lineWidthRange.getVk(), pointSizeGranularity.getVk(), lineWidthGranularity.getVk(), strictLines.getVk(), standardSampleLocations.getVk(), optimalBufferCopyOffsetAlignment.getVk(), optimalBufferCopyRowPitchAlignment.getVk(), nonCoherentAtomSize.getVk()));
    }

    public VulkanUInt32 getMaxImageDimension1D() {
        return new VulkanUInt32(getVk().getMaxImageDimension1D());
    }

    public void setMaxImageDimension1D(VulkanUInt32 maxImageDimension1D) {
        getVk().setMaxImageDimension1D(maxImageDimension1D.getVk());
    }

    public VulkanUInt32 getMaxImageDimension2D() {
        return new VulkanUInt32(getVk().getMaxImageDimension2D());
    }

    public void setMaxImageDimension2D(VulkanUInt32 maxImageDimension2D) {
        getVk().setMaxImageDimension2D(maxImageDimension2D.getVk());
    }

    public VulkanUInt32 getMaxImageDimension3D() {
        return new VulkanUInt32(getVk().getMaxImageDimension3D());
    }

    public void setMaxImageDimension3D(VulkanUInt32 maxImageDimension3D) {
        getVk().setMaxImageDimension3D(maxImageDimension3D.getVk());
    }

    public VulkanUInt32 getMaxImageDimensionCube() {
        return new VulkanUInt32(getVk().getMaxImageDimensionCube());
    }

    public void setMaxImageDimensionCube(VulkanUInt32 maxImageDimensionCube) {
        getVk().setMaxImageDimensionCube(maxImageDimensionCube.getVk());
    }

    public VulkanUInt32 getMaxImageArrayLayers() {
        return new VulkanUInt32(getVk().getMaxImageArrayLayers());
    }

    public void setMaxImageArrayLayers(VulkanUInt32 maxImageArrayLayers) {
        getVk().setMaxImageArrayLayers(maxImageArrayLayers.getVk());
    }

    public VulkanUInt32 getMaxTexelBufferElements() {
        return new VulkanUInt32(getVk().getMaxTexelBufferElements());
    }

    public void setMaxTexelBufferElements(VulkanUInt32 maxTexelBufferElements) {
        getVk().setMaxTexelBufferElements(maxTexelBufferElements.getVk());
    }

    public VulkanUInt32 getMaxUniformBufferRange() {
        return new VulkanUInt32(getVk().getMaxUniformBufferRange());
    }

    public void setMaxUniformBufferRange(VulkanUInt32 maxUniformBufferRange) {
        getVk().setMaxUniformBufferRange(maxUniformBufferRange.getVk());
    }

    public VulkanUInt32 getMaxStorageBufferRange() {
        return new VulkanUInt32(getVk().getMaxStorageBufferRange());
    }

    public void setMaxStorageBufferRange(VulkanUInt32 maxStorageBufferRange) {
        getVk().setMaxStorageBufferRange(maxStorageBufferRange.getVk());
    }

    public VulkanUInt32 getMaxPushConstantsSize() {
        return new VulkanUInt32(getVk().getMaxPushConstantsSize());
    }

    public void setMaxPushConstantsSize(VulkanUInt32 maxPushConstantsSize) {
        getVk().setMaxPushConstantsSize(maxPushConstantsSize.getVk());
    }

    public VulkanUInt32 getMaxMemoryAllocationCount() {
        return new VulkanUInt32(getVk().getMaxMemoryAllocationCount());
    }

    public void setMaxMemoryAllocationCount(VulkanUInt32 maxMemoryAllocationCount) {
        getVk().setMaxMemoryAllocationCount(maxMemoryAllocationCount.getVk());
    }

    public VulkanUInt32 getMaxSamplerAllocationCount() {
        return new VulkanUInt32(getVk().getMaxSamplerAllocationCount());
    }

    public void setMaxSamplerAllocationCount(VulkanUInt32 maxSamplerAllocationCount) {
        getVk().setMaxSamplerAllocationCount(maxSamplerAllocationCount.getVk());
    }

    public VulkanDeviceSize getBufferImageGranularity() {
        return new VulkanDeviceSize(getVk().getBufferImageGranularity());
    }

    public void setBufferImageGranularity(VulkanDeviceSize bufferImageGranularity) {
        getVk().setBufferImageGranularity(bufferImageGranularity.getVk());
    }

    public VulkanDeviceSize getSparseAddressSpaceSize() {
        return new VulkanDeviceSize(getVk().getSparseAddressSpaceSize());
    }

    public void setSparseAddressSpaceSize(VulkanDeviceSize sparseAddressSpaceSize) {
        getVk().setSparseAddressSpaceSize(sparseAddressSpaceSize.getVk());
    }

    public VulkanUInt32 getMaxBoundDescriptorSets() {
        return new VulkanUInt32(getVk().getMaxBoundDescriptorSets());
    }

    public void setMaxBoundDescriptorSets(VulkanUInt32 maxBoundDescriptorSets) {
        getVk().setMaxBoundDescriptorSets(maxBoundDescriptorSets.getVk());
    }

    public VulkanUInt32 getMaxPerStageDescriptorSamplers() {
        return new VulkanUInt32(getVk().getMaxPerStageDescriptorSamplers());
    }

    public void setMaxPerStageDescriptorSamplers(VulkanUInt32 maxPerStageDescriptorSamplers) {
        getVk().setMaxPerStageDescriptorSamplers(maxPerStageDescriptorSamplers.getVk());
    }

    public VulkanUInt32 getMaxPerStageDescriptorUniformBuffers() {
        return new VulkanUInt32(getVk().getMaxPerStageDescriptorUniformBuffers());
    }

    public void setMaxPerStageDescriptorUniformBuffers(VulkanUInt32 maxPerStageDescriptorUniformBuffers) {
        getVk().setMaxPerStageDescriptorUniformBuffers(maxPerStageDescriptorUniformBuffers.getVk());
    }

    public VulkanUInt32 getMaxPerStageDescriptorStorageBuffers() {
        return new VulkanUInt32(getVk().getMaxPerStageDescriptorStorageBuffers());
    }

    public void setMaxPerStageDescriptorStorageBuffers(VulkanUInt32 maxPerStageDescriptorStorageBuffers) {
        getVk().setMaxPerStageDescriptorStorageBuffers(maxPerStageDescriptorStorageBuffers.getVk());
    }

    public VulkanUInt32 getMaxPerStageDescriptorSampledImages() {
        return new VulkanUInt32(getVk().getMaxPerStageDescriptorSampledImages());
    }

    public void setMaxPerStageDescriptorSampledImages(VulkanUInt32 maxPerStageDescriptorSampledImages) {
        getVk().setMaxPerStageDescriptorSampledImages(maxPerStageDescriptorSampledImages.getVk());
    }

    public VulkanUInt32 getMaxPerStageDescriptorStorageImages() {
        return new VulkanUInt32(getVk().getMaxPerStageDescriptorStorageImages());
    }

    public void setMaxPerStageDescriptorStorageImages(VulkanUInt32 maxPerStageDescriptorStorageImages) {
        getVk().setMaxPerStageDescriptorStorageImages(maxPerStageDescriptorStorageImages.getVk());
    }

    public VulkanUInt32 getMaxPerStageDescriptorInputAttachments() {
        return new VulkanUInt32(getVk().getMaxPerStageDescriptorInputAttachments());
    }

    public void setMaxPerStageDescriptorInputAttachments(VulkanUInt32 maxPerStageDescriptorInputAttachments) {
        getVk().setMaxPerStageDescriptorInputAttachments(maxPerStageDescriptorInputAttachments.getVk());
    }

    public VulkanUInt32 getMaxPerStageResources() {
        return new VulkanUInt32(getVk().getMaxPerStageResources());
    }

    public void setMaxPerStageResources(VulkanUInt32 maxPerStageResources) {
        getVk().setMaxPerStageResources(maxPerStageResources.getVk());
    }

    public VulkanUInt32 getMaxDescriptorSetSamplers() {
        return new VulkanUInt32(getVk().getMaxDescriptorSetSamplers());
    }

    public void setMaxDescriptorSetSamplers(VulkanUInt32 maxDescriptorSetSamplers) {
        getVk().setMaxDescriptorSetSamplers(maxDescriptorSetSamplers.getVk());
    }

    public VulkanUInt32 getMaxDescriptorSetUniformBuffers() {
        return new VulkanUInt32(getVk().getMaxDescriptorSetUniformBuffers());
    }

    public void setMaxDescriptorSetUniformBuffers(VulkanUInt32 maxDescriptorSetUniformBuffers) {
        getVk().setMaxDescriptorSetUniformBuffers(maxDescriptorSetUniformBuffers.getVk());
    }

    public VulkanUInt32 getMaxDescriptorSetUniformBuffersDynamic() {
        return new VulkanUInt32(getVk().getMaxDescriptorSetUniformBuffersDynamic());
    }

    public void setMaxDescriptorSetUniformBuffersDynamic(VulkanUInt32 maxDescriptorSetUniformBuffersDynamic) {
        getVk().setMaxDescriptorSetUniformBuffersDynamic(maxDescriptorSetUniformBuffersDynamic.getVk());
    }

    public VulkanUInt32 getMaxDescriptorSetStorageBuffers() {
        return new VulkanUInt32(getVk().getMaxDescriptorSetStorageBuffers());
    }

    public void setMaxDescriptorSetStorageBuffers(VulkanUInt32 maxDescriptorSetStorageBuffers) {
        getVk().setMaxDescriptorSetStorageBuffers(maxDescriptorSetStorageBuffers.getVk());
    }

    public VulkanUInt32 getMaxDescriptorSetStorageBuffersDynamic() {
        return new VulkanUInt32(getVk().getMaxDescriptorSetStorageBuffersDynamic());
    }

    public void setMaxDescriptorSetStorageBuffersDynamic(VulkanUInt32 maxDescriptorSetStorageBuffersDynamic) {
        getVk().setMaxDescriptorSetStorageBuffersDynamic(maxDescriptorSetStorageBuffersDynamic.getVk());
    }

    public VulkanUInt32 getMaxDescriptorSetSampledImages() {
        return new VulkanUInt32(getVk().getMaxDescriptorSetSampledImages());
    }

    public void setMaxDescriptorSetSampledImages(VulkanUInt32 maxDescriptorSetSampledImages) {
        getVk().setMaxDescriptorSetSampledImages(maxDescriptorSetSampledImages.getVk());
    }

    public VulkanUInt32 getMaxDescriptorSetStorageImages() {
        return new VulkanUInt32(getVk().getMaxDescriptorSetStorageImages());
    }

    public void setMaxDescriptorSetStorageImages(VulkanUInt32 maxDescriptorSetStorageImages) {
        getVk().setMaxDescriptorSetStorageImages(maxDescriptorSetStorageImages.getVk());
    }

    public VulkanUInt32 getMaxDescriptorSetInputAttachments() {
        return new VulkanUInt32(getVk().getMaxDescriptorSetInputAttachments());
    }

    public void setMaxDescriptorSetInputAttachments(VulkanUInt32 maxDescriptorSetInputAttachments) {
        getVk().setMaxDescriptorSetInputAttachments(maxDescriptorSetInputAttachments.getVk());
    }

    public VulkanUInt32 getMaxVertexInputAttributes() {
        return new VulkanUInt32(getVk().getMaxVertexInputAttributes());
    }

    public void setMaxVertexInputAttributes(VulkanUInt32 maxVertexInputAttributes) {
        getVk().setMaxVertexInputAttributes(maxVertexInputAttributes.getVk());
    }

    public VulkanUInt32 getMaxVertexInputBindings() {
        return new VulkanUInt32(getVk().getMaxVertexInputBindings());
    }

    public void setMaxVertexInputBindings(VulkanUInt32 maxVertexInputBindings) {
        getVk().setMaxVertexInputBindings(maxVertexInputBindings.getVk());
    }

    public VulkanUInt32 getMaxVertexInputAttributeOffset() {
        return new VulkanUInt32(getVk().getMaxVertexInputAttributeOffset());
    }

    public void setMaxVertexInputAttributeOffset(VulkanUInt32 maxVertexInputAttributeOffset) {
        getVk().setMaxVertexInputAttributeOffset(maxVertexInputAttributeOffset.getVk());
    }

    public VulkanUInt32 getMaxVertexInputBindingStride() {
        return new VulkanUInt32(getVk().getMaxVertexInputBindingStride());
    }

    public void setMaxVertexInputBindingStride(VulkanUInt32 maxVertexInputBindingStride) {
        getVk().setMaxVertexInputBindingStride(maxVertexInputBindingStride.getVk());
    }

    public VulkanUInt32 getMaxVertexOutputComponents() {
        return new VulkanUInt32(getVk().getMaxVertexOutputComponents());
    }

    public void setMaxVertexOutputComponents(VulkanUInt32 maxVertexOutputComponents) {
        getVk().setMaxVertexOutputComponents(maxVertexOutputComponents.getVk());
    }

    public VulkanUInt32 getMaxTessellationGenerationLevel() {
        return new VulkanUInt32(getVk().getMaxTessellationGenerationLevel());
    }

    public void setMaxTessellationGenerationLevel(VulkanUInt32 maxTessellationGenerationLevel) {
        getVk().setMaxTessellationGenerationLevel(maxTessellationGenerationLevel.getVk());
    }

    public VulkanUInt32 getMaxTessellationPatchSize() {
        return new VulkanUInt32(getVk().getMaxTessellationPatchSize());
    }

    public void setMaxTessellationPatchSize(VulkanUInt32 maxTessellationPatchSize) {
        getVk().setMaxTessellationPatchSize(maxTessellationPatchSize.getVk());
    }

    public VulkanUInt32 getMaxTessellationControlPerVertexInputComponents() {
        return new VulkanUInt32(getVk().getMaxTessellationControlPerVertexInputComponents());
    }

    public void setMaxTessellationControlPerVertexInputComponents(VulkanUInt32 maxTessellationControlPerVertexInputComponents) {
        getVk().setMaxTessellationControlPerVertexInputComponents(maxTessellationControlPerVertexInputComponents.getVk());
    }

    public VulkanUInt32 getMaxTessellationControlPerVertexOutputComponents() {
        return new VulkanUInt32(getVk().getMaxTessellationControlPerVertexOutputComponents());
    }

    public void setMaxTessellationControlPerVertexOutputComponents(VulkanUInt32 maxTessellationControlPerVertexOutputComponents) {
        getVk().setMaxTessellationControlPerVertexOutputComponents(maxTessellationControlPerVertexOutputComponents.getVk());
    }

    public VulkanUInt32 getMaxTessellationControlPerPatchOutputComponents() {
        return new VulkanUInt32(getVk().getMaxTessellationControlPerPatchOutputComponents());
    }

    public void setMaxTessellationControlPerPatchOutputComponents(VulkanUInt32 maxTessellationControlPerPatchOutputComponents) {
        getVk().setMaxTessellationControlPerPatchOutputComponents(maxTessellationControlPerPatchOutputComponents.getVk());
    }

    public VulkanUInt32 getMaxTessellationControlTotalOutputComponents() {
        return new VulkanUInt32(getVk().getMaxTessellationControlTotalOutputComponents());
    }

    public void setMaxTessellationControlTotalOutputComponents(VulkanUInt32 maxTessellationControlTotalOutputComponents) {
        getVk().setMaxTessellationControlTotalOutputComponents(maxTessellationControlTotalOutputComponents.getVk());
    }

    public VulkanUInt32 getMaxTessellationEvaluationInputComponents() {
        return new VulkanUInt32(getVk().getMaxTessellationEvaluationInputComponents());
    }

    public void setMaxTessellationEvaluationInputComponents(VulkanUInt32 maxTessellationEvaluationInputComponents) {
        getVk().setMaxTessellationEvaluationInputComponents(maxTessellationEvaluationInputComponents.getVk());
    }

    public VulkanUInt32 getMaxTessellationEvaluationOutputComponents() {
        return new VulkanUInt32(getVk().getMaxTessellationEvaluationOutputComponents());
    }

    public void setMaxTessellationEvaluationOutputComponents(VulkanUInt32 maxTessellationEvaluationOutputComponents) {
        getVk().setMaxTessellationEvaluationOutputComponents(maxTessellationEvaluationOutputComponents.getVk());
    }

    public VulkanUInt32 getMaxGeometryShaderInvocations() {
        return new VulkanUInt32(getVk().getMaxGeometryShaderInvocations());
    }

    public void setMaxGeometryShaderInvocations(VulkanUInt32 maxGeometryShaderInvocations) {
        getVk().setMaxGeometryShaderInvocations(maxGeometryShaderInvocations.getVk());
    }

    public VulkanUInt32 getMaxGeometryInputComponents() {
        return new VulkanUInt32(getVk().getMaxGeometryInputComponents());
    }

    public void setMaxGeometryInputComponents(VulkanUInt32 maxGeometryInputComponents) {
        getVk().setMaxGeometryInputComponents(maxGeometryInputComponents.getVk());
    }

    public VulkanUInt32 getMaxGeometryOutputComponents() {
        return new VulkanUInt32(getVk().getMaxGeometryOutputComponents());
    }

    public void setMaxGeometryOutputComponents(VulkanUInt32 maxGeometryOutputComponents) {
        getVk().setMaxGeometryOutputComponents(maxGeometryOutputComponents.getVk());
    }

    public VulkanUInt32 getMaxGeometryOutputVertices() {
        return new VulkanUInt32(getVk().getMaxGeometryOutputVertices());
    }

    public void setMaxGeometryOutputVertices(VulkanUInt32 maxGeometryOutputVertices) {
        getVk().setMaxGeometryOutputVertices(maxGeometryOutputVertices.getVk());
    }

    public VulkanUInt32 getMaxGeometryTotalOutputComponents() {
        return new VulkanUInt32(getVk().getMaxGeometryTotalOutputComponents());
    }

    public void setMaxGeometryTotalOutputComponents(VulkanUInt32 maxGeometryTotalOutputComponents) {
        getVk().setMaxGeometryTotalOutputComponents(maxGeometryTotalOutputComponents.getVk());
    }

    public VulkanUInt32 getMaxFragmentInputComponents() {
        return new VulkanUInt32(getVk().getMaxFragmentInputComponents());
    }

    public void setMaxFragmentInputComponents(VulkanUInt32 maxFragmentInputComponents) {
        getVk().setMaxFragmentInputComponents(maxFragmentInputComponents.getVk());
    }

    public VulkanUInt32 getMaxFragmentOutputAttachments() {
        return new VulkanUInt32(getVk().getMaxFragmentOutputAttachments());
    }

    public void setMaxFragmentOutputAttachments(VulkanUInt32 maxFragmentOutputAttachments) {
        getVk().setMaxFragmentOutputAttachments(maxFragmentOutputAttachments.getVk());
    }

    public VulkanUInt32 getMaxFragmentDualSrcAttachments() {
        return new VulkanUInt32(getVk().getMaxFragmentDualSrcAttachments());
    }

    public void setMaxFragmentDualSrcAttachments(VulkanUInt32 maxFragmentDualSrcAttachments) {
        getVk().setMaxFragmentDualSrcAttachments(maxFragmentDualSrcAttachments.getVk());
    }

    public VulkanUInt32 getMaxFragmentCombinedOutputResources() {
        return new VulkanUInt32(getVk().getMaxFragmentCombinedOutputResources());
    }

    public void setMaxFragmentCombinedOutputResources(VulkanUInt32 maxFragmentCombinedOutputResources) {
        getVk().setMaxFragmentCombinedOutputResources(maxFragmentCombinedOutputResources.getVk());
    }

    public VulkanUInt32 getMaxComputeSharedMemorySize() {
        return new VulkanUInt32(getVk().getMaxComputeSharedMemorySize());
    }

    public void setMaxComputeSharedMemorySize(VulkanUInt32 maxComputeSharedMemorySize) {
        getVk().setMaxComputeSharedMemorySize(maxComputeSharedMemorySize.getVk());
    }

    public VulkanUInt32 getMaxComputeWorkGroupCount() {
        return new VulkanUInt32(getVk().getMaxComputeWorkGroupCount());
    }

    public void setMaxComputeWorkGroupCount(VulkanUInt32 maxComputeWorkGroupCount) {
        getVk().setMaxComputeWorkGroupCount(maxComputeWorkGroupCount.getVk());
    }

    public VulkanUInt32 getMaxComputeWorkGroupInvocations() {
        return new VulkanUInt32(getVk().getMaxComputeWorkGroupInvocations());
    }

    public void setMaxComputeWorkGroupInvocations(VulkanUInt32 maxComputeWorkGroupInvocations) {
        getVk().setMaxComputeWorkGroupInvocations(maxComputeWorkGroupInvocations.getVk());
    }

    public VulkanUInt32 getMaxComputeWorkGroupSize() {
        return new VulkanUInt32(getVk().getMaxComputeWorkGroupSize());
    }

    public void setMaxComputeWorkGroupSize(VulkanUInt32 maxComputeWorkGroupSize) {
        getVk().setMaxComputeWorkGroupSize(maxComputeWorkGroupSize.getVk());
    }

    public VulkanUInt32 getSubPixelPrecisionBits() {
        return new VulkanUInt32(getVk().getSubPixelPrecisionBits());
    }

    public void setSubPixelPrecisionBits(VulkanUInt32 subPixelPrecisionBits) {
        getVk().setSubPixelPrecisionBits(subPixelPrecisionBits.getVk());
    }

    public VulkanUInt32 getSubTexelPrecisionBits() {
        return new VulkanUInt32(getVk().getSubTexelPrecisionBits());
    }

    public void setSubTexelPrecisionBits(VulkanUInt32 subTexelPrecisionBits) {
        getVk().setSubTexelPrecisionBits(subTexelPrecisionBits.getVk());
    }

    public VulkanUInt32 getMipmapPrecisionBits() {
        return new VulkanUInt32(getVk().getMipmapPrecisionBits());
    }

    public void setMipmapPrecisionBits(VulkanUInt32 mipmapPrecisionBits) {
        getVk().setMipmapPrecisionBits(mipmapPrecisionBits.getVk());
    }

    public VulkanUInt32 getMaxDrawIndexedIndexValue() {
        return new VulkanUInt32(getVk().getMaxDrawIndexedIndexValue());
    }

    public void setMaxDrawIndexedIndexValue(VulkanUInt32 maxDrawIndexedIndexValue) {
        getVk().setMaxDrawIndexedIndexValue(maxDrawIndexedIndexValue.getVk());
    }

    public VulkanUInt32 getMaxDrawIndirectCount() {
        return new VulkanUInt32(getVk().getMaxDrawIndirectCount());
    }

    public void setMaxDrawIndirectCount(VulkanUInt32 maxDrawIndirectCount) {
        getVk().setMaxDrawIndirectCount(maxDrawIndirectCount.getVk());
    }

    public VulkanFloat getMaxSamplerLodBias() {
        return new VulkanFloat(getVk().getMaxSamplerLodBias());
    }

    public void setMaxSamplerLodBias(VulkanFloat maxSamplerLodBias) {
        getVk().setMaxSamplerLodBias(maxSamplerLodBias.getVk());
    }

    public VulkanFloat getMaxSamplerAnisotropy() {
        return new VulkanFloat(getVk().getMaxSamplerAnisotropy());
    }

    public void setMaxSamplerAnisotropy(VulkanFloat maxSamplerAnisotropy) {
        getVk().setMaxSamplerAnisotropy(maxSamplerAnisotropy.getVk());
    }

    public VulkanUInt32 getMaxViewports() {
        return new VulkanUInt32(getVk().getMaxViewports());
    }

    public void setMaxViewports(VulkanUInt32 maxViewports) {
        getVk().setMaxViewports(maxViewports.getVk());
    }

    public VulkanUInt32 getMaxViewportDimensions() {
        return new VulkanUInt32(getVk().getMaxViewportDimensions());
    }

    public void setMaxViewportDimensions(VulkanUInt32 maxViewportDimensions) {
        getVk().setMaxViewportDimensions(maxViewportDimensions.getVk());
    }

    public VulkanFloat getViewportBoundsRange() {
        return new VulkanFloat(getVk().getViewportBoundsRange());
    }

    public void setViewportBoundsRange(VulkanFloat viewportBoundsRange) {
        getVk().setViewportBoundsRange(viewportBoundsRange.getVk());
    }

    public VulkanUInt32 getViewportSubPixelBits() {
        return new VulkanUInt32(getVk().getViewportSubPixelBits());
    }

    public void setViewportSubPixelBits(VulkanUInt32 viewportSubPixelBits) {
        getVk().setViewportSubPixelBits(viewportSubPixelBits.getVk());
    }

    public VulkanSize getMinMemoryMapAlignment() {
        return new VulkanSize(getVk().getMinMemoryMapAlignment());
    }

    public void setMinMemoryMapAlignment(VulkanSize minMemoryMapAlignment) {
        getVk().setMinMemoryMapAlignment(minMemoryMapAlignment.getVk());
    }

    public VulkanDeviceSize getMinTexelBufferOffsetAlignment() {
        return new VulkanDeviceSize(getVk().getMinTexelBufferOffsetAlignment());
    }

    public void setMinTexelBufferOffsetAlignment(VulkanDeviceSize minTexelBufferOffsetAlignment) {
        getVk().setMinTexelBufferOffsetAlignment(minTexelBufferOffsetAlignment.getVk());
    }

    public VulkanDeviceSize getMinUniformBufferOffsetAlignment() {
        return new VulkanDeviceSize(getVk().getMinUniformBufferOffsetAlignment());
    }

    public void setMinUniformBufferOffsetAlignment(VulkanDeviceSize minUniformBufferOffsetAlignment) {
        getVk().setMinUniformBufferOffsetAlignment(minUniformBufferOffsetAlignment.getVk());
    }

    public VulkanDeviceSize getMinStorageBufferOffsetAlignment() {
        return new VulkanDeviceSize(getVk().getMinStorageBufferOffsetAlignment());
    }

    public void setMinStorageBufferOffsetAlignment(VulkanDeviceSize minStorageBufferOffsetAlignment) {
        getVk().setMinStorageBufferOffsetAlignment(minStorageBufferOffsetAlignment.getVk());
    }

    public VulkanInt32 getMinTexelOffset() {
        return new VulkanInt32(getVk().getMinTexelOffset());
    }

    public void setMinTexelOffset(VulkanInt32 minTexelOffset) {
        getVk().setMinTexelOffset(minTexelOffset.getVk());
    }

    public VulkanUInt32 getMaxTexelOffset() {
        return new VulkanUInt32(getVk().getMaxTexelOffset());
    }

    public void setMaxTexelOffset(VulkanUInt32 maxTexelOffset) {
        getVk().setMaxTexelOffset(maxTexelOffset.getVk());
    }

    public VulkanInt32 getMinTexelGatherOffset() {
        return new VulkanInt32(getVk().getMinTexelGatherOffset());
    }

    public void setMinTexelGatherOffset(VulkanInt32 minTexelGatherOffset) {
        getVk().setMinTexelGatherOffset(minTexelGatherOffset.getVk());
    }

    public VulkanUInt32 getMaxTexelGatherOffset() {
        return new VulkanUInt32(getVk().getMaxTexelGatherOffset());
    }

    public void setMaxTexelGatherOffset(VulkanUInt32 maxTexelGatherOffset) {
        getVk().setMaxTexelGatherOffset(maxTexelGatherOffset.getVk());
    }

    public VulkanFloat getMinInterpolationOffset() {
        return new VulkanFloat(getVk().getMinInterpolationOffset());
    }

    public void setMinInterpolationOffset(VulkanFloat minInterpolationOffset) {
        getVk().setMinInterpolationOffset(minInterpolationOffset.getVk());
    }

    public VulkanFloat getMaxInterpolationOffset() {
        return new VulkanFloat(getVk().getMaxInterpolationOffset());
    }

    public void setMaxInterpolationOffset(VulkanFloat maxInterpolationOffset) {
        getVk().setMaxInterpolationOffset(maxInterpolationOffset.getVk());
    }

    public VulkanUInt32 getSubPixelInterpolationOffsetBits() {
        return new VulkanUInt32(getVk().getSubPixelInterpolationOffsetBits());
    }

    public void setSubPixelInterpolationOffsetBits(VulkanUInt32 subPixelInterpolationOffsetBits) {
        getVk().setSubPixelInterpolationOffsetBits(subPixelInterpolationOffsetBits.getVk());
    }

    public VulkanUInt32 getMaxFramebufferWidth() {
        return new VulkanUInt32(getVk().getMaxFramebufferWidth());
    }

    public void setMaxFramebufferWidth(VulkanUInt32 maxFramebufferWidth) {
        getVk().setMaxFramebufferWidth(maxFramebufferWidth.getVk());
    }

    public VulkanUInt32 getMaxFramebufferHeight() {
        return new VulkanUInt32(getVk().getMaxFramebufferHeight());
    }

    public void setMaxFramebufferHeight(VulkanUInt32 maxFramebufferHeight) {
        getVk().setMaxFramebufferHeight(maxFramebufferHeight.getVk());
    }

    public VulkanUInt32 getMaxFramebufferLayers() {
        return new VulkanUInt32(getVk().getMaxFramebufferLayers());
    }

    public void setMaxFramebufferLayers(VulkanUInt32 maxFramebufferLayers) {
        getVk().setMaxFramebufferLayers(maxFramebufferLayers.getVk());
    }

    public VulkanSampleCountFlags getFramebufferColorSampleCounts() {
        return new VulkanSampleCountFlags(getVk().getFramebufferColorSampleCounts());
    }

    public void setFramebufferColorSampleCounts(VulkanSampleCountFlags framebufferColorSampleCounts) {
        getVk().setFramebufferColorSampleCounts(framebufferColorSampleCounts.getVk());
    }

    public VulkanSampleCountFlags getFramebufferDepthSampleCounts() {
        return new VulkanSampleCountFlags(getVk().getFramebufferDepthSampleCounts());
    }

    public void setFramebufferDepthSampleCounts(VulkanSampleCountFlags framebufferDepthSampleCounts) {
        getVk().setFramebufferDepthSampleCounts(framebufferDepthSampleCounts.getVk());
    }

    public VulkanSampleCountFlags getFramebufferStencilSampleCounts() {
        return new VulkanSampleCountFlags(getVk().getFramebufferStencilSampleCounts());
    }

    public void setFramebufferStencilSampleCounts(VulkanSampleCountFlags framebufferStencilSampleCounts) {
        getVk().setFramebufferStencilSampleCounts(framebufferStencilSampleCounts.getVk());
    }

    public VulkanSampleCountFlags getFramebufferNoAttachmentsSampleCounts() {
        return new VulkanSampleCountFlags(getVk().getFramebufferNoAttachmentsSampleCounts());
    }

    public void setFramebufferNoAttachmentsSampleCounts(VulkanSampleCountFlags framebufferNoAttachmentsSampleCounts) {
        getVk().setFramebufferNoAttachmentsSampleCounts(framebufferNoAttachmentsSampleCounts.getVk());
    }

    public VulkanUInt32 getMaxColorAttachments() {
        return new VulkanUInt32(getVk().getMaxColorAttachments());
    }

    public void setMaxColorAttachments(VulkanUInt32 maxColorAttachments) {
        getVk().setMaxColorAttachments(maxColorAttachments.getVk());
    }

    public VulkanSampleCountFlags getSampledImageColorSampleCounts() {
        return new VulkanSampleCountFlags(getVk().getSampledImageColorSampleCounts());
    }

    public void setSampledImageColorSampleCounts(VulkanSampleCountFlags sampledImageColorSampleCounts) {
        getVk().setSampledImageColorSampleCounts(sampledImageColorSampleCounts.getVk());
    }

    public VulkanSampleCountFlags getSampledImageIntegerSampleCounts() {
        return new VulkanSampleCountFlags(getVk().getSampledImageIntegerSampleCounts());
    }

    public void setSampledImageIntegerSampleCounts(VulkanSampleCountFlags sampledImageIntegerSampleCounts) {
        getVk().setSampledImageIntegerSampleCounts(sampledImageIntegerSampleCounts.getVk());
    }

    public VulkanSampleCountFlags getSampledImageDepthSampleCounts() {
        return new VulkanSampleCountFlags(getVk().getSampledImageDepthSampleCounts());
    }

    public void setSampledImageDepthSampleCounts(VulkanSampleCountFlags sampledImageDepthSampleCounts) {
        getVk().setSampledImageDepthSampleCounts(sampledImageDepthSampleCounts.getVk());
    }

    public VulkanSampleCountFlags getSampledImageStencilSampleCounts() {
        return new VulkanSampleCountFlags(getVk().getSampledImageStencilSampleCounts());
    }

    public void setSampledImageStencilSampleCounts(VulkanSampleCountFlags sampledImageStencilSampleCounts) {
        getVk().setSampledImageStencilSampleCounts(sampledImageStencilSampleCounts.getVk());
    }

    public VulkanSampleCountFlags getStorageImageSampleCounts() {
        return new VulkanSampleCountFlags(getVk().getStorageImageSampleCounts());
    }

    public void setStorageImageSampleCounts(VulkanSampleCountFlags storageImageSampleCounts) {
        getVk().setStorageImageSampleCounts(storageImageSampleCounts.getVk());
    }

    public VulkanUInt32 getMaxSampleMaskWords() {
        return new VulkanUInt32(getVk().getMaxSampleMaskWords());
    }

    public void setMaxSampleMaskWords(VulkanUInt32 maxSampleMaskWords) {
        getVk().setMaxSampleMaskWords(maxSampleMaskWords.getVk());
    }

    public VulkanBool32 getTimestampComputeAndGraphics() {
        return new VulkanBool32(getVk().getTimestampComputeAndGraphics());
    }

    public void setTimestampComputeAndGraphics(VulkanBool32 timestampComputeAndGraphics) {
        getVk().setTimestampComputeAndGraphics(timestampComputeAndGraphics.getVk());
    }

    public VulkanFloat getTimestampPeriod() {
        return new VulkanFloat(getVk().getTimestampPeriod());
    }

    public void setTimestampPeriod(VulkanFloat timestampPeriod) {
        getVk().setTimestampPeriod(timestampPeriod.getVk());
    }

    public VulkanUInt32 getMaxClipDistances() {
        return new VulkanUInt32(getVk().getMaxClipDistances());
    }

    public void setMaxClipDistances(VulkanUInt32 maxClipDistances) {
        getVk().setMaxClipDistances(maxClipDistances.getVk());
    }

    public VulkanUInt32 getMaxCullDistances() {
        return new VulkanUInt32(getVk().getMaxCullDistances());
    }

    public void setMaxCullDistances(VulkanUInt32 maxCullDistances) {
        getVk().setMaxCullDistances(maxCullDistances.getVk());
    }

    public VulkanUInt32 getMaxCombinedClipAndCullDistances() {
        return new VulkanUInt32(getVk().getMaxCombinedClipAndCullDistances());
    }

    public void setMaxCombinedClipAndCullDistances(VulkanUInt32 maxCombinedClipAndCullDistances) {
        getVk().setMaxCombinedClipAndCullDistances(maxCombinedClipAndCullDistances.getVk());
    }

    public VulkanUInt32 getDiscreteQueuePriorities() {
        return new VulkanUInt32(getVk().getDiscreteQueuePriorities());
    }

    public void setDiscreteQueuePriorities(VulkanUInt32 discreteQueuePriorities) {
        getVk().setDiscreteQueuePriorities(discreteQueuePriorities.getVk());
    }

    public VulkanFloat getPointSizeRange() {
        return new VulkanFloat(getVk().getPointSizeRange());
    }

    public void setPointSizeRange(VulkanFloat pointSizeRange) {
        getVk().setPointSizeRange(pointSizeRange.getVk());
    }

    public VulkanFloat getLineWidthRange() {
        return new VulkanFloat(getVk().getLineWidthRange());
    }

    public void setLineWidthRange(VulkanFloat lineWidthRange) {
        getVk().setLineWidthRange(lineWidthRange.getVk());
    }

    public VulkanFloat getPointSizeGranularity() {
        return new VulkanFloat(getVk().getPointSizeGranularity());
    }

    public void setPointSizeGranularity(VulkanFloat pointSizeGranularity) {
        getVk().setPointSizeGranularity(pointSizeGranularity.getVk());
    }

    public VulkanFloat getLineWidthGranularity() {
        return new VulkanFloat(getVk().getLineWidthGranularity());
    }

    public void setLineWidthGranularity(VulkanFloat lineWidthGranularity) {
        getVk().setLineWidthGranularity(lineWidthGranularity.getVk());
    }

    public VulkanBool32 getStrictLines() {
        return new VulkanBool32(getVk().getStrictLines());
    }

    public void setStrictLines(VulkanBool32 strictLines) {
        getVk().setStrictLines(strictLines.getVk());
    }

    public VulkanBool32 getStandardSampleLocations() {
        return new VulkanBool32(getVk().getStandardSampleLocations());
    }

    public void setStandardSampleLocations(VulkanBool32 standardSampleLocations) {
        getVk().setStandardSampleLocations(standardSampleLocations.getVk());
    }

    public VulkanDeviceSize getOptimalBufferCopyOffsetAlignment() {
        return new VulkanDeviceSize(getVk().getOptimalBufferCopyOffsetAlignment());
    }

    public void setOptimalBufferCopyOffsetAlignment(VulkanDeviceSize optimalBufferCopyOffsetAlignment) {
        getVk().setOptimalBufferCopyOffsetAlignment(optimalBufferCopyOffsetAlignment.getVk());
    }

    public VulkanDeviceSize getOptimalBufferCopyRowPitchAlignment() {
        return new VulkanDeviceSize(getVk().getOptimalBufferCopyRowPitchAlignment());
    }

    public void setOptimalBufferCopyRowPitchAlignment(VulkanDeviceSize optimalBufferCopyRowPitchAlignment) {
        getVk().setOptimalBufferCopyRowPitchAlignment(optimalBufferCopyRowPitchAlignment.getVk());
    }

    public VulkanDeviceSize getNonCoherentAtomSize() {
        return new VulkanDeviceSize(getVk().getNonCoherentAtomSize());
    }

    public void setNonCoherentAtomSize(VulkanDeviceSize nonCoherentAtomSize) {
        getVk().setNonCoherentAtomSize(nonCoherentAtomSize.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceLimits implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceLimits> {
        public Array(VkPhysicalDeviceLimits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceLimits.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceLimits o){
            this(new VkPhysicalDeviceLimits.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceLimits.Array getVk(){
            return (VkPhysicalDeviceLimits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceLimits get(int i){
            return new VulkanPhysicalDeviceLimits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceLimits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceLimits.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceLimits.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceLimits.Pointer getVk(){
            return (VkPhysicalDeviceLimits.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceLimits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceLimits.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceLimits.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceLimits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceLimits.Pointer.Array getVk(){
                return (VkPhysicalDeviceLimits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceLimits.Pointer get(int i){
                return new VulkanPhysicalDeviceLimits.Pointer(getVk().get(i));
            }
        }
    }
}
