package cz.mg.vulkan;

public class VkExternalSemaphorePropertiesKHR extends VkObject {
    public VkExternalSemaphorePropertiesKHR() {
        super(sizeof());
    }

    public VkExternalSemaphorePropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalSemaphorePropertiesKHR(VkMemory vkmemory, long vkaddress) {
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

    public VkExternalSemaphoreHandleTypeFlagsKHR getExportFromImportedHandleTypes() {
        return new VkExternalSemaphoreHandleTypeFlagsKHR(getVkMemory(), getExportFromImportedHandleTypes(getVkAddress()));
    }

    
    public void setExportFromImportedHandleTypes(VkExternalSemaphoreHandleTypeFlagsKHR exportFromImportedHandleTypes) {
        setExportFromImportedHandleTypes(getVkAddress(), exportFromImportedHandleTypes != null ? exportFromImportedHandleTypes.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getExportFromImportedHandleTypesQ() {
        return getExportFromImportedHandleTypes().getValue();
    }

    public void setExportFromImportedHandleTypes(int exportFromImportedHandleTypes) {
        getExportFromImportedHandleTypes().setValue(exportFromImportedHandleTypes);
    }

    private static native long getExportFromImportedHandleTypes(long address);
    private static native void setExportFromImportedHandleTypes(long address, long exportFromImportedHandleTypes);

    public VkExternalSemaphoreHandleTypeFlagsKHR getCompatibleHandleTypes() {
        return new VkExternalSemaphoreHandleTypeFlagsKHR(getVkMemory(), getCompatibleHandleTypes(getVkAddress()));
    }

    
    public void setCompatibleHandleTypes(VkExternalSemaphoreHandleTypeFlagsKHR compatibleHandleTypes) {
        setCompatibleHandleTypes(getVkAddress(), compatibleHandleTypes != null ? compatibleHandleTypes.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getCompatibleHandleTypesQ() {
        return getCompatibleHandleTypes().getValue();
    }

    public void setCompatibleHandleTypes(int compatibleHandleTypes) {
        getCompatibleHandleTypes().setValue(compatibleHandleTypes);
    }

    private static native long getCompatibleHandleTypes(long address);
    private static native void setCompatibleHandleTypes(long address, long compatibleHandleTypes);

    public VkExternalSemaphoreFeatureFlagsKHR getExternalSemaphoreFeatures() {
        return new VkExternalSemaphoreFeatureFlagsKHR(getVkMemory(), getExternalSemaphoreFeatures(getVkAddress()));
    }

    
    public void setExternalSemaphoreFeatures(VkExternalSemaphoreFeatureFlagsKHR externalSemaphoreFeatures) {
        setExternalSemaphoreFeatures(getVkAddress(), externalSemaphoreFeatures != null ? externalSemaphoreFeatures.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getExternalSemaphoreFeaturesQ() {
        return getExternalSemaphoreFeatures().getValue();
    }

    public void setExternalSemaphoreFeatures(int externalSemaphoreFeatures) {
        getExternalSemaphoreFeatures().setValue(externalSemaphoreFeatures);
    }

    private static native long getExternalSemaphoreFeatures(long address);
    private static native void setExternalSemaphoreFeatures(long address, long externalSemaphoreFeatures);


    public static native long sizeof();

    public static class Array extends VkExternalSemaphorePropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkExternalSemaphorePropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalSemaphorePropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkExternalSemaphorePropertiesKHR o){
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
        public VkExternalSemaphorePropertiesKHR get(int i){
            return new VkExternalSemaphorePropertiesKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkExternalSemaphorePropertiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkExternalSemaphorePropertiesKHR.Pointer> {
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

            public Array(VkExternalSemaphorePropertiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkExternalSemaphorePropertiesKHR.Pointer get(int i){
                return new VkExternalSemaphorePropertiesKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
