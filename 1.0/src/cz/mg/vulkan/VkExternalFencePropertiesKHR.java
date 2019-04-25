package cz.mg.vulkan;

public class VkExternalFencePropertiesKHR extends VkObject {
    public VkExternalFencePropertiesKHR() {
        super(sizeof());
    }

    public VkExternalFencePropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalFencePropertiesKHR(VkMemory vkmemory, long vkaddress) {
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

    public VkExternalFenceHandleTypeFlagsKHR getExportFromImportedHandleTypes() {
        return new VkExternalFenceHandleTypeFlagsKHR(getVkMemory(), getExportFromImportedHandleTypes(getVkAddress()));
    }

    
    public void setExportFromImportedHandleTypes(VkExternalFenceHandleTypeFlagsKHR exportFromImportedHandleTypes) {
        setExportFromImportedHandleTypes(getVkAddress(), exportFromImportedHandleTypes != null ? exportFromImportedHandleTypes.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getExportFromImportedHandleTypesQ() {
        return getExportFromImportedHandleTypes().getValue();
    }

    public void setExportFromImportedHandleTypes(int exportFromImportedHandleTypes) {
        getExportFromImportedHandleTypes().setValue(exportFromImportedHandleTypes);
    }

    protected static native long getExportFromImportedHandleTypes(long address);
    protected static native void setExportFromImportedHandleTypes(long address, long exportFromImportedHandleTypes);

    public VkExternalFenceHandleTypeFlagsKHR getCompatibleHandleTypes() {
        return new VkExternalFenceHandleTypeFlagsKHR(getVkMemory(), getCompatibleHandleTypes(getVkAddress()));
    }

    
    public void setCompatibleHandleTypes(VkExternalFenceHandleTypeFlagsKHR compatibleHandleTypes) {
        setCompatibleHandleTypes(getVkAddress(), compatibleHandleTypes != null ? compatibleHandleTypes.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getCompatibleHandleTypesQ() {
        return getCompatibleHandleTypes().getValue();
    }

    public void setCompatibleHandleTypes(int compatibleHandleTypes) {
        getCompatibleHandleTypes().setValue(compatibleHandleTypes);
    }

    protected static native long getCompatibleHandleTypes(long address);
    protected static native void setCompatibleHandleTypes(long address, long compatibleHandleTypes);

    public VkExternalFenceFeatureFlagsKHR getExternalFenceFeatures() {
        return new VkExternalFenceFeatureFlagsKHR(getVkMemory(), getExternalFenceFeatures(getVkAddress()));
    }

    
    public void setExternalFenceFeatures(VkExternalFenceFeatureFlagsKHR externalFenceFeatures) {
        setExternalFenceFeatures(getVkAddress(), externalFenceFeatures != null ? externalFenceFeatures.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getExternalFenceFeaturesQ() {
        return getExternalFenceFeatures().getValue();
    }

    public void setExternalFenceFeatures(int externalFenceFeatures) {
        getExternalFenceFeatures().setValue(externalFenceFeatures);
    }

    protected static native long getExternalFenceFeatures(long address);
    protected static native void setExternalFenceFeatures(long address, long externalFenceFeatures);


    public static native long sizeof();

    public static class Array extends VkExternalFencePropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkExternalFencePropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalFencePropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkExternalFencePropertiesKHR o){
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
        public VkExternalFencePropertiesKHR get(int i){
            return new VkExternalFencePropertiesKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkExternalFencePropertiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkExternalFencePropertiesKHR.Pointer> {
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

            public Array(VkExternalFencePropertiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkExternalFencePropertiesKHR.Pointer get(int i){
                return new VkExternalFencePropertiesKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
