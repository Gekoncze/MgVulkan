package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceLimits.html">khronos documentation</a>
 **/
public class VkPhysicalDeviceLimits extends VkObject {
    public VkPhysicalDeviceLimits() {
        super(sizeof());
    }

    public VkPhysicalDeviceLimits(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkPhysicalDeviceLimits(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkPhysicalDeviceLimits(VkUInt32 maxImageDimension1D, VkUInt32 maxImageDimension2D, VkUInt32 maxImageDimension3D, VkUInt32 maxImageDimensionCube, VkUInt32 maxImageArrayLayers, VkUInt32 maxTexelBufferElements, VkUInt32 maxUniformBufferRange, VkUInt32 maxStorageBufferRange, VkUInt32 maxPushConstantsSize, VkUInt32 maxMemoryAllocationCount, VkUInt32 maxSamplerAllocationCount, VkDeviceSize bufferImageGranularity, VkDeviceSize sparseAddressSpaceSize, VkUInt32 maxBoundDescriptorSets, VkUInt32 maxPerStageDescriptorSamplers, VkUInt32 maxPerStageDescriptorUniformBuffers, VkUInt32 maxPerStageDescriptorStorageBuffers, VkUInt32 maxPerStageDescriptorSampledImages, VkUInt32 maxPerStageDescriptorStorageImages, VkUInt32 maxPerStageDescriptorInputAttachments, VkUInt32 maxPerStageResources, VkUInt32 maxDescriptorSetSamplers, VkUInt32 maxDescriptorSetUniformBuffers, VkUInt32 maxDescriptorSetUniformBuffersDynamic, VkUInt32 maxDescriptorSetStorageBuffers, VkUInt32 maxDescriptorSetStorageBuffersDynamic, VkUInt32 maxDescriptorSetSampledImages, VkUInt32 maxDescriptorSetStorageImages, VkUInt32 maxDescriptorSetInputAttachments, VkUInt32 maxVertexInputAttributes, VkUInt32 maxVertexInputBindings, VkUInt32 maxVertexInputAttributeOffset, VkUInt32 maxVertexInputBindingStride, VkUInt32 maxVertexOutputComponents, VkUInt32 maxTessellationGenerationLevel, VkUInt32 maxTessellationPatchSize, VkUInt32 maxTessellationControlPerVertexInputComponents, VkUInt32 maxTessellationControlPerVertexOutputComponents, VkUInt32 maxTessellationControlPerPatchOutputComponents, VkUInt32 maxTessellationControlTotalOutputComponents, VkUInt32 maxTessellationEvaluationInputComponents, VkUInt32 maxTessellationEvaluationOutputComponents, VkUInt32 maxGeometryShaderInvocations, VkUInt32 maxGeometryInputComponents, VkUInt32 maxGeometryOutputComponents, VkUInt32 maxGeometryOutputVertices, VkUInt32 maxGeometryTotalOutputComponents, VkUInt32 maxFragmentInputComponents, VkUInt32 maxFragmentOutputAttachments, VkUInt32 maxFragmentDualSrcAttachments, VkUInt32 maxFragmentCombinedOutputResources, VkUInt32 maxComputeSharedMemorySize, VkUInt32 maxComputeWorkGroupCount, VkUInt32 maxComputeWorkGroupInvocations, VkUInt32 maxComputeWorkGroupSize, VkUInt32 subPixelPrecisionBits, VkUInt32 subTexelPrecisionBits, VkUInt32 mipmapPrecisionBits, VkUInt32 maxDrawIndexedIndexValue, VkUInt32 maxDrawIndirectCount, VkFloat maxSamplerLodBias, VkFloat maxSamplerAnisotropy, VkUInt32 maxViewports, VkUInt32 maxViewportDimensions, VkFloat viewportBoundsRange, VkUInt32 viewportSubPixelBits, VkSize minMemoryMapAlignment, VkDeviceSize minTexelBufferOffsetAlignment, VkDeviceSize minUniformBufferOffsetAlignment, VkDeviceSize minStorageBufferOffsetAlignment, VkInt32 minTexelOffset, VkUInt32 maxTexelOffset, VkInt32 minTexelGatherOffset, VkUInt32 maxTexelGatherOffset, VkFloat minInterpolationOffset, VkFloat maxInterpolationOffset, VkUInt32 subPixelInterpolationOffsetBits, VkUInt32 maxFramebufferWidth, VkUInt32 maxFramebufferHeight, VkUInt32 maxFramebufferLayers, VkSampleCountFlags framebufferColorSampleCounts, VkSampleCountFlags framebufferDepthSampleCounts, VkSampleCountFlags framebufferStencilSampleCounts, VkSampleCountFlags framebufferNoAttachmentsSampleCounts, VkUInt32 maxColorAttachments, VkSampleCountFlags sampledImageColorSampleCounts, VkSampleCountFlags sampledImageIntegerSampleCounts, VkSampleCountFlags sampledImageDepthSampleCounts, VkSampleCountFlags sampledImageStencilSampleCounts, VkSampleCountFlags storageImageSampleCounts, VkUInt32 maxSampleMaskWords, VkBool32 timestampComputeAndGraphics, VkFloat timestampPeriod, VkUInt32 maxClipDistances, VkUInt32 maxCullDistances, VkUInt32 maxCombinedClipAndCullDistances, VkUInt32 discreteQueuePriorities, VkFloat pointSizeRange, VkFloat lineWidthRange, VkFloat pointSizeGranularity, VkFloat lineWidthGranularity, VkBool32 strictLines, VkBool32 standardSampleLocations, VkDeviceSize optimalBufferCopyOffsetAlignment, VkDeviceSize optimalBufferCopyRowPitchAlignment, VkDeviceSize nonCoherentAtomSize) {
        super(sizeof());
        setMaxImageDimension1D(maxImageDimension1D);
        setMaxImageDimension2D(maxImageDimension2D);
        setMaxImageDimension3D(maxImageDimension3D);
        setMaxImageDimensionCube(maxImageDimensionCube);
        setMaxImageArrayLayers(maxImageArrayLayers);
        setMaxTexelBufferElements(maxTexelBufferElements);
        setMaxUniformBufferRange(maxUniformBufferRange);
        setMaxStorageBufferRange(maxStorageBufferRange);
        setMaxPushConstantsSize(maxPushConstantsSize);
        setMaxMemoryAllocationCount(maxMemoryAllocationCount);
        setMaxSamplerAllocationCount(maxSamplerAllocationCount);
        setBufferImageGranularity(bufferImageGranularity);
        setSparseAddressSpaceSize(sparseAddressSpaceSize);
        setMaxBoundDescriptorSets(maxBoundDescriptorSets);
        setMaxPerStageDescriptorSamplers(maxPerStageDescriptorSamplers);
        setMaxPerStageDescriptorUniformBuffers(maxPerStageDescriptorUniformBuffers);
        setMaxPerStageDescriptorStorageBuffers(maxPerStageDescriptorStorageBuffers);
        setMaxPerStageDescriptorSampledImages(maxPerStageDescriptorSampledImages);
        setMaxPerStageDescriptorStorageImages(maxPerStageDescriptorStorageImages);
        setMaxPerStageDescriptorInputAttachments(maxPerStageDescriptorInputAttachments);
        setMaxPerStageResources(maxPerStageResources);
        setMaxDescriptorSetSamplers(maxDescriptorSetSamplers);
        setMaxDescriptorSetUniformBuffers(maxDescriptorSetUniformBuffers);
        setMaxDescriptorSetUniformBuffersDynamic(maxDescriptorSetUniformBuffersDynamic);
        setMaxDescriptorSetStorageBuffers(maxDescriptorSetStorageBuffers);
        setMaxDescriptorSetStorageBuffersDynamic(maxDescriptorSetStorageBuffersDynamic);
        setMaxDescriptorSetSampledImages(maxDescriptorSetSampledImages);
        setMaxDescriptorSetStorageImages(maxDescriptorSetStorageImages);
        setMaxDescriptorSetInputAttachments(maxDescriptorSetInputAttachments);
        setMaxVertexInputAttributes(maxVertexInputAttributes);
        setMaxVertexInputBindings(maxVertexInputBindings);
        setMaxVertexInputAttributeOffset(maxVertexInputAttributeOffset);
        setMaxVertexInputBindingStride(maxVertexInputBindingStride);
        setMaxVertexOutputComponents(maxVertexOutputComponents);
        setMaxTessellationGenerationLevel(maxTessellationGenerationLevel);
        setMaxTessellationPatchSize(maxTessellationPatchSize);
        setMaxTessellationControlPerVertexInputComponents(maxTessellationControlPerVertexInputComponents);
        setMaxTessellationControlPerVertexOutputComponents(maxTessellationControlPerVertexOutputComponents);
        setMaxTessellationControlPerPatchOutputComponents(maxTessellationControlPerPatchOutputComponents);
        setMaxTessellationControlTotalOutputComponents(maxTessellationControlTotalOutputComponents);
        setMaxTessellationEvaluationInputComponents(maxTessellationEvaluationInputComponents);
        setMaxTessellationEvaluationOutputComponents(maxTessellationEvaluationOutputComponents);
        setMaxGeometryShaderInvocations(maxGeometryShaderInvocations);
        setMaxGeometryInputComponents(maxGeometryInputComponents);
        setMaxGeometryOutputComponents(maxGeometryOutputComponents);
        setMaxGeometryOutputVertices(maxGeometryOutputVertices);
        setMaxGeometryTotalOutputComponents(maxGeometryTotalOutputComponents);
        setMaxFragmentInputComponents(maxFragmentInputComponents);
        setMaxFragmentOutputAttachments(maxFragmentOutputAttachments);
        setMaxFragmentDualSrcAttachments(maxFragmentDualSrcAttachments);
        setMaxFragmentCombinedOutputResources(maxFragmentCombinedOutputResources);
        setMaxComputeSharedMemorySize(maxComputeSharedMemorySize);
        setMaxComputeWorkGroupCount(maxComputeWorkGroupCount);
        setMaxComputeWorkGroupInvocations(maxComputeWorkGroupInvocations);
        setMaxComputeWorkGroupSize(maxComputeWorkGroupSize);
        setSubPixelPrecisionBits(subPixelPrecisionBits);
        setSubTexelPrecisionBits(subTexelPrecisionBits);
        setMipmapPrecisionBits(mipmapPrecisionBits);
        setMaxDrawIndexedIndexValue(maxDrawIndexedIndexValue);
        setMaxDrawIndirectCount(maxDrawIndirectCount);
        setMaxSamplerLodBias(maxSamplerLodBias);
        setMaxSamplerAnisotropy(maxSamplerAnisotropy);
        setMaxViewports(maxViewports);
        setMaxViewportDimensions(maxViewportDimensions);
        setViewportBoundsRange(viewportBoundsRange);
        setViewportSubPixelBits(viewportSubPixelBits);
        setMinMemoryMapAlignment(minMemoryMapAlignment);
        setMinTexelBufferOffsetAlignment(minTexelBufferOffsetAlignment);
        setMinUniformBufferOffsetAlignment(minUniformBufferOffsetAlignment);
        setMinStorageBufferOffsetAlignment(minStorageBufferOffsetAlignment);
        setMinTexelOffset(minTexelOffset);
        setMaxTexelOffset(maxTexelOffset);
        setMinTexelGatherOffset(minTexelGatherOffset);
        setMaxTexelGatherOffset(maxTexelGatherOffset);
        setMinInterpolationOffset(minInterpolationOffset);
        setMaxInterpolationOffset(maxInterpolationOffset);
        setSubPixelInterpolationOffsetBits(subPixelInterpolationOffsetBits);
        setMaxFramebufferWidth(maxFramebufferWidth);
        setMaxFramebufferHeight(maxFramebufferHeight);
        setMaxFramebufferLayers(maxFramebufferLayers);
        setFramebufferColorSampleCounts(framebufferColorSampleCounts);
        setFramebufferDepthSampleCounts(framebufferDepthSampleCounts);
        setFramebufferStencilSampleCounts(framebufferStencilSampleCounts);
        setFramebufferNoAttachmentsSampleCounts(framebufferNoAttachmentsSampleCounts);
        setMaxColorAttachments(maxColorAttachments);
        setSampledImageColorSampleCounts(sampledImageColorSampleCounts);
        setSampledImageIntegerSampleCounts(sampledImageIntegerSampleCounts);
        setSampledImageDepthSampleCounts(sampledImageDepthSampleCounts);
        setSampledImageStencilSampleCounts(sampledImageStencilSampleCounts);
        setStorageImageSampleCounts(storageImageSampleCounts);
        setMaxSampleMaskWords(maxSampleMaskWords);
        setTimestampComputeAndGraphics(timestampComputeAndGraphics);
        setTimestampPeriod(timestampPeriod);
        setMaxClipDistances(maxClipDistances);
        setMaxCullDistances(maxCullDistances);
        setMaxCombinedClipAndCullDistances(maxCombinedClipAndCullDistances);
        setDiscreteQueuePriorities(discreteQueuePriorities);
        setPointSizeRange(pointSizeRange);
        setLineWidthRange(lineWidthRange);
        setPointSizeGranularity(pointSizeGranularity);
        setLineWidthGranularity(lineWidthGranularity);
        setStrictLines(strictLines);
        setStandardSampleLocations(standardSampleLocations);
        setOptimalBufferCopyOffsetAlignment(optimalBufferCopyOffsetAlignment);
        setOptimalBufferCopyRowPitchAlignment(optimalBufferCopyRowPitchAlignment);
        setNonCoherentAtomSize(nonCoherentAtomSize);
    }

    public VkUInt32 getMaxImageDimension1D() {
        return new VkUInt32(getVkMemory(), getMaxImageDimension1D(getVkAddress()));
    }

    public void setMaxImageDimension1D(VkUInt32 maxImageDimension1D) {
        setMaxImageDimension1D(getVkAddress(), maxImageDimension1D.getVkAddress());
    }

    private static native long getMaxImageDimension1D(long address);
    private static native void setMaxImageDimension1D(long address, long maxImageDimension1D);

    public VkUInt32 getMaxImageDimension2D() {
        return new VkUInt32(getVkMemory(), getMaxImageDimension2D(getVkAddress()));
    }

    public void setMaxImageDimension2D(VkUInt32 maxImageDimension2D) {
        setMaxImageDimension2D(getVkAddress(), maxImageDimension2D.getVkAddress());
    }

    private static native long getMaxImageDimension2D(long address);
    private static native void setMaxImageDimension2D(long address, long maxImageDimension2D);

    public VkUInt32 getMaxImageDimension3D() {
        return new VkUInt32(getVkMemory(), getMaxImageDimension3D(getVkAddress()));
    }

    public void setMaxImageDimension3D(VkUInt32 maxImageDimension3D) {
        setMaxImageDimension3D(getVkAddress(), maxImageDimension3D.getVkAddress());
    }

    private static native long getMaxImageDimension3D(long address);
    private static native void setMaxImageDimension3D(long address, long maxImageDimension3D);

    public VkUInt32 getMaxImageDimensionCube() {
        return new VkUInt32(getVkMemory(), getMaxImageDimensionCube(getVkAddress()));
    }

    public void setMaxImageDimensionCube(VkUInt32 maxImageDimensionCube) {
        setMaxImageDimensionCube(getVkAddress(), maxImageDimensionCube.getVkAddress());
    }

    private static native long getMaxImageDimensionCube(long address);
    private static native void setMaxImageDimensionCube(long address, long maxImageDimensionCube);

    public VkUInt32 getMaxImageArrayLayers() {
        return new VkUInt32(getVkMemory(), getMaxImageArrayLayers(getVkAddress()));
    }

    public void setMaxImageArrayLayers(VkUInt32 maxImageArrayLayers) {
        setMaxImageArrayLayers(getVkAddress(), maxImageArrayLayers.getVkAddress());
    }

    private static native long getMaxImageArrayLayers(long address);
    private static native void setMaxImageArrayLayers(long address, long maxImageArrayLayers);

    public VkUInt32 getMaxTexelBufferElements() {
        return new VkUInt32(getVkMemory(), getMaxTexelBufferElements(getVkAddress()));
    }

    public void setMaxTexelBufferElements(VkUInt32 maxTexelBufferElements) {
        setMaxTexelBufferElements(getVkAddress(), maxTexelBufferElements.getVkAddress());
    }

    private static native long getMaxTexelBufferElements(long address);
    private static native void setMaxTexelBufferElements(long address, long maxTexelBufferElements);

    public VkUInt32 getMaxUniformBufferRange() {
        return new VkUInt32(getVkMemory(), getMaxUniformBufferRange(getVkAddress()));
    }

    public void setMaxUniformBufferRange(VkUInt32 maxUniformBufferRange) {
        setMaxUniformBufferRange(getVkAddress(), maxUniformBufferRange.getVkAddress());
    }

    private static native long getMaxUniformBufferRange(long address);
    private static native void setMaxUniformBufferRange(long address, long maxUniformBufferRange);

    public VkUInt32 getMaxStorageBufferRange() {
        return new VkUInt32(getVkMemory(), getMaxStorageBufferRange(getVkAddress()));
    }

    public void setMaxStorageBufferRange(VkUInt32 maxStorageBufferRange) {
        setMaxStorageBufferRange(getVkAddress(), maxStorageBufferRange.getVkAddress());
    }

    private static native long getMaxStorageBufferRange(long address);
    private static native void setMaxStorageBufferRange(long address, long maxStorageBufferRange);

    public VkUInt32 getMaxPushConstantsSize() {
        return new VkUInt32(getVkMemory(), getMaxPushConstantsSize(getVkAddress()));
    }

    public void setMaxPushConstantsSize(VkUInt32 maxPushConstantsSize) {
        setMaxPushConstantsSize(getVkAddress(), maxPushConstantsSize.getVkAddress());
    }

    private static native long getMaxPushConstantsSize(long address);
    private static native void setMaxPushConstantsSize(long address, long maxPushConstantsSize);

    public VkUInt32 getMaxMemoryAllocationCount() {
        return new VkUInt32(getVkMemory(), getMaxMemoryAllocationCount(getVkAddress()));
    }

    public void setMaxMemoryAllocationCount(VkUInt32 maxMemoryAllocationCount) {
        setMaxMemoryAllocationCount(getVkAddress(), maxMemoryAllocationCount.getVkAddress());
    }

    private static native long getMaxMemoryAllocationCount(long address);
    private static native void setMaxMemoryAllocationCount(long address, long maxMemoryAllocationCount);

    public VkUInt32.Array getMaxSamplerAllocationCount() {
        return new VkUInt32.Array(getVkMemory(), getMaxSamplerAllocationCount(getVkAddress()), getMaxMemoryAllocationCount().getValue());
    }

    public void setMaxSamplerAllocationCount(VkUInt32 maxSamplerAllocationCount) {
        setMaxSamplerAllocationCount(getVkAddress(), maxSamplerAllocationCount.getVkAddress());
    }

    private static native long getMaxSamplerAllocationCount(long address);
    private static native void setMaxSamplerAllocationCount(long address, long maxSamplerAllocationCount);

    public VkDeviceSize.Array getBufferImageGranularity() {
        return new VkDeviceSize.Array(getVkMemory(), getBufferImageGranularity(getVkAddress()), getMaxSamplerAllocationCount().getValue());
    }

    public void setBufferImageGranularity(VkDeviceSize bufferImageGranularity) {
        setBufferImageGranularity(getVkAddress(), bufferImageGranularity.getVkAddress());
    }

    private static native long getBufferImageGranularity(long address);
    private static native void setBufferImageGranularity(long address, long bufferImageGranularity);

    public VkDeviceSize getSparseAddressSpaceSize() {
        return new VkDeviceSize(getVkMemory(), getSparseAddressSpaceSize(getVkAddress()));
    }

    public void setSparseAddressSpaceSize(VkDeviceSize sparseAddressSpaceSize) {
        setSparseAddressSpaceSize(getVkAddress(), sparseAddressSpaceSize.getVkAddress());
    }

    private static native long getSparseAddressSpaceSize(long address);
    private static native void setSparseAddressSpaceSize(long address, long sparseAddressSpaceSize);

    public VkUInt32 getMaxBoundDescriptorSets() {
        return new VkUInt32(getVkMemory(), getMaxBoundDescriptorSets(getVkAddress()));
    }

    public void setMaxBoundDescriptorSets(VkUInt32 maxBoundDescriptorSets) {
        setMaxBoundDescriptorSets(getVkAddress(), maxBoundDescriptorSets.getVkAddress());
    }

    private static native long getMaxBoundDescriptorSets(long address);
    private static native void setMaxBoundDescriptorSets(long address, long maxBoundDescriptorSets);

    public VkUInt32 getMaxPerStageDescriptorSamplers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorSamplers(getVkAddress()));
    }

    public void setMaxPerStageDescriptorSamplers(VkUInt32 maxPerStageDescriptorSamplers) {
        setMaxPerStageDescriptorSamplers(getVkAddress(), maxPerStageDescriptorSamplers.getVkAddress());
    }

    private static native long getMaxPerStageDescriptorSamplers(long address);
    private static native void setMaxPerStageDescriptorSamplers(long address, long maxPerStageDescriptorSamplers);

    public VkUInt32 getMaxPerStageDescriptorUniformBuffers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUniformBuffers(getVkAddress()));
    }

    public void setMaxPerStageDescriptorUniformBuffers(VkUInt32 maxPerStageDescriptorUniformBuffers) {
        setMaxPerStageDescriptorUniformBuffers(getVkAddress(), maxPerStageDescriptorUniformBuffers.getVkAddress());
    }

    private static native long getMaxPerStageDescriptorUniformBuffers(long address);
    private static native void setMaxPerStageDescriptorUniformBuffers(long address, long maxPerStageDescriptorUniformBuffers);

    public VkUInt32 getMaxPerStageDescriptorStorageBuffers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorStorageBuffers(getVkAddress()));
    }

    public void setMaxPerStageDescriptorStorageBuffers(VkUInt32 maxPerStageDescriptorStorageBuffers) {
        setMaxPerStageDescriptorStorageBuffers(getVkAddress(), maxPerStageDescriptorStorageBuffers.getVkAddress());
    }

    private static native long getMaxPerStageDescriptorStorageBuffers(long address);
    private static native void setMaxPerStageDescriptorStorageBuffers(long address, long maxPerStageDescriptorStorageBuffers);

    public VkUInt32 getMaxPerStageDescriptorSampledImages() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorSampledImages(getVkAddress()));
    }

    public void setMaxPerStageDescriptorSampledImages(VkUInt32 maxPerStageDescriptorSampledImages) {
        setMaxPerStageDescriptorSampledImages(getVkAddress(), maxPerStageDescriptorSampledImages.getVkAddress());
    }

    private static native long getMaxPerStageDescriptorSampledImages(long address);
    private static native void setMaxPerStageDescriptorSampledImages(long address, long maxPerStageDescriptorSampledImages);

    public VkUInt32 getMaxPerStageDescriptorStorageImages() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorStorageImages(getVkAddress()));
    }

    public void setMaxPerStageDescriptorStorageImages(VkUInt32 maxPerStageDescriptorStorageImages) {
        setMaxPerStageDescriptorStorageImages(getVkAddress(), maxPerStageDescriptorStorageImages.getVkAddress());
    }

    private static native long getMaxPerStageDescriptorStorageImages(long address);
    private static native void setMaxPerStageDescriptorStorageImages(long address, long maxPerStageDescriptorStorageImages);

    public VkUInt32 getMaxPerStageDescriptorInputAttachments() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorInputAttachments(getVkAddress()));
    }

    public void setMaxPerStageDescriptorInputAttachments(VkUInt32 maxPerStageDescriptorInputAttachments) {
        setMaxPerStageDescriptorInputAttachments(getVkAddress(), maxPerStageDescriptorInputAttachments.getVkAddress());
    }

    private static native long getMaxPerStageDescriptorInputAttachments(long address);
    private static native void setMaxPerStageDescriptorInputAttachments(long address, long maxPerStageDescriptorInputAttachments);

    public VkUInt32 getMaxPerStageResources() {
        return new VkUInt32(getVkMemory(), getMaxPerStageResources(getVkAddress()));
    }

    public void setMaxPerStageResources(VkUInt32 maxPerStageResources) {
        setMaxPerStageResources(getVkAddress(), maxPerStageResources.getVkAddress());
    }

    private static native long getMaxPerStageResources(long address);
    private static native void setMaxPerStageResources(long address, long maxPerStageResources);

    public VkUInt32 getMaxDescriptorSetSamplers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetSamplers(getVkAddress()));
    }

    public void setMaxDescriptorSetSamplers(VkUInt32 maxDescriptorSetSamplers) {
        setMaxDescriptorSetSamplers(getVkAddress(), maxDescriptorSetSamplers.getVkAddress());
    }

    private static native long getMaxDescriptorSetSamplers(long address);
    private static native void setMaxDescriptorSetSamplers(long address, long maxDescriptorSetSamplers);

    public VkUInt32 getMaxDescriptorSetUniformBuffers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUniformBuffers(getVkAddress()));
    }

    public void setMaxDescriptorSetUniformBuffers(VkUInt32 maxDescriptorSetUniformBuffers) {
        setMaxDescriptorSetUniformBuffers(getVkAddress(), maxDescriptorSetUniformBuffers.getVkAddress());
    }

    private static native long getMaxDescriptorSetUniformBuffers(long address);
    private static native void setMaxDescriptorSetUniformBuffers(long address, long maxDescriptorSetUniformBuffers);

    public VkUInt32 getMaxDescriptorSetUniformBuffersDynamic() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUniformBuffersDynamic(getVkAddress()));
    }

    public void setMaxDescriptorSetUniformBuffersDynamic(VkUInt32 maxDescriptorSetUniformBuffersDynamic) {
        setMaxDescriptorSetUniformBuffersDynamic(getVkAddress(), maxDescriptorSetUniformBuffersDynamic.getVkAddress());
    }

    private static native long getMaxDescriptorSetUniformBuffersDynamic(long address);
    private static native void setMaxDescriptorSetUniformBuffersDynamic(long address, long maxDescriptorSetUniformBuffersDynamic);

    public VkUInt32 getMaxDescriptorSetStorageBuffers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetStorageBuffers(getVkAddress()));
    }

    public void setMaxDescriptorSetStorageBuffers(VkUInt32 maxDescriptorSetStorageBuffers) {
        setMaxDescriptorSetStorageBuffers(getVkAddress(), maxDescriptorSetStorageBuffers.getVkAddress());
    }

    private static native long getMaxDescriptorSetStorageBuffers(long address);
    private static native void setMaxDescriptorSetStorageBuffers(long address, long maxDescriptorSetStorageBuffers);

    public VkUInt32 getMaxDescriptorSetStorageBuffersDynamic() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetStorageBuffersDynamic(getVkAddress()));
    }

    public void setMaxDescriptorSetStorageBuffersDynamic(VkUInt32 maxDescriptorSetStorageBuffersDynamic) {
        setMaxDescriptorSetStorageBuffersDynamic(getVkAddress(), maxDescriptorSetStorageBuffersDynamic.getVkAddress());
    }

    private static native long getMaxDescriptorSetStorageBuffersDynamic(long address);
    private static native void setMaxDescriptorSetStorageBuffersDynamic(long address, long maxDescriptorSetStorageBuffersDynamic);

    public VkUInt32 getMaxDescriptorSetSampledImages() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetSampledImages(getVkAddress()));
    }

    public void setMaxDescriptorSetSampledImages(VkUInt32 maxDescriptorSetSampledImages) {
        setMaxDescriptorSetSampledImages(getVkAddress(), maxDescriptorSetSampledImages.getVkAddress());
    }

    private static native long getMaxDescriptorSetSampledImages(long address);
    private static native void setMaxDescriptorSetSampledImages(long address, long maxDescriptorSetSampledImages);

    public VkUInt32 getMaxDescriptorSetStorageImages() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetStorageImages(getVkAddress()));
    }

    public void setMaxDescriptorSetStorageImages(VkUInt32 maxDescriptorSetStorageImages) {
        setMaxDescriptorSetStorageImages(getVkAddress(), maxDescriptorSetStorageImages.getVkAddress());
    }

    private static native long getMaxDescriptorSetStorageImages(long address);
    private static native void setMaxDescriptorSetStorageImages(long address, long maxDescriptorSetStorageImages);

    public VkUInt32 getMaxDescriptorSetInputAttachments() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetInputAttachments(getVkAddress()));
    }

    public void setMaxDescriptorSetInputAttachments(VkUInt32 maxDescriptorSetInputAttachments) {
        setMaxDescriptorSetInputAttachments(getVkAddress(), maxDescriptorSetInputAttachments.getVkAddress());
    }

    private static native long getMaxDescriptorSetInputAttachments(long address);
    private static native void setMaxDescriptorSetInputAttachments(long address, long maxDescriptorSetInputAttachments);

    public VkUInt32 getMaxVertexInputAttributes() {
        return new VkUInt32(getVkMemory(), getMaxVertexInputAttributes(getVkAddress()));
    }

    public void setMaxVertexInputAttributes(VkUInt32 maxVertexInputAttributes) {
        setMaxVertexInputAttributes(getVkAddress(), maxVertexInputAttributes.getVkAddress());
    }

    private static native long getMaxVertexInputAttributes(long address);
    private static native void setMaxVertexInputAttributes(long address, long maxVertexInputAttributes);

    public VkUInt32 getMaxVertexInputBindings() {
        return new VkUInt32(getVkMemory(), getMaxVertexInputBindings(getVkAddress()));
    }

    public void setMaxVertexInputBindings(VkUInt32 maxVertexInputBindings) {
        setMaxVertexInputBindings(getVkAddress(), maxVertexInputBindings.getVkAddress());
    }

    private static native long getMaxVertexInputBindings(long address);
    private static native void setMaxVertexInputBindings(long address, long maxVertexInputBindings);

    public VkUInt32 getMaxVertexInputAttributeOffset() {
        return new VkUInt32(getVkMemory(), getMaxVertexInputAttributeOffset(getVkAddress()));
    }

    public void setMaxVertexInputAttributeOffset(VkUInt32 maxVertexInputAttributeOffset) {
        setMaxVertexInputAttributeOffset(getVkAddress(), maxVertexInputAttributeOffset.getVkAddress());
    }

    private static native long getMaxVertexInputAttributeOffset(long address);
    private static native void setMaxVertexInputAttributeOffset(long address, long maxVertexInputAttributeOffset);

    public VkUInt32 getMaxVertexInputBindingStride() {
        return new VkUInt32(getVkMemory(), getMaxVertexInputBindingStride(getVkAddress()));
    }

    public void setMaxVertexInputBindingStride(VkUInt32 maxVertexInputBindingStride) {
        setMaxVertexInputBindingStride(getVkAddress(), maxVertexInputBindingStride.getVkAddress());
    }

    private static native long getMaxVertexInputBindingStride(long address);
    private static native void setMaxVertexInputBindingStride(long address, long maxVertexInputBindingStride);

    public VkUInt32 getMaxVertexOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxVertexOutputComponents(getVkAddress()));
    }

    public void setMaxVertexOutputComponents(VkUInt32 maxVertexOutputComponents) {
        setMaxVertexOutputComponents(getVkAddress(), maxVertexOutputComponents.getVkAddress());
    }

    private static native long getMaxVertexOutputComponents(long address);
    private static native void setMaxVertexOutputComponents(long address, long maxVertexOutputComponents);

    public VkUInt32 getMaxTessellationGenerationLevel() {
        return new VkUInt32(getVkMemory(), getMaxTessellationGenerationLevel(getVkAddress()));
    }

    public void setMaxTessellationGenerationLevel(VkUInt32 maxTessellationGenerationLevel) {
        setMaxTessellationGenerationLevel(getVkAddress(), maxTessellationGenerationLevel.getVkAddress());
    }

    private static native long getMaxTessellationGenerationLevel(long address);
    private static native void setMaxTessellationGenerationLevel(long address, long maxTessellationGenerationLevel);

    public VkUInt32 getMaxTessellationPatchSize() {
        return new VkUInt32(getVkMemory(), getMaxTessellationPatchSize(getVkAddress()));
    }

    public void setMaxTessellationPatchSize(VkUInt32 maxTessellationPatchSize) {
        setMaxTessellationPatchSize(getVkAddress(), maxTessellationPatchSize.getVkAddress());
    }

    private static native long getMaxTessellationPatchSize(long address);
    private static native void setMaxTessellationPatchSize(long address, long maxTessellationPatchSize);

    public VkUInt32 getMaxTessellationControlPerVertexInputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationControlPerVertexInputComponents(getVkAddress()));
    }

    public void setMaxTessellationControlPerVertexInputComponents(VkUInt32 maxTessellationControlPerVertexInputComponents) {
        setMaxTessellationControlPerVertexInputComponents(getVkAddress(), maxTessellationControlPerVertexInputComponents.getVkAddress());
    }

    private static native long getMaxTessellationControlPerVertexInputComponents(long address);
    private static native void setMaxTessellationControlPerVertexInputComponents(long address, long maxTessellationControlPerVertexInputComponents);

    public VkUInt32 getMaxTessellationControlPerVertexOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationControlPerVertexOutputComponents(getVkAddress()));
    }

    public void setMaxTessellationControlPerVertexOutputComponents(VkUInt32 maxTessellationControlPerVertexOutputComponents) {
        setMaxTessellationControlPerVertexOutputComponents(getVkAddress(), maxTessellationControlPerVertexOutputComponents.getVkAddress());
    }

    private static native long getMaxTessellationControlPerVertexOutputComponents(long address);
    private static native void setMaxTessellationControlPerVertexOutputComponents(long address, long maxTessellationControlPerVertexOutputComponents);

    public VkUInt32 getMaxTessellationControlPerPatchOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationControlPerPatchOutputComponents(getVkAddress()));
    }

    public void setMaxTessellationControlPerPatchOutputComponents(VkUInt32 maxTessellationControlPerPatchOutputComponents) {
        setMaxTessellationControlPerPatchOutputComponents(getVkAddress(), maxTessellationControlPerPatchOutputComponents.getVkAddress());
    }

    private static native long getMaxTessellationControlPerPatchOutputComponents(long address);
    private static native void setMaxTessellationControlPerPatchOutputComponents(long address, long maxTessellationControlPerPatchOutputComponents);

    public VkUInt32 getMaxTessellationControlTotalOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationControlTotalOutputComponents(getVkAddress()));
    }

    public void setMaxTessellationControlTotalOutputComponents(VkUInt32 maxTessellationControlTotalOutputComponents) {
        setMaxTessellationControlTotalOutputComponents(getVkAddress(), maxTessellationControlTotalOutputComponents.getVkAddress());
    }

    private static native long getMaxTessellationControlTotalOutputComponents(long address);
    private static native void setMaxTessellationControlTotalOutputComponents(long address, long maxTessellationControlTotalOutputComponents);

    public VkUInt32 getMaxTessellationEvaluationInputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationEvaluationInputComponents(getVkAddress()));
    }

    public void setMaxTessellationEvaluationInputComponents(VkUInt32 maxTessellationEvaluationInputComponents) {
        setMaxTessellationEvaluationInputComponents(getVkAddress(), maxTessellationEvaluationInputComponents.getVkAddress());
    }

    private static native long getMaxTessellationEvaluationInputComponents(long address);
    private static native void setMaxTessellationEvaluationInputComponents(long address, long maxTessellationEvaluationInputComponents);

    public VkUInt32 getMaxTessellationEvaluationOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationEvaluationOutputComponents(getVkAddress()));
    }

    public void setMaxTessellationEvaluationOutputComponents(VkUInt32 maxTessellationEvaluationOutputComponents) {
        setMaxTessellationEvaluationOutputComponents(getVkAddress(), maxTessellationEvaluationOutputComponents.getVkAddress());
    }

    private static native long getMaxTessellationEvaluationOutputComponents(long address);
    private static native void setMaxTessellationEvaluationOutputComponents(long address, long maxTessellationEvaluationOutputComponents);

    public VkUInt32 getMaxGeometryShaderInvocations() {
        return new VkUInt32(getVkMemory(), getMaxGeometryShaderInvocations(getVkAddress()));
    }

    public void setMaxGeometryShaderInvocations(VkUInt32 maxGeometryShaderInvocations) {
        setMaxGeometryShaderInvocations(getVkAddress(), maxGeometryShaderInvocations.getVkAddress());
    }

    private static native long getMaxGeometryShaderInvocations(long address);
    private static native void setMaxGeometryShaderInvocations(long address, long maxGeometryShaderInvocations);

    public VkUInt32 getMaxGeometryInputComponents() {
        return new VkUInt32(getVkMemory(), getMaxGeometryInputComponents(getVkAddress()));
    }

    public void setMaxGeometryInputComponents(VkUInt32 maxGeometryInputComponents) {
        setMaxGeometryInputComponents(getVkAddress(), maxGeometryInputComponents.getVkAddress());
    }

    private static native long getMaxGeometryInputComponents(long address);
    private static native void setMaxGeometryInputComponents(long address, long maxGeometryInputComponents);

    public VkUInt32 getMaxGeometryOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxGeometryOutputComponents(getVkAddress()));
    }

    public void setMaxGeometryOutputComponents(VkUInt32 maxGeometryOutputComponents) {
        setMaxGeometryOutputComponents(getVkAddress(), maxGeometryOutputComponents.getVkAddress());
    }

    private static native long getMaxGeometryOutputComponents(long address);
    private static native void setMaxGeometryOutputComponents(long address, long maxGeometryOutputComponents);

    public VkUInt32 getMaxGeometryOutputVertices() {
        return new VkUInt32(getVkMemory(), getMaxGeometryOutputVertices(getVkAddress()));
    }

    public void setMaxGeometryOutputVertices(VkUInt32 maxGeometryOutputVertices) {
        setMaxGeometryOutputVertices(getVkAddress(), maxGeometryOutputVertices.getVkAddress());
    }

    private static native long getMaxGeometryOutputVertices(long address);
    private static native void setMaxGeometryOutputVertices(long address, long maxGeometryOutputVertices);

    public VkUInt32 getMaxGeometryTotalOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxGeometryTotalOutputComponents(getVkAddress()));
    }

    public void setMaxGeometryTotalOutputComponents(VkUInt32 maxGeometryTotalOutputComponents) {
        setMaxGeometryTotalOutputComponents(getVkAddress(), maxGeometryTotalOutputComponents.getVkAddress());
    }

    private static native long getMaxGeometryTotalOutputComponents(long address);
    private static native void setMaxGeometryTotalOutputComponents(long address, long maxGeometryTotalOutputComponents);

    public VkUInt32 getMaxFragmentInputComponents() {
        return new VkUInt32(getVkMemory(), getMaxFragmentInputComponents(getVkAddress()));
    }

    public void setMaxFragmentInputComponents(VkUInt32 maxFragmentInputComponents) {
        setMaxFragmentInputComponents(getVkAddress(), maxFragmentInputComponents.getVkAddress());
    }

    private static native long getMaxFragmentInputComponents(long address);
    private static native void setMaxFragmentInputComponents(long address, long maxFragmentInputComponents);

    public VkUInt32 getMaxFragmentOutputAttachments() {
        return new VkUInt32(getVkMemory(), getMaxFragmentOutputAttachments(getVkAddress()));
    }

    public void setMaxFragmentOutputAttachments(VkUInt32 maxFragmentOutputAttachments) {
        setMaxFragmentOutputAttachments(getVkAddress(), maxFragmentOutputAttachments.getVkAddress());
    }

    private static native long getMaxFragmentOutputAttachments(long address);
    private static native void setMaxFragmentOutputAttachments(long address, long maxFragmentOutputAttachments);

    public VkUInt32 getMaxFragmentDualSrcAttachments() {
        return new VkUInt32(getVkMemory(), getMaxFragmentDualSrcAttachments(getVkAddress()));
    }

    public void setMaxFragmentDualSrcAttachments(VkUInt32 maxFragmentDualSrcAttachments) {
        setMaxFragmentDualSrcAttachments(getVkAddress(), maxFragmentDualSrcAttachments.getVkAddress());
    }

    private static native long getMaxFragmentDualSrcAttachments(long address);
    private static native void setMaxFragmentDualSrcAttachments(long address, long maxFragmentDualSrcAttachments);

    public VkUInt32 getMaxFragmentCombinedOutputResources() {
        return new VkUInt32(getVkMemory(), getMaxFragmentCombinedOutputResources(getVkAddress()));
    }

    public void setMaxFragmentCombinedOutputResources(VkUInt32 maxFragmentCombinedOutputResources) {
        setMaxFragmentCombinedOutputResources(getVkAddress(), maxFragmentCombinedOutputResources.getVkAddress());
    }

    private static native long getMaxFragmentCombinedOutputResources(long address);
    private static native void setMaxFragmentCombinedOutputResources(long address, long maxFragmentCombinedOutputResources);

    public VkUInt32 getMaxComputeSharedMemorySize() {
        return new VkUInt32(getVkMemory(), getMaxComputeSharedMemorySize(getVkAddress()));
    }

    public void setMaxComputeSharedMemorySize(VkUInt32 maxComputeSharedMemorySize) {
        setMaxComputeSharedMemorySize(getVkAddress(), maxComputeSharedMemorySize.getVkAddress());
    }

    private static native long getMaxComputeSharedMemorySize(long address);
    private static native void setMaxComputeSharedMemorySize(long address, long maxComputeSharedMemorySize);

    public VkUInt32 getMaxComputeWorkGroupCount() {
        return new VkUInt32(getVkMemory(), getMaxComputeWorkGroupCount(getVkAddress()));
    }

    public void setMaxComputeWorkGroupCount(VkUInt32 maxComputeWorkGroupCount) {
        setMaxComputeWorkGroupCount(getVkAddress(), maxComputeWorkGroupCount.getVkAddress());
    }

    private static native long getMaxComputeWorkGroupCount(long address);
    private static native void setMaxComputeWorkGroupCount(long address, long maxComputeWorkGroupCount);

    public VkUInt32.Array getMaxComputeWorkGroupInvocations() {
        return new VkUInt32.Array(getVkMemory(), getMaxComputeWorkGroupInvocations(getVkAddress()), getMaxComputeWorkGroupCount().getValue());
    }

    public void setMaxComputeWorkGroupInvocations(VkUInt32 maxComputeWorkGroupInvocations) {
        setMaxComputeWorkGroupInvocations(getVkAddress(), maxComputeWorkGroupInvocations.getVkAddress());
    }

    private static native long getMaxComputeWorkGroupInvocations(long address);
    private static native void setMaxComputeWorkGroupInvocations(long address, long maxComputeWorkGroupInvocations);

    public VkUInt32 getMaxComputeWorkGroupSize() {
        return new VkUInt32(getVkMemory(), getMaxComputeWorkGroupSize(getVkAddress()));
    }

    public void setMaxComputeWorkGroupSize(VkUInt32 maxComputeWorkGroupSize) {
        setMaxComputeWorkGroupSize(getVkAddress(), maxComputeWorkGroupSize.getVkAddress());
    }

    private static native long getMaxComputeWorkGroupSize(long address);
    private static native void setMaxComputeWorkGroupSize(long address, long maxComputeWorkGroupSize);

    public VkUInt32 getSubPixelPrecisionBits() {
        return new VkUInt32(getVkMemory(), getSubPixelPrecisionBits(getVkAddress()));
    }

    public void setSubPixelPrecisionBits(VkUInt32 subPixelPrecisionBits) {
        setSubPixelPrecisionBits(getVkAddress(), subPixelPrecisionBits.getVkAddress());
    }

    private static native long getSubPixelPrecisionBits(long address);
    private static native void setSubPixelPrecisionBits(long address, long subPixelPrecisionBits);

    public VkUInt32 getSubTexelPrecisionBits() {
        return new VkUInt32(getVkMemory(), getSubTexelPrecisionBits(getVkAddress()));
    }

    public void setSubTexelPrecisionBits(VkUInt32 subTexelPrecisionBits) {
        setSubTexelPrecisionBits(getVkAddress(), subTexelPrecisionBits.getVkAddress());
    }

    private static native long getSubTexelPrecisionBits(long address);
    private static native void setSubTexelPrecisionBits(long address, long subTexelPrecisionBits);

    public VkUInt32 getMipmapPrecisionBits() {
        return new VkUInt32(getVkMemory(), getMipmapPrecisionBits(getVkAddress()));
    }

    public void setMipmapPrecisionBits(VkUInt32 mipmapPrecisionBits) {
        setMipmapPrecisionBits(getVkAddress(), mipmapPrecisionBits.getVkAddress());
    }

    private static native long getMipmapPrecisionBits(long address);
    private static native void setMipmapPrecisionBits(long address, long mipmapPrecisionBits);

    public VkUInt32 getMaxDrawIndexedIndexValue() {
        return new VkUInt32(getVkMemory(), getMaxDrawIndexedIndexValue(getVkAddress()));
    }

    public void setMaxDrawIndexedIndexValue(VkUInt32 maxDrawIndexedIndexValue) {
        setMaxDrawIndexedIndexValue(getVkAddress(), maxDrawIndexedIndexValue.getVkAddress());
    }

    private static native long getMaxDrawIndexedIndexValue(long address);
    private static native void setMaxDrawIndexedIndexValue(long address, long maxDrawIndexedIndexValue);

    public VkUInt32 getMaxDrawIndirectCount() {
        return new VkUInt32(getVkMemory(), getMaxDrawIndirectCount(getVkAddress()));
    }

    public void setMaxDrawIndirectCount(VkUInt32 maxDrawIndirectCount) {
        setMaxDrawIndirectCount(getVkAddress(), maxDrawIndirectCount.getVkAddress());
    }

    private static native long getMaxDrawIndirectCount(long address);
    private static native void setMaxDrawIndirectCount(long address, long maxDrawIndirectCount);

    public VkFloat.Array getMaxSamplerLodBias() {
        return new VkFloat.Array(getVkMemory(), getMaxSamplerLodBias(getVkAddress()), getMaxDrawIndirectCount().getValue());
    }

    public void setMaxSamplerLodBias(VkFloat maxSamplerLodBias) {
        setMaxSamplerLodBias(getVkAddress(), maxSamplerLodBias.getVkAddress());
    }

    private static native long getMaxSamplerLodBias(long address);
    private static native void setMaxSamplerLodBias(long address, long maxSamplerLodBias);

    public VkFloat getMaxSamplerAnisotropy() {
        return new VkFloat(getVkMemory(), getMaxSamplerAnisotropy(getVkAddress()));
    }

    public void setMaxSamplerAnisotropy(VkFloat maxSamplerAnisotropy) {
        setMaxSamplerAnisotropy(getVkAddress(), maxSamplerAnisotropy.getVkAddress());
    }

    private static native long getMaxSamplerAnisotropy(long address);
    private static native void setMaxSamplerAnisotropy(long address, long maxSamplerAnisotropy);

    public VkUInt32 getMaxViewports() {
        return new VkUInt32(getVkMemory(), getMaxViewports(getVkAddress()));
    }

    public void setMaxViewports(VkUInt32 maxViewports) {
        setMaxViewports(getVkAddress(), maxViewports.getVkAddress());
    }

    private static native long getMaxViewports(long address);
    private static native void setMaxViewports(long address, long maxViewports);

    public VkUInt32 getMaxViewportDimensions() {
        return new VkUInt32(getVkMemory(), getMaxViewportDimensions(getVkAddress()));
    }

    public void setMaxViewportDimensions(VkUInt32 maxViewportDimensions) {
        setMaxViewportDimensions(getVkAddress(), maxViewportDimensions.getVkAddress());
    }

    private static native long getMaxViewportDimensions(long address);
    private static native void setMaxViewportDimensions(long address, long maxViewportDimensions);

    public VkFloat getViewportBoundsRange() {
        return new VkFloat(getVkMemory(), getViewportBoundsRange(getVkAddress()));
    }

    public void setViewportBoundsRange(VkFloat viewportBoundsRange) {
        setViewportBoundsRange(getVkAddress(), viewportBoundsRange.getVkAddress());
    }

    private static native long getViewportBoundsRange(long address);
    private static native void setViewportBoundsRange(long address, long viewportBoundsRange);

    public VkUInt32 getViewportSubPixelBits() {
        return new VkUInt32(getVkMemory(), getViewportSubPixelBits(getVkAddress()));
    }

    public void setViewportSubPixelBits(VkUInt32 viewportSubPixelBits) {
        setViewportSubPixelBits(getVkAddress(), viewportSubPixelBits.getVkAddress());
    }

    private static native long getViewportSubPixelBits(long address);
    private static native void setViewportSubPixelBits(long address, long viewportSubPixelBits);

    public VkSize getMinMemoryMapAlignment() {
        return new VkSize(getVkMemory(), getMinMemoryMapAlignment(getVkAddress()));
    }

    public void setMinMemoryMapAlignment(VkSize minMemoryMapAlignment) {
        setMinMemoryMapAlignment(getVkAddress(), minMemoryMapAlignment.getVkAddress());
    }

    private static native long getMinMemoryMapAlignment(long address);
    private static native void setMinMemoryMapAlignment(long address, long minMemoryMapAlignment);

    public VkDeviceSize getMinTexelBufferOffsetAlignment() {
        return new VkDeviceSize(getVkMemory(), getMinTexelBufferOffsetAlignment(getVkAddress()));
    }

    public void setMinTexelBufferOffsetAlignment(VkDeviceSize minTexelBufferOffsetAlignment) {
        setMinTexelBufferOffsetAlignment(getVkAddress(), minTexelBufferOffsetAlignment.getVkAddress());
    }

    private static native long getMinTexelBufferOffsetAlignment(long address);
    private static native void setMinTexelBufferOffsetAlignment(long address, long minTexelBufferOffsetAlignment);

    public VkDeviceSize getMinUniformBufferOffsetAlignment() {
        return new VkDeviceSize(getVkMemory(), getMinUniformBufferOffsetAlignment(getVkAddress()));
    }

    public void setMinUniformBufferOffsetAlignment(VkDeviceSize minUniformBufferOffsetAlignment) {
        setMinUniformBufferOffsetAlignment(getVkAddress(), minUniformBufferOffsetAlignment.getVkAddress());
    }

    private static native long getMinUniformBufferOffsetAlignment(long address);
    private static native void setMinUniformBufferOffsetAlignment(long address, long minUniformBufferOffsetAlignment);

    public VkDeviceSize getMinStorageBufferOffsetAlignment() {
        return new VkDeviceSize(getVkMemory(), getMinStorageBufferOffsetAlignment(getVkAddress()));
    }

    public void setMinStorageBufferOffsetAlignment(VkDeviceSize minStorageBufferOffsetAlignment) {
        setMinStorageBufferOffsetAlignment(getVkAddress(), minStorageBufferOffsetAlignment.getVkAddress());
    }

    private static native long getMinStorageBufferOffsetAlignment(long address);
    private static native void setMinStorageBufferOffsetAlignment(long address, long minStorageBufferOffsetAlignment);

    public VkInt32 getMinTexelOffset() {
        return new VkInt32(getVkMemory(), getMinTexelOffset(getVkAddress()));
    }

    public void setMinTexelOffset(VkInt32 minTexelOffset) {
        setMinTexelOffset(getVkAddress(), minTexelOffset.getVkAddress());
    }

    private static native long getMinTexelOffset(long address);
    private static native void setMinTexelOffset(long address, long minTexelOffset);

    public VkUInt32 getMaxTexelOffset() {
        return new VkUInt32(getVkMemory(), getMaxTexelOffset(getVkAddress()));
    }

    public void setMaxTexelOffset(VkUInt32 maxTexelOffset) {
        setMaxTexelOffset(getVkAddress(), maxTexelOffset.getVkAddress());
    }

    private static native long getMaxTexelOffset(long address);
    private static native void setMaxTexelOffset(long address, long maxTexelOffset);

    public VkInt32 getMinTexelGatherOffset() {
        return new VkInt32(getVkMemory(), getMinTexelGatherOffset(getVkAddress()));
    }

    public void setMinTexelGatherOffset(VkInt32 minTexelGatherOffset) {
        setMinTexelGatherOffset(getVkAddress(), minTexelGatherOffset.getVkAddress());
    }

    private static native long getMinTexelGatherOffset(long address);
    private static native void setMinTexelGatherOffset(long address, long minTexelGatherOffset);

    public VkUInt32 getMaxTexelGatherOffset() {
        return new VkUInt32(getVkMemory(), getMaxTexelGatherOffset(getVkAddress()));
    }

    public void setMaxTexelGatherOffset(VkUInt32 maxTexelGatherOffset) {
        setMaxTexelGatherOffset(getVkAddress(), maxTexelGatherOffset.getVkAddress());
    }

    private static native long getMaxTexelGatherOffset(long address);
    private static native void setMaxTexelGatherOffset(long address, long maxTexelGatherOffset);

    public VkFloat getMinInterpolationOffset() {
        return new VkFloat(getVkMemory(), getMinInterpolationOffset(getVkAddress()));
    }

    public void setMinInterpolationOffset(VkFloat minInterpolationOffset) {
        setMinInterpolationOffset(getVkAddress(), minInterpolationOffset.getVkAddress());
    }

    private static native long getMinInterpolationOffset(long address);
    private static native void setMinInterpolationOffset(long address, long minInterpolationOffset);

    public VkFloat getMaxInterpolationOffset() {
        return new VkFloat(getVkMemory(), getMaxInterpolationOffset(getVkAddress()));
    }

    public void setMaxInterpolationOffset(VkFloat maxInterpolationOffset) {
        setMaxInterpolationOffset(getVkAddress(), maxInterpolationOffset.getVkAddress());
    }

    private static native long getMaxInterpolationOffset(long address);
    private static native void setMaxInterpolationOffset(long address, long maxInterpolationOffset);

    public VkUInt32 getSubPixelInterpolationOffsetBits() {
        return new VkUInt32(getVkMemory(), getSubPixelInterpolationOffsetBits(getVkAddress()));
    }

    public void setSubPixelInterpolationOffsetBits(VkUInt32 subPixelInterpolationOffsetBits) {
        setSubPixelInterpolationOffsetBits(getVkAddress(), subPixelInterpolationOffsetBits.getVkAddress());
    }

    private static native long getSubPixelInterpolationOffsetBits(long address);
    private static native void setSubPixelInterpolationOffsetBits(long address, long subPixelInterpolationOffsetBits);

    public VkUInt32 getMaxFramebufferWidth() {
        return new VkUInt32(getVkMemory(), getMaxFramebufferWidth(getVkAddress()));
    }

    public void setMaxFramebufferWidth(VkUInt32 maxFramebufferWidth) {
        setMaxFramebufferWidth(getVkAddress(), maxFramebufferWidth.getVkAddress());
    }

    private static native long getMaxFramebufferWidth(long address);
    private static native void setMaxFramebufferWidth(long address, long maxFramebufferWidth);

    public VkUInt32 getMaxFramebufferHeight() {
        return new VkUInt32(getVkMemory(), getMaxFramebufferHeight(getVkAddress()));
    }

    public void setMaxFramebufferHeight(VkUInt32 maxFramebufferHeight) {
        setMaxFramebufferHeight(getVkAddress(), maxFramebufferHeight.getVkAddress());
    }

    private static native long getMaxFramebufferHeight(long address);
    private static native void setMaxFramebufferHeight(long address, long maxFramebufferHeight);

    public VkUInt32 getMaxFramebufferLayers() {
        return new VkUInt32(getVkMemory(), getMaxFramebufferLayers(getVkAddress()));
    }

    public void setMaxFramebufferLayers(VkUInt32 maxFramebufferLayers) {
        setMaxFramebufferLayers(getVkAddress(), maxFramebufferLayers.getVkAddress());
    }

    private static native long getMaxFramebufferLayers(long address);
    private static native void setMaxFramebufferLayers(long address, long maxFramebufferLayers);

    public VkSampleCountFlags getFramebufferColorSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getFramebufferColorSampleCounts(getVkAddress()));
    }

    public void setFramebufferColorSampleCounts(VkSampleCountFlags framebufferColorSampleCounts) {
        setFramebufferColorSampleCounts(getVkAddress(), framebufferColorSampleCounts.getVkAddress());
    }

    private static native long getFramebufferColorSampleCounts(long address);
    private static native void setFramebufferColorSampleCounts(long address, long framebufferColorSampleCounts);

    public VkSampleCountFlags getFramebufferDepthSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getFramebufferDepthSampleCounts(getVkAddress()));
    }

    public void setFramebufferDepthSampleCounts(VkSampleCountFlags framebufferDepthSampleCounts) {
        setFramebufferDepthSampleCounts(getVkAddress(), framebufferDepthSampleCounts.getVkAddress());
    }

    private static native long getFramebufferDepthSampleCounts(long address);
    private static native void setFramebufferDepthSampleCounts(long address, long framebufferDepthSampleCounts);

    public VkSampleCountFlags getFramebufferStencilSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getFramebufferStencilSampleCounts(getVkAddress()));
    }

    public void setFramebufferStencilSampleCounts(VkSampleCountFlags framebufferStencilSampleCounts) {
        setFramebufferStencilSampleCounts(getVkAddress(), framebufferStencilSampleCounts.getVkAddress());
    }

    private static native long getFramebufferStencilSampleCounts(long address);
    private static native void setFramebufferStencilSampleCounts(long address, long framebufferStencilSampleCounts);

    public VkSampleCountFlags getFramebufferNoAttachmentsSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getFramebufferNoAttachmentsSampleCounts(getVkAddress()));
    }

    public void setFramebufferNoAttachmentsSampleCounts(VkSampleCountFlags framebufferNoAttachmentsSampleCounts) {
        setFramebufferNoAttachmentsSampleCounts(getVkAddress(), framebufferNoAttachmentsSampleCounts.getVkAddress());
    }

    private static native long getFramebufferNoAttachmentsSampleCounts(long address);
    private static native void setFramebufferNoAttachmentsSampleCounts(long address, long framebufferNoAttachmentsSampleCounts);

    public VkUInt32 getMaxColorAttachments() {
        return new VkUInt32(getVkMemory(), getMaxColorAttachments(getVkAddress()));
    }

    public void setMaxColorAttachments(VkUInt32 maxColorAttachments) {
        setMaxColorAttachments(getVkAddress(), maxColorAttachments.getVkAddress());
    }

    private static native long getMaxColorAttachments(long address);
    private static native void setMaxColorAttachments(long address, long maxColorAttachments);

    public VkSampleCountFlags getSampledImageColorSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampledImageColorSampleCounts(getVkAddress()));
    }

    public void setSampledImageColorSampleCounts(VkSampleCountFlags sampledImageColorSampleCounts) {
        setSampledImageColorSampleCounts(getVkAddress(), sampledImageColorSampleCounts.getVkAddress());
    }

    private static native long getSampledImageColorSampleCounts(long address);
    private static native void setSampledImageColorSampleCounts(long address, long sampledImageColorSampleCounts);

    public VkSampleCountFlags getSampledImageIntegerSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampledImageIntegerSampleCounts(getVkAddress()));
    }

    public void setSampledImageIntegerSampleCounts(VkSampleCountFlags sampledImageIntegerSampleCounts) {
        setSampledImageIntegerSampleCounts(getVkAddress(), sampledImageIntegerSampleCounts.getVkAddress());
    }

    private static native long getSampledImageIntegerSampleCounts(long address);
    private static native void setSampledImageIntegerSampleCounts(long address, long sampledImageIntegerSampleCounts);

    public VkSampleCountFlags getSampledImageDepthSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampledImageDepthSampleCounts(getVkAddress()));
    }

    public void setSampledImageDepthSampleCounts(VkSampleCountFlags sampledImageDepthSampleCounts) {
        setSampledImageDepthSampleCounts(getVkAddress(), sampledImageDepthSampleCounts.getVkAddress());
    }

    private static native long getSampledImageDepthSampleCounts(long address);
    private static native void setSampledImageDepthSampleCounts(long address, long sampledImageDepthSampleCounts);

    public VkSampleCountFlags getSampledImageStencilSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampledImageStencilSampleCounts(getVkAddress()));
    }

    public void setSampledImageStencilSampleCounts(VkSampleCountFlags sampledImageStencilSampleCounts) {
        setSampledImageStencilSampleCounts(getVkAddress(), sampledImageStencilSampleCounts.getVkAddress());
    }

    private static native long getSampledImageStencilSampleCounts(long address);
    private static native void setSampledImageStencilSampleCounts(long address, long sampledImageStencilSampleCounts);

    public VkSampleCountFlags getStorageImageSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getStorageImageSampleCounts(getVkAddress()));
    }

    public void setStorageImageSampleCounts(VkSampleCountFlags storageImageSampleCounts) {
        setStorageImageSampleCounts(getVkAddress(), storageImageSampleCounts.getVkAddress());
    }

    private static native long getStorageImageSampleCounts(long address);
    private static native void setStorageImageSampleCounts(long address, long storageImageSampleCounts);

    public VkUInt32 getMaxSampleMaskWords() {
        return new VkUInt32(getVkMemory(), getMaxSampleMaskWords(getVkAddress()));
    }

    public void setMaxSampleMaskWords(VkUInt32 maxSampleMaskWords) {
        setMaxSampleMaskWords(getVkAddress(), maxSampleMaskWords.getVkAddress());
    }

    private static native long getMaxSampleMaskWords(long address);
    private static native void setMaxSampleMaskWords(long address, long maxSampleMaskWords);

    public VkBool32 getTimestampComputeAndGraphics() {
        return new VkBool32(getVkMemory(), getTimestampComputeAndGraphics(getVkAddress()));
    }

    public void setTimestampComputeAndGraphics(VkBool32 timestampComputeAndGraphics) {
        setTimestampComputeAndGraphics(getVkAddress(), timestampComputeAndGraphics.getVkAddress());
    }

    private static native long getTimestampComputeAndGraphics(long address);
    private static native void setTimestampComputeAndGraphics(long address, long timestampComputeAndGraphics);

    public VkFloat getTimestampPeriod() {
        return new VkFloat(getVkMemory(), getTimestampPeriod(getVkAddress()));
    }

    public void setTimestampPeriod(VkFloat timestampPeriod) {
        setTimestampPeriod(getVkAddress(), timestampPeriod.getVkAddress());
    }

    private static native long getTimestampPeriod(long address);
    private static native void setTimestampPeriod(long address, long timestampPeriod);

    public VkUInt32 getMaxClipDistances() {
        return new VkUInt32(getVkMemory(), getMaxClipDistances(getVkAddress()));
    }

    public void setMaxClipDistances(VkUInt32 maxClipDistances) {
        setMaxClipDistances(getVkAddress(), maxClipDistances.getVkAddress());
    }

    private static native long getMaxClipDistances(long address);
    private static native void setMaxClipDistances(long address, long maxClipDistances);

    public VkUInt32 getMaxCullDistances() {
        return new VkUInt32(getVkMemory(), getMaxCullDistances(getVkAddress()));
    }

    public void setMaxCullDistances(VkUInt32 maxCullDistances) {
        setMaxCullDistances(getVkAddress(), maxCullDistances.getVkAddress());
    }

    private static native long getMaxCullDistances(long address);
    private static native void setMaxCullDistances(long address, long maxCullDistances);

    public VkUInt32 getMaxCombinedClipAndCullDistances() {
        return new VkUInt32(getVkMemory(), getMaxCombinedClipAndCullDistances(getVkAddress()));
    }

    public void setMaxCombinedClipAndCullDistances(VkUInt32 maxCombinedClipAndCullDistances) {
        setMaxCombinedClipAndCullDistances(getVkAddress(), maxCombinedClipAndCullDistances.getVkAddress());
    }

    private static native long getMaxCombinedClipAndCullDistances(long address);
    private static native void setMaxCombinedClipAndCullDistances(long address, long maxCombinedClipAndCullDistances);

    public VkUInt32 getDiscreteQueuePriorities() {
        return new VkUInt32(getVkMemory(), getDiscreteQueuePriorities(getVkAddress()));
    }

    public void setDiscreteQueuePriorities(VkUInt32 discreteQueuePriorities) {
        setDiscreteQueuePriorities(getVkAddress(), discreteQueuePriorities.getVkAddress());
    }

    private static native long getDiscreteQueuePriorities(long address);
    private static native void setDiscreteQueuePriorities(long address, long discreteQueuePriorities);

    public VkFloat getPointSizeRange() {
        return new VkFloat(getVkMemory(), getPointSizeRange(getVkAddress()));
    }

    public void setPointSizeRange(VkFloat pointSizeRange) {
        setPointSizeRange(getVkAddress(), pointSizeRange.getVkAddress());
    }

    private static native long getPointSizeRange(long address);
    private static native void setPointSizeRange(long address, long pointSizeRange);

    public VkFloat getLineWidthRange() {
        return new VkFloat(getVkMemory(), getLineWidthRange(getVkAddress()));
    }

    public void setLineWidthRange(VkFloat lineWidthRange) {
        setLineWidthRange(getVkAddress(), lineWidthRange.getVkAddress());
    }

    private static native long getLineWidthRange(long address);
    private static native void setLineWidthRange(long address, long lineWidthRange);

    public VkFloat getPointSizeGranularity() {
        return new VkFloat(getVkMemory(), getPointSizeGranularity(getVkAddress()));
    }

    public void setPointSizeGranularity(VkFloat pointSizeGranularity) {
        setPointSizeGranularity(getVkAddress(), pointSizeGranularity.getVkAddress());
    }

    private static native long getPointSizeGranularity(long address);
    private static native void setPointSizeGranularity(long address, long pointSizeGranularity);

    public VkFloat getLineWidthGranularity() {
        return new VkFloat(getVkMemory(), getLineWidthGranularity(getVkAddress()));
    }

    public void setLineWidthGranularity(VkFloat lineWidthGranularity) {
        setLineWidthGranularity(getVkAddress(), lineWidthGranularity.getVkAddress());
    }

    private static native long getLineWidthGranularity(long address);
    private static native void setLineWidthGranularity(long address, long lineWidthGranularity);

    public VkBool32 getStrictLines() {
        return new VkBool32(getVkMemory(), getStrictLines(getVkAddress()));
    }

    public void setStrictLines(VkBool32 strictLines) {
        setStrictLines(getVkAddress(), strictLines.getVkAddress());
    }

    private static native long getStrictLines(long address);
    private static native void setStrictLines(long address, long strictLines);

    public VkBool32 getStandardSampleLocations() {
        return new VkBool32(getVkMemory(), getStandardSampleLocations(getVkAddress()));
    }

    public void setStandardSampleLocations(VkBool32 standardSampleLocations) {
        setStandardSampleLocations(getVkAddress(), standardSampleLocations.getVkAddress());
    }

    private static native long getStandardSampleLocations(long address);
    private static native void setStandardSampleLocations(long address, long standardSampleLocations);

    public VkDeviceSize getOptimalBufferCopyOffsetAlignment() {
        return new VkDeviceSize(getVkMemory(), getOptimalBufferCopyOffsetAlignment(getVkAddress()));
    }

    public void setOptimalBufferCopyOffsetAlignment(VkDeviceSize optimalBufferCopyOffsetAlignment) {
        setOptimalBufferCopyOffsetAlignment(getVkAddress(), optimalBufferCopyOffsetAlignment.getVkAddress());
    }

    private static native long getOptimalBufferCopyOffsetAlignment(long address);
    private static native void setOptimalBufferCopyOffsetAlignment(long address, long optimalBufferCopyOffsetAlignment);

    public VkDeviceSize getOptimalBufferCopyRowPitchAlignment() {
        return new VkDeviceSize(getVkMemory(), getOptimalBufferCopyRowPitchAlignment(getVkAddress()));
    }

    public void setOptimalBufferCopyRowPitchAlignment(VkDeviceSize optimalBufferCopyRowPitchAlignment) {
        setOptimalBufferCopyRowPitchAlignment(getVkAddress(), optimalBufferCopyRowPitchAlignment.getVkAddress());
    }

    private static native long getOptimalBufferCopyRowPitchAlignment(long address);
    private static native void setOptimalBufferCopyRowPitchAlignment(long address, long optimalBufferCopyRowPitchAlignment);

    public VkDeviceSize getNonCoherentAtomSize() {
        return new VkDeviceSize(getVkMemory(), getNonCoherentAtomSize(getVkAddress()));
    }

    public void setNonCoherentAtomSize(VkDeviceSize nonCoherentAtomSize) {
        setNonCoherentAtomSize(getVkAddress(), nonCoherentAtomSize.getVkAddress());
    }

    private static native long getNonCoherentAtomSize(long address);
    private static native void setNonCoherentAtomSize(long address, long nonCoherentAtomSize);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceLimits implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceLimits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkPhysicalDeviceLimits get(int i){
            return new VkPhysicalDeviceLimits(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
                this.count = count;
            }

            public Array(VkMemory vkmemory, int count) {
                super(vkmemory);
                this.count = count;
            }

            public Array(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress);
                this.count = count;
            }

            public Array(VkPhysicalDeviceLimits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
