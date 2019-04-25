package cz.mg.vulkan;

public class VkExternalSemaphoreProperties extends VkObject {
    public VkExternalSemaphoreProperties() {
        super(sizeof());
    }

    protected VkExternalSemaphoreProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalSemaphoreProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalSemaphoreProperties(VkPointer pointer) {
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

    public VkExternalSemaphoreHandleTypeFlags getExportFromImportedHandleTypes() {
        return new VkExternalSemaphoreHandleTypeFlags(getVkMemory(), getExportFromImportedHandleTypes(getVkAddress()));
    }

    
    public void setExportFromImportedHandleTypes(VkExternalSemaphoreHandleTypeFlags exportFromImportedHandleTypes) {
        setExportFromImportedHandleTypes(getVkAddress(), exportFromImportedHandleTypes != null ? exportFromImportedHandleTypes.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getExportFromImportedHandleTypesQ() {
        return getExportFromImportedHandleTypes().getValue();
    }

    public void setExportFromImportedHandleTypes(int exportFromImportedHandleTypes) {
        getExportFromImportedHandleTypes().setValue(exportFromImportedHandleTypes);
    }

    protected static native long getExportFromImportedHandleTypes(long address);
    protected static native void setExportFromImportedHandleTypes(long address, long exportFromImportedHandleTypes);

    public VkExternalSemaphoreHandleTypeFlags getCompatibleHandleTypes() {
        return new VkExternalSemaphoreHandleTypeFlags(getVkMemory(), getCompatibleHandleTypes(getVkAddress()));
    }

    
    public void setCompatibleHandleTypes(VkExternalSemaphoreHandleTypeFlags compatibleHandleTypes) {
        setCompatibleHandleTypes(getVkAddress(), compatibleHandleTypes != null ? compatibleHandleTypes.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCompatibleHandleTypesQ() {
        return getCompatibleHandleTypes().getValue();
    }

    public void setCompatibleHandleTypes(int compatibleHandleTypes) {
        getCompatibleHandleTypes().setValue(compatibleHandleTypes);
    }

    protected static native long getCompatibleHandleTypes(long address);
    protected static native void setCompatibleHandleTypes(long address, long compatibleHandleTypes);

    public VkExternalSemaphoreFeatureFlags getExternalSemaphoreFeatures() {
        return new VkExternalSemaphoreFeatureFlags(getVkMemory(), getExternalSemaphoreFeatures(getVkAddress()));
    }

    
    public void setExternalSemaphoreFeatures(VkExternalSemaphoreFeatureFlags externalSemaphoreFeatures) {
        setExternalSemaphoreFeatures(getVkAddress(), externalSemaphoreFeatures != null ? externalSemaphoreFeatures.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getExternalSemaphoreFeaturesQ() {
        return getExternalSemaphoreFeatures().getValue();
    }

    public void setExternalSemaphoreFeatures(int externalSemaphoreFeatures) {
        getExternalSemaphoreFeatures().setValue(externalSemaphoreFeatures);
    }

    protected static native long getExternalSemaphoreFeatures(long address);
    protected static native void setExternalSemaphoreFeatures(long address, long externalSemaphoreFeatures);


    public static native long sizeof();

    public static class Array extends VkExternalSemaphoreProperties implements cz.mg.collections.array.ReadonlyArray<VkExternalSemaphoreProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalSemaphoreProperties.sizeof()));
            this.count = count;
        }

        public Array(VkExternalSemaphoreProperties o, int count){
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
        public VkExternalSemaphoreProperties get(int i){
            return new VkExternalSemaphoreProperties(getVkMemory(), addressAt(i));
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
