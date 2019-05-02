package cz.mg.vulkan;

public class VkPhysicalDeviceLimits extends VkObject {
    public VkPhysicalDeviceLimits() {
        super(sizeof());
    }

    protected VkPhysicalDeviceLimits(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceLimits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceLimits(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getMaxImageDimension1D() {
        return new VkUInt32(getVkMemory(), getMaxImageDimension1DNative(getVkAddress()));
    }

    
    public void setMaxImageDimension1D(VkUInt32 maxImageDimension1D) {
        setMaxImageDimension1DNative(getVkAddress(), maxImageDimension1D != null ? maxImageDimension1D.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxImageDimension1DQ() {
        return getMaxImageDimension1D().getValue();
    }

    public void setMaxImageDimension1D(int maxImageDimension1D) {
        getMaxImageDimension1D().setValue(maxImageDimension1D);
    }

    protected static native long getMaxImageDimension1DNative(long address);
    protected static native void setMaxImageDimension1DNative(long address, long maxImageDimension1D);

    public VkUInt32 getMaxImageDimension2D() {
        return new VkUInt32(getVkMemory(), getMaxImageDimension2DNative(getVkAddress()));
    }

    
    public void setMaxImageDimension2D(VkUInt32 maxImageDimension2D) {
        setMaxImageDimension2DNative(getVkAddress(), maxImageDimension2D != null ? maxImageDimension2D.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxImageDimension2DQ() {
        return getMaxImageDimension2D().getValue();
    }

    public void setMaxImageDimension2D(int maxImageDimension2D) {
        getMaxImageDimension2D().setValue(maxImageDimension2D);
    }

    protected static native long getMaxImageDimension2DNative(long address);
    protected static native void setMaxImageDimension2DNative(long address, long maxImageDimension2D);

    public VkUInt32 getMaxImageDimension3D() {
        return new VkUInt32(getVkMemory(), getMaxImageDimension3DNative(getVkAddress()));
    }

    
    public void setMaxImageDimension3D(VkUInt32 maxImageDimension3D) {
        setMaxImageDimension3DNative(getVkAddress(), maxImageDimension3D != null ? maxImageDimension3D.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxImageDimension3DQ() {
        return getMaxImageDimension3D().getValue();
    }

    public void setMaxImageDimension3D(int maxImageDimension3D) {
        getMaxImageDimension3D().setValue(maxImageDimension3D);
    }

    protected static native long getMaxImageDimension3DNative(long address);
    protected static native void setMaxImageDimension3DNative(long address, long maxImageDimension3D);

    public VkUInt32 getMaxImageDimensionCube() {
        return new VkUInt32(getVkMemory(), getMaxImageDimensionCubeNative(getVkAddress()));
    }

    
    public void setMaxImageDimensionCube(VkUInt32 maxImageDimensionCube) {
        setMaxImageDimensionCubeNative(getVkAddress(), maxImageDimensionCube != null ? maxImageDimensionCube.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxImageDimensionCubeQ() {
        return getMaxImageDimensionCube().getValue();
    }

    public void setMaxImageDimensionCube(int maxImageDimensionCube) {
        getMaxImageDimensionCube().setValue(maxImageDimensionCube);
    }

    protected static native long getMaxImageDimensionCubeNative(long address);
    protected static native void setMaxImageDimensionCubeNative(long address, long maxImageDimensionCube);

    public VkUInt32 getMaxImageArrayLayers() {
        return new VkUInt32(getVkMemory(), getMaxImageArrayLayersNative(getVkAddress()));
    }

    
    public void setMaxImageArrayLayers(VkUInt32 maxImageArrayLayers) {
        setMaxImageArrayLayersNative(getVkAddress(), maxImageArrayLayers != null ? maxImageArrayLayers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxImageArrayLayersQ() {
        return getMaxImageArrayLayers().getValue();
    }

    public void setMaxImageArrayLayers(int maxImageArrayLayers) {
        getMaxImageArrayLayers().setValue(maxImageArrayLayers);
    }

    protected static native long getMaxImageArrayLayersNative(long address);
    protected static native void setMaxImageArrayLayersNative(long address, long maxImageArrayLayers);

    public VkUInt32 getMaxTexelBufferElements() {
        return new VkUInt32(getVkMemory(), getMaxTexelBufferElementsNative(getVkAddress()));
    }

    
    public void setMaxTexelBufferElements(VkUInt32 maxTexelBufferElements) {
        setMaxTexelBufferElementsNative(getVkAddress(), maxTexelBufferElements != null ? maxTexelBufferElements.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTexelBufferElementsQ() {
        return getMaxTexelBufferElements().getValue();
    }

    public void setMaxTexelBufferElements(int maxTexelBufferElements) {
        getMaxTexelBufferElements().setValue(maxTexelBufferElements);
    }

    protected static native long getMaxTexelBufferElementsNative(long address);
    protected static native void setMaxTexelBufferElementsNative(long address, long maxTexelBufferElements);

    public VkUInt32 getMaxUniformBufferRange() {
        return new VkUInt32(getVkMemory(), getMaxUniformBufferRangeNative(getVkAddress()));
    }

    
    public void setMaxUniformBufferRange(VkUInt32 maxUniformBufferRange) {
        setMaxUniformBufferRangeNative(getVkAddress(), maxUniformBufferRange != null ? maxUniformBufferRange.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxUniformBufferRangeQ() {
        return getMaxUniformBufferRange().getValue();
    }

    public void setMaxUniformBufferRange(int maxUniformBufferRange) {
        getMaxUniformBufferRange().setValue(maxUniformBufferRange);
    }

    protected static native long getMaxUniformBufferRangeNative(long address);
    protected static native void setMaxUniformBufferRangeNative(long address, long maxUniformBufferRange);

    public VkUInt32 getMaxStorageBufferRange() {
        return new VkUInt32(getVkMemory(), getMaxStorageBufferRangeNative(getVkAddress()));
    }

    
    public void setMaxStorageBufferRange(VkUInt32 maxStorageBufferRange) {
        setMaxStorageBufferRangeNative(getVkAddress(), maxStorageBufferRange != null ? maxStorageBufferRange.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxStorageBufferRangeQ() {
        return getMaxStorageBufferRange().getValue();
    }

    public void setMaxStorageBufferRange(int maxStorageBufferRange) {
        getMaxStorageBufferRange().setValue(maxStorageBufferRange);
    }

    protected static native long getMaxStorageBufferRangeNative(long address);
    protected static native void setMaxStorageBufferRangeNative(long address, long maxStorageBufferRange);

    public VkUInt32 getMaxPushConstantsSize() {
        return new VkUInt32(getVkMemory(), getMaxPushConstantsSizeNative(getVkAddress()));
    }

    
    public void setMaxPushConstantsSize(VkUInt32 maxPushConstantsSize) {
        setMaxPushConstantsSizeNative(getVkAddress(), maxPushConstantsSize != null ? maxPushConstantsSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPushConstantsSizeQ() {
        return getMaxPushConstantsSize().getValue();
    }

    public void setMaxPushConstantsSize(int maxPushConstantsSize) {
        getMaxPushConstantsSize().setValue(maxPushConstantsSize);
    }

    protected static native long getMaxPushConstantsSizeNative(long address);
    protected static native void setMaxPushConstantsSizeNative(long address, long maxPushConstantsSize);

    public VkUInt32 getMaxMemoryAllocationCount() {
        return new VkUInt32(getVkMemory(), getMaxMemoryAllocationCountNative(getVkAddress()));
    }

    
    public void setMaxMemoryAllocationCount(VkUInt32 maxMemoryAllocationCount) {
        setMaxMemoryAllocationCountNative(getVkAddress(), maxMemoryAllocationCount != null ? maxMemoryAllocationCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxMemoryAllocationCountQ() {
        return getMaxMemoryAllocationCount().getValue();
    }

    public void setMaxMemoryAllocationCount(int maxMemoryAllocationCount) {
        getMaxMemoryAllocationCount().setValue(maxMemoryAllocationCount);
    }

    protected static native long getMaxMemoryAllocationCountNative(long address);
    protected static native void setMaxMemoryAllocationCountNative(long address, long maxMemoryAllocationCount);

    public VkUInt32 getMaxSamplerAllocationCount() {
        return new VkUInt32(getVkMemory(), getMaxSamplerAllocationCountNative(getVkAddress()));
    }

    
    public void setMaxSamplerAllocationCount(VkUInt32 maxSamplerAllocationCount) {
        setMaxSamplerAllocationCountNative(getVkAddress(), maxSamplerAllocationCount != null ? maxSamplerAllocationCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxSamplerAllocationCountQ() {
        return getMaxSamplerAllocationCount().getValue();
    }

    public void setMaxSamplerAllocationCount(int maxSamplerAllocationCount) {
        getMaxSamplerAllocationCount().setValue(maxSamplerAllocationCount);
    }

    protected static native long getMaxSamplerAllocationCountNative(long address);
    protected static native void setMaxSamplerAllocationCountNative(long address, long maxSamplerAllocationCount);

    public VkDeviceSize getBufferImageGranularity() {
        return new VkDeviceSize(getVkMemory(), getBufferImageGranularityNative(getVkAddress()));
    }

    
    public void setBufferImageGranularity(VkDeviceSize bufferImageGranularity) {
        setBufferImageGranularityNative(getVkAddress(), bufferImageGranularity != null ? bufferImageGranularity.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getBufferImageGranularityQ() {
        return getBufferImageGranularity().getValue();
    }

    public void setBufferImageGranularity(long bufferImageGranularity) {
        getBufferImageGranularity().setValue(bufferImageGranularity);
    }

    protected static native long getBufferImageGranularityNative(long address);
    protected static native void setBufferImageGranularityNative(long address, long bufferImageGranularity);

    public VkDeviceSize getSparseAddressSpaceSize() {
        return new VkDeviceSize(getVkMemory(), getSparseAddressSpaceSizeNative(getVkAddress()));
    }

    
    public void setSparseAddressSpaceSize(VkDeviceSize sparseAddressSpaceSize) {
        setSparseAddressSpaceSizeNative(getVkAddress(), sparseAddressSpaceSize != null ? sparseAddressSpaceSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getSparseAddressSpaceSizeQ() {
        return getSparseAddressSpaceSize().getValue();
    }

    public void setSparseAddressSpaceSize(long sparseAddressSpaceSize) {
        getSparseAddressSpaceSize().setValue(sparseAddressSpaceSize);
    }

    protected static native long getSparseAddressSpaceSizeNative(long address);
    protected static native void setSparseAddressSpaceSizeNative(long address, long sparseAddressSpaceSize);

    public VkUInt32 getMaxBoundDescriptorSets() {
        return new VkUInt32(getVkMemory(), getMaxBoundDescriptorSetsNative(getVkAddress()));
    }

    
    public void setMaxBoundDescriptorSets(VkUInt32 maxBoundDescriptorSets) {
        setMaxBoundDescriptorSetsNative(getVkAddress(), maxBoundDescriptorSets != null ? maxBoundDescriptorSets.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxBoundDescriptorSetsQ() {
        return getMaxBoundDescriptorSets().getValue();
    }

    public void setMaxBoundDescriptorSets(int maxBoundDescriptorSets) {
        getMaxBoundDescriptorSets().setValue(maxBoundDescriptorSets);
    }

    protected static native long getMaxBoundDescriptorSetsNative(long address);
    protected static native void setMaxBoundDescriptorSetsNative(long address, long maxBoundDescriptorSets);

    public VkUInt32 getMaxPerStageDescriptorSamplers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorSamplersNative(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorSamplers(VkUInt32 maxPerStageDescriptorSamplers) {
        setMaxPerStageDescriptorSamplersNative(getVkAddress(), maxPerStageDescriptorSamplers != null ? maxPerStageDescriptorSamplers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorSamplersQ() {
        return getMaxPerStageDescriptorSamplers().getValue();
    }

    public void setMaxPerStageDescriptorSamplers(int maxPerStageDescriptorSamplers) {
        getMaxPerStageDescriptorSamplers().setValue(maxPerStageDescriptorSamplers);
    }

    protected static native long getMaxPerStageDescriptorSamplersNative(long address);
    protected static native void setMaxPerStageDescriptorSamplersNative(long address, long maxPerStageDescriptorSamplers);

    public VkUInt32 getMaxPerStageDescriptorUniformBuffers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUniformBuffersNative(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUniformBuffers(VkUInt32 maxPerStageDescriptorUniformBuffers) {
        setMaxPerStageDescriptorUniformBuffersNative(getVkAddress(), maxPerStageDescriptorUniformBuffers != null ? maxPerStageDescriptorUniformBuffers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorUniformBuffersQ() {
        return getMaxPerStageDescriptorUniformBuffers().getValue();
    }

    public void setMaxPerStageDescriptorUniformBuffers(int maxPerStageDescriptorUniformBuffers) {
        getMaxPerStageDescriptorUniformBuffers().setValue(maxPerStageDescriptorUniformBuffers);
    }

    protected static native long getMaxPerStageDescriptorUniformBuffersNative(long address);
    protected static native void setMaxPerStageDescriptorUniformBuffersNative(long address, long maxPerStageDescriptorUniformBuffers);

    public VkUInt32 getMaxPerStageDescriptorStorageBuffers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorStorageBuffersNative(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorStorageBuffers(VkUInt32 maxPerStageDescriptorStorageBuffers) {
        setMaxPerStageDescriptorStorageBuffersNative(getVkAddress(), maxPerStageDescriptorStorageBuffers != null ? maxPerStageDescriptorStorageBuffers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorStorageBuffersQ() {
        return getMaxPerStageDescriptorStorageBuffers().getValue();
    }

    public void setMaxPerStageDescriptorStorageBuffers(int maxPerStageDescriptorStorageBuffers) {
        getMaxPerStageDescriptorStorageBuffers().setValue(maxPerStageDescriptorStorageBuffers);
    }

    protected static native long getMaxPerStageDescriptorStorageBuffersNative(long address);
    protected static native void setMaxPerStageDescriptorStorageBuffersNative(long address, long maxPerStageDescriptorStorageBuffers);

    public VkUInt32 getMaxPerStageDescriptorSampledImages() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorSampledImagesNative(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorSampledImages(VkUInt32 maxPerStageDescriptorSampledImages) {
        setMaxPerStageDescriptorSampledImagesNative(getVkAddress(), maxPerStageDescriptorSampledImages != null ? maxPerStageDescriptorSampledImages.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorSampledImagesQ() {
        return getMaxPerStageDescriptorSampledImages().getValue();
    }

    public void setMaxPerStageDescriptorSampledImages(int maxPerStageDescriptorSampledImages) {
        getMaxPerStageDescriptorSampledImages().setValue(maxPerStageDescriptorSampledImages);
    }

    protected static native long getMaxPerStageDescriptorSampledImagesNative(long address);
    protected static native void setMaxPerStageDescriptorSampledImagesNative(long address, long maxPerStageDescriptorSampledImages);

    public VkUInt32 getMaxPerStageDescriptorStorageImages() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorStorageImagesNative(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorStorageImages(VkUInt32 maxPerStageDescriptorStorageImages) {
        setMaxPerStageDescriptorStorageImagesNative(getVkAddress(), maxPerStageDescriptorStorageImages != null ? maxPerStageDescriptorStorageImages.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorStorageImagesQ() {
        return getMaxPerStageDescriptorStorageImages().getValue();
    }

    public void setMaxPerStageDescriptorStorageImages(int maxPerStageDescriptorStorageImages) {
        getMaxPerStageDescriptorStorageImages().setValue(maxPerStageDescriptorStorageImages);
    }

    protected static native long getMaxPerStageDescriptorStorageImagesNative(long address);
    protected static native void setMaxPerStageDescriptorStorageImagesNative(long address, long maxPerStageDescriptorStorageImages);

    public VkUInt32 getMaxPerStageDescriptorInputAttachments() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorInputAttachmentsNative(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorInputAttachments(VkUInt32 maxPerStageDescriptorInputAttachments) {
        setMaxPerStageDescriptorInputAttachmentsNative(getVkAddress(), maxPerStageDescriptorInputAttachments != null ? maxPerStageDescriptorInputAttachments.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorInputAttachmentsQ() {
        return getMaxPerStageDescriptorInputAttachments().getValue();
    }

    public void setMaxPerStageDescriptorInputAttachments(int maxPerStageDescriptorInputAttachments) {
        getMaxPerStageDescriptorInputAttachments().setValue(maxPerStageDescriptorInputAttachments);
    }

    protected static native long getMaxPerStageDescriptorInputAttachmentsNative(long address);
    protected static native void setMaxPerStageDescriptorInputAttachmentsNative(long address, long maxPerStageDescriptorInputAttachments);

    public VkUInt32 getMaxPerStageResources() {
        return new VkUInt32(getVkMemory(), getMaxPerStageResourcesNative(getVkAddress()));
    }

    
    public void setMaxPerStageResources(VkUInt32 maxPerStageResources) {
        setMaxPerStageResourcesNative(getVkAddress(), maxPerStageResources != null ? maxPerStageResources.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageResourcesQ() {
        return getMaxPerStageResources().getValue();
    }

    public void setMaxPerStageResources(int maxPerStageResources) {
        getMaxPerStageResources().setValue(maxPerStageResources);
    }

    protected static native long getMaxPerStageResourcesNative(long address);
    protected static native void setMaxPerStageResourcesNative(long address, long maxPerStageResources);

    public VkUInt32 getMaxDescriptorSetSamplers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetSamplersNative(getVkAddress()));
    }

    
    public void setMaxDescriptorSetSamplers(VkUInt32 maxDescriptorSetSamplers) {
        setMaxDescriptorSetSamplersNative(getVkAddress(), maxDescriptorSetSamplers != null ? maxDescriptorSetSamplers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetSamplersQ() {
        return getMaxDescriptorSetSamplers().getValue();
    }

    public void setMaxDescriptorSetSamplers(int maxDescriptorSetSamplers) {
        getMaxDescriptorSetSamplers().setValue(maxDescriptorSetSamplers);
    }

    protected static native long getMaxDescriptorSetSamplersNative(long address);
    protected static native void setMaxDescriptorSetSamplersNative(long address, long maxDescriptorSetSamplers);

    public VkUInt32 getMaxDescriptorSetUniformBuffers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUniformBuffersNative(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUniformBuffers(VkUInt32 maxDescriptorSetUniformBuffers) {
        setMaxDescriptorSetUniformBuffersNative(getVkAddress(), maxDescriptorSetUniformBuffers != null ? maxDescriptorSetUniformBuffers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetUniformBuffersQ() {
        return getMaxDescriptorSetUniformBuffers().getValue();
    }

    public void setMaxDescriptorSetUniformBuffers(int maxDescriptorSetUniformBuffers) {
        getMaxDescriptorSetUniformBuffers().setValue(maxDescriptorSetUniformBuffers);
    }

    protected static native long getMaxDescriptorSetUniformBuffersNative(long address);
    protected static native void setMaxDescriptorSetUniformBuffersNative(long address, long maxDescriptorSetUniformBuffers);

    public VkUInt32 getMaxDescriptorSetUniformBuffersDynamic() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUniformBuffersDynamicNative(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUniformBuffersDynamic(VkUInt32 maxDescriptorSetUniformBuffersDynamic) {
        setMaxDescriptorSetUniformBuffersDynamicNative(getVkAddress(), maxDescriptorSetUniformBuffersDynamic != null ? maxDescriptorSetUniformBuffersDynamic.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetUniformBuffersDynamicQ() {
        return getMaxDescriptorSetUniformBuffersDynamic().getValue();
    }

    public void setMaxDescriptorSetUniformBuffersDynamic(int maxDescriptorSetUniformBuffersDynamic) {
        getMaxDescriptorSetUniformBuffersDynamic().setValue(maxDescriptorSetUniformBuffersDynamic);
    }

    protected static native long getMaxDescriptorSetUniformBuffersDynamicNative(long address);
    protected static native void setMaxDescriptorSetUniformBuffersDynamicNative(long address, long maxDescriptorSetUniformBuffersDynamic);

    public VkUInt32 getMaxDescriptorSetStorageBuffers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetStorageBuffersNative(getVkAddress()));
    }

    
    public void setMaxDescriptorSetStorageBuffers(VkUInt32 maxDescriptorSetStorageBuffers) {
        setMaxDescriptorSetStorageBuffersNative(getVkAddress(), maxDescriptorSetStorageBuffers != null ? maxDescriptorSetStorageBuffers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetStorageBuffersQ() {
        return getMaxDescriptorSetStorageBuffers().getValue();
    }

    public void setMaxDescriptorSetStorageBuffers(int maxDescriptorSetStorageBuffers) {
        getMaxDescriptorSetStorageBuffers().setValue(maxDescriptorSetStorageBuffers);
    }

    protected static native long getMaxDescriptorSetStorageBuffersNative(long address);
    protected static native void setMaxDescriptorSetStorageBuffersNative(long address, long maxDescriptorSetStorageBuffers);

    public VkUInt32 getMaxDescriptorSetStorageBuffersDynamic() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetStorageBuffersDynamicNative(getVkAddress()));
    }

    
    public void setMaxDescriptorSetStorageBuffersDynamic(VkUInt32 maxDescriptorSetStorageBuffersDynamic) {
        setMaxDescriptorSetStorageBuffersDynamicNative(getVkAddress(), maxDescriptorSetStorageBuffersDynamic != null ? maxDescriptorSetStorageBuffersDynamic.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetStorageBuffersDynamicQ() {
        return getMaxDescriptorSetStorageBuffersDynamic().getValue();
    }

    public void setMaxDescriptorSetStorageBuffersDynamic(int maxDescriptorSetStorageBuffersDynamic) {
        getMaxDescriptorSetStorageBuffersDynamic().setValue(maxDescriptorSetStorageBuffersDynamic);
    }

    protected static native long getMaxDescriptorSetStorageBuffersDynamicNative(long address);
    protected static native void setMaxDescriptorSetStorageBuffersDynamicNative(long address, long maxDescriptorSetStorageBuffersDynamic);

    public VkUInt32 getMaxDescriptorSetSampledImages() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetSampledImagesNative(getVkAddress()));
    }

    
    public void setMaxDescriptorSetSampledImages(VkUInt32 maxDescriptorSetSampledImages) {
        setMaxDescriptorSetSampledImagesNative(getVkAddress(), maxDescriptorSetSampledImages != null ? maxDescriptorSetSampledImages.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetSampledImagesQ() {
        return getMaxDescriptorSetSampledImages().getValue();
    }

    public void setMaxDescriptorSetSampledImages(int maxDescriptorSetSampledImages) {
        getMaxDescriptorSetSampledImages().setValue(maxDescriptorSetSampledImages);
    }

    protected static native long getMaxDescriptorSetSampledImagesNative(long address);
    protected static native void setMaxDescriptorSetSampledImagesNative(long address, long maxDescriptorSetSampledImages);

    public VkUInt32 getMaxDescriptorSetStorageImages() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetStorageImagesNative(getVkAddress()));
    }

    
    public void setMaxDescriptorSetStorageImages(VkUInt32 maxDescriptorSetStorageImages) {
        setMaxDescriptorSetStorageImagesNative(getVkAddress(), maxDescriptorSetStorageImages != null ? maxDescriptorSetStorageImages.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetStorageImagesQ() {
        return getMaxDescriptorSetStorageImages().getValue();
    }

    public void setMaxDescriptorSetStorageImages(int maxDescriptorSetStorageImages) {
        getMaxDescriptorSetStorageImages().setValue(maxDescriptorSetStorageImages);
    }

    protected static native long getMaxDescriptorSetStorageImagesNative(long address);
    protected static native void setMaxDescriptorSetStorageImagesNative(long address, long maxDescriptorSetStorageImages);

    public VkUInt32 getMaxDescriptorSetInputAttachments() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetInputAttachmentsNative(getVkAddress()));
    }

    
    public void setMaxDescriptorSetInputAttachments(VkUInt32 maxDescriptorSetInputAttachments) {
        setMaxDescriptorSetInputAttachmentsNative(getVkAddress(), maxDescriptorSetInputAttachments != null ? maxDescriptorSetInputAttachments.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetInputAttachmentsQ() {
        return getMaxDescriptorSetInputAttachments().getValue();
    }

    public void setMaxDescriptorSetInputAttachments(int maxDescriptorSetInputAttachments) {
        getMaxDescriptorSetInputAttachments().setValue(maxDescriptorSetInputAttachments);
    }

    protected static native long getMaxDescriptorSetInputAttachmentsNative(long address);
    protected static native void setMaxDescriptorSetInputAttachmentsNative(long address, long maxDescriptorSetInputAttachments);

    public VkUInt32 getMaxVertexInputAttributes() {
        return new VkUInt32(getVkMemory(), getMaxVertexInputAttributesNative(getVkAddress()));
    }

    
    public void setMaxVertexInputAttributes(VkUInt32 maxVertexInputAttributes) {
        setMaxVertexInputAttributesNative(getVkAddress(), maxVertexInputAttributes != null ? maxVertexInputAttributes.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxVertexInputAttributesQ() {
        return getMaxVertexInputAttributes().getValue();
    }

    public void setMaxVertexInputAttributes(int maxVertexInputAttributes) {
        getMaxVertexInputAttributes().setValue(maxVertexInputAttributes);
    }

    protected static native long getMaxVertexInputAttributesNative(long address);
    protected static native void setMaxVertexInputAttributesNative(long address, long maxVertexInputAttributes);

    public VkUInt32 getMaxVertexInputBindings() {
        return new VkUInt32(getVkMemory(), getMaxVertexInputBindingsNative(getVkAddress()));
    }

    
    public void setMaxVertexInputBindings(VkUInt32 maxVertexInputBindings) {
        setMaxVertexInputBindingsNative(getVkAddress(), maxVertexInputBindings != null ? maxVertexInputBindings.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxVertexInputBindingsQ() {
        return getMaxVertexInputBindings().getValue();
    }

    public void setMaxVertexInputBindings(int maxVertexInputBindings) {
        getMaxVertexInputBindings().setValue(maxVertexInputBindings);
    }

    protected static native long getMaxVertexInputBindingsNative(long address);
    protected static native void setMaxVertexInputBindingsNative(long address, long maxVertexInputBindings);

    public VkUInt32 getMaxVertexInputAttributeOffset() {
        return new VkUInt32(getVkMemory(), getMaxVertexInputAttributeOffsetNative(getVkAddress()));
    }

    
    public void setMaxVertexInputAttributeOffset(VkUInt32 maxVertexInputAttributeOffset) {
        setMaxVertexInputAttributeOffsetNative(getVkAddress(), maxVertexInputAttributeOffset != null ? maxVertexInputAttributeOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxVertexInputAttributeOffsetQ() {
        return getMaxVertexInputAttributeOffset().getValue();
    }

    public void setMaxVertexInputAttributeOffset(int maxVertexInputAttributeOffset) {
        getMaxVertexInputAttributeOffset().setValue(maxVertexInputAttributeOffset);
    }

    protected static native long getMaxVertexInputAttributeOffsetNative(long address);
    protected static native void setMaxVertexInputAttributeOffsetNative(long address, long maxVertexInputAttributeOffset);

    public VkUInt32 getMaxVertexInputBindingStride() {
        return new VkUInt32(getVkMemory(), getMaxVertexInputBindingStrideNative(getVkAddress()));
    }

    
    public void setMaxVertexInputBindingStride(VkUInt32 maxVertexInputBindingStride) {
        setMaxVertexInputBindingStrideNative(getVkAddress(), maxVertexInputBindingStride != null ? maxVertexInputBindingStride.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxVertexInputBindingStrideQ() {
        return getMaxVertexInputBindingStride().getValue();
    }

    public void setMaxVertexInputBindingStride(int maxVertexInputBindingStride) {
        getMaxVertexInputBindingStride().setValue(maxVertexInputBindingStride);
    }

    protected static native long getMaxVertexInputBindingStrideNative(long address);
    protected static native void setMaxVertexInputBindingStrideNative(long address, long maxVertexInputBindingStride);

    public VkUInt32 getMaxVertexOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxVertexOutputComponentsNative(getVkAddress()));
    }

    
    public void setMaxVertexOutputComponents(VkUInt32 maxVertexOutputComponents) {
        setMaxVertexOutputComponentsNative(getVkAddress(), maxVertexOutputComponents != null ? maxVertexOutputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxVertexOutputComponentsQ() {
        return getMaxVertexOutputComponents().getValue();
    }

    public void setMaxVertexOutputComponents(int maxVertexOutputComponents) {
        getMaxVertexOutputComponents().setValue(maxVertexOutputComponents);
    }

    protected static native long getMaxVertexOutputComponentsNative(long address);
    protected static native void setMaxVertexOutputComponentsNative(long address, long maxVertexOutputComponents);

    public VkUInt32 getMaxTessellationGenerationLevel() {
        return new VkUInt32(getVkMemory(), getMaxTessellationGenerationLevelNative(getVkAddress()));
    }

    
    public void setMaxTessellationGenerationLevel(VkUInt32 maxTessellationGenerationLevel) {
        setMaxTessellationGenerationLevelNative(getVkAddress(), maxTessellationGenerationLevel != null ? maxTessellationGenerationLevel.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTessellationGenerationLevelQ() {
        return getMaxTessellationGenerationLevel().getValue();
    }

    public void setMaxTessellationGenerationLevel(int maxTessellationGenerationLevel) {
        getMaxTessellationGenerationLevel().setValue(maxTessellationGenerationLevel);
    }

    protected static native long getMaxTessellationGenerationLevelNative(long address);
    protected static native void setMaxTessellationGenerationLevelNative(long address, long maxTessellationGenerationLevel);

    public VkUInt32 getMaxTessellationPatchSize() {
        return new VkUInt32(getVkMemory(), getMaxTessellationPatchSizeNative(getVkAddress()));
    }

    
    public void setMaxTessellationPatchSize(VkUInt32 maxTessellationPatchSize) {
        setMaxTessellationPatchSizeNative(getVkAddress(), maxTessellationPatchSize != null ? maxTessellationPatchSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTessellationPatchSizeQ() {
        return getMaxTessellationPatchSize().getValue();
    }

    public void setMaxTessellationPatchSize(int maxTessellationPatchSize) {
        getMaxTessellationPatchSize().setValue(maxTessellationPatchSize);
    }

    protected static native long getMaxTessellationPatchSizeNative(long address);
    protected static native void setMaxTessellationPatchSizeNative(long address, long maxTessellationPatchSize);

    public VkUInt32 getMaxTessellationControlPerVertexInputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationControlPerVertexInputComponentsNative(getVkAddress()));
    }

    
    public void setMaxTessellationControlPerVertexInputComponents(VkUInt32 maxTessellationControlPerVertexInputComponents) {
        setMaxTessellationControlPerVertexInputComponentsNative(getVkAddress(), maxTessellationControlPerVertexInputComponents != null ? maxTessellationControlPerVertexInputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTessellationControlPerVertexInputComponentsQ() {
        return getMaxTessellationControlPerVertexInputComponents().getValue();
    }

    public void setMaxTessellationControlPerVertexInputComponents(int maxTessellationControlPerVertexInputComponents) {
        getMaxTessellationControlPerVertexInputComponents().setValue(maxTessellationControlPerVertexInputComponents);
    }

    protected static native long getMaxTessellationControlPerVertexInputComponentsNative(long address);
    protected static native void setMaxTessellationControlPerVertexInputComponentsNative(long address, long maxTessellationControlPerVertexInputComponents);

    public VkUInt32 getMaxTessellationControlPerVertexOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationControlPerVertexOutputComponentsNative(getVkAddress()));
    }

    
    public void setMaxTessellationControlPerVertexOutputComponents(VkUInt32 maxTessellationControlPerVertexOutputComponents) {
        setMaxTessellationControlPerVertexOutputComponentsNative(getVkAddress(), maxTessellationControlPerVertexOutputComponents != null ? maxTessellationControlPerVertexOutputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTessellationControlPerVertexOutputComponentsQ() {
        return getMaxTessellationControlPerVertexOutputComponents().getValue();
    }

    public void setMaxTessellationControlPerVertexOutputComponents(int maxTessellationControlPerVertexOutputComponents) {
        getMaxTessellationControlPerVertexOutputComponents().setValue(maxTessellationControlPerVertexOutputComponents);
    }

    protected static native long getMaxTessellationControlPerVertexOutputComponentsNative(long address);
    protected static native void setMaxTessellationControlPerVertexOutputComponentsNative(long address, long maxTessellationControlPerVertexOutputComponents);

    public VkUInt32 getMaxTessellationControlPerPatchOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationControlPerPatchOutputComponentsNative(getVkAddress()));
    }

    
    public void setMaxTessellationControlPerPatchOutputComponents(VkUInt32 maxTessellationControlPerPatchOutputComponents) {
        setMaxTessellationControlPerPatchOutputComponentsNative(getVkAddress(), maxTessellationControlPerPatchOutputComponents != null ? maxTessellationControlPerPatchOutputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTessellationControlPerPatchOutputComponentsQ() {
        return getMaxTessellationControlPerPatchOutputComponents().getValue();
    }

    public void setMaxTessellationControlPerPatchOutputComponents(int maxTessellationControlPerPatchOutputComponents) {
        getMaxTessellationControlPerPatchOutputComponents().setValue(maxTessellationControlPerPatchOutputComponents);
    }

    protected static native long getMaxTessellationControlPerPatchOutputComponentsNative(long address);
    protected static native void setMaxTessellationControlPerPatchOutputComponentsNative(long address, long maxTessellationControlPerPatchOutputComponents);

    public VkUInt32 getMaxTessellationControlTotalOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationControlTotalOutputComponentsNative(getVkAddress()));
    }

    
    public void setMaxTessellationControlTotalOutputComponents(VkUInt32 maxTessellationControlTotalOutputComponents) {
        setMaxTessellationControlTotalOutputComponentsNative(getVkAddress(), maxTessellationControlTotalOutputComponents != null ? maxTessellationControlTotalOutputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTessellationControlTotalOutputComponentsQ() {
        return getMaxTessellationControlTotalOutputComponents().getValue();
    }

    public void setMaxTessellationControlTotalOutputComponents(int maxTessellationControlTotalOutputComponents) {
        getMaxTessellationControlTotalOutputComponents().setValue(maxTessellationControlTotalOutputComponents);
    }

    protected static native long getMaxTessellationControlTotalOutputComponentsNative(long address);
    protected static native void setMaxTessellationControlTotalOutputComponentsNative(long address, long maxTessellationControlTotalOutputComponents);

    public VkUInt32 getMaxTessellationEvaluationInputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationEvaluationInputComponentsNative(getVkAddress()));
    }

    
    public void setMaxTessellationEvaluationInputComponents(VkUInt32 maxTessellationEvaluationInputComponents) {
        setMaxTessellationEvaluationInputComponentsNative(getVkAddress(), maxTessellationEvaluationInputComponents != null ? maxTessellationEvaluationInputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTessellationEvaluationInputComponentsQ() {
        return getMaxTessellationEvaluationInputComponents().getValue();
    }

    public void setMaxTessellationEvaluationInputComponents(int maxTessellationEvaluationInputComponents) {
        getMaxTessellationEvaluationInputComponents().setValue(maxTessellationEvaluationInputComponents);
    }

    protected static native long getMaxTessellationEvaluationInputComponentsNative(long address);
    protected static native void setMaxTessellationEvaluationInputComponentsNative(long address, long maxTessellationEvaluationInputComponents);

    public VkUInt32 getMaxTessellationEvaluationOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationEvaluationOutputComponentsNative(getVkAddress()));
    }

    
    public void setMaxTessellationEvaluationOutputComponents(VkUInt32 maxTessellationEvaluationOutputComponents) {
        setMaxTessellationEvaluationOutputComponentsNative(getVkAddress(), maxTessellationEvaluationOutputComponents != null ? maxTessellationEvaluationOutputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTessellationEvaluationOutputComponentsQ() {
        return getMaxTessellationEvaluationOutputComponents().getValue();
    }

    public void setMaxTessellationEvaluationOutputComponents(int maxTessellationEvaluationOutputComponents) {
        getMaxTessellationEvaluationOutputComponents().setValue(maxTessellationEvaluationOutputComponents);
    }

    protected static native long getMaxTessellationEvaluationOutputComponentsNative(long address);
    protected static native void setMaxTessellationEvaluationOutputComponentsNative(long address, long maxTessellationEvaluationOutputComponents);

    public VkUInt32 getMaxGeometryShaderInvocations() {
        return new VkUInt32(getVkMemory(), getMaxGeometryShaderInvocationsNative(getVkAddress()));
    }

    
    public void setMaxGeometryShaderInvocations(VkUInt32 maxGeometryShaderInvocations) {
        setMaxGeometryShaderInvocationsNative(getVkAddress(), maxGeometryShaderInvocations != null ? maxGeometryShaderInvocations.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxGeometryShaderInvocationsQ() {
        return getMaxGeometryShaderInvocations().getValue();
    }

    public void setMaxGeometryShaderInvocations(int maxGeometryShaderInvocations) {
        getMaxGeometryShaderInvocations().setValue(maxGeometryShaderInvocations);
    }

    protected static native long getMaxGeometryShaderInvocationsNative(long address);
    protected static native void setMaxGeometryShaderInvocationsNative(long address, long maxGeometryShaderInvocations);

    public VkUInt32 getMaxGeometryInputComponents() {
        return new VkUInt32(getVkMemory(), getMaxGeometryInputComponentsNative(getVkAddress()));
    }

    
    public void setMaxGeometryInputComponents(VkUInt32 maxGeometryInputComponents) {
        setMaxGeometryInputComponentsNative(getVkAddress(), maxGeometryInputComponents != null ? maxGeometryInputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxGeometryInputComponentsQ() {
        return getMaxGeometryInputComponents().getValue();
    }

    public void setMaxGeometryInputComponents(int maxGeometryInputComponents) {
        getMaxGeometryInputComponents().setValue(maxGeometryInputComponents);
    }

    protected static native long getMaxGeometryInputComponentsNative(long address);
    protected static native void setMaxGeometryInputComponentsNative(long address, long maxGeometryInputComponents);

    public VkUInt32 getMaxGeometryOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxGeometryOutputComponentsNative(getVkAddress()));
    }

    
    public void setMaxGeometryOutputComponents(VkUInt32 maxGeometryOutputComponents) {
        setMaxGeometryOutputComponentsNative(getVkAddress(), maxGeometryOutputComponents != null ? maxGeometryOutputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxGeometryOutputComponentsQ() {
        return getMaxGeometryOutputComponents().getValue();
    }

    public void setMaxGeometryOutputComponents(int maxGeometryOutputComponents) {
        getMaxGeometryOutputComponents().setValue(maxGeometryOutputComponents);
    }

    protected static native long getMaxGeometryOutputComponentsNative(long address);
    protected static native void setMaxGeometryOutputComponentsNative(long address, long maxGeometryOutputComponents);

    public VkUInt32 getMaxGeometryOutputVertices() {
        return new VkUInt32(getVkMemory(), getMaxGeometryOutputVerticesNative(getVkAddress()));
    }

    
    public void setMaxGeometryOutputVertices(VkUInt32 maxGeometryOutputVertices) {
        setMaxGeometryOutputVerticesNative(getVkAddress(), maxGeometryOutputVertices != null ? maxGeometryOutputVertices.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxGeometryOutputVerticesQ() {
        return getMaxGeometryOutputVertices().getValue();
    }

    public void setMaxGeometryOutputVertices(int maxGeometryOutputVertices) {
        getMaxGeometryOutputVertices().setValue(maxGeometryOutputVertices);
    }

    protected static native long getMaxGeometryOutputVerticesNative(long address);
    protected static native void setMaxGeometryOutputVerticesNative(long address, long maxGeometryOutputVertices);

    public VkUInt32 getMaxGeometryTotalOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxGeometryTotalOutputComponentsNative(getVkAddress()));
    }

    
    public void setMaxGeometryTotalOutputComponents(VkUInt32 maxGeometryTotalOutputComponents) {
        setMaxGeometryTotalOutputComponentsNative(getVkAddress(), maxGeometryTotalOutputComponents != null ? maxGeometryTotalOutputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxGeometryTotalOutputComponentsQ() {
        return getMaxGeometryTotalOutputComponents().getValue();
    }

    public void setMaxGeometryTotalOutputComponents(int maxGeometryTotalOutputComponents) {
        getMaxGeometryTotalOutputComponents().setValue(maxGeometryTotalOutputComponents);
    }

    protected static native long getMaxGeometryTotalOutputComponentsNative(long address);
    protected static native void setMaxGeometryTotalOutputComponentsNative(long address, long maxGeometryTotalOutputComponents);

    public VkUInt32 getMaxFragmentInputComponents() {
        return new VkUInt32(getVkMemory(), getMaxFragmentInputComponentsNative(getVkAddress()));
    }

    
    public void setMaxFragmentInputComponents(VkUInt32 maxFragmentInputComponents) {
        setMaxFragmentInputComponentsNative(getVkAddress(), maxFragmentInputComponents != null ? maxFragmentInputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxFragmentInputComponentsQ() {
        return getMaxFragmentInputComponents().getValue();
    }

    public void setMaxFragmentInputComponents(int maxFragmentInputComponents) {
        getMaxFragmentInputComponents().setValue(maxFragmentInputComponents);
    }

    protected static native long getMaxFragmentInputComponentsNative(long address);
    protected static native void setMaxFragmentInputComponentsNative(long address, long maxFragmentInputComponents);

    public VkUInt32 getMaxFragmentOutputAttachments() {
        return new VkUInt32(getVkMemory(), getMaxFragmentOutputAttachmentsNative(getVkAddress()));
    }

    
    public void setMaxFragmentOutputAttachments(VkUInt32 maxFragmentOutputAttachments) {
        setMaxFragmentOutputAttachmentsNative(getVkAddress(), maxFragmentOutputAttachments != null ? maxFragmentOutputAttachments.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxFragmentOutputAttachmentsQ() {
        return getMaxFragmentOutputAttachments().getValue();
    }

    public void setMaxFragmentOutputAttachments(int maxFragmentOutputAttachments) {
        getMaxFragmentOutputAttachments().setValue(maxFragmentOutputAttachments);
    }

    protected static native long getMaxFragmentOutputAttachmentsNative(long address);
    protected static native void setMaxFragmentOutputAttachmentsNative(long address, long maxFragmentOutputAttachments);

    public VkUInt32 getMaxFragmentDualSrcAttachments() {
        return new VkUInt32(getVkMemory(), getMaxFragmentDualSrcAttachmentsNative(getVkAddress()));
    }

    
    public void setMaxFragmentDualSrcAttachments(VkUInt32 maxFragmentDualSrcAttachments) {
        setMaxFragmentDualSrcAttachmentsNative(getVkAddress(), maxFragmentDualSrcAttachments != null ? maxFragmentDualSrcAttachments.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxFragmentDualSrcAttachmentsQ() {
        return getMaxFragmentDualSrcAttachments().getValue();
    }

    public void setMaxFragmentDualSrcAttachments(int maxFragmentDualSrcAttachments) {
        getMaxFragmentDualSrcAttachments().setValue(maxFragmentDualSrcAttachments);
    }

    protected static native long getMaxFragmentDualSrcAttachmentsNative(long address);
    protected static native void setMaxFragmentDualSrcAttachmentsNative(long address, long maxFragmentDualSrcAttachments);

    public VkUInt32 getMaxFragmentCombinedOutputResources() {
        return new VkUInt32(getVkMemory(), getMaxFragmentCombinedOutputResourcesNative(getVkAddress()));
    }

    
    public void setMaxFragmentCombinedOutputResources(VkUInt32 maxFragmentCombinedOutputResources) {
        setMaxFragmentCombinedOutputResourcesNative(getVkAddress(), maxFragmentCombinedOutputResources != null ? maxFragmentCombinedOutputResources.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxFragmentCombinedOutputResourcesQ() {
        return getMaxFragmentCombinedOutputResources().getValue();
    }

    public void setMaxFragmentCombinedOutputResources(int maxFragmentCombinedOutputResources) {
        getMaxFragmentCombinedOutputResources().setValue(maxFragmentCombinedOutputResources);
    }

    protected static native long getMaxFragmentCombinedOutputResourcesNative(long address);
    protected static native void setMaxFragmentCombinedOutputResourcesNative(long address, long maxFragmentCombinedOutputResources);

    public VkUInt32 getMaxComputeSharedMemorySize() {
        return new VkUInt32(getVkMemory(), getMaxComputeSharedMemorySizeNative(getVkAddress()));
    }

    
    public void setMaxComputeSharedMemorySize(VkUInt32 maxComputeSharedMemorySize) {
        setMaxComputeSharedMemorySizeNative(getVkAddress(), maxComputeSharedMemorySize != null ? maxComputeSharedMemorySize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxComputeSharedMemorySizeQ() {
        return getMaxComputeSharedMemorySize().getValue();
    }

    public void setMaxComputeSharedMemorySize(int maxComputeSharedMemorySize) {
        getMaxComputeSharedMemorySize().setValue(maxComputeSharedMemorySize);
    }

    protected static native long getMaxComputeSharedMemorySizeNative(long address);
    protected static native void setMaxComputeSharedMemorySizeNative(long address, long maxComputeSharedMemorySize);

    public VkUInt32 getMaxComputeWorkGroupCount() {
        return new VkUInt32(getVkMemory(), getMaxComputeWorkGroupCountNative(getVkAddress()));
    }

    
    public void setMaxComputeWorkGroupCount(VkUInt32 maxComputeWorkGroupCount) {
        setMaxComputeWorkGroupCountNative(getVkAddress(), maxComputeWorkGroupCount != null ? maxComputeWorkGroupCount.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getMaxComputeWorkGroupCountNative(long address);
    protected static native void setMaxComputeWorkGroupCountNative(long address, long maxComputeWorkGroupCount);

    public VkUInt32 getMaxComputeWorkGroupInvocations() {
        return new VkUInt32(getVkMemory(), getMaxComputeWorkGroupInvocationsNative(getVkAddress()));
    }

    
    public void setMaxComputeWorkGroupInvocations(VkUInt32 maxComputeWorkGroupInvocations) {
        setMaxComputeWorkGroupInvocationsNative(getVkAddress(), maxComputeWorkGroupInvocations != null ? maxComputeWorkGroupInvocations.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxComputeWorkGroupInvocationsQ() {
        return getMaxComputeWorkGroupInvocations().getValue();
    }

    public void setMaxComputeWorkGroupInvocations(int maxComputeWorkGroupInvocations) {
        getMaxComputeWorkGroupInvocations().setValue(maxComputeWorkGroupInvocations);
    }

    protected static native long getMaxComputeWorkGroupInvocationsNative(long address);
    protected static native void setMaxComputeWorkGroupInvocationsNative(long address, long maxComputeWorkGroupInvocations);

    public VkUInt32 getMaxComputeWorkGroupSize() {
        return new VkUInt32(getVkMemory(), getMaxComputeWorkGroupSizeNative(getVkAddress()));
    }

    
    public void setMaxComputeWorkGroupSize(VkUInt32 maxComputeWorkGroupSize) {
        setMaxComputeWorkGroupSizeNative(getVkAddress(), maxComputeWorkGroupSize != null ? maxComputeWorkGroupSize.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getMaxComputeWorkGroupSizeNative(long address);
    protected static native void setMaxComputeWorkGroupSizeNative(long address, long maxComputeWorkGroupSize);

    public VkUInt32 getSubPixelPrecisionBits() {
        return new VkUInt32(getVkMemory(), getSubPixelPrecisionBitsNative(getVkAddress()));
    }

    
    public void setSubPixelPrecisionBits(VkUInt32 subPixelPrecisionBits) {
        setSubPixelPrecisionBitsNative(getVkAddress(), subPixelPrecisionBits != null ? subPixelPrecisionBits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubPixelPrecisionBitsQ() {
        return getSubPixelPrecisionBits().getValue();
    }

    public void setSubPixelPrecisionBits(int subPixelPrecisionBits) {
        getSubPixelPrecisionBits().setValue(subPixelPrecisionBits);
    }

    protected static native long getSubPixelPrecisionBitsNative(long address);
    protected static native void setSubPixelPrecisionBitsNative(long address, long subPixelPrecisionBits);

    public VkUInt32 getSubTexelPrecisionBits() {
        return new VkUInt32(getVkMemory(), getSubTexelPrecisionBitsNative(getVkAddress()));
    }

    
    public void setSubTexelPrecisionBits(VkUInt32 subTexelPrecisionBits) {
        setSubTexelPrecisionBitsNative(getVkAddress(), subTexelPrecisionBits != null ? subTexelPrecisionBits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubTexelPrecisionBitsQ() {
        return getSubTexelPrecisionBits().getValue();
    }

    public void setSubTexelPrecisionBits(int subTexelPrecisionBits) {
        getSubTexelPrecisionBits().setValue(subTexelPrecisionBits);
    }

    protected static native long getSubTexelPrecisionBitsNative(long address);
    protected static native void setSubTexelPrecisionBitsNative(long address, long subTexelPrecisionBits);

    public VkUInt32 getMipmapPrecisionBits() {
        return new VkUInt32(getVkMemory(), getMipmapPrecisionBitsNative(getVkAddress()));
    }

    
    public void setMipmapPrecisionBits(VkUInt32 mipmapPrecisionBits) {
        setMipmapPrecisionBitsNative(getVkAddress(), mipmapPrecisionBits != null ? mipmapPrecisionBits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMipmapPrecisionBitsQ() {
        return getMipmapPrecisionBits().getValue();
    }

    public void setMipmapPrecisionBits(int mipmapPrecisionBits) {
        getMipmapPrecisionBits().setValue(mipmapPrecisionBits);
    }

    protected static native long getMipmapPrecisionBitsNative(long address);
    protected static native void setMipmapPrecisionBitsNative(long address, long mipmapPrecisionBits);

    public VkUInt32 getMaxDrawIndexedIndexValue() {
        return new VkUInt32(getVkMemory(), getMaxDrawIndexedIndexValueNative(getVkAddress()));
    }

    
    public void setMaxDrawIndexedIndexValue(VkUInt32 maxDrawIndexedIndexValue) {
        setMaxDrawIndexedIndexValueNative(getVkAddress(), maxDrawIndexedIndexValue != null ? maxDrawIndexedIndexValue.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDrawIndexedIndexValueQ() {
        return getMaxDrawIndexedIndexValue().getValue();
    }

    public void setMaxDrawIndexedIndexValue(int maxDrawIndexedIndexValue) {
        getMaxDrawIndexedIndexValue().setValue(maxDrawIndexedIndexValue);
    }

    protected static native long getMaxDrawIndexedIndexValueNative(long address);
    protected static native void setMaxDrawIndexedIndexValueNative(long address, long maxDrawIndexedIndexValue);

    public VkUInt32 getMaxDrawIndirectCount() {
        return new VkUInt32(getVkMemory(), getMaxDrawIndirectCountNative(getVkAddress()));
    }

    
    public void setMaxDrawIndirectCount(VkUInt32 maxDrawIndirectCount) {
        setMaxDrawIndirectCountNative(getVkAddress(), maxDrawIndirectCount != null ? maxDrawIndirectCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDrawIndirectCountQ() {
        return getMaxDrawIndirectCount().getValue();
    }

    public void setMaxDrawIndirectCount(int maxDrawIndirectCount) {
        getMaxDrawIndirectCount().setValue(maxDrawIndirectCount);
    }

    protected static native long getMaxDrawIndirectCountNative(long address);
    protected static native void setMaxDrawIndirectCountNative(long address, long maxDrawIndirectCount);

    public VkFloat getMaxSamplerLodBias() {
        return new VkFloat(getVkMemory(), getMaxSamplerLodBiasNative(getVkAddress()));
    }

    
    public void setMaxSamplerLodBias(VkFloat maxSamplerLodBias) {
        setMaxSamplerLodBiasNative(getVkAddress(), maxSamplerLodBias != null ? maxSamplerLodBias.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxSamplerLodBiasQ() {
        return getMaxSamplerLodBias().getValue();
    }

    public void setMaxSamplerLodBias(float maxSamplerLodBias) {
        getMaxSamplerLodBias().setValue(maxSamplerLodBias);
    }

    protected static native long getMaxSamplerLodBiasNative(long address);
    protected static native void setMaxSamplerLodBiasNative(long address, long maxSamplerLodBias);

    public VkFloat getMaxSamplerAnisotropy() {
        return new VkFloat(getVkMemory(), getMaxSamplerAnisotropyNative(getVkAddress()));
    }

    
    public void setMaxSamplerAnisotropy(VkFloat maxSamplerAnisotropy) {
        setMaxSamplerAnisotropyNative(getVkAddress(), maxSamplerAnisotropy != null ? maxSamplerAnisotropy.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxSamplerAnisotropyQ() {
        return getMaxSamplerAnisotropy().getValue();
    }

    public void setMaxSamplerAnisotropy(float maxSamplerAnisotropy) {
        getMaxSamplerAnisotropy().setValue(maxSamplerAnisotropy);
    }

    protected static native long getMaxSamplerAnisotropyNative(long address);
    protected static native void setMaxSamplerAnisotropyNative(long address, long maxSamplerAnisotropy);

    public VkUInt32 getMaxViewports() {
        return new VkUInt32(getVkMemory(), getMaxViewportsNative(getVkAddress()));
    }

    
    public void setMaxViewports(VkUInt32 maxViewports) {
        setMaxViewportsNative(getVkAddress(), maxViewports != null ? maxViewports.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxViewportsQ() {
        return getMaxViewports().getValue();
    }

    public void setMaxViewports(int maxViewports) {
        getMaxViewports().setValue(maxViewports);
    }

    protected static native long getMaxViewportsNative(long address);
    protected static native void setMaxViewportsNative(long address, long maxViewports);

    public VkUInt32 getMaxViewportDimensions() {
        return new VkUInt32(getVkMemory(), getMaxViewportDimensionsNative(getVkAddress()));
    }

    
    public void setMaxViewportDimensions(VkUInt32 maxViewportDimensions) {
        setMaxViewportDimensionsNative(getVkAddress(), maxViewportDimensions != null ? maxViewportDimensions.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getMaxViewportDimensionsNative(long address);
    protected static native void setMaxViewportDimensionsNative(long address, long maxViewportDimensions);

    public VkFloat getViewportBoundsRange() {
        return new VkFloat(getVkMemory(), getViewportBoundsRangeNative(getVkAddress()));
    }

    
    public void setViewportBoundsRange(VkFloat viewportBoundsRange) {
        setViewportBoundsRangeNative(getVkAddress(), viewportBoundsRange != null ? viewportBoundsRange.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getViewportBoundsRangeNative(long address);
    protected static native void setViewportBoundsRangeNative(long address, long viewportBoundsRange);

    public VkUInt32 getViewportSubPixelBits() {
        return new VkUInt32(getVkMemory(), getViewportSubPixelBitsNative(getVkAddress()));
    }

    
    public void setViewportSubPixelBits(VkUInt32 viewportSubPixelBits) {
        setViewportSubPixelBitsNative(getVkAddress(), viewportSubPixelBits != null ? viewportSubPixelBits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getViewportSubPixelBitsQ() {
        return getViewportSubPixelBits().getValue();
    }

    public void setViewportSubPixelBits(int viewportSubPixelBits) {
        getViewportSubPixelBits().setValue(viewportSubPixelBits);
    }

    protected static native long getViewportSubPixelBitsNative(long address);
    protected static native void setViewportSubPixelBitsNative(long address, long viewportSubPixelBits);

    public VkSize getMinMemoryMapAlignment() {
        return new VkSize(getVkMemory(), getMinMemoryMapAlignmentNative(getVkAddress()));
    }

    
    public void setMinMemoryMapAlignment(VkSize minMemoryMapAlignment) {
        setMinMemoryMapAlignmentNative(getVkAddress(), minMemoryMapAlignment != null ? minMemoryMapAlignment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getMinMemoryMapAlignmentQ() {
        return getMinMemoryMapAlignment().getValue();
    }

    public void setMinMemoryMapAlignment(long minMemoryMapAlignment) {
        getMinMemoryMapAlignment().setValue(minMemoryMapAlignment);
    }

    protected static native long getMinMemoryMapAlignmentNative(long address);
    protected static native void setMinMemoryMapAlignmentNative(long address, long minMemoryMapAlignment);

    public VkDeviceSize getMinTexelBufferOffsetAlignment() {
        return new VkDeviceSize(getVkMemory(), getMinTexelBufferOffsetAlignmentNative(getVkAddress()));
    }

    
    public void setMinTexelBufferOffsetAlignment(VkDeviceSize minTexelBufferOffsetAlignment) {
        setMinTexelBufferOffsetAlignmentNative(getVkAddress(), minTexelBufferOffsetAlignment != null ? minTexelBufferOffsetAlignment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getMinTexelBufferOffsetAlignmentQ() {
        return getMinTexelBufferOffsetAlignment().getValue();
    }

    public void setMinTexelBufferOffsetAlignment(long minTexelBufferOffsetAlignment) {
        getMinTexelBufferOffsetAlignment().setValue(minTexelBufferOffsetAlignment);
    }

    protected static native long getMinTexelBufferOffsetAlignmentNative(long address);
    protected static native void setMinTexelBufferOffsetAlignmentNative(long address, long minTexelBufferOffsetAlignment);

    public VkDeviceSize getMinUniformBufferOffsetAlignment() {
        return new VkDeviceSize(getVkMemory(), getMinUniformBufferOffsetAlignmentNative(getVkAddress()));
    }

    
    public void setMinUniformBufferOffsetAlignment(VkDeviceSize minUniformBufferOffsetAlignment) {
        setMinUniformBufferOffsetAlignmentNative(getVkAddress(), minUniformBufferOffsetAlignment != null ? minUniformBufferOffsetAlignment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getMinUniformBufferOffsetAlignmentQ() {
        return getMinUniformBufferOffsetAlignment().getValue();
    }

    public void setMinUniformBufferOffsetAlignment(long minUniformBufferOffsetAlignment) {
        getMinUniformBufferOffsetAlignment().setValue(minUniformBufferOffsetAlignment);
    }

    protected static native long getMinUniformBufferOffsetAlignmentNative(long address);
    protected static native void setMinUniformBufferOffsetAlignmentNative(long address, long minUniformBufferOffsetAlignment);

    public VkDeviceSize getMinStorageBufferOffsetAlignment() {
        return new VkDeviceSize(getVkMemory(), getMinStorageBufferOffsetAlignmentNative(getVkAddress()));
    }

    
    public void setMinStorageBufferOffsetAlignment(VkDeviceSize minStorageBufferOffsetAlignment) {
        setMinStorageBufferOffsetAlignmentNative(getVkAddress(), minStorageBufferOffsetAlignment != null ? minStorageBufferOffsetAlignment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getMinStorageBufferOffsetAlignmentQ() {
        return getMinStorageBufferOffsetAlignment().getValue();
    }

    public void setMinStorageBufferOffsetAlignment(long minStorageBufferOffsetAlignment) {
        getMinStorageBufferOffsetAlignment().setValue(minStorageBufferOffsetAlignment);
    }

    protected static native long getMinStorageBufferOffsetAlignmentNative(long address);
    protected static native void setMinStorageBufferOffsetAlignmentNative(long address, long minStorageBufferOffsetAlignment);

    public VkInt32 getMinTexelOffset() {
        return new VkInt32(getVkMemory(), getMinTexelOffsetNative(getVkAddress()));
    }

    
    public void setMinTexelOffset(VkInt32 minTexelOffset) {
        setMinTexelOffsetNative(getVkAddress(), minTexelOffset != null ? minTexelOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMinTexelOffsetQ() {
        return getMinTexelOffset().getValue();
    }

    public void setMinTexelOffset(int minTexelOffset) {
        getMinTexelOffset().setValue(minTexelOffset);
    }

    protected static native long getMinTexelOffsetNative(long address);
    protected static native void setMinTexelOffsetNative(long address, long minTexelOffset);

    public VkUInt32 getMaxTexelOffset() {
        return new VkUInt32(getVkMemory(), getMaxTexelOffsetNative(getVkAddress()));
    }

    
    public void setMaxTexelOffset(VkUInt32 maxTexelOffset) {
        setMaxTexelOffsetNative(getVkAddress(), maxTexelOffset != null ? maxTexelOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTexelOffsetQ() {
        return getMaxTexelOffset().getValue();
    }

    public void setMaxTexelOffset(int maxTexelOffset) {
        getMaxTexelOffset().setValue(maxTexelOffset);
    }

    protected static native long getMaxTexelOffsetNative(long address);
    protected static native void setMaxTexelOffsetNative(long address, long maxTexelOffset);

    public VkInt32 getMinTexelGatherOffset() {
        return new VkInt32(getVkMemory(), getMinTexelGatherOffsetNative(getVkAddress()));
    }

    
    public void setMinTexelGatherOffset(VkInt32 minTexelGatherOffset) {
        setMinTexelGatherOffsetNative(getVkAddress(), minTexelGatherOffset != null ? minTexelGatherOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMinTexelGatherOffsetQ() {
        return getMinTexelGatherOffset().getValue();
    }

    public void setMinTexelGatherOffset(int minTexelGatherOffset) {
        getMinTexelGatherOffset().setValue(minTexelGatherOffset);
    }

    protected static native long getMinTexelGatherOffsetNative(long address);
    protected static native void setMinTexelGatherOffsetNative(long address, long minTexelGatherOffset);

    public VkUInt32 getMaxTexelGatherOffset() {
        return new VkUInt32(getVkMemory(), getMaxTexelGatherOffsetNative(getVkAddress()));
    }

    
    public void setMaxTexelGatherOffset(VkUInt32 maxTexelGatherOffset) {
        setMaxTexelGatherOffsetNative(getVkAddress(), maxTexelGatherOffset != null ? maxTexelGatherOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTexelGatherOffsetQ() {
        return getMaxTexelGatherOffset().getValue();
    }

    public void setMaxTexelGatherOffset(int maxTexelGatherOffset) {
        getMaxTexelGatherOffset().setValue(maxTexelGatherOffset);
    }

    protected static native long getMaxTexelGatherOffsetNative(long address);
    protected static native void setMaxTexelGatherOffsetNative(long address, long maxTexelGatherOffset);

    public VkFloat getMinInterpolationOffset() {
        return new VkFloat(getVkMemory(), getMinInterpolationOffsetNative(getVkAddress()));
    }

    
    public void setMinInterpolationOffset(VkFloat minInterpolationOffset) {
        setMinInterpolationOffsetNative(getVkAddress(), minInterpolationOffset != null ? minInterpolationOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMinInterpolationOffsetQ() {
        return getMinInterpolationOffset().getValue();
    }

    public void setMinInterpolationOffset(float minInterpolationOffset) {
        getMinInterpolationOffset().setValue(minInterpolationOffset);
    }

    protected static native long getMinInterpolationOffsetNative(long address);
    protected static native void setMinInterpolationOffsetNative(long address, long minInterpolationOffset);

    public VkFloat getMaxInterpolationOffset() {
        return new VkFloat(getVkMemory(), getMaxInterpolationOffsetNative(getVkAddress()));
    }

    
    public void setMaxInterpolationOffset(VkFloat maxInterpolationOffset) {
        setMaxInterpolationOffsetNative(getVkAddress(), maxInterpolationOffset != null ? maxInterpolationOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxInterpolationOffsetQ() {
        return getMaxInterpolationOffset().getValue();
    }

    public void setMaxInterpolationOffset(float maxInterpolationOffset) {
        getMaxInterpolationOffset().setValue(maxInterpolationOffset);
    }

    protected static native long getMaxInterpolationOffsetNative(long address);
    protected static native void setMaxInterpolationOffsetNative(long address, long maxInterpolationOffset);

    public VkUInt32 getSubPixelInterpolationOffsetBits() {
        return new VkUInt32(getVkMemory(), getSubPixelInterpolationOffsetBitsNative(getVkAddress()));
    }

    
    public void setSubPixelInterpolationOffsetBits(VkUInt32 subPixelInterpolationOffsetBits) {
        setSubPixelInterpolationOffsetBitsNative(getVkAddress(), subPixelInterpolationOffsetBits != null ? subPixelInterpolationOffsetBits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubPixelInterpolationOffsetBitsQ() {
        return getSubPixelInterpolationOffsetBits().getValue();
    }

    public void setSubPixelInterpolationOffsetBits(int subPixelInterpolationOffsetBits) {
        getSubPixelInterpolationOffsetBits().setValue(subPixelInterpolationOffsetBits);
    }

    protected static native long getSubPixelInterpolationOffsetBitsNative(long address);
    protected static native void setSubPixelInterpolationOffsetBitsNative(long address, long subPixelInterpolationOffsetBits);

    public VkUInt32 getMaxFramebufferWidth() {
        return new VkUInt32(getVkMemory(), getMaxFramebufferWidthNative(getVkAddress()));
    }

    
    public void setMaxFramebufferWidth(VkUInt32 maxFramebufferWidth) {
        setMaxFramebufferWidthNative(getVkAddress(), maxFramebufferWidth != null ? maxFramebufferWidth.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxFramebufferWidthQ() {
        return getMaxFramebufferWidth().getValue();
    }

    public void setMaxFramebufferWidth(int maxFramebufferWidth) {
        getMaxFramebufferWidth().setValue(maxFramebufferWidth);
    }

    protected static native long getMaxFramebufferWidthNative(long address);
    protected static native void setMaxFramebufferWidthNative(long address, long maxFramebufferWidth);

    public VkUInt32 getMaxFramebufferHeight() {
        return new VkUInt32(getVkMemory(), getMaxFramebufferHeightNative(getVkAddress()));
    }

    
    public void setMaxFramebufferHeight(VkUInt32 maxFramebufferHeight) {
        setMaxFramebufferHeightNative(getVkAddress(), maxFramebufferHeight != null ? maxFramebufferHeight.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxFramebufferHeightQ() {
        return getMaxFramebufferHeight().getValue();
    }

    public void setMaxFramebufferHeight(int maxFramebufferHeight) {
        getMaxFramebufferHeight().setValue(maxFramebufferHeight);
    }

    protected static native long getMaxFramebufferHeightNative(long address);
    protected static native void setMaxFramebufferHeightNative(long address, long maxFramebufferHeight);

    public VkUInt32 getMaxFramebufferLayers() {
        return new VkUInt32(getVkMemory(), getMaxFramebufferLayersNative(getVkAddress()));
    }

    
    public void setMaxFramebufferLayers(VkUInt32 maxFramebufferLayers) {
        setMaxFramebufferLayersNative(getVkAddress(), maxFramebufferLayers != null ? maxFramebufferLayers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxFramebufferLayersQ() {
        return getMaxFramebufferLayers().getValue();
    }

    public void setMaxFramebufferLayers(int maxFramebufferLayers) {
        getMaxFramebufferLayers().setValue(maxFramebufferLayers);
    }

    protected static native long getMaxFramebufferLayersNative(long address);
    protected static native void setMaxFramebufferLayersNative(long address, long maxFramebufferLayers);

    public VkSampleCountFlags getFramebufferColorSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getFramebufferColorSampleCountsNative(getVkAddress()));
    }

    
    public void setFramebufferColorSampleCounts(VkSampleCountFlags framebufferColorSampleCounts) {
        setFramebufferColorSampleCountsNative(getVkAddress(), framebufferColorSampleCounts != null ? framebufferColorSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFramebufferColorSampleCountsQ() {
        return getFramebufferColorSampleCounts().getValue();
    }

    public void setFramebufferColorSampleCounts(int framebufferColorSampleCounts) {
        getFramebufferColorSampleCounts().setValue(framebufferColorSampleCounts);
    }

    protected static native long getFramebufferColorSampleCountsNative(long address);
    protected static native void setFramebufferColorSampleCountsNative(long address, long framebufferColorSampleCounts);

    public VkSampleCountFlags getFramebufferDepthSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getFramebufferDepthSampleCountsNative(getVkAddress()));
    }

    
    public void setFramebufferDepthSampleCounts(VkSampleCountFlags framebufferDepthSampleCounts) {
        setFramebufferDepthSampleCountsNative(getVkAddress(), framebufferDepthSampleCounts != null ? framebufferDepthSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFramebufferDepthSampleCountsQ() {
        return getFramebufferDepthSampleCounts().getValue();
    }

    public void setFramebufferDepthSampleCounts(int framebufferDepthSampleCounts) {
        getFramebufferDepthSampleCounts().setValue(framebufferDepthSampleCounts);
    }

    protected static native long getFramebufferDepthSampleCountsNative(long address);
    protected static native void setFramebufferDepthSampleCountsNative(long address, long framebufferDepthSampleCounts);

    public VkSampleCountFlags getFramebufferStencilSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getFramebufferStencilSampleCountsNative(getVkAddress()));
    }

    
    public void setFramebufferStencilSampleCounts(VkSampleCountFlags framebufferStencilSampleCounts) {
        setFramebufferStencilSampleCountsNative(getVkAddress(), framebufferStencilSampleCounts != null ? framebufferStencilSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFramebufferStencilSampleCountsQ() {
        return getFramebufferStencilSampleCounts().getValue();
    }

    public void setFramebufferStencilSampleCounts(int framebufferStencilSampleCounts) {
        getFramebufferStencilSampleCounts().setValue(framebufferStencilSampleCounts);
    }

    protected static native long getFramebufferStencilSampleCountsNative(long address);
    protected static native void setFramebufferStencilSampleCountsNative(long address, long framebufferStencilSampleCounts);

    public VkSampleCountFlags getFramebufferNoAttachmentsSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getFramebufferNoAttachmentsSampleCountsNative(getVkAddress()));
    }

    
    public void setFramebufferNoAttachmentsSampleCounts(VkSampleCountFlags framebufferNoAttachmentsSampleCounts) {
        setFramebufferNoAttachmentsSampleCountsNative(getVkAddress(), framebufferNoAttachmentsSampleCounts != null ? framebufferNoAttachmentsSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFramebufferNoAttachmentsSampleCountsQ() {
        return getFramebufferNoAttachmentsSampleCounts().getValue();
    }

    public void setFramebufferNoAttachmentsSampleCounts(int framebufferNoAttachmentsSampleCounts) {
        getFramebufferNoAttachmentsSampleCounts().setValue(framebufferNoAttachmentsSampleCounts);
    }

    protected static native long getFramebufferNoAttachmentsSampleCountsNative(long address);
    protected static native void setFramebufferNoAttachmentsSampleCountsNative(long address, long framebufferNoAttachmentsSampleCounts);

    public VkUInt32 getMaxColorAttachments() {
        return new VkUInt32(getVkMemory(), getMaxColorAttachmentsNative(getVkAddress()));
    }

    
    public void setMaxColorAttachments(VkUInt32 maxColorAttachments) {
        setMaxColorAttachmentsNative(getVkAddress(), maxColorAttachments != null ? maxColorAttachments.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxColorAttachmentsQ() {
        return getMaxColorAttachments().getValue();
    }

    public void setMaxColorAttachments(int maxColorAttachments) {
        getMaxColorAttachments().setValue(maxColorAttachments);
    }

    protected static native long getMaxColorAttachmentsNative(long address);
    protected static native void setMaxColorAttachmentsNative(long address, long maxColorAttachments);

    public VkSampleCountFlags getSampledImageColorSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampledImageColorSampleCountsNative(getVkAddress()));
    }

    
    public void setSampledImageColorSampleCounts(VkSampleCountFlags sampledImageColorSampleCounts) {
        setSampledImageColorSampleCountsNative(getVkAddress(), sampledImageColorSampleCounts != null ? sampledImageColorSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampledImageColorSampleCountsQ() {
        return getSampledImageColorSampleCounts().getValue();
    }

    public void setSampledImageColorSampleCounts(int sampledImageColorSampleCounts) {
        getSampledImageColorSampleCounts().setValue(sampledImageColorSampleCounts);
    }

    protected static native long getSampledImageColorSampleCountsNative(long address);
    protected static native void setSampledImageColorSampleCountsNative(long address, long sampledImageColorSampleCounts);

    public VkSampleCountFlags getSampledImageIntegerSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampledImageIntegerSampleCountsNative(getVkAddress()));
    }

    
    public void setSampledImageIntegerSampleCounts(VkSampleCountFlags sampledImageIntegerSampleCounts) {
        setSampledImageIntegerSampleCountsNative(getVkAddress(), sampledImageIntegerSampleCounts != null ? sampledImageIntegerSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampledImageIntegerSampleCountsQ() {
        return getSampledImageIntegerSampleCounts().getValue();
    }

    public void setSampledImageIntegerSampleCounts(int sampledImageIntegerSampleCounts) {
        getSampledImageIntegerSampleCounts().setValue(sampledImageIntegerSampleCounts);
    }

    protected static native long getSampledImageIntegerSampleCountsNative(long address);
    protected static native void setSampledImageIntegerSampleCountsNative(long address, long sampledImageIntegerSampleCounts);

    public VkSampleCountFlags getSampledImageDepthSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampledImageDepthSampleCountsNative(getVkAddress()));
    }

    
    public void setSampledImageDepthSampleCounts(VkSampleCountFlags sampledImageDepthSampleCounts) {
        setSampledImageDepthSampleCountsNative(getVkAddress(), sampledImageDepthSampleCounts != null ? sampledImageDepthSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampledImageDepthSampleCountsQ() {
        return getSampledImageDepthSampleCounts().getValue();
    }

    public void setSampledImageDepthSampleCounts(int sampledImageDepthSampleCounts) {
        getSampledImageDepthSampleCounts().setValue(sampledImageDepthSampleCounts);
    }

    protected static native long getSampledImageDepthSampleCountsNative(long address);
    protected static native void setSampledImageDepthSampleCountsNative(long address, long sampledImageDepthSampleCounts);

    public VkSampleCountFlags getSampledImageStencilSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampledImageStencilSampleCountsNative(getVkAddress()));
    }

    
    public void setSampledImageStencilSampleCounts(VkSampleCountFlags sampledImageStencilSampleCounts) {
        setSampledImageStencilSampleCountsNative(getVkAddress(), sampledImageStencilSampleCounts != null ? sampledImageStencilSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampledImageStencilSampleCountsQ() {
        return getSampledImageStencilSampleCounts().getValue();
    }

    public void setSampledImageStencilSampleCounts(int sampledImageStencilSampleCounts) {
        getSampledImageStencilSampleCounts().setValue(sampledImageStencilSampleCounts);
    }

    protected static native long getSampledImageStencilSampleCountsNative(long address);
    protected static native void setSampledImageStencilSampleCountsNative(long address, long sampledImageStencilSampleCounts);

    public VkSampleCountFlags getStorageImageSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getStorageImageSampleCountsNative(getVkAddress()));
    }

    
    public void setStorageImageSampleCounts(VkSampleCountFlags storageImageSampleCounts) {
        setStorageImageSampleCountsNative(getVkAddress(), storageImageSampleCounts != null ? storageImageSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStorageImageSampleCountsQ() {
        return getStorageImageSampleCounts().getValue();
    }

    public void setStorageImageSampleCounts(int storageImageSampleCounts) {
        getStorageImageSampleCounts().setValue(storageImageSampleCounts);
    }

    protected static native long getStorageImageSampleCountsNative(long address);
    protected static native void setStorageImageSampleCountsNative(long address, long storageImageSampleCounts);

    public VkUInt32 getMaxSampleMaskWords() {
        return new VkUInt32(getVkMemory(), getMaxSampleMaskWordsNative(getVkAddress()));
    }

    
    public void setMaxSampleMaskWords(VkUInt32 maxSampleMaskWords) {
        setMaxSampleMaskWordsNative(getVkAddress(), maxSampleMaskWords != null ? maxSampleMaskWords.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxSampleMaskWordsQ() {
        return getMaxSampleMaskWords().getValue();
    }

    public void setMaxSampleMaskWords(int maxSampleMaskWords) {
        getMaxSampleMaskWords().setValue(maxSampleMaskWords);
    }

    protected static native long getMaxSampleMaskWordsNative(long address);
    protected static native void setMaxSampleMaskWordsNative(long address, long maxSampleMaskWords);

    public VkBool32 getTimestampComputeAndGraphics() {
        return new VkBool32(getVkMemory(), getTimestampComputeAndGraphicsNative(getVkAddress()));
    }

    
    public void setTimestampComputeAndGraphics(VkBool32 timestampComputeAndGraphics) {
        setTimestampComputeAndGraphicsNative(getVkAddress(), timestampComputeAndGraphics != null ? timestampComputeAndGraphics.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTimestampComputeAndGraphicsQ() {
        return getTimestampComputeAndGraphics().getValue();
    }

    public void setTimestampComputeAndGraphics(int timestampComputeAndGraphics) {
        getTimestampComputeAndGraphics().setValue(timestampComputeAndGraphics);
    }

    protected static native long getTimestampComputeAndGraphicsNative(long address);
    protected static native void setTimestampComputeAndGraphicsNative(long address, long timestampComputeAndGraphics);

    public VkFloat getTimestampPeriod() {
        return new VkFloat(getVkMemory(), getTimestampPeriodNative(getVkAddress()));
    }

    
    public void setTimestampPeriod(VkFloat timestampPeriod) {
        setTimestampPeriodNative(getVkAddress(), timestampPeriod != null ? timestampPeriod.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getTimestampPeriodQ() {
        return getTimestampPeriod().getValue();
    }

    public void setTimestampPeriod(float timestampPeriod) {
        getTimestampPeriod().setValue(timestampPeriod);
    }

    protected static native long getTimestampPeriodNative(long address);
    protected static native void setTimestampPeriodNative(long address, long timestampPeriod);

    public VkUInt32 getMaxClipDistances() {
        return new VkUInt32(getVkMemory(), getMaxClipDistancesNative(getVkAddress()));
    }

    
    public void setMaxClipDistances(VkUInt32 maxClipDistances) {
        setMaxClipDistancesNative(getVkAddress(), maxClipDistances != null ? maxClipDistances.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxClipDistancesQ() {
        return getMaxClipDistances().getValue();
    }

    public void setMaxClipDistances(int maxClipDistances) {
        getMaxClipDistances().setValue(maxClipDistances);
    }

    protected static native long getMaxClipDistancesNative(long address);
    protected static native void setMaxClipDistancesNative(long address, long maxClipDistances);

    public VkUInt32 getMaxCullDistances() {
        return new VkUInt32(getVkMemory(), getMaxCullDistancesNative(getVkAddress()));
    }

    
    public void setMaxCullDistances(VkUInt32 maxCullDistances) {
        setMaxCullDistancesNative(getVkAddress(), maxCullDistances != null ? maxCullDistances.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxCullDistancesQ() {
        return getMaxCullDistances().getValue();
    }

    public void setMaxCullDistances(int maxCullDistances) {
        getMaxCullDistances().setValue(maxCullDistances);
    }

    protected static native long getMaxCullDistancesNative(long address);
    protected static native void setMaxCullDistancesNative(long address, long maxCullDistances);

    public VkUInt32 getMaxCombinedClipAndCullDistances() {
        return new VkUInt32(getVkMemory(), getMaxCombinedClipAndCullDistancesNative(getVkAddress()));
    }

    
    public void setMaxCombinedClipAndCullDistances(VkUInt32 maxCombinedClipAndCullDistances) {
        setMaxCombinedClipAndCullDistancesNative(getVkAddress(), maxCombinedClipAndCullDistances != null ? maxCombinedClipAndCullDistances.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxCombinedClipAndCullDistancesQ() {
        return getMaxCombinedClipAndCullDistances().getValue();
    }

    public void setMaxCombinedClipAndCullDistances(int maxCombinedClipAndCullDistances) {
        getMaxCombinedClipAndCullDistances().setValue(maxCombinedClipAndCullDistances);
    }

    protected static native long getMaxCombinedClipAndCullDistancesNative(long address);
    protected static native void setMaxCombinedClipAndCullDistancesNative(long address, long maxCombinedClipAndCullDistances);

    public VkUInt32 getDiscreteQueuePriorities() {
        return new VkUInt32(getVkMemory(), getDiscreteQueuePrioritiesNative(getVkAddress()));
    }

    
    public void setDiscreteQueuePriorities(VkUInt32 discreteQueuePriorities) {
        setDiscreteQueuePrioritiesNative(getVkAddress(), discreteQueuePriorities != null ? discreteQueuePriorities.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDiscreteQueuePrioritiesQ() {
        return getDiscreteQueuePriorities().getValue();
    }

    public void setDiscreteQueuePriorities(int discreteQueuePriorities) {
        getDiscreteQueuePriorities().setValue(discreteQueuePriorities);
    }

    protected static native long getDiscreteQueuePrioritiesNative(long address);
    protected static native void setDiscreteQueuePrioritiesNative(long address, long discreteQueuePriorities);

    public VkFloat getPointSizeRange() {
        return new VkFloat(getVkMemory(), getPointSizeRangeNative(getVkAddress()));
    }

    
    public void setPointSizeRange(VkFloat pointSizeRange) {
        setPointSizeRangeNative(getVkAddress(), pointSizeRange != null ? pointSizeRange.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getPointSizeRangeNative(long address);
    protected static native void setPointSizeRangeNative(long address, long pointSizeRange);

    public VkFloat getLineWidthRange() {
        return new VkFloat(getVkMemory(), getLineWidthRangeNative(getVkAddress()));
    }

    
    public void setLineWidthRange(VkFloat lineWidthRange) {
        setLineWidthRangeNative(getVkAddress(), lineWidthRange != null ? lineWidthRange.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getLineWidthRangeNative(long address);
    protected static native void setLineWidthRangeNative(long address, long lineWidthRange);

    public VkFloat getPointSizeGranularity() {
        return new VkFloat(getVkMemory(), getPointSizeGranularityNative(getVkAddress()));
    }

    
    public void setPointSizeGranularity(VkFloat pointSizeGranularity) {
        setPointSizeGranularityNative(getVkAddress(), pointSizeGranularity != null ? pointSizeGranularity.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getPointSizeGranularityQ() {
        return getPointSizeGranularity().getValue();
    }

    public void setPointSizeGranularity(float pointSizeGranularity) {
        getPointSizeGranularity().setValue(pointSizeGranularity);
    }

    protected static native long getPointSizeGranularityNative(long address);
    protected static native void setPointSizeGranularityNative(long address, long pointSizeGranularity);

    public VkFloat getLineWidthGranularity() {
        return new VkFloat(getVkMemory(), getLineWidthGranularityNative(getVkAddress()));
    }

    
    public void setLineWidthGranularity(VkFloat lineWidthGranularity) {
        setLineWidthGranularityNative(getVkAddress(), lineWidthGranularity != null ? lineWidthGranularity.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getLineWidthGranularityQ() {
        return getLineWidthGranularity().getValue();
    }

    public void setLineWidthGranularity(float lineWidthGranularity) {
        getLineWidthGranularity().setValue(lineWidthGranularity);
    }

    protected static native long getLineWidthGranularityNative(long address);
    protected static native void setLineWidthGranularityNative(long address, long lineWidthGranularity);

    public VkBool32 getStrictLines() {
        return new VkBool32(getVkMemory(), getStrictLinesNative(getVkAddress()));
    }

    
    public void setStrictLines(VkBool32 strictLines) {
        setStrictLinesNative(getVkAddress(), strictLines != null ? strictLines.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStrictLinesQ() {
        return getStrictLines().getValue();
    }

    public void setStrictLines(int strictLines) {
        getStrictLines().setValue(strictLines);
    }

    protected static native long getStrictLinesNative(long address);
    protected static native void setStrictLinesNative(long address, long strictLines);

    public VkBool32 getStandardSampleLocations() {
        return new VkBool32(getVkMemory(), getStandardSampleLocationsNative(getVkAddress()));
    }

    
    public void setStandardSampleLocations(VkBool32 standardSampleLocations) {
        setStandardSampleLocationsNative(getVkAddress(), standardSampleLocations != null ? standardSampleLocations.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStandardSampleLocationsQ() {
        return getStandardSampleLocations().getValue();
    }

    public void setStandardSampleLocations(int standardSampleLocations) {
        getStandardSampleLocations().setValue(standardSampleLocations);
    }

    protected static native long getStandardSampleLocationsNative(long address);
    protected static native void setStandardSampleLocationsNative(long address, long standardSampleLocations);

    public VkDeviceSize getOptimalBufferCopyOffsetAlignment() {
        return new VkDeviceSize(getVkMemory(), getOptimalBufferCopyOffsetAlignmentNative(getVkAddress()));
    }

    
    public void setOptimalBufferCopyOffsetAlignment(VkDeviceSize optimalBufferCopyOffsetAlignment) {
        setOptimalBufferCopyOffsetAlignmentNative(getVkAddress(), optimalBufferCopyOffsetAlignment != null ? optimalBufferCopyOffsetAlignment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getOptimalBufferCopyOffsetAlignmentQ() {
        return getOptimalBufferCopyOffsetAlignment().getValue();
    }

    public void setOptimalBufferCopyOffsetAlignment(long optimalBufferCopyOffsetAlignment) {
        getOptimalBufferCopyOffsetAlignment().setValue(optimalBufferCopyOffsetAlignment);
    }

    protected static native long getOptimalBufferCopyOffsetAlignmentNative(long address);
    protected static native void setOptimalBufferCopyOffsetAlignmentNative(long address, long optimalBufferCopyOffsetAlignment);

    public VkDeviceSize getOptimalBufferCopyRowPitchAlignment() {
        return new VkDeviceSize(getVkMemory(), getOptimalBufferCopyRowPitchAlignmentNative(getVkAddress()));
    }

    
    public void setOptimalBufferCopyRowPitchAlignment(VkDeviceSize optimalBufferCopyRowPitchAlignment) {
        setOptimalBufferCopyRowPitchAlignmentNative(getVkAddress(), optimalBufferCopyRowPitchAlignment != null ? optimalBufferCopyRowPitchAlignment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getOptimalBufferCopyRowPitchAlignmentQ() {
        return getOptimalBufferCopyRowPitchAlignment().getValue();
    }

    public void setOptimalBufferCopyRowPitchAlignment(long optimalBufferCopyRowPitchAlignment) {
        getOptimalBufferCopyRowPitchAlignment().setValue(optimalBufferCopyRowPitchAlignment);
    }

    protected static native long getOptimalBufferCopyRowPitchAlignmentNative(long address);
    protected static native void setOptimalBufferCopyRowPitchAlignmentNative(long address, long optimalBufferCopyRowPitchAlignment);

    public VkDeviceSize getNonCoherentAtomSize() {
        return new VkDeviceSize(getVkMemory(), getNonCoherentAtomSizeNative(getVkAddress()));
    }

    
    public void setNonCoherentAtomSize(VkDeviceSize nonCoherentAtomSize) {
        setNonCoherentAtomSizeNative(getVkAddress(), nonCoherentAtomSize != null ? nonCoherentAtomSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getNonCoherentAtomSizeQ() {
        return getNonCoherentAtomSize().getValue();
    }

    public void setNonCoherentAtomSize(long nonCoherentAtomSize) {
        getNonCoherentAtomSize().setValue(nonCoherentAtomSize);
    }

    protected static native long getNonCoherentAtomSizeNative(long address);
    protected static native void setNonCoherentAtomSizeNative(long address, long nonCoherentAtomSize);


    public void set(VkPhysicalDeviceLimits o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPhysicalDeviceLimits implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceLimits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceLimits.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceLimits o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkPhysicalDeviceLimits get(int i){
            return new VkPhysicalDeviceLimits(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
