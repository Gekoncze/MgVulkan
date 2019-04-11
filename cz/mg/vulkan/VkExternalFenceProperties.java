package cz.mg.vulkan;

public class VkExternalFenceProperties extends VkObject {
    public VkExternalFenceProperties() {
        super(sizeof());
    }

    public VkExternalFenceProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalFenceProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkExternalFenceProperties(VkStructureType sType, VkObject pNext, VkExternalFenceHandleTypeFlags exportFromImportedHandleTypes, VkExternalFenceHandleTypeFlags compatibleHandleTypes, VkExternalFenceFeatureFlags externalFenceFeatures) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setExportFromImportedHandleTypes(exportFromImportedHandleTypes);
        setCompatibleHandleTypes(compatibleHandleTypes);
        setExternalFenceFeatures(externalFenceFeatures);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
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

    public VkExternalFenceHandleTypeFlags getExportFromImportedHandleTypes() {
        return new VkExternalFenceHandleTypeFlags(getVkMemory(), getExportFromImportedHandleTypes(getVkAddress()));
    }

    
    public void setExportFromImportedHandleTypes(VkExternalFenceHandleTypeFlags exportFromImportedHandleTypes) {
        setExportFromImportedHandleTypes(getVkAddress(), exportFromImportedHandleTypes != null ? exportFromImportedHandleTypes.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getExportFromImportedHandleTypes(long address);
    private static native void setExportFromImportedHandleTypes(long address, long exportFromImportedHandleTypes);

    public VkExternalFenceHandleTypeFlags getCompatibleHandleTypes() {
        return new VkExternalFenceHandleTypeFlags(getVkMemory(), getCompatibleHandleTypes(getVkAddress()));
    }

    
    public void setCompatibleHandleTypes(VkExternalFenceHandleTypeFlags compatibleHandleTypes) {
        setCompatibleHandleTypes(getVkAddress(), compatibleHandleTypes != null ? compatibleHandleTypes.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getCompatibleHandleTypes(long address);
    private static native void setCompatibleHandleTypes(long address, long compatibleHandleTypes);

    public VkExternalFenceFeatureFlags getExternalFenceFeatures() {
        return new VkExternalFenceFeatureFlags(getVkMemory(), getExternalFenceFeatures(getVkAddress()));
    }

    
    public void setExternalFenceFeatures(VkExternalFenceFeatureFlags externalFenceFeatures) {
        setExternalFenceFeatures(getVkAddress(), externalFenceFeatures != null ? externalFenceFeatures.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getExternalFenceFeatures(long address);
    private static native void setExternalFenceFeatures(long address, long externalFenceFeatures);


    public static native long sizeof();

    public static class Array extends VkExternalFenceProperties implements cz.mg.collections.array.ReadonlyArray<VkExternalFenceProperties> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalFenceProperties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkExternalFenceProperties o){
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
        public VkExternalFenceProperties get(int i){
            return new VkExternalFenceProperties(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkExternalFenceProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkExternalFenceProperties.Pointer> {
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

            public Array(VkExternalFenceProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkExternalFenceProperties.Pointer get(int i){
                return new VkExternalFenceProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
