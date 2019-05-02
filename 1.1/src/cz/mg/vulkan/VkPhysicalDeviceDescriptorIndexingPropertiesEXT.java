package cz.mg.vulkan;

public class VkPhysicalDeviceDescriptorIndexingPropertiesEXT extends VkObject {
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT() {
        super(sizeof());
    }

    protected VkPhysicalDeviceDescriptorIndexingPropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceDescriptorIndexingPropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSTypeNative(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSTypeNative(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSTypeNative(long address);
    protected static native void setSTypeNative(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNextNative(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNextNative(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNextNative(long address);
    protected static native void setPNextNative(long address, long pNext);

    public VkUInt32 getMaxUpdateAfterBindDescriptorsInAllPools() {
        return new VkUInt32(getVkMemory(), getMaxUpdateAfterBindDescriptorsInAllPoolsNative(getVkAddress()));
    }

    
    public void setMaxUpdateAfterBindDescriptorsInAllPools(VkUInt32 maxUpdateAfterBindDescriptorsInAllPools) {
        setMaxUpdateAfterBindDescriptorsInAllPoolsNative(getVkAddress(), maxUpdateAfterBindDescriptorsInAllPools != null ? maxUpdateAfterBindDescriptorsInAllPools.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxUpdateAfterBindDescriptorsInAllPoolsQ() {
        return getMaxUpdateAfterBindDescriptorsInAllPools().getValue();
    }

    public void setMaxUpdateAfterBindDescriptorsInAllPools(int maxUpdateAfterBindDescriptorsInAllPools) {
        getMaxUpdateAfterBindDescriptorsInAllPools().setValue(maxUpdateAfterBindDescriptorsInAllPools);
    }

    protected static native long getMaxUpdateAfterBindDescriptorsInAllPoolsNative(long address);
    protected static native void setMaxUpdateAfterBindDescriptorsInAllPoolsNative(long address, long maxUpdateAfterBindDescriptorsInAllPools);

    public VkBool32 getShaderUniformBufferArrayNonUniformIndexingNative() {
        return new VkBool32(getVkMemory(), getShaderUniformBufferArrayNonUniformIndexingNativeNative(getVkAddress()));
    }

    
    public void setShaderUniformBufferArrayNonUniformIndexingNative(VkBool32 shaderUniformBufferArrayNonUniformIndexingNative) {
        setShaderUniformBufferArrayNonUniformIndexingNativeNative(getVkAddress(), shaderUniformBufferArrayNonUniformIndexingNative != null ? shaderUniformBufferArrayNonUniformIndexingNative.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderUniformBufferArrayNonUniformIndexingNativeQ() {
        return getShaderUniformBufferArrayNonUniformIndexingNative().getValue();
    }

    public void setShaderUniformBufferArrayNonUniformIndexingNative(int shaderUniformBufferArrayNonUniformIndexingNative) {
        getShaderUniformBufferArrayNonUniformIndexingNative().setValue(shaderUniformBufferArrayNonUniformIndexingNative);
    }

    protected static native long getShaderUniformBufferArrayNonUniformIndexingNativeNative(long address);
    protected static native void setShaderUniformBufferArrayNonUniformIndexingNativeNative(long address, long shaderUniformBufferArrayNonUniformIndexingNative);

    public VkBool32 getShaderSampledImageArrayNonUniformIndexingNative() {
        return new VkBool32(getVkMemory(), getShaderSampledImageArrayNonUniformIndexingNativeNative(getVkAddress()));
    }

    
    public void setShaderSampledImageArrayNonUniformIndexingNative(VkBool32 shaderSampledImageArrayNonUniformIndexingNative) {
        setShaderSampledImageArrayNonUniformIndexingNativeNative(getVkAddress(), shaderSampledImageArrayNonUniformIndexingNative != null ? shaderSampledImageArrayNonUniformIndexingNative.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderSampledImageArrayNonUniformIndexingNativeQ() {
        return getShaderSampledImageArrayNonUniformIndexingNative().getValue();
    }

    public void setShaderSampledImageArrayNonUniformIndexingNative(int shaderSampledImageArrayNonUniformIndexingNative) {
        getShaderSampledImageArrayNonUniformIndexingNative().setValue(shaderSampledImageArrayNonUniformIndexingNative);
    }

    protected static native long getShaderSampledImageArrayNonUniformIndexingNativeNative(long address);
    protected static native void setShaderSampledImageArrayNonUniformIndexingNativeNative(long address, long shaderSampledImageArrayNonUniformIndexingNative);

    public VkBool32 getShaderStorageBufferArrayNonUniformIndexingNative() {
        return new VkBool32(getVkMemory(), getShaderStorageBufferArrayNonUniformIndexingNativeNative(getVkAddress()));
    }

    
    public void setShaderStorageBufferArrayNonUniformIndexingNative(VkBool32 shaderStorageBufferArrayNonUniformIndexingNative) {
        setShaderStorageBufferArrayNonUniformIndexingNativeNative(getVkAddress(), shaderStorageBufferArrayNonUniformIndexingNative != null ? shaderStorageBufferArrayNonUniformIndexingNative.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageBufferArrayNonUniformIndexingNativeQ() {
        return getShaderStorageBufferArrayNonUniformIndexingNative().getValue();
    }

    public void setShaderStorageBufferArrayNonUniformIndexingNative(int shaderStorageBufferArrayNonUniformIndexingNative) {
        getShaderStorageBufferArrayNonUniformIndexingNative().setValue(shaderStorageBufferArrayNonUniformIndexingNative);
    }

    protected static native long getShaderStorageBufferArrayNonUniformIndexingNativeNative(long address);
    protected static native void setShaderStorageBufferArrayNonUniformIndexingNativeNative(long address, long shaderStorageBufferArrayNonUniformIndexingNative);

    public VkBool32 getShaderStorageImageArrayNonUniformIndexingNative() {
        return new VkBool32(getVkMemory(), getShaderStorageImageArrayNonUniformIndexingNativeNative(getVkAddress()));
    }

    
    public void setShaderStorageImageArrayNonUniformIndexingNative(VkBool32 shaderStorageImageArrayNonUniformIndexingNative) {
        setShaderStorageImageArrayNonUniformIndexingNativeNative(getVkAddress(), shaderStorageImageArrayNonUniformIndexingNative != null ? shaderStorageImageArrayNonUniformIndexingNative.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageImageArrayNonUniformIndexingNativeQ() {
        return getShaderStorageImageArrayNonUniformIndexingNative().getValue();
    }

    public void setShaderStorageImageArrayNonUniformIndexingNative(int shaderStorageImageArrayNonUniformIndexingNative) {
        getShaderStorageImageArrayNonUniformIndexingNative().setValue(shaderStorageImageArrayNonUniformIndexingNative);
    }

    protected static native long getShaderStorageImageArrayNonUniformIndexingNativeNative(long address);
    protected static native void setShaderStorageImageArrayNonUniformIndexingNativeNative(long address, long shaderStorageImageArrayNonUniformIndexingNative);

    public VkBool32 getShaderInputAttachmentArrayNonUniformIndexingNative() {
        return new VkBool32(getVkMemory(), getShaderInputAttachmentArrayNonUniformIndexingNativeNative(getVkAddress()));
    }

    
    public void setShaderInputAttachmentArrayNonUniformIndexingNative(VkBool32 shaderInputAttachmentArrayNonUniformIndexingNative) {
        setShaderInputAttachmentArrayNonUniformIndexingNativeNative(getVkAddress(), shaderInputAttachmentArrayNonUniformIndexingNative != null ? shaderInputAttachmentArrayNonUniformIndexingNative.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderInputAttachmentArrayNonUniformIndexingNativeQ() {
        return getShaderInputAttachmentArrayNonUniformIndexingNative().getValue();
    }

    public void setShaderInputAttachmentArrayNonUniformIndexingNative(int shaderInputAttachmentArrayNonUniformIndexingNative) {
        getShaderInputAttachmentArrayNonUniformIndexingNative().setValue(shaderInputAttachmentArrayNonUniformIndexingNative);
    }

    protected static native long getShaderInputAttachmentArrayNonUniformIndexingNativeNative(long address);
    protected static native void setShaderInputAttachmentArrayNonUniformIndexingNativeNative(long address, long shaderInputAttachmentArrayNonUniformIndexingNative);

    public VkBool32 getRobustBufferAccessUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getRobustBufferAccessUpdateAfterBindNative(getVkAddress()));
    }

    
    public void setRobustBufferAccessUpdateAfterBind(VkBool32 robustBufferAccessUpdateAfterBind) {
        setRobustBufferAccessUpdateAfterBindNative(getVkAddress(), robustBufferAccessUpdateAfterBind != null ? robustBufferAccessUpdateAfterBind.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getRobustBufferAccessUpdateAfterBindQ() {
        return getRobustBufferAccessUpdateAfterBind().getValue();
    }

    public void setRobustBufferAccessUpdateAfterBind(int robustBufferAccessUpdateAfterBind) {
        getRobustBufferAccessUpdateAfterBind().setValue(robustBufferAccessUpdateAfterBind);
    }

    protected static native long getRobustBufferAccessUpdateAfterBindNative(long address);
    protected static native void setRobustBufferAccessUpdateAfterBindNative(long address, long robustBufferAccessUpdateAfterBind);

    public VkBool32 getQuadDivergentImplicitLod() {
        return new VkBool32(getVkMemory(), getQuadDivergentImplicitLodNative(getVkAddress()));
    }

    
    public void setQuadDivergentImplicitLod(VkBool32 quadDivergentImplicitLod) {
        setQuadDivergentImplicitLodNative(getVkAddress(), quadDivergentImplicitLod != null ? quadDivergentImplicitLod.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQuadDivergentImplicitLodQ() {
        return getQuadDivergentImplicitLod().getValue();
    }

    public void setQuadDivergentImplicitLod(int quadDivergentImplicitLod) {
        getQuadDivergentImplicitLod().setValue(quadDivergentImplicitLod);
    }

    protected static native long getQuadDivergentImplicitLodNative(long address);
    protected static native void setQuadDivergentImplicitLodNative(long address, long quadDivergentImplicitLod);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindSamplers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindSamplersNative(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindSamplers(VkUInt32 maxPerStageDescriptorUpdateAfterBindSamplers) {
        setMaxPerStageDescriptorUpdateAfterBindSamplersNative(getVkAddress(), maxPerStageDescriptorUpdateAfterBindSamplers != null ? maxPerStageDescriptorUpdateAfterBindSamplers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorUpdateAfterBindSamplersQ() {
        return getMaxPerStageDescriptorUpdateAfterBindSamplers().getValue();
    }

    public void setMaxPerStageDescriptorUpdateAfterBindSamplers(int maxPerStageDescriptorUpdateAfterBindSamplers) {
        getMaxPerStageDescriptorUpdateAfterBindSamplers().setValue(maxPerStageDescriptorUpdateAfterBindSamplers);
    }

    protected static native long getMaxPerStageDescriptorUpdateAfterBindSamplersNative(long address);
    protected static native void setMaxPerStageDescriptorUpdateAfterBindSamplersNative(long address, long maxPerStageDescriptorUpdateAfterBindSamplers);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindUniformBuffers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindUniformBuffersNative(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindUniformBuffers(VkUInt32 maxPerStageDescriptorUpdateAfterBindUniformBuffers) {
        setMaxPerStageDescriptorUpdateAfterBindUniformBuffersNative(getVkAddress(), maxPerStageDescriptorUpdateAfterBindUniformBuffers != null ? maxPerStageDescriptorUpdateAfterBindUniformBuffers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorUpdateAfterBindUniformBuffersQ() {
        return getMaxPerStageDescriptorUpdateAfterBindUniformBuffers().getValue();
    }

    public void setMaxPerStageDescriptorUpdateAfterBindUniformBuffers(int maxPerStageDescriptorUpdateAfterBindUniformBuffers) {
        getMaxPerStageDescriptorUpdateAfterBindUniformBuffers().setValue(maxPerStageDescriptorUpdateAfterBindUniformBuffers);
    }

    protected static native long getMaxPerStageDescriptorUpdateAfterBindUniformBuffersNative(long address);
    protected static native void setMaxPerStageDescriptorUpdateAfterBindUniformBuffersNative(long address, long maxPerStageDescriptorUpdateAfterBindUniformBuffers);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindStorageBuffers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindStorageBuffersNative(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindStorageBuffers(VkUInt32 maxPerStageDescriptorUpdateAfterBindStorageBuffers) {
        setMaxPerStageDescriptorUpdateAfterBindStorageBuffersNative(getVkAddress(), maxPerStageDescriptorUpdateAfterBindStorageBuffers != null ? maxPerStageDescriptorUpdateAfterBindStorageBuffers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorUpdateAfterBindStorageBuffersQ() {
        return getMaxPerStageDescriptorUpdateAfterBindStorageBuffers().getValue();
    }

    public void setMaxPerStageDescriptorUpdateAfterBindStorageBuffers(int maxPerStageDescriptorUpdateAfterBindStorageBuffers) {
        getMaxPerStageDescriptorUpdateAfterBindStorageBuffers().setValue(maxPerStageDescriptorUpdateAfterBindStorageBuffers);
    }

    protected static native long getMaxPerStageDescriptorUpdateAfterBindStorageBuffersNative(long address);
    protected static native void setMaxPerStageDescriptorUpdateAfterBindStorageBuffersNative(long address, long maxPerStageDescriptorUpdateAfterBindStorageBuffers);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindSampledImages() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindSampledImagesNative(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindSampledImages(VkUInt32 maxPerStageDescriptorUpdateAfterBindSampledImages) {
        setMaxPerStageDescriptorUpdateAfterBindSampledImagesNative(getVkAddress(), maxPerStageDescriptorUpdateAfterBindSampledImages != null ? maxPerStageDescriptorUpdateAfterBindSampledImages.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorUpdateAfterBindSampledImagesQ() {
        return getMaxPerStageDescriptorUpdateAfterBindSampledImages().getValue();
    }

    public void setMaxPerStageDescriptorUpdateAfterBindSampledImages(int maxPerStageDescriptorUpdateAfterBindSampledImages) {
        getMaxPerStageDescriptorUpdateAfterBindSampledImages().setValue(maxPerStageDescriptorUpdateAfterBindSampledImages);
    }

    protected static native long getMaxPerStageDescriptorUpdateAfterBindSampledImagesNative(long address);
    protected static native void setMaxPerStageDescriptorUpdateAfterBindSampledImagesNative(long address, long maxPerStageDescriptorUpdateAfterBindSampledImages);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindStorageImages() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindStorageImagesNative(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindStorageImages(VkUInt32 maxPerStageDescriptorUpdateAfterBindStorageImages) {
        setMaxPerStageDescriptorUpdateAfterBindStorageImagesNative(getVkAddress(), maxPerStageDescriptorUpdateAfterBindStorageImages != null ? maxPerStageDescriptorUpdateAfterBindStorageImages.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorUpdateAfterBindStorageImagesQ() {
        return getMaxPerStageDescriptorUpdateAfterBindStorageImages().getValue();
    }

    public void setMaxPerStageDescriptorUpdateAfterBindStorageImages(int maxPerStageDescriptorUpdateAfterBindStorageImages) {
        getMaxPerStageDescriptorUpdateAfterBindStorageImages().setValue(maxPerStageDescriptorUpdateAfterBindStorageImages);
    }

    protected static native long getMaxPerStageDescriptorUpdateAfterBindStorageImagesNative(long address);
    protected static native void setMaxPerStageDescriptorUpdateAfterBindStorageImagesNative(long address, long maxPerStageDescriptorUpdateAfterBindStorageImages);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindInputAttachments() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindInputAttachmentsNative(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindInputAttachments(VkUInt32 maxPerStageDescriptorUpdateAfterBindInputAttachments) {
        setMaxPerStageDescriptorUpdateAfterBindInputAttachmentsNative(getVkAddress(), maxPerStageDescriptorUpdateAfterBindInputAttachments != null ? maxPerStageDescriptorUpdateAfterBindInputAttachments.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageDescriptorUpdateAfterBindInputAttachmentsQ() {
        return getMaxPerStageDescriptorUpdateAfterBindInputAttachments().getValue();
    }

    public void setMaxPerStageDescriptorUpdateAfterBindInputAttachments(int maxPerStageDescriptorUpdateAfterBindInputAttachments) {
        getMaxPerStageDescriptorUpdateAfterBindInputAttachments().setValue(maxPerStageDescriptorUpdateAfterBindInputAttachments);
    }

    protected static native long getMaxPerStageDescriptorUpdateAfterBindInputAttachmentsNative(long address);
    protected static native void setMaxPerStageDescriptorUpdateAfterBindInputAttachmentsNative(long address, long maxPerStageDescriptorUpdateAfterBindInputAttachments);

    public VkUInt32 getMaxPerStageUpdateAfterBindResources() {
        return new VkUInt32(getVkMemory(), getMaxPerStageUpdateAfterBindResourcesNative(getVkAddress()));
    }

    
    public void setMaxPerStageUpdateAfterBindResources(VkUInt32 maxPerStageUpdateAfterBindResources) {
        setMaxPerStageUpdateAfterBindResourcesNative(getVkAddress(), maxPerStageUpdateAfterBindResources != null ? maxPerStageUpdateAfterBindResources.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerStageUpdateAfterBindResourcesQ() {
        return getMaxPerStageUpdateAfterBindResources().getValue();
    }

    public void setMaxPerStageUpdateAfterBindResources(int maxPerStageUpdateAfterBindResources) {
        getMaxPerStageUpdateAfterBindResources().setValue(maxPerStageUpdateAfterBindResources);
    }

    protected static native long getMaxPerStageUpdateAfterBindResourcesNative(long address);
    protected static native void setMaxPerStageUpdateAfterBindResourcesNative(long address, long maxPerStageUpdateAfterBindResources);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindSamplers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindSamplersNative(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindSamplers(VkUInt32 maxDescriptorSetUpdateAfterBindSamplers) {
        setMaxDescriptorSetUpdateAfterBindSamplersNative(getVkAddress(), maxDescriptorSetUpdateAfterBindSamplers != null ? maxDescriptorSetUpdateAfterBindSamplers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetUpdateAfterBindSamplersQ() {
        return getMaxDescriptorSetUpdateAfterBindSamplers().getValue();
    }

    public void setMaxDescriptorSetUpdateAfterBindSamplers(int maxDescriptorSetUpdateAfterBindSamplers) {
        getMaxDescriptorSetUpdateAfterBindSamplers().setValue(maxDescriptorSetUpdateAfterBindSamplers);
    }

    protected static native long getMaxDescriptorSetUpdateAfterBindSamplersNative(long address);
    protected static native void setMaxDescriptorSetUpdateAfterBindSamplersNative(long address, long maxDescriptorSetUpdateAfterBindSamplers);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindUniformBuffers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindUniformBuffersNative(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindUniformBuffers(VkUInt32 maxDescriptorSetUpdateAfterBindUniformBuffers) {
        setMaxDescriptorSetUpdateAfterBindUniformBuffersNative(getVkAddress(), maxDescriptorSetUpdateAfterBindUniformBuffers != null ? maxDescriptorSetUpdateAfterBindUniformBuffers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetUpdateAfterBindUniformBuffersQ() {
        return getMaxDescriptorSetUpdateAfterBindUniformBuffers().getValue();
    }

    public void setMaxDescriptorSetUpdateAfterBindUniformBuffers(int maxDescriptorSetUpdateAfterBindUniformBuffers) {
        getMaxDescriptorSetUpdateAfterBindUniformBuffers().setValue(maxDescriptorSetUpdateAfterBindUniformBuffers);
    }

    protected static native long getMaxDescriptorSetUpdateAfterBindUniformBuffersNative(long address);
    protected static native void setMaxDescriptorSetUpdateAfterBindUniformBuffersNative(long address, long maxDescriptorSetUpdateAfterBindUniformBuffers);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamicNative(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(VkUInt32 maxDescriptorSetUpdateAfterBindUniformBuffersDynamic) {
        setMaxDescriptorSetUpdateAfterBindUniformBuffersDynamicNative(getVkAddress(), maxDescriptorSetUpdateAfterBindUniformBuffersDynamic != null ? maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamicQ() {
        return getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic().getValue();
    }

    public void setMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic) {
        getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic().setValue(maxDescriptorSetUpdateAfterBindUniformBuffersDynamic);
    }

    protected static native long getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamicNative(long address);
    protected static native void setMaxDescriptorSetUpdateAfterBindUniformBuffersDynamicNative(long address, long maxDescriptorSetUpdateAfterBindUniformBuffersDynamic);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindStorageBuffers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindStorageBuffersNative(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindStorageBuffers(VkUInt32 maxDescriptorSetUpdateAfterBindStorageBuffers) {
        setMaxDescriptorSetUpdateAfterBindStorageBuffersNative(getVkAddress(), maxDescriptorSetUpdateAfterBindStorageBuffers != null ? maxDescriptorSetUpdateAfterBindStorageBuffers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetUpdateAfterBindStorageBuffersQ() {
        return getMaxDescriptorSetUpdateAfterBindStorageBuffers().getValue();
    }

    public void setMaxDescriptorSetUpdateAfterBindStorageBuffers(int maxDescriptorSetUpdateAfterBindStorageBuffers) {
        getMaxDescriptorSetUpdateAfterBindStorageBuffers().setValue(maxDescriptorSetUpdateAfterBindStorageBuffers);
    }

    protected static native long getMaxDescriptorSetUpdateAfterBindStorageBuffersNative(long address);
    protected static native void setMaxDescriptorSetUpdateAfterBindStorageBuffersNative(long address, long maxDescriptorSetUpdateAfterBindStorageBuffers);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamicNative(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(VkUInt32 maxDescriptorSetUpdateAfterBindStorageBuffersDynamic) {
        setMaxDescriptorSetUpdateAfterBindStorageBuffersDynamicNative(getVkAddress(), maxDescriptorSetUpdateAfterBindStorageBuffersDynamic != null ? maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamicQ() {
        return getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic().getValue();
    }

    public void setMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic) {
        getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic().setValue(maxDescriptorSetUpdateAfterBindStorageBuffersDynamic);
    }

    protected static native long getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamicNative(long address);
    protected static native void setMaxDescriptorSetUpdateAfterBindStorageBuffersDynamicNative(long address, long maxDescriptorSetUpdateAfterBindStorageBuffersDynamic);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindSampledImages() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindSampledImagesNative(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindSampledImages(VkUInt32 maxDescriptorSetUpdateAfterBindSampledImages) {
        setMaxDescriptorSetUpdateAfterBindSampledImagesNative(getVkAddress(), maxDescriptorSetUpdateAfterBindSampledImages != null ? maxDescriptorSetUpdateAfterBindSampledImages.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetUpdateAfterBindSampledImagesQ() {
        return getMaxDescriptorSetUpdateAfterBindSampledImages().getValue();
    }

    public void setMaxDescriptorSetUpdateAfterBindSampledImages(int maxDescriptorSetUpdateAfterBindSampledImages) {
        getMaxDescriptorSetUpdateAfterBindSampledImages().setValue(maxDescriptorSetUpdateAfterBindSampledImages);
    }

    protected static native long getMaxDescriptorSetUpdateAfterBindSampledImagesNative(long address);
    protected static native void setMaxDescriptorSetUpdateAfterBindSampledImagesNative(long address, long maxDescriptorSetUpdateAfterBindSampledImages);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindStorageImages() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindStorageImagesNative(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindStorageImages(VkUInt32 maxDescriptorSetUpdateAfterBindStorageImages) {
        setMaxDescriptorSetUpdateAfterBindStorageImagesNative(getVkAddress(), maxDescriptorSetUpdateAfterBindStorageImages != null ? maxDescriptorSetUpdateAfterBindStorageImages.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetUpdateAfterBindStorageImagesQ() {
        return getMaxDescriptorSetUpdateAfterBindStorageImages().getValue();
    }

    public void setMaxDescriptorSetUpdateAfterBindStorageImages(int maxDescriptorSetUpdateAfterBindStorageImages) {
        getMaxDescriptorSetUpdateAfterBindStorageImages().setValue(maxDescriptorSetUpdateAfterBindStorageImages);
    }

    protected static native long getMaxDescriptorSetUpdateAfterBindStorageImagesNative(long address);
    protected static native void setMaxDescriptorSetUpdateAfterBindStorageImagesNative(long address, long maxDescriptorSetUpdateAfterBindStorageImages);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindInputAttachments() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindInputAttachmentsNative(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindInputAttachments(VkUInt32 maxDescriptorSetUpdateAfterBindInputAttachments) {
        setMaxDescriptorSetUpdateAfterBindInputAttachmentsNative(getVkAddress(), maxDescriptorSetUpdateAfterBindInputAttachments != null ? maxDescriptorSetUpdateAfterBindInputAttachments.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDescriptorSetUpdateAfterBindInputAttachmentsQ() {
        return getMaxDescriptorSetUpdateAfterBindInputAttachments().getValue();
    }

    public void setMaxDescriptorSetUpdateAfterBindInputAttachments(int maxDescriptorSetUpdateAfterBindInputAttachments) {
        getMaxDescriptorSetUpdateAfterBindInputAttachments().setValue(maxDescriptorSetUpdateAfterBindInputAttachments);
    }

    protected static native long getMaxDescriptorSetUpdateAfterBindInputAttachmentsNative(long address);
    protected static native void setMaxDescriptorSetUpdateAfterBindInputAttachmentsNative(long address, long maxDescriptorSetUpdateAfterBindInputAttachments);


    public void set(VkPhysicalDeviceDescriptorIndexingPropertiesEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPhysicalDeviceDescriptorIndexingPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceDescriptorIndexingPropertiesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceDescriptorIndexingPropertiesEXT.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceDescriptorIndexingPropertiesEXT o, int count){
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
        public VkPhysicalDeviceDescriptorIndexingPropertiesEXT get(int i){
            return new VkPhysicalDeviceDescriptorIndexingPropertiesEXT(getVkMemory(), address(i));
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
