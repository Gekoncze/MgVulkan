package cz.mg.vulkan.vk;

public class VkExternalSemaphoreProperties extends VkObject {
    public VkExternalSemaphoreProperties() {
        super(sizeof());
    }

    public VkExternalSemaphoreProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalSemaphoreProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkExternalSemaphoreProperties(VkStructureType sType, VkObject pNext, VkExternalSemaphoreHandleTypeFlags exportFromImportedHandleTypes, VkExternalSemaphoreHandleTypeFlags compatibleHandleTypes, VkExternalSemaphoreFeatureFlags externalSemaphoreFeatures) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setExportFromImportedHandleTypes(exportFromImportedHandleTypes);
        setCompatibleHandleTypes(compatibleHandleTypes);
        setExternalSemaphoreFeatures(externalSemaphoreFeatures);
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

    public VkExternalSemaphoreHandleTypeFlags getExportFromImportedHandleTypes() {
        return new VkExternalSemaphoreHandleTypeFlags(getVkMemory(), getExportFromImportedHandleTypes(getVkAddress()));
    }

    
    public void setExportFromImportedHandleTypes(VkExternalSemaphoreHandleTypeFlags exportFromImportedHandleTypes) {
        setExportFromImportedHandleTypes(getVkAddress(), exportFromImportedHandleTypes != null ? exportFromImportedHandleTypes.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getExportFromImportedHandleTypes(long address);
    private static native void setExportFromImportedHandleTypes(long address, long exportFromImportedHandleTypes);

    public VkExternalSemaphoreHandleTypeFlags getCompatibleHandleTypes() {
        return new VkExternalSemaphoreHandleTypeFlags(getVkMemory(), getCompatibleHandleTypes(getVkAddress()));
    }

    
    public void setCompatibleHandleTypes(VkExternalSemaphoreHandleTypeFlags compatibleHandleTypes) {
        setCompatibleHandleTypes(getVkAddress(), compatibleHandleTypes != null ? compatibleHandleTypes.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getCompatibleHandleTypes(long address);
    private static native void setCompatibleHandleTypes(long address, long compatibleHandleTypes);

    public VkExternalSemaphoreFeatureFlags getExternalSemaphoreFeatures() {
        return new VkExternalSemaphoreFeatureFlags(getVkMemory(), getExternalSemaphoreFeatures(getVkAddress()));
    }

    
    public void setExternalSemaphoreFeatures(VkExternalSemaphoreFeatureFlags externalSemaphoreFeatures) {
        setExternalSemaphoreFeatures(getVkAddress(), externalSemaphoreFeatures != null ? externalSemaphoreFeatures.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getExternalSemaphoreFeatures(long address);
    private static native void setExternalSemaphoreFeatures(long address, long externalSemaphoreFeatures);


    public static native long sizeof();

    public static class Array extends VkExternalSemaphoreProperties implements cz.mg.collections.array.ReadonlyArray<VkExternalSemaphoreProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalSemaphoreProperties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkExternalSemaphoreProperties o){
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
        public VkExternalSemaphoreProperties get(int i){
            return new VkExternalSemaphoreProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkExternalSemaphoreProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkExternalSemaphoreProperties.Pointer> {
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

            public Array(VkExternalSemaphoreProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkExternalSemaphoreProperties.Pointer get(int i){
                return new VkExternalSemaphoreProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
