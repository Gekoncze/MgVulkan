package cz.mg.vulkan;

public class VkPhysicalDeviceDescriptorIndexingPropertiesEXT extends VkObject {
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT() {
        super(sizeof());
    }

    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkUInt32 getMaxUpdateAfterBindDescriptorsInAllPools() {
        return new VkUInt32(getVkMemory(), getMaxUpdateAfterBindDescriptorsInAllPools(getVkAddress()));
    }

    
    public void setMaxUpdateAfterBindDescriptorsInAllPools(VkUInt32 maxUpdateAfterBindDescriptorsInAllPools) {
        setMaxUpdateAfterBindDescriptorsInAllPools(getVkAddress(), maxUpdateAfterBindDescriptorsInAllPools != null ? maxUpdateAfterBindDescriptorsInAllPools.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxUpdateAfterBindDescriptorsInAllPoolsQ() {
        return getMaxUpdateAfterBindDescriptorsInAllPools().getValue();
    }

    public void setMaxUpdateAfterBindDescriptorsInAllPools(int maxUpdateAfterBindDescriptorsInAllPools) {
        getMaxUpdateAfterBindDescriptorsInAllPools().setValue(maxUpdateAfterBindDescriptorsInAllPools);
    }

    private static native long getMaxUpdateAfterBindDescriptorsInAllPools(long address);
    private static native void setMaxUpdateAfterBindDescriptorsInAllPools(long address, long maxUpdateAfterBindDescriptorsInAllPools);

    public VkBool32 getShaderUniformBufferArrayNonUniformIndexingNative() {
        return new VkBool32(getVkMemory(), getShaderUniformBufferArrayNonUniformIndexingNative(getVkAddress()));
    }

    
    public void setShaderUniformBufferArrayNonUniformIndexingNative(VkBool32 shaderUniformBufferArrayNonUniformIndexingNative) {
        setShaderUniformBufferArrayNonUniformIndexingNative(getVkAddress(), shaderUniformBufferArrayNonUniformIndexingNative != null ? shaderUniformBufferArrayNonUniformIndexingNative.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getShaderUniformBufferArrayNonUniformIndexingNativeQ() {
        return getShaderUniformBufferArrayNonUniformIndexingNative().getValue();
    }

    public void setShaderUniformBufferArrayNonUniformIndexingNative(int shaderUniformBufferArrayNonUniformIndexingNative) {
        getShaderUniformBufferArrayNonUniformIndexingNative().setValue(shaderUniformBufferArrayNonUniformIndexingNative);
    }

    private static native long getShaderUniformBufferArrayNonUniformIndexingNative(long address);
    private static native void setShaderUniformBufferArrayNonUniformIndexingNative(long address, long shaderUniformBufferArrayNonUniformIndexingNative);

    public VkBool32 getShaderSampledImageArrayNonUniformIndexingNative() {
        return new VkBool32(getVkMemory(), getShaderSampledImageArrayNonUniformIndexingNative(getVkAddress()));
    }

    
    public void setShaderSampledImageArrayNonUniformIndexingNative(VkBool32 shaderSampledImageArrayNonUniformIndexingNative) {
        setShaderSampledImageArrayNonUniformIndexingNative(getVkAddress(), shaderSampledImageArrayNonUniformIndexingNative != null ? shaderSampledImageArrayNonUniformIndexingNative.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getShaderSampledImageArrayNonUniformIndexingNativeQ() {
        return getShaderSampledImageArrayNonUniformIndexingNative().getValue();
    }

    public void setShaderSampledImageArrayNonUniformIndexingNative(int shaderSampledImageArrayNonUniformIndexingNative) {
        getShaderSampledImageArrayNonUniformIndexingNative().setValue(shaderSampledImageArrayNonUniformIndexingNative);
    }

    private static native long getShaderSampledImageArrayNonUniformIndexingNative(long address);
    private static native void setShaderSampledImageArrayNonUniformIndexingNative(long address, long shaderSampledImageArrayNonUniformIndexingNative);

    public VkBool32 getShaderStorageBufferArrayNonUniformIndexingNative() {
        return new VkBool32(getVkMemory(), getShaderStorageBufferArrayNonUniformIndexingNative(getVkAddress()));
    }

    
    public void setShaderStorageBufferArrayNonUniformIndexingNative(VkBool32 shaderStorageBufferArrayNonUniformIndexingNative) {
        setShaderStorageBufferArrayNonUniformIndexingNative(getVkAddress(), shaderStorageBufferArrayNonUniformIndexingNative != null ? shaderStorageBufferArrayNonUniformIndexingNative.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getShaderStorageBufferArrayNonUniformIndexingNativeQ() {
        return getShaderStorageBufferArrayNonUniformIndexingNative().getValue();
    }

    public void setShaderStorageBufferArrayNonUniformIndexingNative(int shaderStorageBufferArrayNonUniformIndexingNative) {
        getShaderStorageBufferArrayNonUniformIndexingNative().setValue(shaderStorageBufferArrayNonUniformIndexingNative);
    }

    private static native long getShaderStorageBufferArrayNonUniformIndexingNative(long address);
    private static native void setShaderStorageBufferArrayNonUniformIndexingNative(long address, long shaderStorageBufferArrayNonUniformIndexingNative);

    public VkBool32 getShaderStorageImageArrayNonUniformIndexingNative() {
        return new VkBool32(getVkMemory(), getShaderStorageImageArrayNonUniformIndexingNative(getVkAddress()));
    }

    
    public void setShaderStorageImageArrayNonUniformIndexingNative(VkBool32 shaderStorageImageArrayNonUniformIndexingNative) {
        setShaderStorageImageArrayNonUniformIndexingNative(getVkAddress(), shaderStorageImageArrayNonUniformIndexingNative != null ? shaderStorageImageArrayNonUniformIndexingNative.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getShaderStorageImageArrayNonUniformIndexingNativeQ() {
        return getShaderStorageImageArrayNonUniformIndexingNative().getValue();
    }

    public void setShaderStorageImageArrayNonUniformIndexingNative(int shaderStorageImageArrayNonUniformIndexingNative) {
        getShaderStorageImageArrayNonUniformIndexingNative().setValue(shaderStorageImageArrayNonUniformIndexingNative);
    }

    private static native long getShaderStorageImageArrayNonUniformIndexingNative(long address);
    private static native void setShaderStorageImageArrayNonUniformIndexingNative(long address, long shaderStorageImageArrayNonUniformIndexingNative);

    public VkBool32 getShaderInputAttachmentArrayNonUniformIndexingNative() {
        return new VkBool32(getVkMemory(), getShaderInputAttachmentArrayNonUniformIndexingNative(getVkAddress()));
    }

    
    public void setShaderInputAttachmentArrayNonUniformIndexingNative(VkBool32 shaderInputAttachmentArrayNonUniformIndexingNative) {
        setShaderInputAttachmentArrayNonUniformIndexingNative(getVkAddress(), shaderInputAttachmentArrayNonUniformIndexingNative != null ? shaderInputAttachmentArrayNonUniformIndexingNative.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getShaderInputAttachmentArrayNonUniformIndexingNativeQ() {
        return getShaderInputAttachmentArrayNonUniformIndexingNative().getValue();
    }

    public void setShaderInputAttachmentArrayNonUniformIndexingNative(int shaderInputAttachmentArrayNonUniformIndexingNative) {
        getShaderInputAttachmentArrayNonUniformIndexingNative().setValue(shaderInputAttachmentArrayNonUniformIndexingNative);
    }

    private static native long getShaderInputAttachmentArrayNonUniformIndexingNative(long address);
    private static native void setShaderInputAttachmentArrayNonUniformIndexingNative(long address, long shaderInputAttachmentArrayNonUniformIndexingNative);

    public VkBool32 getRobustBufferAccessUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getRobustBufferAccessUpdateAfterBind(getVkAddress()));
    }

    
    public void setRobustBufferAccessUpdateAfterBind(VkBool32 robustBufferAccessUpdateAfterBind) {
        setRobustBufferAccessUpdateAfterBind(getVkAddress(), robustBufferAccessUpdateAfterBind != null ? robustBufferAccessUpdateAfterBind.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getRobustBufferAccessUpdateAfterBindQ() {
        return getRobustBufferAccessUpdateAfterBind().getValue();
    }

    public void setRobustBufferAccessUpdateAfterBind(int robustBufferAccessUpdateAfterBind) {
        getRobustBufferAccessUpdateAfterBind().setValue(robustBufferAccessUpdateAfterBind);
    }

    private static native long getRobustBufferAccessUpdateAfterBind(long address);
    private static native void setRobustBufferAccessUpdateAfterBind(long address, long robustBufferAccessUpdateAfterBind);

    public VkBool32 getQuadDivergentImplicitLod() {
        return new VkBool32(getVkMemory(), getQuadDivergentImplicitLod(getVkAddress()));
    }

    
    public void setQuadDivergentImplicitLod(VkBool32 quadDivergentImplicitLod) {
        setQuadDivergentImplicitLod(getVkAddress(), quadDivergentImplicitLod != null ? quadDivergentImplicitLod.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getQuadDivergentImplicitLodQ() {
        return getQuadDivergentImplicitLod().getValue();
    }

    public void setQuadDivergentImplicitLod(int quadDivergentImplicitLod) {
        getQuadDivergentImplicitLod().setValue(quadDivergentImplicitLod);
    }

    private static native long getQuadDivergentImplicitLod(long address);
    private static native void setQuadDivergentImplicitLod(long address, long quadDivergentImplicitLod);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindSamplers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindSamplers(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindSamplers(VkUInt32 maxPerStageDescriptorUpdateAfterBindSamplers) {
        setMaxPerStageDescriptorUpdateAfterBindSamplers(getVkAddress(), maxPerStageDescriptorUpdateAfterBindSamplers != null ? maxPerStageDescriptorUpdateAfterBindSamplers.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxPerStageDescriptorUpdateAfterBindSamplersQ() {
        return getMaxPerStageDescriptorUpdateAfterBindSamplers().getValue();
    }

    public void setMaxPerStageDescriptorUpdateAfterBindSamplers(int maxPerStageDescriptorUpdateAfterBindSamplers) {
        getMaxPerStageDescriptorUpdateAfterBindSamplers().setValue(maxPerStageDescriptorUpdateAfterBindSamplers);
    }

    private static native long getMaxPerStageDescriptorUpdateAfterBindSamplers(long address);
    private static native void setMaxPerStageDescriptorUpdateAfterBindSamplers(long address, long maxPerStageDescriptorUpdateAfterBindSamplers);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindUniformBuffers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindUniformBuffers(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindUniformBuffers(VkUInt32 maxPerStageDescriptorUpdateAfterBindUniformBuffers) {
        setMaxPerStageDescriptorUpdateAfterBindUniformBuffers(getVkAddress(), maxPerStageDescriptorUpdateAfterBindUniformBuffers != null ? maxPerStageDescriptorUpdateAfterBindUniformBuffers.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxPerStageDescriptorUpdateAfterBindUniformBuffersQ() {
        return getMaxPerStageDescriptorUpdateAfterBindUniformBuffers().getValue();
    }

    public void setMaxPerStageDescriptorUpdateAfterBindUniformBuffers(int maxPerStageDescriptorUpdateAfterBindUniformBuffers) {
        getMaxPerStageDescriptorUpdateAfterBindUniformBuffers().setValue(maxPerStageDescriptorUpdateAfterBindUniformBuffers);
    }

    private static native long getMaxPerStageDescriptorUpdateAfterBindUniformBuffers(long address);
    private static native void setMaxPerStageDescriptorUpdateAfterBindUniformBuffers(long address, long maxPerStageDescriptorUpdateAfterBindUniformBuffers);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindStorageBuffers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindStorageBuffers(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindStorageBuffers(VkUInt32 maxPerStageDescriptorUpdateAfterBindStorageBuffers) {
        setMaxPerStageDescriptorUpdateAfterBindStorageBuffers(getVkAddress(), maxPerStageDescriptorUpdateAfterBindStorageBuffers != null ? maxPerStageDescriptorUpdateAfterBindStorageBuffers.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxPerStageDescriptorUpdateAfterBindStorageBuffersQ() {
        return getMaxPerStageDescriptorUpdateAfterBindStorageBuffers().getValue();
    }

    public void setMaxPerStageDescriptorUpdateAfterBindStorageBuffers(int maxPerStageDescriptorUpdateAfterBindStorageBuffers) {
        getMaxPerStageDescriptorUpdateAfterBindStorageBuffers().setValue(maxPerStageDescriptorUpdateAfterBindStorageBuffers);
    }

    private static native long getMaxPerStageDescriptorUpdateAfterBindStorageBuffers(long address);
    private static native void setMaxPerStageDescriptorUpdateAfterBindStorageBuffers(long address, long maxPerStageDescriptorUpdateAfterBindStorageBuffers);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindSampledImages() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindSampledImages(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindSampledImages(VkUInt32 maxPerStageDescriptorUpdateAfterBindSampledImages) {
        setMaxPerStageDescriptorUpdateAfterBindSampledImages(getVkAddress(), maxPerStageDescriptorUpdateAfterBindSampledImages != null ? maxPerStageDescriptorUpdateAfterBindSampledImages.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxPerStageDescriptorUpdateAfterBindSampledImagesQ() {
        return getMaxPerStageDescriptorUpdateAfterBindSampledImages().getValue();
    }

    public void setMaxPerStageDescriptorUpdateAfterBindSampledImages(int maxPerStageDescriptorUpdateAfterBindSampledImages) {
        getMaxPerStageDescriptorUpdateAfterBindSampledImages().setValue(maxPerStageDescriptorUpdateAfterBindSampledImages);
    }

    private static native long getMaxPerStageDescriptorUpdateAfterBindSampledImages(long address);
    private static native void setMaxPerStageDescriptorUpdateAfterBindSampledImages(long address, long maxPerStageDescriptorUpdateAfterBindSampledImages);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindStorageImages() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindStorageImages(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindStorageImages(VkUInt32 maxPerStageDescriptorUpdateAfterBindStorageImages) {
        setMaxPerStageDescriptorUpdateAfterBindStorageImages(getVkAddress(), maxPerStageDescriptorUpdateAfterBindStorageImages != null ? maxPerStageDescriptorUpdateAfterBindStorageImages.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxPerStageDescriptorUpdateAfterBindStorageImagesQ() {
        return getMaxPerStageDescriptorUpdateAfterBindStorageImages().getValue();
    }

    public void setMaxPerStageDescriptorUpdateAfterBindStorageImages(int maxPerStageDescriptorUpdateAfterBindStorageImages) {
        getMaxPerStageDescriptorUpdateAfterBindStorageImages().setValue(maxPerStageDescriptorUpdateAfterBindStorageImages);
    }

    private static native long getMaxPerStageDescriptorUpdateAfterBindStorageImages(long address);
    private static native void setMaxPerStageDescriptorUpdateAfterBindStorageImages(long address, long maxPerStageDescriptorUpdateAfterBindStorageImages);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindInputAttachments() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindInputAttachments(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindInputAttachments(VkUInt32 maxPerStageDescriptorUpdateAfterBindInputAttachments) {
        setMaxPerStageDescriptorUpdateAfterBindInputAttachments(getVkAddress(), maxPerStageDescriptorUpdateAfterBindInputAttachments != null ? maxPerStageDescriptorUpdateAfterBindInputAttachments.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxPerStageDescriptorUpdateAfterBindInputAttachmentsQ() {
        return getMaxPerStageDescriptorUpdateAfterBindInputAttachments().getValue();
    }

    public void setMaxPerStageDescriptorUpdateAfterBindInputAttachments(int maxPerStageDescriptorUpdateAfterBindInputAttachments) {
        getMaxPerStageDescriptorUpdateAfterBindInputAttachments().setValue(maxPerStageDescriptorUpdateAfterBindInputAttachments);
    }

    private static native long getMaxPerStageDescriptorUpdateAfterBindInputAttachments(long address);
    private static native void setMaxPerStageDescriptorUpdateAfterBindInputAttachments(long address, long maxPerStageDescriptorUpdateAfterBindInputAttachments);

    public VkUInt32 getMaxPerStageUpdateAfterBindResources() {
        return new VkUInt32(getVkMemory(), getMaxPerStageUpdateAfterBindResources(getVkAddress()));
    }

    
    public void setMaxPerStageUpdateAfterBindResources(VkUInt32 maxPerStageUpdateAfterBindResources) {
        setMaxPerStageUpdateAfterBindResources(getVkAddress(), maxPerStageUpdateAfterBindResources != null ? maxPerStageUpdateAfterBindResources.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxPerStageUpdateAfterBindResourcesQ() {
        return getMaxPerStageUpdateAfterBindResources().getValue();
    }

    public void setMaxPerStageUpdateAfterBindResources(int maxPerStageUpdateAfterBindResources) {
        getMaxPerStageUpdateAfterBindResources().setValue(maxPerStageUpdateAfterBindResources);
    }

    private static native long getMaxPerStageUpdateAfterBindResources(long address);
    private static native void setMaxPerStageUpdateAfterBindResources(long address, long maxPerStageUpdateAfterBindResources);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindSamplers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindSamplers(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindSamplers(VkUInt32 maxDescriptorSetUpdateAfterBindSamplers) {
        setMaxDescriptorSetUpdateAfterBindSamplers(getVkAddress(), maxDescriptorSetUpdateAfterBindSamplers != null ? maxDescriptorSetUpdateAfterBindSamplers.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxDescriptorSetUpdateAfterBindSamplersQ() {
        return getMaxDescriptorSetUpdateAfterBindSamplers().getValue();
    }

    public void setMaxDescriptorSetUpdateAfterBindSamplers(int maxDescriptorSetUpdateAfterBindSamplers) {
        getMaxDescriptorSetUpdateAfterBindSamplers().setValue(maxDescriptorSetUpdateAfterBindSamplers);
    }

    private static native long getMaxDescriptorSetUpdateAfterBindSamplers(long address);
    private static native void setMaxDescriptorSetUpdateAfterBindSamplers(long address, long maxDescriptorSetUpdateAfterBindSamplers);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindUniformBuffers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindUniformBuffers(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindUniformBuffers(VkUInt32 maxDescriptorSetUpdateAfterBindUniformBuffers) {
        setMaxDescriptorSetUpdateAfterBindUniformBuffers(getVkAddress(), maxDescriptorSetUpdateAfterBindUniformBuffers != null ? maxDescriptorSetUpdateAfterBindUniformBuffers.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxDescriptorSetUpdateAfterBindUniformBuffersQ() {
        return getMaxDescriptorSetUpdateAfterBindUniformBuffers().getValue();
    }

    public void setMaxDescriptorSetUpdateAfterBindUniformBuffers(int maxDescriptorSetUpdateAfterBindUniformBuffers) {
        getMaxDescriptorSetUpdateAfterBindUniformBuffers().setValue(maxDescriptorSetUpdateAfterBindUniformBuffers);
    }

    private static native long getMaxDescriptorSetUpdateAfterBindUniformBuffers(long address);
    private static native void setMaxDescriptorSetUpdateAfterBindUniformBuffers(long address, long maxDescriptorSetUpdateAfterBindUniformBuffers);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(VkUInt32 maxDescriptorSetUpdateAfterBindUniformBuffersDynamic) {
        setMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(getVkAddress(), maxDescriptorSetUpdateAfterBindUniformBuffersDynamic != null ? maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamicQ() {
        return getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic().getValue();
    }

    public void setMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic) {
        getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic().setValue(maxDescriptorSetUpdateAfterBindUniformBuffersDynamic);
    }

    private static native long getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(long address);
    private static native void setMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(long address, long maxDescriptorSetUpdateAfterBindUniformBuffersDynamic);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindStorageBuffers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindStorageBuffers(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindStorageBuffers(VkUInt32 maxDescriptorSetUpdateAfterBindStorageBuffers) {
        setMaxDescriptorSetUpdateAfterBindStorageBuffers(getVkAddress(), maxDescriptorSetUpdateAfterBindStorageBuffers != null ? maxDescriptorSetUpdateAfterBindStorageBuffers.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxDescriptorSetUpdateAfterBindStorageBuffersQ() {
        return getMaxDescriptorSetUpdateAfterBindStorageBuffers().getValue();
    }

    public void setMaxDescriptorSetUpdateAfterBindStorageBuffers(int maxDescriptorSetUpdateAfterBindStorageBuffers) {
        getMaxDescriptorSetUpdateAfterBindStorageBuffers().setValue(maxDescriptorSetUpdateAfterBindStorageBuffers);
    }

    private static native long getMaxDescriptorSetUpdateAfterBindStorageBuffers(long address);
    private static native void setMaxDescriptorSetUpdateAfterBindStorageBuffers(long address, long maxDescriptorSetUpdateAfterBindStorageBuffers);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(VkUInt32 maxDescriptorSetUpdateAfterBindStorageBuffersDynamic) {
        setMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(getVkAddress(), maxDescriptorSetUpdateAfterBindStorageBuffersDynamic != null ? maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamicQ() {
        return getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic().getValue();
    }

    public void setMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic) {
        getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic().setValue(maxDescriptorSetUpdateAfterBindStorageBuffersDynamic);
    }

    private static native long getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(long address);
    private static native void setMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(long address, long maxDescriptorSetUpdateAfterBindStorageBuffersDynamic);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindSampledImages() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindSampledImages(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindSampledImages(VkUInt32 maxDescriptorSetUpdateAfterBindSampledImages) {
        setMaxDescriptorSetUpdateAfterBindSampledImages(getVkAddress(), maxDescriptorSetUpdateAfterBindSampledImages != null ? maxDescriptorSetUpdateAfterBindSampledImages.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxDescriptorSetUpdateAfterBindSampledImagesQ() {
        return getMaxDescriptorSetUpdateAfterBindSampledImages().getValue();
    }

    public void setMaxDescriptorSetUpdateAfterBindSampledImages(int maxDescriptorSetUpdateAfterBindSampledImages) {
        getMaxDescriptorSetUpdateAfterBindSampledImages().setValue(maxDescriptorSetUpdateAfterBindSampledImages);
    }

    private static native long getMaxDescriptorSetUpdateAfterBindSampledImages(long address);
    private static native void setMaxDescriptorSetUpdateAfterBindSampledImages(long address, long maxDescriptorSetUpdateAfterBindSampledImages);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindStorageImages() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindStorageImages(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindStorageImages(VkUInt32 maxDescriptorSetUpdateAfterBindStorageImages) {
        setMaxDescriptorSetUpdateAfterBindStorageImages(getVkAddress(), maxDescriptorSetUpdateAfterBindStorageImages != null ? maxDescriptorSetUpdateAfterBindStorageImages.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxDescriptorSetUpdateAfterBindStorageImagesQ() {
        return getMaxDescriptorSetUpdateAfterBindStorageImages().getValue();
    }

    public void setMaxDescriptorSetUpdateAfterBindStorageImages(int maxDescriptorSetUpdateAfterBindStorageImages) {
        getMaxDescriptorSetUpdateAfterBindStorageImages().setValue(maxDescriptorSetUpdateAfterBindStorageImages);
    }

    private static native long getMaxDescriptorSetUpdateAfterBindStorageImages(long address);
    private static native void setMaxDescriptorSetUpdateAfterBindStorageImages(long address, long maxDescriptorSetUpdateAfterBindStorageImages);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindInputAttachments() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindInputAttachments(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindInputAttachments(VkUInt32 maxDescriptorSetUpdateAfterBindInputAttachments) {
        setMaxDescriptorSetUpdateAfterBindInputAttachments(getVkAddress(), maxDescriptorSetUpdateAfterBindInputAttachments != null ? maxDescriptorSetUpdateAfterBindInputAttachments.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxDescriptorSetUpdateAfterBindInputAttachmentsQ() {
        return getMaxDescriptorSetUpdateAfterBindInputAttachments().getValue();
    }

    public void setMaxDescriptorSetUpdateAfterBindInputAttachments(int maxDescriptorSetUpdateAfterBindInputAttachments) {
        getMaxDescriptorSetUpdateAfterBindInputAttachments().setValue(maxDescriptorSetUpdateAfterBindInputAttachments);
    }

    private static native long getMaxDescriptorSetUpdateAfterBindInputAttachments(long address);
    private static native void setMaxDescriptorSetUpdateAfterBindInputAttachments(long address, long maxDescriptorSetUpdateAfterBindInputAttachments);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceDescriptorIndexingPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceDescriptorIndexingPropertiesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceDescriptorIndexingPropertiesEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceDescriptorIndexingPropertiesEXT o){
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
        public VkPhysicalDeviceDescriptorIndexingPropertiesEXT get(int i){
            return new VkPhysicalDeviceDescriptorIndexingPropertiesEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Pointer> {
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

            public Array(VkPhysicalDeviceDescriptorIndexingPropertiesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Pointer get(int i){
                return new VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
