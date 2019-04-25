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
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkBool32 getShaderInputAttachmentArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderInputAttachmentArrayDynamicIndexing(getVkAddress()));
    }

    
    public void setShaderInputAttachmentArrayDynamicIndexing(VkBool32 shaderInputAttachmentArrayDynamicIndexing) {
        setShaderInputAttachmentArrayDynamicIndexing(getVkAddress(), shaderInputAttachmentArrayDynamicIndexing != null ? shaderInputAttachmentArrayDynamicIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderInputAttachmentArrayDynamicIndexingQ() {
        return getShaderInputAttachmentArrayDynamicIndexing().getValue();
    }

    public void setShaderInputAttachmentArrayDynamicIndexing(int shaderInputAttachmentArrayDynamicIndexing) {
        getShaderInputAttachmentArrayDynamicIndexing().setValue(shaderInputAttachmentArrayDynamicIndexing);
    }

    protected static native long getShaderInputAttachmentArrayDynamicIndexing(long address);
    protected static native void setShaderInputAttachmentArrayDynamicIndexing(long address, long shaderInputAttachmentArrayDynamicIndexing);

    public VkBool32 getShaderUniformTexelBufferArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderUniformTexelBufferArrayDynamicIndexing(getVkAddress()));
    }

    
    public void setShaderUniformTexelBufferArrayDynamicIndexing(VkBool32 shaderUniformTexelBufferArrayDynamicIndexing) {
        setShaderUniformTexelBufferArrayDynamicIndexing(getVkAddress(), shaderUniformTexelBufferArrayDynamicIndexing != null ? shaderUniformTexelBufferArrayDynamicIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderUniformTexelBufferArrayDynamicIndexingQ() {
        return getShaderUniformTexelBufferArrayDynamicIndexing().getValue();
    }

    public void setShaderUniformTexelBufferArrayDynamicIndexing(int shaderUniformTexelBufferArrayDynamicIndexing) {
        getShaderUniformTexelBufferArrayDynamicIndexing().setValue(shaderUniformTexelBufferArrayDynamicIndexing);
    }

    protected static native long getShaderUniformTexelBufferArrayDynamicIndexing(long address);
    protected static native void setShaderUniformTexelBufferArrayDynamicIndexing(long address, long shaderUniformTexelBufferArrayDynamicIndexing);

    public VkBool32 getShaderStorageTexelBufferArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageTexelBufferArrayDynamicIndexing(getVkAddress()));
    }

    
    public void setShaderStorageTexelBufferArrayDynamicIndexing(VkBool32 shaderStorageTexelBufferArrayDynamicIndexing) {
        setShaderStorageTexelBufferArrayDynamicIndexing(getVkAddress(), shaderStorageTexelBufferArrayDynamicIndexing != null ? shaderStorageTexelBufferArrayDynamicIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageTexelBufferArrayDynamicIndexingQ() {
        return getShaderStorageTexelBufferArrayDynamicIndexing().getValue();
    }

    public void setShaderStorageTexelBufferArrayDynamicIndexing(int shaderStorageTexelBufferArrayDynamicIndexing) {
        getShaderStorageTexelBufferArrayDynamicIndexing().setValue(shaderStorageTexelBufferArrayDynamicIndexing);
    }

    protected static native long getShaderStorageTexelBufferArrayDynamicIndexing(long address);
    protected static native void setShaderStorageTexelBufferArrayDynamicIndexing(long address, long shaderStorageTexelBufferArrayDynamicIndexing);

    public VkBool32 getShaderUniformBufferArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderUniformBufferArrayNonUniformIndexing(getVkAddress()));
    }

    
    public void setShaderUniformBufferArrayNonUniformIndexing(VkBool32 shaderUniformBufferArrayNonUniformIndexing) {
        setShaderUniformBufferArrayNonUniformIndexing(getVkAddress(), shaderUniformBufferArrayNonUniformIndexing != null ? shaderUniformBufferArrayNonUniformIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderUniformBufferArrayNonUniformIndexingQ() {
        return getShaderUniformBufferArrayNonUniformIndexing().getValue();
    }

    public void setShaderUniformBufferArrayNonUniformIndexing(int shaderUniformBufferArrayNonUniformIndexing) {
        getShaderUniformBufferArrayNonUniformIndexing().setValue(shaderUniformBufferArrayNonUniformIndexing);
    }

    protected static native long getShaderUniformBufferArrayNonUniformIndexing(long address);
    protected static native void setShaderUniformBufferArrayNonUniformIndexing(long address, long shaderUniformBufferArrayNonUniformIndexing);

    public VkBool32 getShaderSampledImageArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderSampledImageArrayNonUniformIndexing(getVkAddress()));
    }

    
    public void setShaderSampledImageArrayNonUniformIndexing(VkBool32 shaderSampledImageArrayNonUniformIndexing) {
        setShaderSampledImageArrayNonUniformIndexing(getVkAddress(), shaderSampledImageArrayNonUniformIndexing != null ? shaderSampledImageArrayNonUniformIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderSampledImageArrayNonUniformIndexingQ() {
        return getShaderSampledImageArrayNonUniformIndexing().getValue();
    }

    public void setShaderSampledImageArrayNonUniformIndexing(int shaderSampledImageArrayNonUniformIndexing) {
        getShaderSampledImageArrayNonUniformIndexing().setValue(shaderSampledImageArrayNonUniformIndexing);
    }

    protected static native long getShaderSampledImageArrayNonUniformIndexing(long address);
    protected static native void setShaderSampledImageArrayNonUniformIndexing(long address, long shaderSampledImageArrayNonUniformIndexing);

    public VkBool32 getShaderStorageBufferArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageBufferArrayNonUniformIndexing(getVkAddress()));
    }

    
    public void setShaderStorageBufferArrayNonUniformIndexing(VkBool32 shaderStorageBufferArrayNonUniformIndexing) {
        setShaderStorageBufferArrayNonUniformIndexing(getVkAddress(), shaderStorageBufferArrayNonUniformIndexing != null ? shaderStorageBufferArrayNonUniformIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageBufferArrayNonUniformIndexingQ() {
        return getShaderStorageBufferArrayNonUniformIndexing().getValue();
    }

    public void setShaderStorageBufferArrayNonUniformIndexing(int shaderStorageBufferArrayNonUniformIndexing) {
        getShaderStorageBufferArrayNonUniformIndexing().setValue(shaderStorageBufferArrayNonUniformIndexing);
    }

    protected static native long getShaderStorageBufferArrayNonUniformIndexing(long address);
    protected static native void setShaderStorageBufferArrayNonUniformIndexing(long address, long shaderStorageBufferArrayNonUniformIndexing);

    public VkBool32 getShaderStorageImageArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageImageArrayNonUniformIndexing(getVkAddress()));
    }

    
    public void setShaderStorageImageArrayNonUniformIndexing(VkBool32 shaderStorageImageArrayNonUniformIndexing) {
        setShaderStorageImageArrayNonUniformIndexing(getVkAddress(), shaderStorageImageArrayNonUniformIndexing != null ? shaderStorageImageArrayNonUniformIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageImageArrayNonUniformIndexingQ() {
        return getShaderStorageImageArrayNonUniformIndexing().getValue();
    }

    public void setShaderStorageImageArrayNonUniformIndexing(int shaderStorageImageArrayNonUniformIndexing) {
        getShaderStorageImageArrayNonUniformIndexing().setValue(shaderStorageImageArrayNonUniformIndexing);
    }

    protected static native long getShaderStorageImageArrayNonUniformIndexing(long address);
    protected static native void setShaderStorageImageArrayNonUniformIndexing(long address, long shaderStorageImageArrayNonUniformIndexing);

    public VkBool32 getShaderInputAttachmentArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderInputAttachmentArrayNonUniformIndexing(getVkAddress()));
    }

    
    public void setShaderInputAttachmentArrayNonUniformIndexing(VkBool32 shaderInputAttachmentArrayNonUniformIndexing) {
        setShaderInputAttachmentArrayNonUniformIndexing(getVkAddress(), shaderInputAttachmentArrayNonUniformIndexing != null ? shaderInputAttachmentArrayNonUniformIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderInputAttachmentArrayNonUniformIndexingQ() {
        return getShaderInputAttachmentArrayNonUniformIndexing().getValue();
    }

    public void setShaderInputAttachmentArrayNonUniformIndexing(int shaderInputAttachmentArrayNonUniformIndexing) {
        getShaderInputAttachmentArrayNonUniformIndexing().setValue(shaderInputAttachmentArrayNonUniformIndexing);
    }

    protected static native long getShaderInputAttachmentArrayNonUniformIndexing(long address);
    protected static native void setShaderInputAttachmentArrayNonUniformIndexing(long address, long shaderInputAttachmentArrayNonUniformIndexing);

    public VkBool32 getShaderUniformTexelBufferArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderUniformTexelBufferArrayNonUniformIndexing(getVkAddress()));
    }

    
    public void setShaderUniformTexelBufferArrayNonUniformIndexing(VkBool32 shaderUniformTexelBufferArrayNonUniformIndexing) {
        setShaderUniformTexelBufferArrayNonUniformIndexing(getVkAddress(), shaderUniformTexelBufferArrayNonUniformIndexing != null ? shaderUniformTexelBufferArrayNonUniformIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderUniformTexelBufferArrayNonUniformIndexingQ() {
        return getShaderUniformTexelBufferArrayNonUniformIndexing().getValue();
    }

    public void setShaderUniformTexelBufferArrayNonUniformIndexing(int shaderUniformTexelBufferArrayNonUniformIndexing) {
        getShaderUniformTexelBufferArrayNonUniformIndexing().setValue(shaderUniformTexelBufferArrayNonUniformIndexing);
    }

    protected static native long getShaderUniformTexelBufferArrayNonUniformIndexing(long address);
    protected static native void setShaderUniformTexelBufferArrayNonUniformIndexing(long address, long shaderUniformTexelBufferArrayNonUniformIndexing);

    public VkBool32 getShaderStorageTexelBufferArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageTexelBufferArrayNonUniformIndexing(getVkAddress()));
    }

    
    public void setShaderStorageTexelBufferArrayNonUniformIndexing(VkBool32 shaderStorageTexelBufferArrayNonUniformIndexing) {
        setShaderStorageTexelBufferArrayNonUniformIndexing(getVkAddress(), shaderStorageTexelBufferArrayNonUniformIndexing != null ? shaderStorageTexelBufferArrayNonUniformIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageTexelBufferArrayNonUniformIndexingQ() {
        return getShaderStorageTexelBufferArrayNonUniformIndexing().getValue();
    }

    public void setShaderStorageTexelBufferArrayNonUniformIndexing(int shaderStorageTexelBufferArrayNonUniformIndexing) {
        getShaderStorageTexelBufferArrayNonUniformIndexing().setValue(shaderStorageTexelBufferArrayNonUniformIndexing);
    }

    protected static native long getShaderStorageTexelBufferArrayNonUniformIndexing(long address);
    protected static native void setShaderStorageTexelBufferArrayNonUniformIndexing(long address, long shaderStorageTexelBufferArrayNonUniformIndexing);

    public VkBool32 getDescriptorBindingUniformBufferUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingUniformBufferUpdateAfterBind(getVkAddress()));
    }

    
    public void setDescriptorBindingUniformBufferUpdateAfterBind(VkBool32 descriptorBindingUniformBufferUpdateAfterBind) {
        setDescriptorBindingUniformBufferUpdateAfterBind(getVkAddress(), descriptorBindingUniformBufferUpdateAfterBind != null ? descriptorBindingUniformBufferUpdateAfterBind.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingUniformBufferUpdateAfterBindQ() {
        return getDescriptorBindingUniformBufferUpdateAfterBind().getValue();
    }

    public void setDescriptorBindingUniformBufferUpdateAfterBind(int descriptorBindingUniformBufferUpdateAfterBind) {
        getDescriptorBindingUniformBufferUpdateAfterBind().setValue(descriptorBindingUniformBufferUpdateAfterBind);
    }

    protected static native long getDescriptorBindingUniformBufferUpdateAfterBind(long address);
    protected static native void setDescriptorBindingUniformBufferUpdateAfterBind(long address, long descriptorBindingUniformBufferUpdateAfterBind);

    public VkBool32 getDescriptorBindingSampledImageUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingSampledImageUpdateAfterBind(getVkAddress()));
    }

    
    public void setDescriptorBindingSampledImageUpdateAfterBind(VkBool32 descriptorBindingSampledImageUpdateAfterBind) {
        setDescriptorBindingSampledImageUpdateAfterBind(getVkAddress(), descriptorBindingSampledImageUpdateAfterBind != null ? descriptorBindingSampledImageUpdateAfterBind.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingSampledImageUpdateAfterBindQ() {
        return getDescriptorBindingSampledImageUpdateAfterBind().getValue();
    }

    public void setDescriptorBindingSampledImageUpdateAfterBind(int descriptorBindingSampledImageUpdateAfterBind) {
        getDescriptorBindingSampledImageUpdateAfterBind().setValue(descriptorBindingSampledImageUpdateAfterBind);
    }

    protected static native long getDescriptorBindingSampledImageUpdateAfterBind(long address);
    protected static native void setDescriptorBindingSampledImageUpdateAfterBind(long address, long descriptorBindingSampledImageUpdateAfterBind);

    public VkBool32 getDescriptorBindingStorageImageUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingStorageImageUpdateAfterBind(getVkAddress()));
    }

    
    public void setDescriptorBindingStorageImageUpdateAfterBind(VkBool32 descriptorBindingStorageImageUpdateAfterBind) {
        setDescriptorBindingStorageImageUpdateAfterBind(getVkAddress(), descriptorBindingStorageImageUpdateAfterBind != null ? descriptorBindingStorageImageUpdateAfterBind.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingStorageImageUpdateAfterBindQ() {
        return getDescriptorBindingStorageImageUpdateAfterBind().getValue();
    }

    public void setDescriptorBindingStorageImageUpdateAfterBind(int descriptorBindingStorageImageUpdateAfterBind) {
        getDescriptorBindingStorageImageUpdateAfterBind().setValue(descriptorBindingStorageImageUpdateAfterBind);
    }

    protected static native long getDescriptorBindingStorageImageUpdateAfterBind(long address);
    protected static native void setDescriptorBindingStorageImageUpdateAfterBind(long address, long descriptorBindingStorageImageUpdateAfterBind);

    public VkBool32 getDescriptorBindingStorageBufferUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingStorageBufferUpdateAfterBind(getVkAddress()));
    }

    
    public void setDescriptorBindingStorageBufferUpdateAfterBind(VkBool32 descriptorBindingStorageBufferUpdateAfterBind) {
        setDescriptorBindingStorageBufferUpdateAfterBind(getVkAddress(), descriptorBindingStorageBufferUpdateAfterBind != null ? descriptorBindingStorageBufferUpdateAfterBind.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingStorageBufferUpdateAfterBindQ() {
        return getDescriptorBindingStorageBufferUpdateAfterBind().getValue();
    }

    public void setDescriptorBindingStorageBufferUpdateAfterBind(int descriptorBindingStorageBufferUpdateAfterBind) {
        getDescriptorBindingStorageBufferUpdateAfterBind().setValue(descriptorBindingStorageBufferUpdateAfterBind);
    }

    protected static native long getDescriptorBindingStorageBufferUpdateAfterBind(long address);
    protected static native void setDescriptorBindingStorageBufferUpdateAfterBind(long address, long descriptorBindingStorageBufferUpdateAfterBind);

    public VkBool32 getDescriptorBindingUniformTexelBufferUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingUniformTexelBufferUpdateAfterBind(getVkAddress()));
    }

    
    public void setDescriptorBindingUniformTexelBufferUpdateAfterBind(VkBool32 descriptorBindingUniformTexelBufferUpdateAfterBind) {
        setDescriptorBindingUniformTexelBufferUpdateAfterBind(getVkAddress(), descriptorBindingUniformTexelBufferUpdateAfterBind != null ? descriptorBindingUniformTexelBufferUpdateAfterBind.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingUniformTexelBufferUpdateAfterBindQ() {
        return getDescriptorBindingUniformTexelBufferUpdateAfterBind().getValue();
    }

    public void setDescriptorBindingUniformTexelBufferUpdateAfterBind(int descriptorBindingUniformTexelBufferUpdateAfterBind) {
        getDescriptorBindingUniformTexelBufferUpdateAfterBind().setValue(descriptorBindingUniformTexelBufferUpdateAfterBind);
    }

    protected static native long getDescriptorBindingUniformTexelBufferUpdateAfterBind(long address);
    protected static native void setDescriptorBindingUniformTexelBufferUpdateAfterBind(long address, long descriptorBindingUniformTexelBufferUpdateAfterBind);

    public VkBool32 getDescriptorBindingStorageTexelBufferUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingStorageTexelBufferUpdateAfterBind(getVkAddress()));
    }

    
    public void setDescriptorBindingStorageTexelBufferUpdateAfterBind(VkBool32 descriptorBindingStorageTexelBufferUpdateAfterBind) {
        setDescriptorBindingStorageTexelBufferUpdateAfterBind(getVkAddress(), descriptorBindingStorageTexelBufferUpdateAfterBind != null ? descriptorBindingStorageTexelBufferUpdateAfterBind.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingStorageTexelBufferUpdateAfterBindQ() {
        return getDescriptorBindingStorageTexelBufferUpdateAfterBind().getValue();
    }

    public void setDescriptorBindingStorageTexelBufferUpdateAfterBind(int descriptorBindingStorageTexelBufferUpdateAfterBind) {
        getDescriptorBindingStorageTexelBufferUpdateAfterBind().setValue(descriptorBindingStorageTexelBufferUpdateAfterBind);
    }

    protected static native long getDescriptorBindingStorageTexelBufferUpdateAfterBind(long address);
    protected static native void setDescriptorBindingStorageTexelBufferUpdateAfterBind(long address, long descriptorBindingStorageTexelBufferUpdateAfterBind);

    public VkBool32 getDescriptorBindingUpdateUnusedWhilePending() {
        return new VkBool32(getVkMemory(), getDescriptorBindingUpdateUnusedWhilePending(getVkAddress()));
    }

    
    public void setDescriptorBindingUpdateUnusedWhilePending(VkBool32 descriptorBindingUpdateUnusedWhilePending) {
        setDescriptorBindingUpdateUnusedWhilePending(getVkAddress(), descriptorBindingUpdateUnusedWhilePending != null ? descriptorBindingUpdateUnusedWhilePending.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingUpdateUnusedWhilePendingQ() {
        return getDescriptorBindingUpdateUnusedWhilePending().getValue();
    }

    public void setDescriptorBindingUpdateUnusedWhilePending(int descriptorBindingUpdateUnusedWhilePending) {
        getDescriptorBindingUpdateUnusedWhilePending().setValue(descriptorBindingUpdateUnusedWhilePending);
    }

    protected static native long getDescriptorBindingUpdateUnusedWhilePending(long address);
    protected static native void setDescriptorBindingUpdateUnusedWhilePending(long address, long descriptorBindingUpdateUnusedWhilePending);

    public VkBool32 getDescriptorBindingPartiallyBound() {
        return new VkBool32(getVkMemory(), getDescriptorBindingPartiallyBound(getVkAddress()));
    }

    
    public void setDescriptorBindingPartiallyBound(VkBool32 descriptorBindingPartiallyBound) {
        setDescriptorBindingPartiallyBound(getVkAddress(), descriptorBindingPartiallyBound != null ? descriptorBindingPartiallyBound.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingPartiallyBoundQ() {
        return getDescriptorBindingPartiallyBound().getValue();
    }

    public void setDescriptorBindingPartiallyBound(int descriptorBindingPartiallyBound) {
        getDescriptorBindingPartiallyBound().setValue(descriptorBindingPartiallyBound);
    }

    protected static native long getDescriptorBindingPartiallyBound(long address);
    protected static native void setDescriptorBindingPartiallyBound(long address, long descriptorBindingPartiallyBound);

    public VkBool32 getDescriptorBindingVariableDescriptorCount() {
        return new VkBool32(getVkMemory(), getDescriptorBindingVariableDescriptorCount(getVkAddress()));
    }

    
    public void setDescriptorBindingVariableDescriptorCount(VkBool32 descriptorBindingVariableDescriptorCount) {
        setDescriptorBindingVariableDescriptorCount(getVkAddress(), descriptorBindingVariableDescriptorCount != null ? descriptorBindingVariableDescriptorCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorBindingVariableDescriptorCountQ() {
        return getDescriptorBindingVariableDescriptorCount().getValue();
    }

    public void setDescriptorBindingVariableDescriptorCount(int descriptorBindingVariableDescriptorCount) {
        getDescriptorBindingVariableDescriptorCount().setValue(descriptorBindingVariableDescriptorCount);
    }

    protected static native long getDescriptorBindingVariableDescriptorCount(long address);
    protected static native void setDescriptorBindingVariableDescriptorCount(long address, long descriptorBindingVariableDescriptorCount);

    public VkBool32 getRuntimeDescriptorArray() {
        return new VkBool32(getVkMemory(), getRuntimeDescriptorArray(getVkAddress()));
    }

    
    public void setRuntimeDescriptorArray(VkBool32 runtimeDescriptorArray) {
        setRuntimeDescriptorArray(getVkAddress(), runtimeDescriptorArray != null ? runtimeDescriptorArray.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getRuntimeDescriptorArrayQ() {
        return getRuntimeDescriptorArray().getValue();
    }

    public void setRuntimeDescriptorArray(int runtimeDescriptorArray) {
        getRuntimeDescriptorArray().setValue(runtimeDescriptorArray);
    }

    protected static native long getRuntimeDescriptorArray(long address);
    protected static native void setRuntimeDescriptorArray(long address, long runtimeDescriptorArray);


    public static native long sizeof();

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
            return new VkPhysicalDeviceDescriptorIndexingFeaturesEXT(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
