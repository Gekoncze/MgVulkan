package cz.mg.vulkan;

public class VkPhysicalDeviceLimits extends VkObject {
    public VkPhysicalDeviceLimits() {
        super(sizeof());
    }

    public VkPhysicalDeviceLimits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceLimits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getMaxImageDimension1D() {
        return new VkUInt32(getVkMemory(), getMaxImageDimension1D(getVkAddress()));
    }

    
    public void setMaxImageDimension1D(VkUInt32 maxImageDimension1D) {
        setMaxImageDimension1D(getVkAddress(), maxImageDimension1D != null ? maxImageDimension1D.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxImageDimension1DQ() {
        return getMaxImageDimension1D().getValue();
    }

    public void setMaxImageDimension1D(int maxImageDimension1D) {
        getMaxImageDimension1D().setValue(maxImageDimension1D);
    }

    protected static native long getMaxImageDimension1D(long address);
    protected static native void setMaxImageDimension1D(long address, long maxImageDimension1D);

    public VkUInt32 getMaxImageDimension2D() {
        return new VkUInt32(getVkMemory(), getMaxImageDimension2D(getVkAddress()));
    }

    
    public void setMaxImageDimension2D(VkUInt32 maxImageDimension2D) {
        setMaxImageDimension2D(getVkAddress(), maxImageDimension2D != null ? maxImageDimension2D.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxImageDimension2DQ() {
        return getMaxImageDimension2D().getValue();
    }

    public void setMaxImageDimension2D(int maxImageDimension2D) {
        getMaxImageDimension2D().setValue(maxImageDimension2D);
    }

    protected static native long getMaxImageDimension2D(long address);
    protected static native void setMaxImageDimension2D(long address, long maxImageDimension2D);

    public VkUInt32 getMaxImageDimension3D() {
        return new VkUInt32(getVkMemory(), getMaxImageDimension3D(getVkAddress()));
    }

    
    public void setMaxImageDimension3D(VkUInt32 maxImageDimension3D) {
        setMaxImageDimension3D(getVkAddress(), maxImageDimension3D != null ? maxImageDimension3D.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxImageDimension3DQ() {
        return getMaxImageDimension3D().getValue();
    }

    public void setMaxImageDimension3D(int maxImageDimension3D) {
        getMaxImageDimension3D().setValue(maxImageDimension3D);
    }

    protected static native long getMaxImageDimension3D(long address);
    protected static native void setMaxImageDimension3D(long address, long maxImageDimension3D);

    public VkUInt32 getMaxImageDimensionCube() {
        return new VkUInt32(getVkMemory(), getMaxImageDimensionCube(getVkAddress()));
    }

    
    public void setMaxImageDimensionCube(VkUInt32 maxImageDimensionCube) {
        setMaxImageDimensionCube(getVkAddress(), maxImageDimensionCube != null ? maxImageDimensionCube.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxImageDimensionCubeQ() {
        return getMaxImageDimensionCube().getValue();
    }

    public void setMaxImageDimensionCube(int maxImageDimensionCube) {
        getMaxImageDimensionCube().setValue(maxImageDimensionCube);
    }

    protected static native long getMaxImageDimensionCube(long address);
    protected static native void setMaxImageDimensionCube(long address, long maxImageDimensionCube);

    public VkUInt32 getMaxImageArrayLayers() {
        return new VkUInt32(getVkMemory(), getMaxImageArrayLayers(getVkAddress()));
    }

    
    public void setMaxImageArrayLayers(VkUInt32 maxImageArrayLayers) {
        setMaxImageArrayLayers(getVkAddress(), maxImageArrayLayers != null ? maxImageArrayLayers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxImageArrayLayersQ() {
        return getMaxImageArrayLayers().getValue();
    }

    public void setMaxImageArrayLayers(int maxImageArrayLayers) {
        getMaxImageArrayLayers().setValue(maxImageArrayLayers);
    }

    protected static native long getMaxImageArrayLayers(long address);
    protected static native void setMaxImageArrayLayers(long address, long maxImageArrayLayers);

    public VkUInt32 getMaxTexelBufferElements() {
        return new VkUInt32(getVkMemory(), getMaxTexelBufferElements(getVkAddress()));
    }

    
    public void setMaxTexelBufferElements(VkUInt32 maxTexelBufferElements) {
        setMaxTexelBufferElements(getVkAddress(), maxTexelBufferElements != null ? maxTexelBufferElements.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTexelBufferElementsQ() {
        return getMaxTexelBufferElements().getValue();
    }

    public void setMaxTexelBufferElements(int maxTexelBufferElements) {
        getMaxTexelBufferElements().setValue(maxTexelBufferElements);
    }

    protected static native long getMaxTexelBufferElements(long address);
    protected static native void setMaxTexelBufferElements(long address, long maxTexelBufferElements);

    public VkUInt32 getMaxUniformBufferRange() {
        return new VkUInt32(getVkMemory(), getMaxUniformBufferRange(getVkAddress()));
    }

    
    public void setMaxUniformBufferRange(VkUInt32 maxUniformBufferRange) {
        setMaxUniformBufferRange(getVkAddress(), maxUniformBufferRange != null ? maxUniformBufferRange.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxUniformBufferRangeQ() {
        return getMaxUniformBufferRange().getValue();
    }

    public void setMaxUniformBufferRange(int maxUniformBufferRange) {
        getMaxUniformBufferRange().setValue(maxUniformBufferRange);
    }

    protected static native long getMaxUniformBufferRange(long address);
    protected static native void setMaxUniformBufferRange(long address, long maxUniformBufferRange);

    public VkUInt32 getMaxStorageBufferRange() {
        return new VkUInt32(getVkMemory(), getMaxStorageBufferRange(getVkAddress()));
    }

    
    public void setMaxStorageBufferRange(VkUInt32 maxStorageBufferRange) {
        setMaxStorageBufferRange(getVkAddress(), maxStorageBufferRange != null ? maxStorageBufferRange.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxStorageBufferRangeQ() {
        return getMaxStorageBufferRange().getValue();
    }

    public void setMaxStorageBufferRange(int maxStorageBufferRange) {
        getMaxStorageBufferRange().setValue(maxStorageBufferRange);
    }

    protected static native long getMaxStorageBufferRange(long address);
    protected static native void setMaxStorageBufferRange(long address, long maxStorageBufferRange);

    public VkUInt32 getMaxPushConstantsSize() {
        return new VkUInt32(getVkMemory(), getMaxPushConstantsSize(getVkAddress()));
    }

    
    public void setMaxPushConstantsSize(VkUInt32 maxPushConstantsSize) {
        setMaxPushConstantsSize(getVkAddress(), maxPushConstantsSize != null ? maxPushConstantsSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPushConstantsSizeQ() {
        return getMaxPushConstantsSize().getValue();
    }

    public void setMaxPushConstantsSize(int maxPushConstantsSize) {
        getMaxPushConstantsSize().setValue(maxPushConstantsSize);
    }

    protected static native long getMaxPushConstantsSize(long address);
    protected static native void setMaxPushConstantsSize(long address, long maxPushConstantsSize);

    public VkUInt32 getMaxMemoryAllocationCount() {
        return new VkUInt32(getVkMemory(), getMaxMemoryAllocationCount(getVkAddress()));
    }

    
    public void setMaxMemoryAllocationCount(VkUInt32 maxMemoryAllocationCount) {
        setMaxMemoryAllocationCount(getVkAddress(), maxMemoryAllocationCount != null ? maxMemoryAllocationCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxMemoryAllocationCountQ() {
        return getMaxMemoryAllocationCount().getValue();
    }

    public void setMaxMemoryAllocationCount(int maxMemoryAllocationCount) {
        getMaxMemoryAllocationCount().setValue(maxMemoryAllocationCount);
    }

    protected static native long getMaxMemoryAllocationCount(long address);
    protected static native void setMaxMemoryAllocationCount(long address, long maxMemoryAllocationCount);

    public VkUInt32 getMaxSamplerAllocationCount() {
        return new VkUInt32(getVkMemory(), getMaxSamplerAllocationCount(getVkAddress()));
    }

    
    public void setMaxSamplerAllocationCount(VkUInt32 maxSamplerAllocationCount) {
        setMaxSamplerAllocationCount(getVkAddress(), maxSamplerAllocationCount != null ? maxSamplerAllocationCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxSamplerAllocationCountQ() {
        return getMaxSamplerAllocationCount().getValue();
    }

    public void setMaxSamplerAllocationCount(int maxSamplerAllocationCount) {
        getMaxSamplerAllocationCount().setValue(maxSamplerAllocationCount);
    }

    protected static native long getMaxSamplerAllocationCount(long address);
    protected static native void setMaxSamplerAllocationCount(long address, long maxSamplerAllocationCount);

    public VkDeviceSize getBufferImageGranularity() {
        return new VkDeviceSize(getVkMemory(), getBufferImageGranularity(getVkAddress()));
    }

    
    public void setBufferImageGranularity(VkDeviceSize bufferImageGranularity) {
        setBufferImageGranularity(getVkAddress(), bufferImageGranularity != null ? bufferImageGranularity.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getBufferImageGranularityQ() {
        return getBufferImageGranularity().getValue();
    }

    public void setBufferImageGranularity(long bufferImageGranularity) {
        getBufferImageGranularity().setValue(bufferImageGranularity);
    }

    protected static native long getBufferImageGranularity(long address);
    protected static native void setBufferImageGranularity(long address, long bufferImageGranularity);

    public VkDeviceSize getSparseAddressSpaceSize() {
        return new VkDeviceSize(getVkMemory(), getSparseAddressSpaceSize(getVkAddress()));
    }

    
    public void setSparseAddressSpaceSize(VkDeviceSize sparseAddressSpaceSize) {
        setSparseAddressSpaceSize(getVkAddress(), sparseAddressSpaceSize != null ? sparseAddressSpaceSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getSparseAddressSpaceSizeQ() {
        return getSparseAddressSpaceSize().getValue();
    }

    public void setSparseAddressSpaceSize(long sparseAddressSpaceSize) {
        getSparseAddressSpaceSize().setValue(sparseAddressSpaceSize);
    }

    protected static native long getSparseAddressSpaceSize(long address);
    protected static native void setSparseAddressSpaceSize(long address, long sparseAddressSpaceSize);

    public VkUInt32 getMaxBoundDescriptorSets() {
        return new VkUInt32(getVkMemory(), getMaxBoundDescriptorSets(getVkAddress()));
    }

    
    public void setMaxBoundDescriptorSets(VkUInt32 maxBoundDescriptorSets) {
        setMaxBoundDescriptorSets(getVkAddress(), maxBoundDescriptorSets != null ? maxBoundDescriptorSets.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxBoundDescriptorSetsQ() {
        return getMaxBoundDescriptorSets().getValue();
    }

    public void setMaxBoundDescriptorSets(int maxBoundDescriptorSets) {
        getMaxBoundDescriptorSets().setValue(maxBoundDescriptorSets);
    }

    protected static native long getMaxBoundDescriptorSets(long address);
    protected static native void setMaxBoundDescriptorSets(long address, long maxBoundDescriptorSets);

    public VkUInt32 getMaxPerStageDescriptorSamplers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorSamplers(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorSamplers(VkUInt32 maxPerStageDescriptorSamplers) {
        setMaxPerStageDescriptorSamplers(getVkAddress(), maxPerStageDescriptorSamplers != null ? maxPerStageDescriptorSamplers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorSamplersQ() {
        return getMaxPerStageDescriptorSamplers().getValue();
    }

    public void setMaxPerStageDescriptorSamplers(int maxPerStageDescriptorSamplers) {
        getMaxPerStageDescriptorSamplers().setValue(maxPerStageDescriptorSamplers);
    }

    protected static native long getMaxPerStageDescriptorSamplers(long address);
    protected static native void setMaxPerStageDescriptorSamplers(long address, long maxPerStageDescriptorSamplers);

    public VkUInt32 getMaxPerStageDescriptorUniformBuffers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUniformBuffers(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUniformBuffers(VkUInt32 maxPerStageDescriptorUniformBuffers) {
        setMaxPerStageDescriptorUniformBuffers(getVkAddress(), maxPerStageDescriptorUniformBuffers != null ? maxPerStageDescriptorUniformBuffers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorUniformBuffersQ() {
        return getMaxPerStageDescriptorUniformBuffers().getValue();
    }

    public void setMaxPerStageDescriptorUniformBuffers(int maxPerStageDescriptorUniformBuffers) {
        getMaxPerStageDescriptorUniformBuffers().setValue(maxPerStageDescriptorUniformBuffers);
    }

    protected static native long getMaxPerStageDescriptorUniformBuffers(long address);
    protected static native void setMaxPerStageDescriptorUniformBuffers(long address, long maxPerStageDescriptorUniformBuffers);

    public VkUInt32 getMaxPerStageDescriptorStorageBuffers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorStorageBuffers(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorStorageBuffers(VkUInt32 maxPerStageDescriptorStorageBuffers) {
        setMaxPerStageDescriptorStorageBuffers(getVkAddress(), maxPerStageDescriptorStorageBuffers != null ? maxPerStageDescriptorStorageBuffers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorStorageBuffersQ() {
        return getMaxPerStageDescriptorStorageBuffers().getValue();
    }

    public void setMaxPerStageDescriptorStorageBuffers(int maxPerStageDescriptorStorageBuffers) {
        getMaxPerStageDescriptorStorageBuffers().setValue(maxPerStageDescriptorStorageBuffers);
    }

    protected static native long getMaxPerStageDescriptorStorageBuffers(long address);
    protected static native void setMaxPerStageDescriptorStorageBuffers(long address, long maxPerStageDescriptorStorageBuffers);

    public VkUInt32 getMaxPerStageDescriptorSampledImages() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorSampledImages(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorSampledImages(VkUInt32 maxPerStageDescriptorSampledImages) {
        setMaxPerStageDescriptorSampledImages(getVkAddress(), maxPerStageDescriptorSampledImages != null ? maxPerStageDescriptorSampledImages.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorSampledImagesQ() {
        return getMaxPerStageDescriptorSampledImages().getValue();
    }

    public void setMaxPerStageDescriptorSampledImages(int maxPerStageDescriptorSampledImages) {
        getMaxPerStageDescriptorSampledImages().setValue(maxPerStageDescriptorSampledImages);
    }

    protected static native long getMaxPerStageDescriptorSampledImages(long address);
    protected static native void setMaxPerStageDescriptorSampledImages(long address, long maxPerStageDescriptorSampledImages);

    public VkUInt32 getMaxPerStageDescriptorStorageImages() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorStorageImages(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorStorageImages(VkUInt32 maxPerStageDescriptorStorageImages) {
        setMaxPerStageDescriptorStorageImages(getVkAddress(), maxPerStageDescriptorStorageImages != null ? maxPerStageDescriptorStorageImages.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorStorageImagesQ() {
        return getMaxPerStageDescriptorStorageImages().getValue();
    }

    public void setMaxPerStageDescriptorStorageImages(int maxPerStageDescriptorStorageImages) {
        getMaxPerStageDescriptorStorageImages().setValue(maxPerStageDescriptorStorageImages);
    }

    protected static native long getMaxPerStageDescriptorStorageImages(long address);
    protected static native void setMaxPerStageDescriptorStorageImages(long address, long maxPerStageDescriptorStorageImages);

    public VkUInt32 getMaxPerStageDescriptorInputAttachments() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorInputAttachments(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorInputAttachments(VkUInt32 maxPerStageDescriptorInputAttachments) {
        setMaxPerStageDescriptorInputAttachments(getVkAddress(), maxPerStageDescriptorInputAttachments != null ? maxPerStageDescriptorInputAttachments.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorInputAttachmentsQ() {
        return getMaxPerStageDescriptorInputAttachments().getValue();
    }

    public void setMaxPerStageDescriptorInputAttachments(int maxPerStageDescriptorInputAttachments) {
        getMaxPerStageDescriptorInputAttachments().setValue(maxPerStageDescriptorInputAttachments);
    }

    protected static native long getMaxPerStageDescriptorInputAttachments(long address);
    protected static native void setMaxPerStageDescriptorInputAttachments(long address, long maxPerStageDescriptorInputAttachments);

    public VkUInt32 getMaxPerStageResources() {
        return new VkUInt32(getVkMemory(), getMaxPerStageResources(getVkAddress()));
    }

    
    public void setMaxPerStageResources(VkUInt32 maxPerStageResources) {
        setMaxPerStageResources(getVkAddress(), maxPerStageResources != null ? maxPerStageResources.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageResourcesQ() {
        return getMaxPerStageResources().getValue();
    }

    public void setMaxPerStageResources(int maxPerStageResources) {
        getMaxPerStageResources().setValue(maxPerStageResources);
    }

    protected static native long getMaxPerStageResources(long address);
    protected static native void setMaxPerStageResources(long address, long maxPerStageResources);

    public VkUInt32 getMaxDescriptorSetSamplers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetSamplers(getVkAddress()));
    }

    
    public void setMaxDescriptorSetSamplers(VkUInt32 maxDescriptorSetSamplers) {
        setMaxDescriptorSetSamplers(getVkAddress(), maxDescriptorSetSamplers != null ? maxDescriptorSetSamplers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetSamplersQ() {
        return getMaxDescriptorSetSamplers().getValue();
    }

    public void setMaxDescriptorSetSamplers(int maxDescriptorSetSamplers) {
        getMaxDescriptorSetSamplers().setValue(maxDescriptorSetSamplers);
    }

    protected static native long getMaxDescriptorSetSamplers(long address);
    protected static native void setMaxDescriptorSetSamplers(long address, long maxDescriptorSetSamplers);

    public VkUInt32 getMaxDescriptorSetUniformBuffers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUniformBuffers(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUniformBuffers(VkUInt32 maxDescriptorSetUniformBuffers) {
        setMaxDescriptorSetUniformBuffers(getVkAddress(), maxDescriptorSetUniformBuffers != null ? maxDescriptorSetUniformBuffers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetUniformBuffersQ() {
        return getMaxDescriptorSetUniformBuffers().getValue();
    }

    public void setMaxDescriptorSetUniformBuffers(int maxDescriptorSetUniformBuffers) {
        getMaxDescriptorSetUniformBuffers().setValue(maxDescriptorSetUniformBuffers);
    }

    protected static native long getMaxDescriptorSetUniformBuffers(long address);
    protected static native void setMaxDescriptorSetUniformBuffers(long address, long maxDescriptorSetUniformBuffers);

    public VkUInt32 getMaxDescriptorSetUniformBuffersDynamic() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUniformBuffersDynamic(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUniformBuffersDynamic(VkUInt32 maxDescriptorSetUniformBuffersDynamic) {
        setMaxDescriptorSetUniformBuffersDynamic(getVkAddress(), maxDescriptorSetUniformBuffersDynamic != null ? maxDescriptorSetUniformBuffersDynamic.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetUniformBuffersDynamicQ() {
        return getMaxDescriptorSetUniformBuffersDynamic().getValue();
    }

    public void setMaxDescriptorSetUniformBuffersDynamic(int maxDescriptorSetUniformBuffersDynamic) {
        getMaxDescriptorSetUniformBuffersDynamic().setValue(maxDescriptorSetUniformBuffersDynamic);
    }

    protected static native long getMaxDescriptorSetUniformBuffersDynamic(long address);
    protected static native void setMaxDescriptorSetUniformBuffersDynamic(long address, long maxDescriptorSetUniformBuffersDynamic);

    public VkUInt32 getMaxDescriptorSetStorageBuffers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetStorageBuffers(getVkAddress()));
    }

    
    public void setMaxDescriptorSetStorageBuffers(VkUInt32 maxDescriptorSetStorageBuffers) {
        setMaxDescriptorSetStorageBuffers(getVkAddress(), maxDescriptorSetStorageBuffers != null ? maxDescriptorSetStorageBuffers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetStorageBuffersQ() {
        return getMaxDescriptorSetStorageBuffers().getValue();
    }

    public void setMaxDescriptorSetStorageBuffers(int maxDescriptorSetStorageBuffers) {
        getMaxDescriptorSetStorageBuffers().setValue(maxDescriptorSetStorageBuffers);
    }

    protected static native long getMaxDescriptorSetStorageBuffers(long address);
    protected static native void setMaxDescriptorSetStorageBuffers(long address, long maxDescriptorSetStorageBuffers);

    public VkUInt32 getMaxDescriptorSetStorageBuffersDynamic() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetStorageBuffersDynamic(getVkAddress()));
    }

    
    public void setMaxDescriptorSetStorageBuffersDynamic(VkUInt32 maxDescriptorSetStorageBuffersDynamic) {
        setMaxDescriptorSetStorageBuffersDynamic(getVkAddress(), maxDescriptorSetStorageBuffersDynamic != null ? maxDescriptorSetStorageBuffersDynamic.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetStorageBuffersDynamicQ() {
        return getMaxDescriptorSetStorageBuffersDynamic().getValue();
    }

    public void setMaxDescriptorSetStorageBuffersDynamic(int maxDescriptorSetStorageBuffersDynamic) {
        getMaxDescriptorSetStorageBuffersDynamic().setValue(maxDescriptorSetStorageBuffersDynamic);
    }

    protected static native long getMaxDescriptorSetStorageBuffersDynamic(long address);
    protected static native void setMaxDescriptorSetStorageBuffersDynamic(long address, long maxDescriptorSetStorageBuffersDynamic);

    public VkUInt32 getMaxDescriptorSetSampledImages() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetSampledImages(getVkAddress()));
    }

    
    public void setMaxDescriptorSetSampledImages(VkUInt32 maxDescriptorSetSampledImages) {
        setMaxDescriptorSetSampledImages(getVkAddress(), maxDescriptorSetSampledImages != null ? maxDescriptorSetSampledImages.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetSampledImagesQ() {
        return getMaxDescriptorSetSampledImages().getValue();
    }

    public void setMaxDescriptorSetSampledImages(int maxDescriptorSetSampledImages) {
        getMaxDescriptorSetSampledImages().setValue(maxDescriptorSetSampledImages);
    }

    protected static native long getMaxDescriptorSetSampledImages(long address);
    protected static native void setMaxDescriptorSetSampledImages(long address, long maxDescriptorSetSampledImages);

    public VkUInt32 getMaxDescriptorSetStorageImages() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetStorageImages(getVkAddress()));
    }

    
    public void setMaxDescriptorSetStorageImages(VkUInt32 maxDescriptorSetStorageImages) {
        setMaxDescriptorSetStorageImages(getVkAddress(), maxDescriptorSetStorageImages != null ? maxDescriptorSetStorageImages.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetStorageImagesQ() {
        return getMaxDescriptorSetStorageImages().getValue();
    }

    public void setMaxDescriptorSetStorageImages(int maxDescriptorSetStorageImages) {
        getMaxDescriptorSetStorageImages().setValue(maxDescriptorSetStorageImages);
    }

    protected static native long getMaxDescriptorSetStorageImages(long address);
    protected static native void setMaxDescriptorSetStorageImages(long address, long maxDescriptorSetStorageImages);

    public VkUInt32 getMaxDescriptorSetInputAttachments() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetInputAttachments(getVkAddress()));
    }

    
    public void setMaxDescriptorSetInputAttachments(VkUInt32 maxDescriptorSetInputAttachments) {
        setMaxDescriptorSetInputAttachments(getVkAddress(), maxDescriptorSetInputAttachments != null ? maxDescriptorSetInputAttachments.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetInputAttachmentsQ() {
        return getMaxDescriptorSetInputAttachments().getValue();
    }

    public void setMaxDescriptorSetInputAttachments(int maxDescriptorSetInputAttachments) {
        getMaxDescriptorSetInputAttachments().setValue(maxDescriptorSetInputAttachments);
    }

    protected static native long getMaxDescriptorSetInputAttachments(long address);
    protected static native void setMaxDescriptorSetInputAttachments(long address, long maxDescriptorSetInputAttachments);

    public VkUInt32 getMaxVertexInputAttributes() {
        return new VkUInt32(getVkMemory(), getMaxVertexInputAttributes(getVkAddress()));
    }

    
    public void setMaxVertexInputAttributes(VkUInt32 maxVertexInputAttributes) {
        setMaxVertexInputAttributes(getVkAddress(), maxVertexInputAttributes != null ? maxVertexInputAttributes.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxVertexInputAttributesQ() {
        return getMaxVertexInputAttributes().getValue();
    }

    public void setMaxVertexInputAttributes(int maxVertexInputAttributes) {
        getMaxVertexInputAttributes().setValue(maxVertexInputAttributes);
    }

    protected static native long getMaxVertexInputAttributes(long address);
    protected static native void setMaxVertexInputAttributes(long address, long maxVertexInputAttributes);

    public VkUInt32 getMaxVertexInputBindings() {
        return new VkUInt32(getVkMemory(), getMaxVertexInputBindings(getVkAddress()));
    }

    
    public void setMaxVertexInputBindings(VkUInt32 maxVertexInputBindings) {
        setMaxVertexInputBindings(getVkAddress(), maxVertexInputBindings != null ? maxVertexInputBindings.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxVertexInputBindingsQ() {
        return getMaxVertexInputBindings().getValue();
    }

    public void setMaxVertexInputBindings(int maxVertexInputBindings) {
        getMaxVertexInputBindings().setValue(maxVertexInputBindings);
    }

    protected static native long getMaxVertexInputBindings(long address);
    protected static native void setMaxVertexInputBindings(long address, long maxVertexInputBindings);

    public VkUInt32 getMaxVertexInputAttributeOffset() {
        return new VkUInt32(getVkMemory(), getMaxVertexInputAttributeOffset(getVkAddress()));
    }

    
    public void setMaxVertexInputAttributeOffset(VkUInt32 maxVertexInputAttributeOffset) {
        setMaxVertexInputAttributeOffset(getVkAddress(), maxVertexInputAttributeOffset != null ? maxVertexInputAttributeOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxVertexInputAttributeOffsetQ() {
        return getMaxVertexInputAttributeOffset().getValue();
    }

    public void setMaxVertexInputAttributeOffset(int maxVertexInputAttributeOffset) {
        getMaxVertexInputAttributeOffset().setValue(maxVertexInputAttributeOffset);
    }

    protected static native long getMaxVertexInputAttributeOffset(long address);
    protected static native void setMaxVertexInputAttributeOffset(long address, long maxVertexInputAttributeOffset);

    public VkUInt32 getMaxVertexInputBindingStride() {
        return new VkUInt32(getVkMemory(), getMaxVertexInputBindingStride(getVkAddress()));
    }

    
    public void setMaxVertexInputBindingStride(VkUInt32 maxVertexInputBindingStride) {
        setMaxVertexInputBindingStride(getVkAddress(), maxVertexInputBindingStride != null ? maxVertexInputBindingStride.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxVertexInputBindingStrideQ() {
        return getMaxVertexInputBindingStride().getValue();
    }

    public void setMaxVertexInputBindingStride(int maxVertexInputBindingStride) {
        getMaxVertexInputBindingStride().setValue(maxVertexInputBindingStride);
    }

    protected static native long getMaxVertexInputBindingStride(long address);
    protected static native void setMaxVertexInputBindingStride(long address, long maxVertexInputBindingStride);

    public VkUInt32 getMaxVertexOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxVertexOutputComponents(getVkAddress()));
    }

    
    public void setMaxVertexOutputComponents(VkUInt32 maxVertexOutputComponents) {
        setMaxVertexOutputComponents(getVkAddress(), maxVertexOutputComponents != null ? maxVertexOutputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxVertexOutputComponentsQ() {
        return getMaxVertexOutputComponents().getValue();
    }

    public void setMaxVertexOutputComponents(int maxVertexOutputComponents) {
        getMaxVertexOutputComponents().setValue(maxVertexOutputComponents);
    }

    protected static native long getMaxVertexOutputComponents(long address);
    protected static native void setMaxVertexOutputComponents(long address, long maxVertexOutputComponents);

    public VkUInt32 getMaxTessellationGenerationLevel() {
        return new VkUInt32(getVkMemory(), getMaxTessellationGenerationLevel(getVkAddress()));
    }

    
    public void setMaxTessellationGenerationLevel(VkUInt32 maxTessellationGenerationLevel) {
        setMaxTessellationGenerationLevel(getVkAddress(), maxTessellationGenerationLevel != null ? maxTessellationGenerationLevel.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTessellationGenerationLevelQ() {
        return getMaxTessellationGenerationLevel().getValue();
    }

    public void setMaxTessellationGenerationLevel(int maxTessellationGenerationLevel) {
        getMaxTessellationGenerationLevel().setValue(maxTessellationGenerationLevel);
    }

    protected static native long getMaxTessellationGenerationLevel(long address);
    protected static native void setMaxTessellationGenerationLevel(long address, long maxTessellationGenerationLevel);

    public VkUInt32 getMaxTessellationPatchSize() {
        return new VkUInt32(getVkMemory(), getMaxTessellationPatchSize(getVkAddress()));
    }

    
    public void setMaxTessellationPatchSize(VkUInt32 maxTessellationPatchSize) {
        setMaxTessellationPatchSize(getVkAddress(), maxTessellationPatchSize != null ? maxTessellationPatchSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTessellationPatchSizeQ() {
        return getMaxTessellationPatchSize().getValue();
    }

    public void setMaxTessellationPatchSize(int maxTessellationPatchSize) {
        getMaxTessellationPatchSize().setValue(maxTessellationPatchSize);
    }

    protected static native long getMaxTessellationPatchSize(long address);
    protected static native void setMaxTessellationPatchSize(long address, long maxTessellationPatchSize);

    public VkUInt32 getMaxTessellationControlPerVertexInputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationControlPerVertexInputComponents(getVkAddress()));
    }

    
    public void setMaxTessellationControlPerVertexInputComponents(VkUInt32 maxTessellationControlPerVertexInputComponents) {
        setMaxTessellationControlPerVertexInputComponents(getVkAddress(), maxTessellationControlPerVertexInputComponents != null ? maxTessellationControlPerVertexInputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTessellationControlPerVertexInputComponentsQ() {
        return getMaxTessellationControlPerVertexInputComponents().getValue();
    }

    public void setMaxTessellationControlPerVertexInputComponents(int maxTessellationControlPerVertexInputComponents) {
        getMaxTessellationControlPerVertexInputComponents().setValue(maxTessellationControlPerVertexInputComponents);
    }

    protected static native long getMaxTessellationControlPerVertexInputComponents(long address);
    protected static native void setMaxTessellationControlPerVertexInputComponents(long address, long maxTessellationControlPerVertexInputComponents);

    public VkUInt32 getMaxTessellationControlPerVertexOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationControlPerVertexOutputComponents(getVkAddress()));
    }

    
    public void setMaxTessellationControlPerVertexOutputComponents(VkUInt32 maxTessellationControlPerVertexOutputComponents) {
        setMaxTessellationControlPerVertexOutputComponents(getVkAddress(), maxTessellationControlPerVertexOutputComponents != null ? maxTessellationControlPerVertexOutputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTessellationControlPerVertexOutputComponentsQ() {
        return getMaxTessellationControlPerVertexOutputComponents().getValue();
    }

    public void setMaxTessellationControlPerVertexOutputComponents(int maxTessellationControlPerVertexOutputComponents) {
        getMaxTessellationControlPerVertexOutputComponents().setValue(maxTessellationControlPerVertexOutputComponents);
    }

    protected static native long getMaxTessellationControlPerVertexOutputComponents(long address);
    protected static native void setMaxTessellationControlPerVertexOutputComponents(long address, long maxTessellationControlPerVertexOutputComponents);

    public VkUInt32 getMaxTessellationControlPerPatchOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationControlPerPatchOutputComponents(getVkAddress()));
    }

    
    public void setMaxTessellationControlPerPatchOutputComponents(VkUInt32 maxTessellationControlPerPatchOutputComponents) {
        setMaxTessellationControlPerPatchOutputComponents(getVkAddress(), maxTessellationControlPerPatchOutputComponents != null ? maxTessellationControlPerPatchOutputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTessellationControlPerPatchOutputComponentsQ() {
        return getMaxTessellationControlPerPatchOutputComponents().getValue();
    }

    public void setMaxTessellationControlPerPatchOutputComponents(int maxTessellationControlPerPatchOutputComponents) {
        getMaxTessellationControlPerPatchOutputComponents().setValue(maxTessellationControlPerPatchOutputComponents);
    }

    protected static native long getMaxTessellationControlPerPatchOutputComponents(long address);
    protected static native void setMaxTessellationControlPerPatchOutputComponents(long address, long maxTessellationControlPerPatchOutputComponents);

    public VkUInt32 getMaxTessellationControlTotalOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationControlTotalOutputComponents(getVkAddress()));
    }

    
    public void setMaxTessellationControlTotalOutputComponents(VkUInt32 maxTessellationControlTotalOutputComponents) {
        setMaxTessellationControlTotalOutputComponents(getVkAddress(), maxTessellationControlTotalOutputComponents != null ? maxTessellationControlTotalOutputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTessellationControlTotalOutputComponentsQ() {
        return getMaxTessellationControlTotalOutputComponents().getValue();
    }

    public void setMaxTessellationControlTotalOutputComponents(int maxTessellationControlTotalOutputComponents) {
        getMaxTessellationControlTotalOutputComponents().setValue(maxTessellationControlTotalOutputComponents);
    }

    protected static native long getMaxTessellationControlTotalOutputComponents(long address);
    protected static native void setMaxTessellationControlTotalOutputComponents(long address, long maxTessellationControlTotalOutputComponents);

    public VkUInt32 getMaxTessellationEvaluationInputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationEvaluationInputComponents(getVkAddress()));
    }

    
    public void setMaxTessellationEvaluationInputComponents(VkUInt32 maxTessellationEvaluationInputComponents) {
        setMaxTessellationEvaluationInputComponents(getVkAddress(), maxTessellationEvaluationInputComponents != null ? maxTessellationEvaluationInputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTessellationEvaluationInputComponentsQ() {
        return getMaxTessellationEvaluationInputComponents().getValue();
    }

    public void setMaxTessellationEvaluationInputComponents(int maxTessellationEvaluationInputComponents) {
        getMaxTessellationEvaluationInputComponents().setValue(maxTessellationEvaluationInputComponents);
    }

    protected static native long getMaxTessellationEvaluationInputComponents(long address);
    protected static native void setMaxTessellationEvaluationInputComponents(long address, long maxTessellationEvaluationInputComponents);

    public VkUInt32 getMaxTessellationEvaluationOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxTessellationEvaluationOutputComponents(getVkAddress()));
    }

    
    public void setMaxTessellationEvaluationOutputComponents(VkUInt32 maxTessellationEvaluationOutputComponents) {
        setMaxTessellationEvaluationOutputComponents(getVkAddress(), maxTessellationEvaluationOutputComponents != null ? maxTessellationEvaluationOutputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTessellationEvaluationOutputComponentsQ() {
        return getMaxTessellationEvaluationOutputComponents().getValue();
    }

    public void setMaxTessellationEvaluationOutputComponents(int maxTessellationEvaluationOutputComponents) {
        getMaxTessellationEvaluationOutputComponents().setValue(maxTessellationEvaluationOutputComponents);
    }

    protected static native long getMaxTessellationEvaluationOutputComponents(long address);
    protected static native void setMaxTessellationEvaluationOutputComponents(long address, long maxTessellationEvaluationOutputComponents);

    public VkUInt32 getMaxGeometryShaderInvocations() {
        return new VkUInt32(getVkMemory(), getMaxGeometryShaderInvocations(getVkAddress()));
    }

    
    public void setMaxGeometryShaderInvocations(VkUInt32 maxGeometryShaderInvocations) {
        setMaxGeometryShaderInvocations(getVkAddress(), maxGeometryShaderInvocations != null ? maxGeometryShaderInvocations.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxGeometryShaderInvocationsQ() {
        return getMaxGeometryShaderInvocations().getValue();
    }

    public void setMaxGeometryShaderInvocations(int maxGeometryShaderInvocations) {
        getMaxGeometryShaderInvocations().setValue(maxGeometryShaderInvocations);
    }

    protected static native long getMaxGeometryShaderInvocations(long address);
    protected static native void setMaxGeometryShaderInvocations(long address, long maxGeometryShaderInvocations);

    public VkUInt32 getMaxGeometryInputComponents() {
        return new VkUInt32(getVkMemory(), getMaxGeometryInputComponents(getVkAddress()));
    }

    
    public void setMaxGeometryInputComponents(VkUInt32 maxGeometryInputComponents) {
        setMaxGeometryInputComponents(getVkAddress(), maxGeometryInputComponents != null ? maxGeometryInputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxGeometryInputComponentsQ() {
        return getMaxGeometryInputComponents().getValue();
    }

    public void setMaxGeometryInputComponents(int maxGeometryInputComponents) {
        getMaxGeometryInputComponents().setValue(maxGeometryInputComponents);
    }

    protected static native long getMaxGeometryInputComponents(long address);
    protected static native void setMaxGeometryInputComponents(long address, long maxGeometryInputComponents);

    public VkUInt32 getMaxGeometryOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxGeometryOutputComponents(getVkAddress()));
    }

    
    public void setMaxGeometryOutputComponents(VkUInt32 maxGeometryOutputComponents) {
        setMaxGeometryOutputComponents(getVkAddress(), maxGeometryOutputComponents != null ? maxGeometryOutputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxGeometryOutputComponentsQ() {
        return getMaxGeometryOutputComponents().getValue();
    }

    public void setMaxGeometryOutputComponents(int maxGeometryOutputComponents) {
        getMaxGeometryOutputComponents().setValue(maxGeometryOutputComponents);
    }

    protected static native long getMaxGeometryOutputComponents(long address);
    protected static native void setMaxGeometryOutputComponents(long address, long maxGeometryOutputComponents);

    public VkUInt32 getMaxGeometryOutputVertices() {
        return new VkUInt32(getVkMemory(), getMaxGeometryOutputVertices(getVkAddress()));
    }

    
    public void setMaxGeometryOutputVertices(VkUInt32 maxGeometryOutputVertices) {
        setMaxGeometryOutputVertices(getVkAddress(), maxGeometryOutputVertices != null ? maxGeometryOutputVertices.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxGeometryOutputVerticesQ() {
        return getMaxGeometryOutputVertices().getValue();
    }

    public void setMaxGeometryOutputVertices(int maxGeometryOutputVertices) {
        getMaxGeometryOutputVertices().setValue(maxGeometryOutputVertices);
    }

    protected static native long getMaxGeometryOutputVertices(long address);
    protected static native void setMaxGeometryOutputVertices(long address, long maxGeometryOutputVertices);

    public VkUInt32 getMaxGeometryTotalOutputComponents() {
        return new VkUInt32(getVkMemory(), getMaxGeometryTotalOutputComponents(getVkAddress()));
    }

    
    public void setMaxGeometryTotalOutputComponents(VkUInt32 maxGeometryTotalOutputComponents) {
        setMaxGeometryTotalOutputComponents(getVkAddress(), maxGeometryTotalOutputComponents != null ? maxGeometryTotalOutputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxGeometryTotalOutputComponentsQ() {
        return getMaxGeometryTotalOutputComponents().getValue();
    }

    public void setMaxGeometryTotalOutputComponents(int maxGeometryTotalOutputComponents) {
        getMaxGeometryTotalOutputComponents().setValue(maxGeometryTotalOutputComponents);
    }

    protected static native long getMaxGeometryTotalOutputComponents(long address);
    protected static native void setMaxGeometryTotalOutputComponents(long address, long maxGeometryTotalOutputComponents);

    public VkUInt32 getMaxFragmentInputComponents() {
        return new VkUInt32(getVkMemory(), getMaxFragmentInputComponents(getVkAddress()));
    }

    
    public void setMaxFragmentInputComponents(VkUInt32 maxFragmentInputComponents) {
        setMaxFragmentInputComponents(getVkAddress(), maxFragmentInputComponents != null ? maxFragmentInputComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxFragmentInputComponentsQ() {
        return getMaxFragmentInputComponents().getValue();
    }

    public void setMaxFragmentInputComponents(int maxFragmentInputComponents) {
        getMaxFragmentInputComponents().setValue(maxFragmentInputComponents);
    }

    protected static native long getMaxFragmentInputComponents(long address);
    protected static native void setMaxFragmentInputComponents(long address, long maxFragmentInputComponents);

    public VkUInt32 getMaxFragmentOutputAttachments() {
        return new VkUInt32(getVkMemory(), getMaxFragmentOutputAttachments(getVkAddress()));
    }

    
    public void setMaxFragmentOutputAttachments(VkUInt32 maxFragmentOutputAttachments) {
        setMaxFragmentOutputAttachments(getVkAddress(), maxFragmentOutputAttachments != null ? maxFragmentOutputAttachments.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxFragmentOutputAttachmentsQ() {
        return getMaxFragmentOutputAttachments().getValue();
    }

    public void setMaxFragmentOutputAttachments(int maxFragmentOutputAttachments) {
        getMaxFragmentOutputAttachments().setValue(maxFragmentOutputAttachments);
    }

    protected static native long getMaxFragmentOutputAttachments(long address);
    protected static native void setMaxFragmentOutputAttachments(long address, long maxFragmentOutputAttachments);

    public VkUInt32 getMaxFragmentDualSrcAttachments() {
        return new VkUInt32(getVkMemory(), getMaxFragmentDualSrcAttachments(getVkAddress()));
    }

    
    public void setMaxFragmentDualSrcAttachments(VkUInt32 maxFragmentDualSrcAttachments) {
        setMaxFragmentDualSrcAttachments(getVkAddress(), maxFragmentDualSrcAttachments != null ? maxFragmentDualSrcAttachments.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxFragmentDualSrcAttachmentsQ() {
        return getMaxFragmentDualSrcAttachments().getValue();
    }

    public void setMaxFragmentDualSrcAttachments(int maxFragmentDualSrcAttachments) {
        getMaxFragmentDualSrcAttachments().setValue(maxFragmentDualSrcAttachments);
    }

    protected static native long getMaxFragmentDualSrcAttachments(long address);
    protected static native void setMaxFragmentDualSrcAttachments(long address, long maxFragmentDualSrcAttachments);

    public VkUInt32 getMaxFragmentCombinedOutputResources() {
        return new VkUInt32(getVkMemory(), getMaxFragmentCombinedOutputResources(getVkAddress()));
    }

    
    public void setMaxFragmentCombinedOutputResources(VkUInt32 maxFragmentCombinedOutputResources) {
        setMaxFragmentCombinedOutputResources(getVkAddress(), maxFragmentCombinedOutputResources != null ? maxFragmentCombinedOutputResources.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxFragmentCombinedOutputResourcesQ() {
        return getMaxFragmentCombinedOutputResources().getValue();
    }

    public void setMaxFragmentCombinedOutputResources(int maxFragmentCombinedOutputResources) {
        getMaxFragmentCombinedOutputResources().setValue(maxFragmentCombinedOutputResources);
    }

    protected static native long getMaxFragmentCombinedOutputResources(long address);
    protected static native void setMaxFragmentCombinedOutputResources(long address, long maxFragmentCombinedOutputResources);

    public VkUInt32 getMaxComputeSharedMemorySize() {
        return new VkUInt32(getVkMemory(), getMaxComputeSharedMemorySize(getVkAddress()));
    }

    
    public void setMaxComputeSharedMemorySize(VkUInt32 maxComputeSharedMemorySize) {
        setMaxComputeSharedMemorySize(getVkAddress(), maxComputeSharedMemorySize != null ? maxComputeSharedMemorySize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxComputeSharedMemorySizeQ() {
        return getMaxComputeSharedMemorySize().getValue();
    }

    public void setMaxComputeSharedMemorySize(int maxComputeSharedMemorySize) {
        getMaxComputeSharedMemorySize().setValue(maxComputeSharedMemorySize);
    }

    protected static native long getMaxComputeSharedMemorySize(long address);
    protected static native void setMaxComputeSharedMemorySize(long address, long maxComputeSharedMemorySize);

    public VkUInt32 getMaxComputeWorkGroupCount() {
        return new VkUInt32(getVkMemory(), getMaxComputeWorkGroupCount(getVkAddress()));
    }

    
    public void setMaxComputeWorkGroupCount(VkUInt32 maxComputeWorkGroupCount) {
        setMaxComputeWorkGroupCount(getVkAddress(), maxComputeWorkGroupCount != null ? maxComputeWorkGroupCount.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getMaxComputeWorkGroupCount(long address);
    protected static native void setMaxComputeWorkGroupCount(long address, long maxComputeWorkGroupCount);

    public VkUInt32 getMaxComputeWorkGroupInvocations() {
        return new VkUInt32(getVkMemory(), getMaxComputeWorkGroupInvocations(getVkAddress()));
    }

    
    public void setMaxComputeWorkGroupInvocations(VkUInt32 maxComputeWorkGroupInvocations) {
        setMaxComputeWorkGroupInvocations(getVkAddress(), maxComputeWorkGroupInvocations != null ? maxComputeWorkGroupInvocations.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxComputeWorkGroupInvocationsQ() {
        return getMaxComputeWorkGroupInvocations().getValue();
    }

    public void setMaxComputeWorkGroupInvocations(int maxComputeWorkGroupInvocations) {
        getMaxComputeWorkGroupInvocations().setValue(maxComputeWorkGroupInvocations);
    }

    protected static native long getMaxComputeWorkGroupInvocations(long address);
    protected static native void setMaxComputeWorkGroupInvocations(long address, long maxComputeWorkGroupInvocations);

    public VkUInt32 getMaxComputeWorkGroupSize() {
        return new VkUInt32(getVkMemory(), getMaxComputeWorkGroupSize(getVkAddress()));
    }

    
    public void setMaxComputeWorkGroupSize(VkUInt32 maxComputeWorkGroupSize) {
        setMaxComputeWorkGroupSize(getVkAddress(), maxComputeWorkGroupSize != null ? maxComputeWorkGroupSize.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getMaxComputeWorkGroupSize(long address);
    protected static native void setMaxComputeWorkGroupSize(long address, long maxComputeWorkGroupSize);

    public VkUInt32 getSubPixelPrecisionBits() {
        return new VkUInt32(getVkMemory(), getSubPixelPrecisionBits(getVkAddress()));
    }

    
    public void setSubPixelPrecisionBits(VkUInt32 subPixelPrecisionBits) {
        setSubPixelPrecisionBits(getVkAddress(), subPixelPrecisionBits != null ? subPixelPrecisionBits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubPixelPrecisionBitsQ() {
        return getSubPixelPrecisionBits().getValue();
    }

    public void setSubPixelPrecisionBits(int subPixelPrecisionBits) {
        getSubPixelPrecisionBits().setValue(subPixelPrecisionBits);
    }

    protected static native long getSubPixelPrecisionBits(long address);
    protected static native void setSubPixelPrecisionBits(long address, long subPixelPrecisionBits);

    public VkUInt32 getSubTexelPrecisionBits() {
        return new VkUInt32(getVkMemory(), getSubTexelPrecisionBits(getVkAddress()));
    }

    
    public void setSubTexelPrecisionBits(VkUInt32 subTexelPrecisionBits) {
        setSubTexelPrecisionBits(getVkAddress(), subTexelPrecisionBits != null ? subTexelPrecisionBits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubTexelPrecisionBitsQ() {
        return getSubTexelPrecisionBits().getValue();
    }

    public void setSubTexelPrecisionBits(int subTexelPrecisionBits) {
        getSubTexelPrecisionBits().setValue(subTexelPrecisionBits);
    }

    protected static native long getSubTexelPrecisionBits(long address);
    protected static native void setSubTexelPrecisionBits(long address, long subTexelPrecisionBits);

    public VkUInt32 getMipmapPrecisionBits() {
        return new VkUInt32(getVkMemory(), getMipmapPrecisionBits(getVkAddress()));
    }

    
    public void setMipmapPrecisionBits(VkUInt32 mipmapPrecisionBits) {
        setMipmapPrecisionBits(getVkAddress(), mipmapPrecisionBits != null ? mipmapPrecisionBits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMipmapPrecisionBitsQ() {
        return getMipmapPrecisionBits().getValue();
    }

    public void setMipmapPrecisionBits(int mipmapPrecisionBits) {
        getMipmapPrecisionBits().setValue(mipmapPrecisionBits);
    }

    protected static native long getMipmapPrecisionBits(long address);
    protected static native void setMipmapPrecisionBits(long address, long mipmapPrecisionBits);

    public VkUInt32 getMaxDrawIndexedIndexValue() {
        return new VkUInt32(getVkMemory(), getMaxDrawIndexedIndexValue(getVkAddress()));
    }

    
    public void setMaxDrawIndexedIndexValue(VkUInt32 maxDrawIndexedIndexValue) {
        setMaxDrawIndexedIndexValue(getVkAddress(), maxDrawIndexedIndexValue != null ? maxDrawIndexedIndexValue.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDrawIndexedIndexValueQ() {
        return getMaxDrawIndexedIndexValue().getValue();
    }

    public void setMaxDrawIndexedIndexValue(int maxDrawIndexedIndexValue) {
        getMaxDrawIndexedIndexValue().setValue(maxDrawIndexedIndexValue);
    }

    protected static native long getMaxDrawIndexedIndexValue(long address);
    protected static native void setMaxDrawIndexedIndexValue(long address, long maxDrawIndexedIndexValue);

    public VkUInt32 getMaxDrawIndirectCount() {
        return new VkUInt32(getVkMemory(), getMaxDrawIndirectCount(getVkAddress()));
    }

    
    public void setMaxDrawIndirectCount(VkUInt32 maxDrawIndirectCount) {
        setMaxDrawIndirectCount(getVkAddress(), maxDrawIndirectCount != null ? maxDrawIndirectCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDrawIndirectCountQ() {
        return getMaxDrawIndirectCount().getValue();
    }

    public void setMaxDrawIndirectCount(int maxDrawIndirectCount) {
        getMaxDrawIndirectCount().setValue(maxDrawIndirectCount);
    }

    protected static native long getMaxDrawIndirectCount(long address);
    protected static native void setMaxDrawIndirectCount(long address, long maxDrawIndirectCount);

    public VkFloat getMaxSamplerLodBias() {
        return new VkFloat(getVkMemory(), getMaxSamplerLodBias(getVkAddress()));
    }

    
    public void setMaxSamplerLodBias(VkFloat maxSamplerLodBias) {
        setMaxSamplerLodBias(getVkAddress(), maxSamplerLodBias != null ? maxSamplerLodBias.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxSamplerLodBiasQ() {
        return getMaxSamplerLodBias().getValue();
    }

    public void setMaxSamplerLodBias(float maxSamplerLodBias) {
        getMaxSamplerLodBias().setValue(maxSamplerLodBias);
    }

    protected static native long getMaxSamplerLodBias(long address);
    protected static native void setMaxSamplerLodBias(long address, long maxSamplerLodBias);

    public VkFloat getMaxSamplerAnisotropy() {
        return new VkFloat(getVkMemory(), getMaxSamplerAnisotropy(getVkAddress()));
    }

    
    public void setMaxSamplerAnisotropy(VkFloat maxSamplerAnisotropy) {
        setMaxSamplerAnisotropy(getVkAddress(), maxSamplerAnisotropy != null ? maxSamplerAnisotropy.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxSamplerAnisotropyQ() {
        return getMaxSamplerAnisotropy().getValue();
    }

    public void setMaxSamplerAnisotropy(float maxSamplerAnisotropy) {
        getMaxSamplerAnisotropy().setValue(maxSamplerAnisotropy);
    }

    protected static native long getMaxSamplerAnisotropy(long address);
    protected static native void setMaxSamplerAnisotropy(long address, long maxSamplerAnisotropy);

    public VkUInt32 getMaxViewports() {
        return new VkUInt32(getVkMemory(), getMaxViewports(getVkAddress()));
    }

    
    public void setMaxViewports(VkUInt32 maxViewports) {
        setMaxViewports(getVkAddress(), maxViewports != null ? maxViewports.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxViewportsQ() {
        return getMaxViewports().getValue();
    }

    public void setMaxViewports(int maxViewports) {
        getMaxViewports().setValue(maxViewports);
    }

    protected static native long getMaxViewports(long address);
    protected static native void setMaxViewports(long address, long maxViewports);

    public VkUInt32 getMaxViewportDimensions() {
        return new VkUInt32(getVkMemory(), getMaxViewportDimensions(getVkAddress()));
    }

    
    public void setMaxViewportDimensions(VkUInt32 maxViewportDimensions) {
        setMaxViewportDimensions(getVkAddress(), maxViewportDimensions != null ? maxViewportDimensions.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getMaxViewportDimensions(long address);
    protected static native void setMaxViewportDimensions(long address, long maxViewportDimensions);

    public VkFloat getViewportBoundsRange() {
        return new VkFloat(getVkMemory(), getViewportBoundsRange(getVkAddress()));
    }

    
    public void setViewportBoundsRange(VkFloat viewportBoundsRange) {
        setViewportBoundsRange(getVkAddress(), viewportBoundsRange != null ? viewportBoundsRange.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getViewportBoundsRange(long address);
    protected static native void setViewportBoundsRange(long address, long viewportBoundsRange);

    public VkUInt32 getViewportSubPixelBits() {
        return new VkUInt32(getVkMemory(), getViewportSubPixelBits(getVkAddress()));
    }

    
    public void setViewportSubPixelBits(VkUInt32 viewportSubPixelBits) {
        setViewportSubPixelBits(getVkAddress(), viewportSubPixelBits != null ? viewportSubPixelBits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getViewportSubPixelBitsQ() {
        return getViewportSubPixelBits().getValue();
    }

    public void setViewportSubPixelBits(int viewportSubPixelBits) {
        getViewportSubPixelBits().setValue(viewportSubPixelBits);
    }

    protected static native long getViewportSubPixelBits(long address);
    protected static native void setViewportSubPixelBits(long address, long viewportSubPixelBits);

    public VkSize getMinMemoryMapAlignment() {
        return new VkSize(getVkMemory(), getMinMemoryMapAlignment(getVkAddress()));
    }

    
    public void setMinMemoryMapAlignment(VkSize minMemoryMapAlignment) {
        setMinMemoryMapAlignment(getVkAddress(), minMemoryMapAlignment != null ? minMemoryMapAlignment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getMinMemoryMapAlignmentQ() {
        return getMinMemoryMapAlignment().getValue();
    }

    public void setMinMemoryMapAlignment(long minMemoryMapAlignment) {
        getMinMemoryMapAlignment().setValue(minMemoryMapAlignment);
    }

    protected static native long getMinMemoryMapAlignment(long address);
    protected static native void setMinMemoryMapAlignment(long address, long minMemoryMapAlignment);

    public VkDeviceSize getMinTexelBufferOffsetAlignment() {
        return new VkDeviceSize(getVkMemory(), getMinTexelBufferOffsetAlignment(getVkAddress()));
    }

    
    public void setMinTexelBufferOffsetAlignment(VkDeviceSize minTexelBufferOffsetAlignment) {
        setMinTexelBufferOffsetAlignment(getVkAddress(), minTexelBufferOffsetAlignment != null ? minTexelBufferOffsetAlignment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getMinTexelBufferOffsetAlignmentQ() {
        return getMinTexelBufferOffsetAlignment().getValue();
    }

    public void setMinTexelBufferOffsetAlignment(long minTexelBufferOffsetAlignment) {
        getMinTexelBufferOffsetAlignment().setValue(minTexelBufferOffsetAlignment);
    }

    protected static native long getMinTexelBufferOffsetAlignment(long address);
    protected static native void setMinTexelBufferOffsetAlignment(long address, long minTexelBufferOffsetAlignment);

    public VkDeviceSize getMinUniformBufferOffsetAlignment() {
        return new VkDeviceSize(getVkMemory(), getMinUniformBufferOffsetAlignment(getVkAddress()));
    }

    
    public void setMinUniformBufferOffsetAlignment(VkDeviceSize minUniformBufferOffsetAlignment) {
        setMinUniformBufferOffsetAlignment(getVkAddress(), minUniformBufferOffsetAlignment != null ? minUniformBufferOffsetAlignment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getMinUniformBufferOffsetAlignmentQ() {
        return getMinUniformBufferOffsetAlignment().getValue();
    }

    public void setMinUniformBufferOffsetAlignment(long minUniformBufferOffsetAlignment) {
        getMinUniformBufferOffsetAlignment().setValue(minUniformBufferOffsetAlignment);
    }

    protected static native long getMinUniformBufferOffsetAlignment(long address);
    protected static native void setMinUniformBufferOffsetAlignment(long address, long minUniformBufferOffsetAlignment);

    public VkDeviceSize getMinStorageBufferOffsetAlignment() {
        return new VkDeviceSize(getVkMemory(), getMinStorageBufferOffsetAlignment(getVkAddress()));
    }

    
    public void setMinStorageBufferOffsetAlignment(VkDeviceSize minStorageBufferOffsetAlignment) {
        setMinStorageBufferOffsetAlignment(getVkAddress(), minStorageBufferOffsetAlignment != null ? minStorageBufferOffsetAlignment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getMinStorageBufferOffsetAlignmentQ() {
        return getMinStorageBufferOffsetAlignment().getValue();
    }

    public void setMinStorageBufferOffsetAlignment(long minStorageBufferOffsetAlignment) {
        getMinStorageBufferOffsetAlignment().setValue(minStorageBufferOffsetAlignment);
    }

    protected static native long getMinStorageBufferOffsetAlignment(long address);
    protected static native void setMinStorageBufferOffsetAlignment(long address, long minStorageBufferOffsetAlignment);

    public VkInt32 getMinTexelOffset() {
        return new VkInt32(getVkMemory(), getMinTexelOffset(getVkAddress()));
    }

    
    public void setMinTexelOffset(VkInt32 minTexelOffset) {
        setMinTexelOffset(getVkAddress(), minTexelOffset != null ? minTexelOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMinTexelOffsetQ() {
        return getMinTexelOffset().getValue();
    }

    public void setMinTexelOffset(int minTexelOffset) {
        getMinTexelOffset().setValue(minTexelOffset);
    }

    protected static native long getMinTexelOffset(long address);
    protected static native void setMinTexelOffset(long address, long minTexelOffset);

    public VkUInt32 getMaxTexelOffset() {
        return new VkUInt32(getVkMemory(), getMaxTexelOffset(getVkAddress()));
    }

    
    public void setMaxTexelOffset(VkUInt32 maxTexelOffset) {
        setMaxTexelOffset(getVkAddress(), maxTexelOffset != null ? maxTexelOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTexelOffsetQ() {
        return getMaxTexelOffset().getValue();
    }

    public void setMaxTexelOffset(int maxTexelOffset) {
        getMaxTexelOffset().setValue(maxTexelOffset);
    }

    protected static native long getMaxTexelOffset(long address);
    protected static native void setMaxTexelOffset(long address, long maxTexelOffset);

    public VkInt32 getMinTexelGatherOffset() {
        return new VkInt32(getVkMemory(), getMinTexelGatherOffset(getVkAddress()));
    }

    
    public void setMinTexelGatherOffset(VkInt32 minTexelGatherOffset) {
        setMinTexelGatherOffset(getVkAddress(), minTexelGatherOffset != null ? minTexelGatherOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMinTexelGatherOffsetQ() {
        return getMinTexelGatherOffset().getValue();
    }

    public void setMinTexelGatherOffset(int minTexelGatherOffset) {
        getMinTexelGatherOffset().setValue(minTexelGatherOffset);
    }

    protected static native long getMinTexelGatherOffset(long address);
    protected static native void setMinTexelGatherOffset(long address, long minTexelGatherOffset);

    public VkUInt32 getMaxTexelGatherOffset() {
        return new VkUInt32(getVkMemory(), getMaxTexelGatherOffset(getVkAddress()));
    }

    
    public void setMaxTexelGatherOffset(VkUInt32 maxTexelGatherOffset) {
        setMaxTexelGatherOffset(getVkAddress(), maxTexelGatherOffset != null ? maxTexelGatherOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxTexelGatherOffsetQ() {
        return getMaxTexelGatherOffset().getValue();
    }

    public void setMaxTexelGatherOffset(int maxTexelGatherOffset) {
        getMaxTexelGatherOffset().setValue(maxTexelGatherOffset);
    }

    protected static native long getMaxTexelGatherOffset(long address);
    protected static native void setMaxTexelGatherOffset(long address, long maxTexelGatherOffset);

    public VkFloat getMinInterpolationOffset() {
        return new VkFloat(getVkMemory(), getMinInterpolationOffset(getVkAddress()));
    }

    
    public void setMinInterpolationOffset(VkFloat minInterpolationOffset) {
        setMinInterpolationOffset(getVkAddress(), minInterpolationOffset != null ? minInterpolationOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMinInterpolationOffsetQ() {
        return getMinInterpolationOffset().getValue();
    }

    public void setMinInterpolationOffset(float minInterpolationOffset) {
        getMinInterpolationOffset().setValue(minInterpolationOffset);
    }

    protected static native long getMinInterpolationOffset(long address);
    protected static native void setMinInterpolationOffset(long address, long minInterpolationOffset);

    public VkFloat getMaxInterpolationOffset() {
        return new VkFloat(getVkMemory(), getMaxInterpolationOffset(getVkAddress()));
    }

    
    public void setMaxInterpolationOffset(VkFloat maxInterpolationOffset) {
        setMaxInterpolationOffset(getVkAddress(), maxInterpolationOffset != null ? maxInterpolationOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxInterpolationOffsetQ() {
        return getMaxInterpolationOffset().getValue();
    }

    public void setMaxInterpolationOffset(float maxInterpolationOffset) {
        getMaxInterpolationOffset().setValue(maxInterpolationOffset);
    }

    protected static native long getMaxInterpolationOffset(long address);
    protected static native void setMaxInterpolationOffset(long address, long maxInterpolationOffset);

    public VkUInt32 getSubPixelInterpolationOffsetBits() {
        return new VkUInt32(getVkMemory(), getSubPixelInterpolationOffsetBits(getVkAddress()));
    }

    
    public void setSubPixelInterpolationOffsetBits(VkUInt32 subPixelInterpolationOffsetBits) {
        setSubPixelInterpolationOffsetBits(getVkAddress(), subPixelInterpolationOffsetBits != null ? subPixelInterpolationOffsetBits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubPixelInterpolationOffsetBitsQ() {
        return getSubPixelInterpolationOffsetBits().getValue();
    }

    public void setSubPixelInterpolationOffsetBits(int subPixelInterpolationOffsetBits) {
        getSubPixelInterpolationOffsetBits().setValue(subPixelInterpolationOffsetBits);
    }

    protected static native long getSubPixelInterpolationOffsetBits(long address);
    protected static native void setSubPixelInterpolationOffsetBits(long address, long subPixelInterpolationOffsetBits);

    public VkUInt32 getMaxFramebufferWidth() {
        return new VkUInt32(getVkMemory(), getMaxFramebufferWidth(getVkAddress()));
    }

    
    public void setMaxFramebufferWidth(VkUInt32 maxFramebufferWidth) {
        setMaxFramebufferWidth(getVkAddress(), maxFramebufferWidth != null ? maxFramebufferWidth.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxFramebufferWidthQ() {
        return getMaxFramebufferWidth().getValue();
    }

    public void setMaxFramebufferWidth(int maxFramebufferWidth) {
        getMaxFramebufferWidth().setValue(maxFramebufferWidth);
    }

    protected static native long getMaxFramebufferWidth(long address);
    protected static native void setMaxFramebufferWidth(long address, long maxFramebufferWidth);

    public VkUInt32 getMaxFramebufferHeight() {
        return new VkUInt32(getVkMemory(), getMaxFramebufferHeight(getVkAddress()));
    }

    
    public void setMaxFramebufferHeight(VkUInt32 maxFramebufferHeight) {
        setMaxFramebufferHeight(getVkAddress(), maxFramebufferHeight != null ? maxFramebufferHeight.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxFramebufferHeightQ() {
        return getMaxFramebufferHeight().getValue();
    }

    public void setMaxFramebufferHeight(int maxFramebufferHeight) {
        getMaxFramebufferHeight().setValue(maxFramebufferHeight);
    }

    protected static native long getMaxFramebufferHeight(long address);
    protected static native void setMaxFramebufferHeight(long address, long maxFramebufferHeight);

    public VkUInt32 getMaxFramebufferLayers() {
        return new VkUInt32(getVkMemory(), getMaxFramebufferLayers(getVkAddress()));
    }

    
    public void setMaxFramebufferLayers(VkUInt32 maxFramebufferLayers) {
        setMaxFramebufferLayers(getVkAddress(), maxFramebufferLayers != null ? maxFramebufferLayers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxFramebufferLayersQ() {
        return getMaxFramebufferLayers().getValue();
    }

    public void setMaxFramebufferLayers(int maxFramebufferLayers) {
        getMaxFramebufferLayers().setValue(maxFramebufferLayers);
    }

    protected static native long getMaxFramebufferLayers(long address);
    protected static native void setMaxFramebufferLayers(long address, long maxFramebufferLayers);

    public VkSampleCountFlags getFramebufferColorSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getFramebufferColorSampleCounts(getVkAddress()));
    }

    
    public void setFramebufferColorSampleCounts(VkSampleCountFlags framebufferColorSampleCounts) {
        setFramebufferColorSampleCounts(getVkAddress(), framebufferColorSampleCounts != null ? framebufferColorSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFramebufferColorSampleCountsQ() {
        return getFramebufferColorSampleCounts().getValue();
    }

    public void setFramebufferColorSampleCounts(int framebufferColorSampleCounts) {
        getFramebufferColorSampleCounts().setValue(framebufferColorSampleCounts);
    }

    protected static native long getFramebufferColorSampleCounts(long address);
    protected static native void setFramebufferColorSampleCounts(long address, long framebufferColorSampleCounts);

    public VkSampleCountFlags getFramebufferDepthSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getFramebufferDepthSampleCounts(getVkAddress()));
    }

    
    public void setFramebufferDepthSampleCounts(VkSampleCountFlags framebufferDepthSampleCounts) {
        setFramebufferDepthSampleCounts(getVkAddress(), framebufferDepthSampleCounts != null ? framebufferDepthSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFramebufferDepthSampleCountsQ() {
        return getFramebufferDepthSampleCounts().getValue();
    }

    public void setFramebufferDepthSampleCounts(int framebufferDepthSampleCounts) {
        getFramebufferDepthSampleCounts().setValue(framebufferDepthSampleCounts);
    }

    protected static native long getFramebufferDepthSampleCounts(long address);
    protected static native void setFramebufferDepthSampleCounts(long address, long framebufferDepthSampleCounts);

    public VkSampleCountFlags getFramebufferStencilSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getFramebufferStencilSampleCounts(getVkAddress()));
    }

    
    public void setFramebufferStencilSampleCounts(VkSampleCountFlags framebufferStencilSampleCounts) {
        setFramebufferStencilSampleCounts(getVkAddress(), framebufferStencilSampleCounts != null ? framebufferStencilSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFramebufferStencilSampleCountsQ() {
        return getFramebufferStencilSampleCounts().getValue();
    }

    public void setFramebufferStencilSampleCounts(int framebufferStencilSampleCounts) {
        getFramebufferStencilSampleCounts().setValue(framebufferStencilSampleCounts);
    }

    protected static native long getFramebufferStencilSampleCounts(long address);
    protected static native void setFramebufferStencilSampleCounts(long address, long framebufferStencilSampleCounts);

    public VkSampleCountFlags getFramebufferNoAttachmentsSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getFramebufferNoAttachmentsSampleCounts(getVkAddress()));
    }

    
    public void setFramebufferNoAttachmentsSampleCounts(VkSampleCountFlags framebufferNoAttachmentsSampleCounts) {
        setFramebufferNoAttachmentsSampleCounts(getVkAddress(), framebufferNoAttachmentsSampleCounts != null ? framebufferNoAttachmentsSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFramebufferNoAttachmentsSampleCountsQ() {
        return getFramebufferNoAttachmentsSampleCounts().getValue();
    }

    public void setFramebufferNoAttachmentsSampleCounts(int framebufferNoAttachmentsSampleCounts) {
        getFramebufferNoAttachmentsSampleCounts().setValue(framebufferNoAttachmentsSampleCounts);
    }

    protected static native long getFramebufferNoAttachmentsSampleCounts(long address);
    protected static native void setFramebufferNoAttachmentsSampleCounts(long address, long framebufferNoAttachmentsSampleCounts);

    public VkUInt32 getMaxColorAttachments() {
        return new VkUInt32(getVkMemory(), getMaxColorAttachments(getVkAddress()));
    }

    
    public void setMaxColorAttachments(VkUInt32 maxColorAttachments) {
        setMaxColorAttachments(getVkAddress(), maxColorAttachments != null ? maxColorAttachments.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxColorAttachmentsQ() {
        return getMaxColorAttachments().getValue();
    }

    public void setMaxColorAttachments(int maxColorAttachments) {
        getMaxColorAttachments().setValue(maxColorAttachments);
    }

    protected static native long getMaxColorAttachments(long address);
    protected static native void setMaxColorAttachments(long address, long maxColorAttachments);

    public VkSampleCountFlags getSampledImageColorSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampledImageColorSampleCounts(getVkAddress()));
    }

    
    public void setSampledImageColorSampleCounts(VkSampleCountFlags sampledImageColorSampleCounts) {
        setSampledImageColorSampleCounts(getVkAddress(), sampledImageColorSampleCounts != null ? sampledImageColorSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampledImageColorSampleCountsQ() {
        return getSampledImageColorSampleCounts().getValue();
    }

    public void setSampledImageColorSampleCounts(int sampledImageColorSampleCounts) {
        getSampledImageColorSampleCounts().setValue(sampledImageColorSampleCounts);
    }

    protected static native long getSampledImageColorSampleCounts(long address);
    protected static native void setSampledImageColorSampleCounts(long address, long sampledImageColorSampleCounts);

    public VkSampleCountFlags getSampledImageIntegerSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampledImageIntegerSampleCounts(getVkAddress()));
    }

    
    public void setSampledImageIntegerSampleCounts(VkSampleCountFlags sampledImageIntegerSampleCounts) {
        setSampledImageIntegerSampleCounts(getVkAddress(), sampledImageIntegerSampleCounts != null ? sampledImageIntegerSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampledImageIntegerSampleCountsQ() {
        return getSampledImageIntegerSampleCounts().getValue();
    }

    public void setSampledImageIntegerSampleCounts(int sampledImageIntegerSampleCounts) {
        getSampledImageIntegerSampleCounts().setValue(sampledImageIntegerSampleCounts);
    }

    protected static native long getSampledImageIntegerSampleCounts(long address);
    protected static native void setSampledImageIntegerSampleCounts(long address, long sampledImageIntegerSampleCounts);

    public VkSampleCountFlags getSampledImageDepthSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampledImageDepthSampleCounts(getVkAddress()));
    }

    
    public void setSampledImageDepthSampleCounts(VkSampleCountFlags sampledImageDepthSampleCounts) {
        setSampledImageDepthSampleCounts(getVkAddress(), sampledImageDepthSampleCounts != null ? sampledImageDepthSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampledImageDepthSampleCountsQ() {
        return getSampledImageDepthSampleCounts().getValue();
    }

    public void setSampledImageDepthSampleCounts(int sampledImageDepthSampleCounts) {
        getSampledImageDepthSampleCounts().setValue(sampledImageDepthSampleCounts);
    }

    protected static native long getSampledImageDepthSampleCounts(long address);
    protected static native void setSampledImageDepthSampleCounts(long address, long sampledImageDepthSampleCounts);

    public VkSampleCountFlags getSampledImageStencilSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampledImageStencilSampleCounts(getVkAddress()));
    }

    
    public void setSampledImageStencilSampleCounts(VkSampleCountFlags sampledImageStencilSampleCounts) {
        setSampledImageStencilSampleCounts(getVkAddress(), sampledImageStencilSampleCounts != null ? sampledImageStencilSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampledImageStencilSampleCountsQ() {
        return getSampledImageStencilSampleCounts().getValue();
    }

    public void setSampledImageStencilSampleCounts(int sampledImageStencilSampleCounts) {
        getSampledImageStencilSampleCounts().setValue(sampledImageStencilSampleCounts);
    }

    protected static native long getSampledImageStencilSampleCounts(long address);
    protected static native void setSampledImageStencilSampleCounts(long address, long sampledImageStencilSampleCounts);

    public VkSampleCountFlags getStorageImageSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getStorageImageSampleCounts(getVkAddress()));
    }

    
    public void setStorageImageSampleCounts(VkSampleCountFlags storageImageSampleCounts) {
        setStorageImageSampleCounts(getVkAddress(), storageImageSampleCounts != null ? storageImageSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStorageImageSampleCountsQ() {
        return getStorageImageSampleCounts().getValue();
    }

    public void setStorageImageSampleCounts(int storageImageSampleCounts) {
        getStorageImageSampleCounts().setValue(storageImageSampleCounts);
    }

    protected static native long getStorageImageSampleCounts(long address);
    protected static native void setStorageImageSampleCounts(long address, long storageImageSampleCounts);

    public VkUInt32 getMaxSampleMaskWords() {
        return new VkUInt32(getVkMemory(), getMaxSampleMaskWords(getVkAddress()));
    }

    
    public void setMaxSampleMaskWords(VkUInt32 maxSampleMaskWords) {
        setMaxSampleMaskWords(getVkAddress(), maxSampleMaskWords != null ? maxSampleMaskWords.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxSampleMaskWordsQ() {
        return getMaxSampleMaskWords().getValue();
    }

    public void setMaxSampleMaskWords(int maxSampleMaskWords) {
        getMaxSampleMaskWords().setValue(maxSampleMaskWords);
    }

    protected static native long getMaxSampleMaskWords(long address);
    protected static native void setMaxSampleMaskWords(long address, long maxSampleMaskWords);

    public VkBool32 getTimestampComputeAndGraphics() {
        return new VkBool32(getVkMemory(), getTimestampComputeAndGraphics(getVkAddress()));
    }

    
    public void setTimestampComputeAndGraphics(VkBool32 timestampComputeAndGraphics) {
        setTimestampComputeAndGraphics(getVkAddress(), timestampComputeAndGraphics != null ? timestampComputeAndGraphics.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTimestampComputeAndGraphicsQ() {
        return getTimestampComputeAndGraphics().getValue();
    }

    public void setTimestampComputeAndGraphics(int timestampComputeAndGraphics) {
        getTimestampComputeAndGraphics().setValue(timestampComputeAndGraphics);
    }

    protected static native long getTimestampComputeAndGraphics(long address);
    protected static native void setTimestampComputeAndGraphics(long address, long timestampComputeAndGraphics);

    public VkFloat getTimestampPeriod() {
        return new VkFloat(getVkMemory(), getTimestampPeriod(getVkAddress()));
    }

    
    public void setTimestampPeriod(VkFloat timestampPeriod) {
        setTimestampPeriod(getVkAddress(), timestampPeriod != null ? timestampPeriod.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getTimestampPeriodQ() {
        return getTimestampPeriod().getValue();
    }

    public void setTimestampPeriod(float timestampPeriod) {
        getTimestampPeriod().setValue(timestampPeriod);
    }

    protected static native long getTimestampPeriod(long address);
    protected static native void setTimestampPeriod(long address, long timestampPeriod);

    public VkUInt32 getMaxClipDistances() {
        return new VkUInt32(getVkMemory(), getMaxClipDistances(getVkAddress()));
    }

    
    public void setMaxClipDistances(VkUInt32 maxClipDistances) {
        setMaxClipDistances(getVkAddress(), maxClipDistances != null ? maxClipDistances.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxClipDistancesQ() {
        return getMaxClipDistances().getValue();
    }

    public void setMaxClipDistances(int maxClipDistances) {
        getMaxClipDistances().setValue(maxClipDistances);
    }

    protected static native long getMaxClipDistances(long address);
    protected static native void setMaxClipDistances(long address, long maxClipDistances);

    public VkUInt32 getMaxCullDistances() {
        return new VkUInt32(getVkMemory(), getMaxCullDistances(getVkAddress()));
    }

    
    public void setMaxCullDistances(VkUInt32 maxCullDistances) {
        setMaxCullDistances(getVkAddress(), maxCullDistances != null ? maxCullDistances.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxCullDistancesQ() {
        return getMaxCullDistances().getValue();
    }

    public void setMaxCullDistances(int maxCullDistances) {
        getMaxCullDistances().setValue(maxCullDistances);
    }

    protected static native long getMaxCullDistances(long address);
    protected static native void setMaxCullDistances(long address, long maxCullDistances);

    public VkUInt32 getMaxCombinedClipAndCullDistances() {
        return new VkUInt32(getVkMemory(), getMaxCombinedClipAndCullDistances(getVkAddress()));
    }

    
    public void setMaxCombinedClipAndCullDistances(VkUInt32 maxCombinedClipAndCullDistances) {
        setMaxCombinedClipAndCullDistances(getVkAddress(), maxCombinedClipAndCullDistances != null ? maxCombinedClipAndCullDistances.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxCombinedClipAndCullDistancesQ() {
        return getMaxCombinedClipAndCullDistances().getValue();
    }

    public void setMaxCombinedClipAndCullDistances(int maxCombinedClipAndCullDistances) {
        getMaxCombinedClipAndCullDistances().setValue(maxCombinedClipAndCullDistances);
    }

    protected static native long getMaxCombinedClipAndCullDistances(long address);
    protected static native void setMaxCombinedClipAndCullDistances(long address, long maxCombinedClipAndCullDistances);

    public VkUInt32 getDiscreteQueuePriorities() {
        return new VkUInt32(getVkMemory(), getDiscreteQueuePriorities(getVkAddress()));
    }

    
    public void setDiscreteQueuePriorities(VkUInt32 discreteQueuePriorities) {
        setDiscreteQueuePriorities(getVkAddress(), discreteQueuePriorities != null ? discreteQueuePriorities.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDiscreteQueuePrioritiesQ() {
        return getDiscreteQueuePriorities().getValue();
    }

    public void setDiscreteQueuePriorities(int discreteQueuePriorities) {
        getDiscreteQueuePriorities().setValue(discreteQueuePriorities);
    }

    protected static native long getDiscreteQueuePriorities(long address);
    protected static native void setDiscreteQueuePriorities(long address, long discreteQueuePriorities);

    public VkFloat getPointSizeRange() {
        return new VkFloat(getVkMemory(), getPointSizeRange(getVkAddress()));
    }

    
    public void setPointSizeRange(VkFloat pointSizeRange) {
        setPointSizeRange(getVkAddress(), pointSizeRange != null ? pointSizeRange.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getPointSizeRange(long address);
    protected static native void setPointSizeRange(long address, long pointSizeRange);

    public VkFloat getLineWidthRange() {
        return new VkFloat(getVkMemory(), getLineWidthRange(getVkAddress()));
    }

    
    public void setLineWidthRange(VkFloat lineWidthRange) {
        setLineWidthRange(getVkAddress(), lineWidthRange != null ? lineWidthRange.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getLineWidthRange(long address);
    protected static native void setLineWidthRange(long address, long lineWidthRange);

    public VkFloat getPointSizeGranularity() {
        return new VkFloat(getVkMemory(), getPointSizeGranularity(getVkAddress()));
    }

    
    public void setPointSizeGranularity(VkFloat pointSizeGranularity) {
        setPointSizeGranularity(getVkAddress(), pointSizeGranularity != null ? pointSizeGranularity.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getPointSizeGranularityQ() {
        return getPointSizeGranularity().getValue();
    }

    public void setPointSizeGranularity(float pointSizeGranularity) {
        getPointSizeGranularity().setValue(pointSizeGranularity);
    }

    protected static native long getPointSizeGranularity(long address);
    protected static native void setPointSizeGranularity(long address, long pointSizeGranularity);

    public VkFloat getLineWidthGranularity() {
        return new VkFloat(getVkMemory(), getLineWidthGranularity(getVkAddress()));
    }

    
    public void setLineWidthGranularity(VkFloat lineWidthGranularity) {
        setLineWidthGranularity(getVkAddress(), lineWidthGranularity != null ? lineWidthGranularity.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getLineWidthGranularityQ() {
        return getLineWidthGranularity().getValue();
    }

    public void setLineWidthGranularity(float lineWidthGranularity) {
        getLineWidthGranularity().setValue(lineWidthGranularity);
    }

    protected static native long getLineWidthGranularity(long address);
    protected static native void setLineWidthGranularity(long address, long lineWidthGranularity);

    public VkBool32 getStrictLines() {
        return new VkBool32(getVkMemory(), getStrictLines(getVkAddress()));
    }

    
    public void setStrictLines(VkBool32 strictLines) {
        setStrictLines(getVkAddress(), strictLines != null ? strictLines.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStrictLinesQ() {
        return getStrictLines().getValue();
    }

    public void setStrictLines(int strictLines) {
        getStrictLines().setValue(strictLines);
    }

    protected static native long getStrictLines(long address);
    protected static native void setStrictLines(long address, long strictLines);

    public VkBool32 getStandardSampleLocations() {
        return new VkBool32(getVkMemory(), getStandardSampleLocations(getVkAddress()));
    }

    
    public void setStandardSampleLocations(VkBool32 standardSampleLocations) {
        setStandardSampleLocations(getVkAddress(), standardSampleLocations != null ? standardSampleLocations.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStandardSampleLocationsQ() {
        return getStandardSampleLocations().getValue();
    }

    public void setStandardSampleLocations(int standardSampleLocations) {
        getStandardSampleLocations().setValue(standardSampleLocations);
    }

    protected static native long getStandardSampleLocations(long address);
    protected static native void setStandardSampleLocations(long address, long standardSampleLocations);

    public VkDeviceSize getOptimalBufferCopyOffsetAlignment() {
        return new VkDeviceSize(getVkMemory(), getOptimalBufferCopyOffsetAlignment(getVkAddress()));
    }

    
    public void setOptimalBufferCopyOffsetAlignment(VkDeviceSize optimalBufferCopyOffsetAlignment) {
        setOptimalBufferCopyOffsetAlignment(getVkAddress(), optimalBufferCopyOffsetAlignment != null ? optimalBufferCopyOffsetAlignment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getOptimalBufferCopyOffsetAlignmentQ() {
        return getOptimalBufferCopyOffsetAlignment().getValue();
    }

    public void setOptimalBufferCopyOffsetAlignment(long optimalBufferCopyOffsetAlignment) {
        getOptimalBufferCopyOffsetAlignment().setValue(optimalBufferCopyOffsetAlignment);
    }

    protected static native long getOptimalBufferCopyOffsetAlignment(long address);
    protected static native void setOptimalBufferCopyOffsetAlignment(long address, long optimalBufferCopyOffsetAlignment);

    public VkDeviceSize getOptimalBufferCopyRowPitchAlignment() {
        return new VkDeviceSize(getVkMemory(), getOptimalBufferCopyRowPitchAlignment(getVkAddress()));
    }

    
    public void setOptimalBufferCopyRowPitchAlignment(VkDeviceSize optimalBufferCopyRowPitchAlignment) {
        setOptimalBufferCopyRowPitchAlignment(getVkAddress(), optimalBufferCopyRowPitchAlignment != null ? optimalBufferCopyRowPitchAlignment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getOptimalBufferCopyRowPitchAlignmentQ() {
        return getOptimalBufferCopyRowPitchAlignment().getValue();
    }

    public void setOptimalBufferCopyRowPitchAlignment(long optimalBufferCopyRowPitchAlignment) {
        getOptimalBufferCopyRowPitchAlignment().setValue(optimalBufferCopyRowPitchAlignment);
    }

    protected static native long getOptimalBufferCopyRowPitchAlignment(long address);
    protected static native void setOptimalBufferCopyRowPitchAlignment(long address, long optimalBufferCopyRowPitchAlignment);

    public VkDeviceSize getNonCoherentAtomSize() {
        return new VkDeviceSize(getVkMemory(), getNonCoherentAtomSize(getVkAddress()));
    }

    
    public void setNonCoherentAtomSize(VkDeviceSize nonCoherentAtomSize) {
        setNonCoherentAtomSize(getVkAddress(), nonCoherentAtomSize != null ? nonCoherentAtomSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getNonCoherentAtomSizeQ() {
        return getNonCoherentAtomSize().getValue();
    }

    public void setNonCoherentAtomSize(long nonCoherentAtomSize) {
        getNonCoherentAtomSize().setValue(nonCoherentAtomSize);
    }

    protected static native long getNonCoherentAtomSize(long address);
    protected static native void setNonCoherentAtomSize(long address, long nonCoherentAtomSize);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceLimits implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceLimits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceLimits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceLimits o){
            super(o.getVkMemory(), o.getVkAddress());
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
            return new VkPhysicalDeviceLimits(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceLimits.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceLimits.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceLimits.Pointer get(int i){
                return new VkPhysicalDeviceLimits.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
