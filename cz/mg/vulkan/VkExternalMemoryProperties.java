package cz.mg.vulkan;

public class VkExternalMemoryProperties extends VkObject {
    public VkExternalMemoryProperties() {
        super(sizeof());
    }

    public VkExternalMemoryProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalMemoryProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkExternalMemoryFeatureFlags getExternalMemoryFeatures() {
        return new VkExternalMemoryFeatureFlags(getVkMemory(), getExternalMemoryFeatures(getVkAddress()));
    }

    
    public void setExternalMemoryFeatures(VkExternalMemoryFeatureFlags externalMemoryFeatures) {
        setExternalMemoryFeatures(getVkAddress(), externalMemoryFeatures != null ? externalMemoryFeatures.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getExternalMemoryFeaturesQ() {
        return getExternalMemoryFeatures().getValue();
    }

    public void setExternalMemoryFeatures(int externalMemoryFeatures) {
        getExternalMemoryFeatures().setValue(externalMemoryFeatures);
    }

    private static native long getExternalMemoryFeatures(long address);
    private static native void setExternalMemoryFeatures(long address, long externalMemoryFeatures);

    public VkExternalMemoryHandleTypeFlags getExportFromImportedHandleTypes() {
        return new VkExternalMemoryHandleTypeFlags(getVkMemory(), getExportFromImportedHandleTypes(getVkAddress()));
    }

    
    public void setExportFromImportedHandleTypes(VkExternalMemoryHandleTypeFlags exportFromImportedHandleTypes) {
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

    public VkExternalMemoryHandleTypeFlags getCompatibleHandleTypes() {
        return new VkExternalMemoryHandleTypeFlags(getVkMemory(), getCompatibleHandleTypes(getVkAddress()));
    }

    
    public void setCompatibleHandleTypes(VkExternalMemoryHandleTypeFlags compatibleHandleTypes) {
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


    public static native long sizeof();

    public static class Array extends VkExternalMemoryProperties implements cz.mg.collections.array.ReadonlyArray<VkExternalMemoryProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalMemoryProperties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkExternalMemoryProperties o){
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
        public VkExternalMemoryProperties get(int i){
            return new VkExternalMemoryProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkExternalMemoryProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkExternalMemoryProperties.Pointer> {
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

            public Array(VkExternalMemoryProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkExternalMemoryProperties.Pointer get(int i){
                return new VkExternalMemoryProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
