package cz.mg.vulkan;

public class VkPhysicalDeviceDescriptorIndexingFeaturesEXT extends VkObject {
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT() {
        super(sizeof());
    }

    protected VkPhysicalDeviceDescriptorIndexingFeaturesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceDescriptorIndexingFeaturesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT(VkPointer pointer) {
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

    public VkBool32 getShaderInputAttachmentArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderInputAttachmentArrayDynamicIndexingNative(getVkAddress()));
    }

    
    public void setShaderInputAttachmentArrayDynamicIndexing(VkBool32 shaderInputAttachmentArrayDynamicIndexing) {
        setShaderInputAttachmentArrayDynamicIndexingNative(getVkAddress(), shaderInputAttachmentArrayDynamicIndexing != null ? shaderInputAttachmentArrayDynamicIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderInputAttachmentArrayDynamicIndexingQ() {
        return getShaderInputAttachmentArrayDynamicIndexing().getValue();
    }

    public void setShaderInputAttachmentArrayDynamicIndexing(int shaderInputAttachmentArrayDynamicIndexing) {
        getShaderInputAttachmentArrayDynamicIndexing().setValue(shaderInputAttachmentArrayDynamicIndexing);
    }

    protected static native long getShaderInputAttachmentArrayDynamicIndexingNative(long address);
    protected static native void setShaderInputAttachmentArrayDynamicIndexingNative(long address, long shaderInputAttachmentArrayDynamicIndexing);

    public VkBool32 getShaderUniformTexelBufferArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderUniformTexelBufferArrayDynamicIndexingNative(getVkAddress()));
    }

    
    public void setShaderUniformTexelBufferArrayDynamicIndexing(VkBool32 shaderUniformTexelBufferArrayDynamicIndexing) {
        setShaderUniformTexelBufferArrayDynamicIndexingNative(getVkAddress(), shaderUniformTexelBufferArrayDynamicIndexing != null ? shaderUniformTexelBufferArrayDynamicIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderUniformTexelBufferArrayDynamicIndexingQ() {
        return getShaderUniformTexelBufferArrayDynamicIndexing().getValue();
    }

    public void setShaderUniformTexelBufferArrayDynamicIndexing(int shaderUniformTexelBufferArrayDynamicIndexing) {
        getShaderUniformTexelBufferArrayDynamicIndexing().setValue(shaderUniformTexelBufferArrayDynamicIndexing);
    }

    protected static native long getShaderUniformTexelBufferArrayDynamicIndexingNative(long address);
    protected static native void setShaderUniformTexelBufferArrayDynamicIndexingNative(long address, long shaderUniformTexelBufferArrayDynamicIndexing);

    public VkBool32 getShaderStorageTexelBufferArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageTexelBufferArrayDynamicIndexingNative(getVkAddress()));
    }

    
    public void setShaderStorageTexelBufferArrayDynamicIndexing(VkBool32 shaderStorageTexelBufferArrayDynamicIndexing) {
        setShaderStorageTexelBufferArrayDynamicIndexingNative(getVkAddress(), shaderStorageTexelBufferArrayDynamicIndexing != null ? shaderStorageTexelBufferArrayDynamicIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageTexelBufferArrayDynamicIndexingQ() {
        return getShaderStorageTexelBufferArrayDynamicIndexing().getValue();
    }

    public void setShaderStorageTexelBufferArrayDynamicIndexing(int shaderStorageTexelBufferArrayDynamicIndexing) {
        getShaderStorageTexelBufferArrayDynamicIndexing().setValue(shaderStorageTexelBufferArrayDynamicIndexing);
    }

    protected static native long getShaderStorageTexelBufferArrayDynamicIndexingNative(long address);
    protected static native void setShaderStorageTexelBufferArrayDynamicIndexingNative(long address, long shaderStorageTexelBufferArrayDynamicIndexing);

    public VkBool32 getShaderUniformBufferArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderUniformBufferArrayNonUniformIndexingNative(getVkAddress()));
    }

    
    public void setShaderUniformBufferArrayNonUniformIndexing(VkBool32 shaderUniformBufferArrayNonUniformIndexing) {
        setShaderUniformBufferArrayNonUniformIndexingNative(getVkAddress(), shaderUniformBufferArrayNonUniformIndexing != null ? shaderUniformBufferArrayNonUniformIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderUniformBufferArrayNonUniformIndexingQ() {
        return getShaderUniformBufferArrayNonUniformIndexing().getValue();
    }

    public void setShaderUniformBufferArrayNonUniformIndexing(int shaderUniformBufferArrayNonUniformIndexing) {
        getShaderUniformBufferArrayNonUniformIndexing().setValue(shaderUniformBufferArrayNonUniformIndexing);
    }

    protected static native long getShaderUniformBufferArrayNonUniformIndexingNative(long address);
    protected static native void setShaderUniformBufferArrayNonUniformIndexingNative(long address, long shaderUniformBufferArrayNonUniformIndexing);

    public VkBool32 getShaderSampledImageArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderSampledImageArrayNonUniformIndexingNative(getVkAddress()));
    }

    
    public void setShaderSampledImageArrayNonUniformIndexing(VkBool32 shaderSampledImageArrayNonUniformIndexing) {
        setShaderSampledImageArrayNonUniformIndexingNative(getVkAddress(), shaderSampledImageArrayNonUniformIndexing != null ? shaderSampledImageArrayNonUniformIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderSampledImageArrayNonUniformIndexingQ() {
        return getShaderSampledImageArrayNonUniformIndexing().getValue();
    }

    public void setShaderSampledImageArrayNonUniformIndexing(int shaderSampledImageArrayNonUniformIndexing) {
        getShaderSampledImageArrayNonUniformIndexing().setValue(shaderSampledImageArrayNonUniformIndexing);
    }

    protected static native long getShaderSampledImageArrayNonUniformIndexingNative(long address);
    protected static native void setShaderSampledImageArrayNonUniformIndexingNative(long address, long shaderSampledImageArrayNonUniformIndexing);

    public VkBool32 getShaderStorageBufferArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageBufferArrayNonUniformIndexingNative(getVkAddress()));
    }

    
    public void setShaderStorageBufferArrayNonUniformIndexing(VkBool32 shaderStorageBufferArrayNonUniformIndexing) {
        setShaderStorageBufferArrayNonUniformIndexingNative(getVkAddress(), shaderStorageBufferArrayNonUniformIndexing != null ? shaderStorageBufferArrayNonUniformIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageBufferArrayNonUniformIndexingQ() {
        return getShaderStorageBufferArrayNonUniformIndexing().getValue();
    }

    public void setShaderStorageBufferArrayNonUniformIndexing(int shaderStorageBufferArrayNonUniformIndexing) {
        getShaderStorageBufferArrayNonUniformIndexing().setValue(shaderStorageBufferArrayNonUniformIndexing);
    }

    protected static native long getShaderStorageBufferArrayNonUniformIndexingNative(long address);
    protected static native void setShaderStorageBufferArrayNonUniformIndexingNative(long address, long shaderStorageBufferArrayNonUniformIndexing);

    public VkBool32 getShaderStorageImageArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageImageArrayNonUniformIndexingNative(getVkAddress()));
    }

    
    public void setShaderStorageImageArrayNonUniformIndexing(VkBool32 shaderStorageImageArrayNonUniformIndexing) {
        setShaderStorageImageArrayNonUniformIndexingNative(getVkAddress(), shaderStorageImageArrayNonUniformIndexing != null ? shaderStorageImageArrayNonUniformIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageImageArrayNonUniformIndexingQ() {
        return getShaderStorageImageArrayNonUniformIndexing().getValue();
    }

    public void setShaderStorageImageArrayNonUniformIndexing(int shaderStorageImageArrayNonUniformIndexing) {
        getShaderStorageImageArrayNonUniformIndexing().setValue(shaderStorageImageArrayNonUniformIndexing);
    }

    protected static native long getShaderStorageImageArrayNonUniformIndexingNative(long address);
    protected static native void setShaderStorageImageArrayNonUniformIndexingNative(long address, long shaderStorageImageArrayNonUniformIndexing);

    public VkBool32 getShaderInputAttachmentArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderInputAttachmentArrayNonUniformIndexingNative(getVkAddress()));
    }

    
    public void setShaderInputAttachmentArrayNonUniformIndexing(VkBool32 shaderInputAttachmentArrayNonUniformIndexing) {
        setShaderInputAttachmentArrayNonUniformIndexingNative(getVkAddress(), shaderInputAttachmentArrayNonUniformIndexing != null ? shaderInputAttachmentArrayNonUniformIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderInputAttachmentArrayNonUniformIndexingQ() {
        return getShaderInputAttachmentArrayNonUniformIndexing().getValue();
    }

    public void setShaderInputAttachmentArrayNonUniformIndexing(int shaderInputAttachmentArrayNonUniformIndexing) {
        getShaderInputAttachmentArrayNonUniformIndexing().setValue(shaderInputAttachmentArrayNonUniformIndexing);
    }

    protected static native long getShaderInputAttachmentArrayNonUniformIndexingNative(long address);
    protected static native void setShaderInputAttachmentArrayNonUniformIndexingNative(long address, long shaderInputAttachmentArrayNonUniformIndexing);

    public VkBool32 getShaderUniformTexelBufferArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderUniformTexelBufferArrayNonUniformIndexingNative(getVkAddress()));
    }

    
    public void setShaderUniformTexelBufferArrayNonUniformIndexing(VkBool32 shaderUniformTexelBufferArrayNonUniformIndexing) {
        setShaderUniformTexelBufferArrayNonUniformIndexingNative(getVkAddress(), shaderUniformTexelBufferArrayNonUniformIndexing != null ? shaderUniformTexelBufferArrayNonUniformIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderUniformTexelBufferArrayNonUniformIndexingQ() {
        return getShaderUniformTexelBufferArrayNonUniformIndexing().getValue();
    }

    public void setShaderUniformTexelBufferArrayNonUniformIndexing(int shaderUniformTexelBufferArrayNonUniformIndexing) {
        getShaderUniformTexelBufferArrayNonUniformIndexing().setValue(shaderUniformTexelBufferArrayNonUniformIndexing);
    }

    protected static native long getShaderUniformTexelBufferArrayNonUniformIndexingNative(long address);
    protected static native void setShaderUniformTexelBufferArrayNonUniformIndexingNative(long address, long shaderUniformTexelBufferArrayNonUniformIndexing);

    public VkBool32 getShaderStorageTexelBufferArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageTexelBufferArrayNonUniformIndexingNative(getVkAddress()));
    }

    
    public void setShaderStorageTexelBufferArrayNonUniformIndexing(VkBool32 shaderStorageTexelBufferArrayNonUniformIndexing) {
        setShaderStorageTexelBufferArrayNonUniformIndexingNative(getVkAddress(), shaderStorageTexelBufferArrayNonUniformIndexing != null ? shaderStorageTexelBufferArrayNonUniformIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageTexelBufferArrayNonUniformIndexingQ() {
        return getShaderStorageTexelBufferArrayNonUniformIndexing().getValue();
    }

    public void setShaderStorageTexelBufferArrayNonUniformIndexing(int shaderStorageTexelBufferArrayNonUniformIndexing) {
        getShaderStorageTexelBufferArrayNonUniformIndexing().setValue(shaderStorageTexelBufferArrayNonUniformIndexing);
    }

    protected static native long getShaderStorageTexelBufferArrayNonUniformIndexingNative(long address);
    protected static native void setShaderStorageTexelBufferArrayNonUniformIndexingNative(long address, long shaderStorageTexelBufferArrayNonUniformIndexing);

    public VkBool32 getDescriptorBindingUniformBufferUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingUniformBufferUpdateAfterBindNative(getVkAddress()));
    }

    
    public void setDescriptorBindingUniformBufferUpdateAfterBind(VkBool32 descriptorBindingUniformBufferUpdateAfterBind) {
        setDescriptorBindingUniformBufferUpdateAfterBindNative(getVkAddress(), descriptorBindingUniformBufferUpdateAfterBind != null ? descriptorBindingUniformBufferUpdateAfterBind.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingUniformBufferUpdateAfterBindQ() {
        return getDescriptorBindingUniformBufferUpdateAfterBind().getValue();
    }

    public void setDescriptorBindingUniformBufferUpdateAfterBind(int descriptorBindingUniformBufferUpdateAfterBind) {
        getDescriptorBindingUniformBufferUpdateAfterBind().setValue(descriptorBindingUniformBufferUpdateAfterBind);
    }

    protected static native long getDescriptorBindingUniformBufferUpdateAfterBindNative(long address);
    protected static native void setDescriptorBindingUniformBufferUpdateAfterBindNative(long address, long descriptorBindingUniformBufferUpdateAfterBind);

    public VkBool32 getDescriptorBindingSampledImageUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingSampledImageUpdateAfterBindNative(getVkAddress()));
    }

    
    public void setDescriptorBindingSampledImageUpdateAfterBind(VkBool32 descriptorBindingSampledImageUpdateAfterBind) {
        setDescriptorBindingSampledImageUpdateAfterBindNative(getVkAddress(), descriptorBindingSampledImageUpdateAfterBind != null ? descriptorBindingSampledImageUpdateAfterBind.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingSampledImageUpdateAfterBindQ() {
        return getDescriptorBindingSampledImageUpdateAfterBind().getValue();
    }

    public void setDescriptorBindingSampledImageUpdateAfterBind(int descriptorBindingSampledImageUpdateAfterBind) {
        getDescriptorBindingSampledImageUpdateAfterBind().setValue(descriptorBindingSampledImageUpdateAfterBind);
    }

    protected static native long getDescriptorBindingSampledImageUpdateAfterBindNative(long address);
    protected static native void setDescriptorBindingSampledImageUpdateAfterBindNative(long address, long descriptorBindingSampledImageUpdateAfterBind);

    public VkBool32 getDescriptorBindingStorageImageUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingStorageImageUpdateAfterBindNative(getVkAddress()));
    }

    
    public void setDescriptorBindingStorageImageUpdateAfterBind(VkBool32 descriptorBindingStorageImageUpdateAfterBind) {
        setDescriptorBindingStorageImageUpdateAfterBindNative(getVkAddress(), descriptorBindingStorageImageUpdateAfterBind != null ? descriptorBindingStorageImageUpdateAfterBind.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingStorageImageUpdateAfterBindQ() {
        return getDescriptorBindingStorageImageUpdateAfterBind().getValue();
    }

    public void setDescriptorBindingStorageImageUpdateAfterBind(int descriptorBindingStorageImageUpdateAfterBind) {
        getDescriptorBindingStorageImageUpdateAfterBind().setValue(descriptorBindingStorageImageUpdateAfterBind);
    }

    protected static native long getDescriptorBindingStorageImageUpdateAfterBindNative(long address);
    protected static native void setDescriptorBindingStorageImageUpdateAfterBindNative(long address, long descriptorBindingStorageImageUpdateAfterBind);

    public VkBool32 getDescriptorBindingStorageBufferUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingStorageBufferUpdateAfterBindNative(getVkAddress()));
    }

    
    public void setDescriptorBindingStorageBufferUpdateAfterBind(VkBool32 descriptorBindingStorageBufferUpdateAfterBind) {
        setDescriptorBindingStorageBufferUpdateAfterBindNative(getVkAddress(), descriptorBindingStorageBufferUpdateAfterBind != null ? descriptorBindingStorageBufferUpdateAfterBind.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingStorageBufferUpdateAfterBindQ() {
        return getDescriptorBindingStorageBufferUpdateAfterBind().getValue();
    }

    public void setDescriptorBindingStorageBufferUpdateAfterBind(int descriptorBindingStorageBufferUpdateAfterBind) {
        getDescriptorBindingStorageBufferUpdateAfterBind().setValue(descriptorBindingStorageBufferUpdateAfterBind);
    }

    protected static native long getDescriptorBindingStorageBufferUpdateAfterBindNative(long address);
    protected static native void setDescriptorBindingStorageBufferUpdateAfterBindNative(long address, long descriptorBindingStorageBufferUpdateAfterBind);

    public VkBool32 getDescriptorBindingUniformTexelBufferUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingUniformTexelBufferUpdateAfterBindNative(getVkAddress()));
    }

    
    public void setDescriptorBindingUniformTexelBufferUpdateAfterBind(VkBool32 descriptorBindingUniformTexelBufferUpdateAfterBind) {
        setDescriptorBindingUniformTexelBufferUpdateAfterBindNative(getVkAddress(), descriptorBindingUniformTexelBufferUpdateAfterBind != null ? descriptorBindingUniformTexelBufferUpdateAfterBind.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingUniformTexelBufferUpdateAfterBindQ() {
        return getDescriptorBindingUniformTexelBufferUpdateAfterBind().getValue();
    }

    public void setDescriptorBindingUniformTexelBufferUpdateAfterBind(int descriptorBindingUniformTexelBufferUpdateAfterBind) {
        getDescriptorBindingUniformTexelBufferUpdateAfterBind().setValue(descriptorBindingUniformTexelBufferUpdateAfterBind);
    }

    protected static native long getDescriptorBindingUniformTexelBufferUpdateAfterBindNative(long address);
    protected static native void setDescriptorBindingUniformTexelBufferUpdateAfterBindNative(long address, long descriptorBindingUniformTexelBufferUpdateAfterBind);

    public VkBool32 getDescriptorBindingStorageTexelBufferUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingStorageTexelBufferUpdateAfterBindNative(getVkAddress()));
    }

    
    public void setDescriptorBindingStorageTexelBufferUpdateAfterBind(VkBool32 descriptorBindingStorageTexelBufferUpdateAfterBind) {
        setDescriptorBindingStorageTexelBufferUpdateAfterBindNative(getVkAddress(), descriptorBindingStorageTexelBufferUpdateAfterBind != null ? descriptorBindingStorageTexelBufferUpdateAfterBind.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingStorageTexelBufferUpdateAfterBindQ() {
        return getDescriptorBindingStorageTexelBufferUpdateAfterBind().getValue();
    }

    public void setDescriptorBindingStorageTexelBufferUpdateAfterBind(int descriptorBindingStorageTexelBufferUpdateAfterBind) {
        getDescriptorBindingStorageTexelBufferUpdateAfterBind().setValue(descriptorBindingStorageTexelBufferUpdateAfterBind);
    }

    protected static native long getDescriptorBindingStorageTexelBufferUpdateAfterBindNative(long address);
    protected static native void setDescriptorBindingStorageTexelBufferUpdateAfterBindNative(long address, long descriptorBindingStorageTexelBufferUpdateAfterBind);

    public VkBool32 getDescriptorBindingUpdateUnusedWhilePending() {
        return new VkBool32(getVkMemory(), getDescriptorBindingUpdateUnusedWhilePendingNative(getVkAddress()));
    }

    
    public void setDescriptorBindingUpdateUnusedWhilePending(VkBool32 descriptorBindingUpdateUnusedWhilePending) {
        setDescriptorBindingUpdateUnusedWhilePendingNative(getVkAddress(), descriptorBindingUpdateUnusedWhilePending != null ? descriptorBindingUpdateUnusedWhilePending.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingUpdateUnusedWhilePendingQ() {
        return getDescriptorBindingUpdateUnusedWhilePending().getValue();
    }

    public void setDescriptorBindingUpdateUnusedWhilePending(int descriptorBindingUpdateUnusedWhilePending) {
        getDescriptorBindingUpdateUnusedWhilePending().setValue(descriptorBindingUpdateUnusedWhilePending);
    }

    protected static native long getDescriptorBindingUpdateUnusedWhilePendingNative(long address);
    protected static native void setDescriptorBindingUpdateUnusedWhilePendingNative(long address, long descriptorBindingUpdateUnusedWhilePending);

    public VkBool32 getDescriptorBindingPartiallyBound() {
        return new VkBool32(getVkMemory(), getDescriptorBindingPartiallyBoundNative(getVkAddress()));
    }

    
    public void setDescriptorBindingPartiallyBound(VkBool32 descriptorBindingPartiallyBound) {
        setDescriptorBindingPartiallyBoundNative(getVkAddress(), descriptorBindingPartiallyBound != null ? descriptorBindingPartiallyBound.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingPartiallyBoundQ() {
        return getDescriptorBindingPartiallyBound().getValue();
    }

    public void setDescriptorBindingPartiallyBound(int descriptorBindingPartiallyBound) {
        getDescriptorBindingPartiallyBound().setValue(descriptorBindingPartiallyBound);
    }

    protected static native long getDescriptorBindingPartiallyBoundNative(long address);
    protected static native void setDescriptorBindingPartiallyBoundNative(long address, long descriptorBindingPartiallyBound);

    public VkBool32 getDescriptorBindingVariableDescriptorCount() {
        return new VkBool32(getVkMemory(), getDescriptorBindingVariableDescriptorCountNative(getVkAddress()));
    }

    
    public void setDescriptorBindingVariableDescriptorCount(VkBool32 descriptorBindingVariableDescriptorCount) {
        setDescriptorBindingVariableDescriptorCountNative(getVkAddress(), descriptorBindingVariableDescriptorCount != null ? descriptorBindingVariableDescriptorCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingVariableDescriptorCountQ() {
        return getDescriptorBindingVariableDescriptorCount().getValue();
    }

    public void setDescriptorBindingVariableDescriptorCount(int descriptorBindingVariableDescriptorCount) {
        getDescriptorBindingVariableDescriptorCount().setValue(descriptorBindingVariableDescriptorCount);
    }

    protected static native long getDescriptorBindingVariableDescriptorCountNative(long address);
    protected static native void setDescriptorBindingVariableDescriptorCountNative(long address, long descriptorBindingVariableDescriptorCount);

    public VkBool32 getRuntimeDescriptorArray() {
        return new VkBool32(getVkMemory(), getRuntimeDescriptorArrayNative(getVkAddress()));
    }

    
    public void setRuntimeDescriptorArray(VkBool32 runtimeDescriptorArray) {
        setRuntimeDescriptorArrayNative(getVkAddress(), runtimeDescriptorArray != null ? runtimeDescriptorArray.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getRuntimeDescriptorArrayQ() {
        return getRuntimeDescriptorArray().getValue();
    }

    public void setRuntimeDescriptorArray(int runtimeDescriptorArray) {
        getRuntimeDescriptorArray().setValue(runtimeDescriptorArray);
    }

    protected static native long getRuntimeDescriptorArrayNative(long address);
    protected static native void setRuntimeDescriptorArrayNative(long address, long runtimeDescriptorArray);


    public void set(VkPhysicalDeviceDescriptorIndexingFeaturesEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPhysicalDeviceDescriptorIndexingFeaturesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceDescriptorIndexingFeaturesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceDescriptorIndexingFeaturesEXT.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceDescriptorIndexingFeaturesEXT o, int count){
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
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT get(int i){
            return new VkPhysicalDeviceDescriptorIndexingFeaturesEXT(getVkMemory(), address(i));
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
