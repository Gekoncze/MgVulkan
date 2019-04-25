package cz.mg.vulkan;

public class VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT extends VkObject {
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT() {
        super(sizeof());
    }

    protected VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(VkPointer pointer) {
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

    public VkUInt32 getAdvancedBlendMaxColorAttachments() {
        return new VkUInt32(getVkMemory(), getAdvancedBlendMaxColorAttachmentsNative(getVkAddress()));
    }

    
    public void setAdvancedBlendMaxColorAttachments(VkUInt32 advancedBlendMaxColorAttachments) {
        setAdvancedBlendMaxColorAttachmentsNative(getVkAddress(), advancedBlendMaxColorAttachments != null ? advancedBlendMaxColorAttachments.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAdvancedBlendMaxColorAttachmentsQ() {
        return getAdvancedBlendMaxColorAttachments().getValue();
    }

    public void setAdvancedBlendMaxColorAttachments(int advancedBlendMaxColorAttachments) {
        getAdvancedBlendMaxColorAttachments().setValue(advancedBlendMaxColorAttachments);
    }

    protected static native long getAdvancedBlendMaxColorAttachmentsNative(long address);
    protected static native void setAdvancedBlendMaxColorAttachmentsNative(long address, long advancedBlendMaxColorAttachments);

    public VkBool32 getAdvancedBlendIndependentBlend() {
        return new VkBool32(getVkMemory(), getAdvancedBlendIndependentBlendNative(getVkAddress()));
    }

    
    public void setAdvancedBlendIndependentBlend(VkBool32 advancedBlendIndependentBlend) {
        setAdvancedBlendIndependentBlendNative(getVkAddress(), advancedBlendIndependentBlend != null ? advancedBlendIndependentBlend.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAdvancedBlendIndependentBlendQ() {
        return getAdvancedBlendIndependentBlend().getValue();
    }

    public void setAdvancedBlendIndependentBlend(int advancedBlendIndependentBlend) {
        getAdvancedBlendIndependentBlend().setValue(advancedBlendIndependentBlend);
    }

    protected static native long getAdvancedBlendIndependentBlendNative(long address);
    protected static native void setAdvancedBlendIndependentBlendNative(long address, long advancedBlendIndependentBlend);

    public VkBool32 getAdvancedBlendNonPremultipliedSrcColor() {
        return new VkBool32(getVkMemory(), getAdvancedBlendNonPremultipliedSrcColorNative(getVkAddress()));
    }

    
    public void setAdvancedBlendNonPremultipliedSrcColor(VkBool32 advancedBlendNonPremultipliedSrcColor) {
        setAdvancedBlendNonPremultipliedSrcColorNative(getVkAddress(), advancedBlendNonPremultipliedSrcColor != null ? advancedBlendNonPremultipliedSrcColor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAdvancedBlendNonPremultipliedSrcColorQ() {
        return getAdvancedBlendNonPremultipliedSrcColor().getValue();
    }

    public void setAdvancedBlendNonPremultipliedSrcColor(int advancedBlendNonPremultipliedSrcColor) {
        getAdvancedBlendNonPremultipliedSrcColor().setValue(advancedBlendNonPremultipliedSrcColor);
    }

    protected static native long getAdvancedBlendNonPremultipliedSrcColorNative(long address);
    protected static native void setAdvancedBlendNonPremultipliedSrcColorNative(long address, long advancedBlendNonPremultipliedSrcColor);

    public VkBool32 getAdvancedBlendNonPremultipliedDstColor() {
        return new VkBool32(getVkMemory(), getAdvancedBlendNonPremultipliedDstColorNative(getVkAddress()));
    }

    
    public void setAdvancedBlendNonPremultipliedDstColor(VkBool32 advancedBlendNonPremultipliedDstColor) {
        setAdvancedBlendNonPremultipliedDstColorNative(getVkAddress(), advancedBlendNonPremultipliedDstColor != null ? advancedBlendNonPremultipliedDstColor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAdvancedBlendNonPremultipliedDstColorQ() {
        return getAdvancedBlendNonPremultipliedDstColor().getValue();
    }

    public void setAdvancedBlendNonPremultipliedDstColor(int advancedBlendNonPremultipliedDstColor) {
        getAdvancedBlendNonPremultipliedDstColor().setValue(advancedBlendNonPremultipliedDstColor);
    }

    protected static native long getAdvancedBlendNonPremultipliedDstColorNative(long address);
    protected static native void setAdvancedBlendNonPremultipliedDstColorNative(long address, long advancedBlendNonPremultipliedDstColor);

    public VkBool32 getAdvancedBlendCorrelatedOverlap() {
        return new VkBool32(getVkMemory(), getAdvancedBlendCorrelatedOverlapNative(getVkAddress()));
    }

    
    public void setAdvancedBlendCorrelatedOverlap(VkBool32 advancedBlendCorrelatedOverlap) {
        setAdvancedBlendCorrelatedOverlapNative(getVkAddress(), advancedBlendCorrelatedOverlap != null ? advancedBlendCorrelatedOverlap.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAdvancedBlendCorrelatedOverlapQ() {
        return getAdvancedBlendCorrelatedOverlap().getValue();
    }

    public void setAdvancedBlendCorrelatedOverlap(int advancedBlendCorrelatedOverlap) {
        getAdvancedBlendCorrelatedOverlap().setValue(advancedBlendCorrelatedOverlap);
    }

    protected static native long getAdvancedBlendCorrelatedOverlapNative(long address);
    protected static native void setAdvancedBlendCorrelatedOverlapNative(long address, long advancedBlendCorrelatedOverlap);

    public VkBool32 getAdvancedBlendAllOperations() {
        return new VkBool32(getVkMemory(), getAdvancedBlendAllOperationsNative(getVkAddress()));
    }

    
    public void setAdvancedBlendAllOperations(VkBool32 advancedBlendAllOperations) {
        setAdvancedBlendAllOperationsNative(getVkAddress(), advancedBlendAllOperations != null ? advancedBlendAllOperations.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAdvancedBlendAllOperationsQ() {
        return getAdvancedBlendAllOperations().getValue();
    }

    public void setAdvancedBlendAllOperations(int advancedBlendAllOperations) {
        getAdvancedBlendAllOperations().setValue(advancedBlendAllOperations);
    }

    protected static native long getAdvancedBlendAllOperationsNative(long address);
    protected static native void setAdvancedBlendAllOperationsNative(long address, long advancedBlendAllOperations);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT o, int count){
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
        public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT get(int i){
            return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(getVkMemory(), address(i));
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
