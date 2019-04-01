package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceDescriptorIndexingPropertiesEXT.html">khronos documentation</a>
 **/
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


    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT(VkStructureType sType, VkObject pNext, VkUInt32 maxUpdateAfterBindDescriptorsInAllPools, VkBool32 shaderUniformBufferArrayNonUniformIndexingNative, VkBool32 shaderSampledImageArrayNonUniformIndexingNative, VkBool32 shaderStorageBufferArrayNonUniformIndexingNative, VkBool32 shaderStorageImageArrayNonUniformIndexingNative, VkBool32 shaderInputAttachmentArrayNonUniformIndexingNative, VkBool32 robustBufferAccessUpdateAfterBind, VkBool32 quadDivergentImplicitLod, VkUInt32 maxPerStageDescriptorUpdateAfterBindSamplers, VkUInt32 maxPerStageDescriptorUpdateAfterBindUniformBuffers, VkUInt32 maxPerStageDescriptorUpdateAfterBindStorageBuffers, VkUInt32 maxPerStageDescriptorUpdateAfterBindSampledImages, VkUInt32 maxPerStageDescriptorUpdateAfterBindStorageImages, VkUInt32 maxPerStageDescriptorUpdateAfterBindInputAttachments, VkUInt32 maxPerStageUpdateAfterBindResources, VkUInt32 maxDescriptorSetUpdateAfterBindSamplers, VkUInt32 maxDescriptorSetUpdateAfterBindUniformBuffers, VkUInt32 maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, VkUInt32 maxDescriptorSetUpdateAfterBindStorageBuffers, VkUInt32 maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, VkUInt32 maxDescriptorSetUpdateAfterBindSampledImages, VkUInt32 maxDescriptorSetUpdateAfterBindStorageImages, VkUInt32 maxDescriptorSetUpdateAfterBindInputAttachments) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setMaxUpdateAfterBindDescriptorsInAllPools(maxUpdateAfterBindDescriptorsInAllPools);
        setShaderUniformBufferArrayNonUniformIndexingNative(shaderUniformBufferArrayNonUniformIndexingNative);
        setShaderSampledImageArrayNonUniformIndexingNative(shaderSampledImageArrayNonUniformIndexingNative);
        setShaderStorageBufferArrayNonUniformIndexingNative(shaderStorageBufferArrayNonUniformIndexingNative);
        setShaderStorageImageArrayNonUniformIndexingNative(shaderStorageImageArrayNonUniformIndexingNative);
        setShaderInputAttachmentArrayNonUniformIndexingNative(shaderInputAttachmentArrayNonUniformIndexingNative);
        setRobustBufferAccessUpdateAfterBind(robustBufferAccessUpdateAfterBind);
        setQuadDivergentImplicitLod(quadDivergentImplicitLod);
        setMaxPerStageDescriptorUpdateAfterBindSamplers(maxPerStageDescriptorUpdateAfterBindSamplers);
        setMaxPerStageDescriptorUpdateAfterBindUniformBuffers(maxPerStageDescriptorUpdateAfterBindUniformBuffers);
        setMaxPerStageDescriptorUpdateAfterBindStorageBuffers(maxPerStageDescriptorUpdateAfterBindStorageBuffers);
        setMaxPerStageDescriptorUpdateAfterBindSampledImages(maxPerStageDescriptorUpdateAfterBindSampledImages);
        setMaxPerStageDescriptorUpdateAfterBindStorageImages(maxPerStageDescriptorUpdateAfterBindStorageImages);
        setMaxPerStageDescriptorUpdateAfterBindInputAttachments(maxPerStageDescriptorUpdateAfterBindInputAttachments);
        setMaxPerStageUpdateAfterBindResources(maxPerStageUpdateAfterBindResources);
        setMaxDescriptorSetUpdateAfterBindSamplers(maxDescriptorSetUpdateAfterBindSamplers);
        setMaxDescriptorSetUpdateAfterBindUniformBuffers(maxDescriptorSetUpdateAfterBindUniformBuffers);
        setMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(maxDescriptorSetUpdateAfterBindUniformBuffersDynamic);
        setMaxDescriptorSetUpdateAfterBindStorageBuffers(maxDescriptorSetUpdateAfterBindStorageBuffers);
        setMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(maxDescriptorSetUpdateAfterBindStorageBuffersDynamic);
        setMaxDescriptorSetUpdateAfterBindSampledImages(maxDescriptorSetUpdateAfterBindSampledImages);
        setMaxDescriptorSetUpdateAfterBindStorageImages(maxDescriptorSetUpdateAfterBindStorageImages);
        setMaxDescriptorSetUpdateAfterBindInputAttachments(maxDescriptorSetUpdateAfterBindInputAttachments);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
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
        setMaxUpdateAfterBindDescriptorsInAllPools(getVkAddress(), maxUpdateAfterBindDescriptorsInAllPools != null ? maxUpdateAfterBindDescriptorsInAllPools.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxUpdateAfterBindDescriptorsInAllPools(long address);
    private static native void setMaxUpdateAfterBindDescriptorsInAllPools(long address, long maxUpdateAfterBindDescriptorsInAllPools);

    public VkBool32 getShaderUniformBufferArrayNonUniformIndexingNative() {
        return new VkBool32(getVkMemory(), getShaderUniformBufferArrayNonUniformIndexingNative(getVkAddress()));
    }

    
    public void setShaderUniformBufferArrayNonUniformIndexingNative(VkBool32 shaderUniformBufferArrayNonUniformIndexingNative) {
        setShaderUniformBufferArrayNonUniformIndexingNative(getVkAddress(), shaderUniformBufferArrayNonUniformIndexingNative != null ? shaderUniformBufferArrayNonUniformIndexingNative.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderUniformBufferArrayNonUniformIndexingNative(long address);
    private static native void setShaderUniformBufferArrayNonUniformIndexingNative(long address, long shaderUniformBufferArrayNonUniformIndexingNative);

    public VkBool32 getShaderSampledImageArrayNonUniformIndexingNative() {
        return new VkBool32(getVkMemory(), getShaderSampledImageArrayNonUniformIndexingNative(getVkAddress()));
    }

    
    public void setShaderSampledImageArrayNonUniformIndexingNative(VkBool32 shaderSampledImageArrayNonUniformIndexingNative) {
        setShaderSampledImageArrayNonUniformIndexingNative(getVkAddress(), shaderSampledImageArrayNonUniformIndexingNative != null ? shaderSampledImageArrayNonUniformIndexingNative.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderSampledImageArrayNonUniformIndexingNative(long address);
    private static native void setShaderSampledImageArrayNonUniformIndexingNative(long address, long shaderSampledImageArrayNonUniformIndexingNative);

    public VkBool32 getShaderStorageBufferArrayNonUniformIndexingNative() {
        return new VkBool32(getVkMemory(), getShaderStorageBufferArrayNonUniformIndexingNative(getVkAddress()));
    }

    
    public void setShaderStorageBufferArrayNonUniformIndexingNative(VkBool32 shaderStorageBufferArrayNonUniformIndexingNative) {
        setShaderStorageBufferArrayNonUniformIndexingNative(getVkAddress(), shaderStorageBufferArrayNonUniformIndexingNative != null ? shaderStorageBufferArrayNonUniformIndexingNative.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderStorageBufferArrayNonUniformIndexingNative(long address);
    private static native void setShaderStorageBufferArrayNonUniformIndexingNative(long address, long shaderStorageBufferArrayNonUniformIndexingNative);

    public VkBool32 getShaderStorageImageArrayNonUniformIndexingNative() {
        return new VkBool32(getVkMemory(), getShaderStorageImageArrayNonUniformIndexingNative(getVkAddress()));
    }

    
    public void setShaderStorageImageArrayNonUniformIndexingNative(VkBool32 shaderStorageImageArrayNonUniformIndexingNative) {
        setShaderStorageImageArrayNonUniformIndexingNative(getVkAddress(), shaderStorageImageArrayNonUniformIndexingNative != null ? shaderStorageImageArrayNonUniformIndexingNative.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderStorageImageArrayNonUniformIndexingNative(long address);
    private static native void setShaderStorageImageArrayNonUniformIndexingNative(long address, long shaderStorageImageArrayNonUniformIndexingNative);

    public VkBool32 getShaderInputAttachmentArrayNonUniformIndexingNative() {
        return new VkBool32(getVkMemory(), getShaderInputAttachmentArrayNonUniformIndexingNative(getVkAddress()));
    }

    
    public void setShaderInputAttachmentArrayNonUniformIndexingNative(VkBool32 shaderInputAttachmentArrayNonUniformIndexingNative) {
        setShaderInputAttachmentArrayNonUniformIndexingNative(getVkAddress(), shaderInputAttachmentArrayNonUniformIndexingNative != null ? shaderInputAttachmentArrayNonUniformIndexingNative.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderInputAttachmentArrayNonUniformIndexingNative(long address);
    private static native void setShaderInputAttachmentArrayNonUniformIndexingNative(long address, long shaderInputAttachmentArrayNonUniformIndexingNative);

    public VkBool32 getRobustBufferAccessUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getRobustBufferAccessUpdateAfterBind(getVkAddress()));
    }

    
    public void setRobustBufferAccessUpdateAfterBind(VkBool32 robustBufferAccessUpdateAfterBind) {
        setRobustBufferAccessUpdateAfterBind(getVkAddress(), robustBufferAccessUpdateAfterBind != null ? robustBufferAccessUpdateAfterBind.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getRobustBufferAccessUpdateAfterBind(long address);
    private static native void setRobustBufferAccessUpdateAfterBind(long address, long robustBufferAccessUpdateAfterBind);

    public VkBool32 getQuadDivergentImplicitLod() {
        return new VkBool32(getVkMemory(), getQuadDivergentImplicitLod(getVkAddress()));
    }

    
    public void setQuadDivergentImplicitLod(VkBool32 quadDivergentImplicitLod) {
        setQuadDivergentImplicitLod(getVkAddress(), quadDivergentImplicitLod != null ? quadDivergentImplicitLod.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getQuadDivergentImplicitLod(long address);
    private static native void setQuadDivergentImplicitLod(long address, long quadDivergentImplicitLod);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindSamplers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindSamplers(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindSamplers(VkUInt32 maxPerStageDescriptorUpdateAfterBindSamplers) {
        setMaxPerStageDescriptorUpdateAfterBindSamplers(getVkAddress(), maxPerStageDescriptorUpdateAfterBindSamplers != null ? maxPerStageDescriptorUpdateAfterBindSamplers.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxPerStageDescriptorUpdateAfterBindSamplers(long address);
    private static native void setMaxPerStageDescriptorUpdateAfterBindSamplers(long address, long maxPerStageDescriptorUpdateAfterBindSamplers);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindUniformBuffers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindUniformBuffers(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindUniformBuffers(VkUInt32 maxPerStageDescriptorUpdateAfterBindUniformBuffers) {
        setMaxPerStageDescriptorUpdateAfterBindUniformBuffers(getVkAddress(), maxPerStageDescriptorUpdateAfterBindUniformBuffers != null ? maxPerStageDescriptorUpdateAfterBindUniformBuffers.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxPerStageDescriptorUpdateAfterBindUniformBuffers(long address);
    private static native void setMaxPerStageDescriptorUpdateAfterBindUniformBuffers(long address, long maxPerStageDescriptorUpdateAfterBindUniformBuffers);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindStorageBuffers() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindStorageBuffers(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindStorageBuffers(VkUInt32 maxPerStageDescriptorUpdateAfterBindStorageBuffers) {
        setMaxPerStageDescriptorUpdateAfterBindStorageBuffers(getVkAddress(), maxPerStageDescriptorUpdateAfterBindStorageBuffers != null ? maxPerStageDescriptorUpdateAfterBindStorageBuffers.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxPerStageDescriptorUpdateAfterBindStorageBuffers(long address);
    private static native void setMaxPerStageDescriptorUpdateAfterBindStorageBuffers(long address, long maxPerStageDescriptorUpdateAfterBindStorageBuffers);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindSampledImages() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindSampledImages(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindSampledImages(VkUInt32 maxPerStageDescriptorUpdateAfterBindSampledImages) {
        setMaxPerStageDescriptorUpdateAfterBindSampledImages(getVkAddress(), maxPerStageDescriptorUpdateAfterBindSampledImages != null ? maxPerStageDescriptorUpdateAfterBindSampledImages.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxPerStageDescriptorUpdateAfterBindSampledImages(long address);
    private static native void setMaxPerStageDescriptorUpdateAfterBindSampledImages(long address, long maxPerStageDescriptorUpdateAfterBindSampledImages);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindStorageImages() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindStorageImages(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindStorageImages(VkUInt32 maxPerStageDescriptorUpdateAfterBindStorageImages) {
        setMaxPerStageDescriptorUpdateAfterBindStorageImages(getVkAddress(), maxPerStageDescriptorUpdateAfterBindStorageImages != null ? maxPerStageDescriptorUpdateAfterBindStorageImages.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxPerStageDescriptorUpdateAfterBindStorageImages(long address);
    private static native void setMaxPerStageDescriptorUpdateAfterBindStorageImages(long address, long maxPerStageDescriptorUpdateAfterBindStorageImages);

    public VkUInt32 getMaxPerStageDescriptorUpdateAfterBindInputAttachments() {
        return new VkUInt32(getVkMemory(), getMaxPerStageDescriptorUpdateAfterBindInputAttachments(getVkAddress()));
    }

    
    public void setMaxPerStageDescriptorUpdateAfterBindInputAttachments(VkUInt32 maxPerStageDescriptorUpdateAfterBindInputAttachments) {
        setMaxPerStageDescriptorUpdateAfterBindInputAttachments(getVkAddress(), maxPerStageDescriptorUpdateAfterBindInputAttachments != null ? maxPerStageDescriptorUpdateAfterBindInputAttachments.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxPerStageDescriptorUpdateAfterBindInputAttachments(long address);
    private static native void setMaxPerStageDescriptorUpdateAfterBindInputAttachments(long address, long maxPerStageDescriptorUpdateAfterBindInputAttachments);

    public VkUInt32 getMaxPerStageUpdateAfterBindResources() {
        return new VkUInt32(getVkMemory(), getMaxPerStageUpdateAfterBindResources(getVkAddress()));
    }

    
    public void setMaxPerStageUpdateAfterBindResources(VkUInt32 maxPerStageUpdateAfterBindResources) {
        setMaxPerStageUpdateAfterBindResources(getVkAddress(), maxPerStageUpdateAfterBindResources != null ? maxPerStageUpdateAfterBindResources.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxPerStageUpdateAfterBindResources(long address);
    private static native void setMaxPerStageUpdateAfterBindResources(long address, long maxPerStageUpdateAfterBindResources);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindSamplers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindSamplers(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindSamplers(VkUInt32 maxDescriptorSetUpdateAfterBindSamplers) {
        setMaxDescriptorSetUpdateAfterBindSamplers(getVkAddress(), maxDescriptorSetUpdateAfterBindSamplers != null ? maxDescriptorSetUpdateAfterBindSamplers.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxDescriptorSetUpdateAfterBindSamplers(long address);
    private static native void setMaxDescriptorSetUpdateAfterBindSamplers(long address, long maxDescriptorSetUpdateAfterBindSamplers);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindUniformBuffers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindUniformBuffers(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindUniformBuffers(VkUInt32 maxDescriptorSetUpdateAfterBindUniformBuffers) {
        setMaxDescriptorSetUpdateAfterBindUniformBuffers(getVkAddress(), maxDescriptorSetUpdateAfterBindUniformBuffers != null ? maxDescriptorSetUpdateAfterBindUniformBuffers.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxDescriptorSetUpdateAfterBindUniformBuffers(long address);
    private static native void setMaxDescriptorSetUpdateAfterBindUniformBuffers(long address, long maxDescriptorSetUpdateAfterBindUniformBuffers);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(VkUInt32 maxDescriptorSetUpdateAfterBindUniformBuffersDynamic) {
        setMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(getVkAddress(), maxDescriptorSetUpdateAfterBindUniformBuffersDynamic != null ? maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(long address);
    private static native void setMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(long address, long maxDescriptorSetUpdateAfterBindUniformBuffersDynamic);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindStorageBuffers() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindStorageBuffers(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindStorageBuffers(VkUInt32 maxDescriptorSetUpdateAfterBindStorageBuffers) {
        setMaxDescriptorSetUpdateAfterBindStorageBuffers(getVkAddress(), maxDescriptorSetUpdateAfterBindStorageBuffers != null ? maxDescriptorSetUpdateAfterBindStorageBuffers.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxDescriptorSetUpdateAfterBindStorageBuffers(long address);
    private static native void setMaxDescriptorSetUpdateAfterBindStorageBuffers(long address, long maxDescriptorSetUpdateAfterBindStorageBuffers);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(VkUInt32 maxDescriptorSetUpdateAfterBindStorageBuffersDynamic) {
        setMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(getVkAddress(), maxDescriptorSetUpdateAfterBindStorageBuffersDynamic != null ? maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(long address);
    private static native void setMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(long address, long maxDescriptorSetUpdateAfterBindStorageBuffersDynamic);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindSampledImages() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindSampledImages(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindSampledImages(VkUInt32 maxDescriptorSetUpdateAfterBindSampledImages) {
        setMaxDescriptorSetUpdateAfterBindSampledImages(getVkAddress(), maxDescriptorSetUpdateAfterBindSampledImages != null ? maxDescriptorSetUpdateAfterBindSampledImages.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxDescriptorSetUpdateAfterBindSampledImages(long address);
    private static native void setMaxDescriptorSetUpdateAfterBindSampledImages(long address, long maxDescriptorSetUpdateAfterBindSampledImages);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindStorageImages() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindStorageImages(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindStorageImages(VkUInt32 maxDescriptorSetUpdateAfterBindStorageImages) {
        setMaxDescriptorSetUpdateAfterBindStorageImages(getVkAddress(), maxDescriptorSetUpdateAfterBindStorageImages != null ? maxDescriptorSetUpdateAfterBindStorageImages.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxDescriptorSetUpdateAfterBindStorageImages(long address);
    private static native void setMaxDescriptorSetUpdateAfterBindStorageImages(long address, long maxDescriptorSetUpdateAfterBindStorageImages);

    public VkUInt32 getMaxDescriptorSetUpdateAfterBindInputAttachments() {
        return new VkUInt32(getVkMemory(), getMaxDescriptorSetUpdateAfterBindInputAttachments(getVkAddress()));
    }

    
    public void setMaxDescriptorSetUpdateAfterBindInputAttachments(VkUInt32 maxDescriptorSetUpdateAfterBindInputAttachments) {
        setMaxDescriptorSetUpdateAfterBindInputAttachments(getVkAddress(), maxDescriptorSetUpdateAfterBindInputAttachments != null ? maxDescriptorSetUpdateAfterBindInputAttachments.getVkAddress() : VkPointer.NULL_ADDRESS);
        
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

        public static class Array extends VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
