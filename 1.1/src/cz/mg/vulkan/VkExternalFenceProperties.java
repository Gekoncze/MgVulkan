package cz.mg.vulkan;

public class VkExternalFenceProperties extends VkObject {
    public VkExternalFenceProperties() {
        super(sizeof());
    }

    protected VkExternalFenceProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalFenceProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalFenceProperties(VkPointer pointer) {
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

    public VkExternalFenceHandleTypeFlags getExportFromImportedHandleTypes() {
        return new VkExternalFenceHandleTypeFlags(getVkMemory(), getExportFromImportedHandleTypesNative(getVkAddress()));
    }

    
    public void setExportFromImportedHandleTypes(VkExternalFenceHandleTypeFlags exportFromImportedHandleTypes) {
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

    public VkExternalFenceHandleTypeFlags getCompatibleHandleTypes() {
        return new VkExternalFenceHandleTypeFlags(getVkMemory(), getCompatibleHandleTypesNative(getVkAddress()));
    }

    
    public void setCompatibleHandleTypes(VkExternalFenceHandleTypeFlags compatibleHandleTypes) {
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

    public VkExternalFenceFeatureFlags getExternalFenceFeatures() {
        return new VkExternalFenceFeatureFlags(getVkMemory(), getExternalFenceFeaturesNative(getVkAddress()));
    }

    
    public void setExternalFenceFeatures(VkExternalFenceFeatureFlags externalFenceFeatures) {
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

    public static class Array extends VkExternalFenceProperties implements cz.mg.collections.array.ReadonlyArray<VkExternalFenceProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalFenceProperties.sizeof()));
            this.count = count;
        }

        public Array(VkExternalFenceProperties o, int count){
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
        public VkExternalFenceProperties get(int i){
            return new VkExternalFenceProperties(getVkMemory(), address(i));
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
