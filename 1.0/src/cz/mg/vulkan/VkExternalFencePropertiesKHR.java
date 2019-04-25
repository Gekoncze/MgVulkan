package cz.mg.vulkan;

public class VkExternalFencePropertiesKHR extends VkObject {
    public VkExternalFencePropertiesKHR() {
        super(sizeof());
    }

    protected VkExternalFencePropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalFencePropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalFencePropertiesKHR(VkPointer pointer) {
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

    public VkExternalFenceHandleTypeFlagsKHR getExportFromImportedHandleTypes() {
        return new VkExternalFenceHandleTypeFlagsKHR(getVkMemory(), getExportFromImportedHandleTypesNative(getVkAddress()));
    }

    
    public void setExportFromImportedHandleTypes(VkExternalFenceHandleTypeFlagsKHR exportFromImportedHandleTypes) {
        setExportFromImportedHandleTypesNative(getVkAddress(), exportFromImportedHandleTypes != null ? exportFromImportedHandleTypes.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getExportFromImportedHandleTypesQ() {
        return getExportFromImportedHandleTypes().getValue();
    }

    public void setExportFromImportedHandleTypes(int exportFromImportedHandleTypes) {
        getExportFromImportedHandleTypes().setValue(exportFromImportedHandleTypes);
    }

    protected static native long getExportFromImportedHandleTypesNative(long address);
    protected static native void setExportFromImportedHandleTypesNative(long address, long exportFromImportedHandleTypes);

    public VkExternalFenceHandleTypeFlagsKHR getCompatibleHandleTypes() {
        return new VkExternalFenceHandleTypeFlagsKHR(getVkMemory(), getCompatibleHandleTypesNative(getVkAddress()));
    }

    
    public void setCompatibleHandleTypes(VkExternalFenceHandleTypeFlagsKHR compatibleHandleTypes) {
        setCompatibleHandleTypesNative(getVkAddress(), compatibleHandleTypes != null ? compatibleHandleTypes.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCompatibleHandleTypesQ() {
        return getCompatibleHandleTypes().getValue();
    }

    public void setCompatibleHandleTypes(int compatibleHandleTypes) {
        getCompatibleHandleTypes().setValue(compatibleHandleTypes);
    }

    protected static native long getCompatibleHandleTypesNative(long address);
    protected static native void setCompatibleHandleTypesNative(long address, long compatibleHandleTypes);

    public VkExternalFenceFeatureFlagsKHR getExternalFenceFeatures() {
        return new VkExternalFenceFeatureFlagsKHR(getVkMemory(), getExternalFenceFeaturesNative(getVkAddress()));
    }

    
    public void setExternalFenceFeatures(VkExternalFenceFeatureFlagsKHR externalFenceFeatures) {
        setExternalFenceFeaturesNative(getVkAddress(), externalFenceFeatures != null ? externalFenceFeatures.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getExternalFenceFeaturesQ() {
        return getExternalFenceFeatures().getValue();
    }

    public void setExternalFenceFeatures(int externalFenceFeatures) {
        getExternalFenceFeatures().setValue(externalFenceFeatures);
    }

    protected static native long getExternalFenceFeaturesNative(long address);
    protected static native void setExternalFenceFeaturesNative(long address, long externalFenceFeatures);


    public static native long sizeof();

    public static class Array extends VkExternalFencePropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkExternalFencePropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalFencePropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(VkExternalFencePropertiesKHR o, int count){
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
        public VkExternalFencePropertiesKHR get(int i){
            return new VkExternalFencePropertiesKHR(getVkMemory(), address(i));
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
