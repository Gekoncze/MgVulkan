package cz.mg.vulkan;

public class VkExternalMemoryPropertiesKHR extends VkObject {
    public VkExternalMemoryPropertiesKHR() {
        super(sizeof());
    }

    protected VkExternalMemoryPropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalMemoryPropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalMemoryPropertiesKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalMemoryFeatureFlagsKHR getExternalMemoryFeatures() {
        return new VkExternalMemoryFeatureFlagsKHR(getVkMemory(), getExternalMemoryFeaturesNative(getVkAddress()));
    }

    
    public void setExternalMemoryFeatures(VkExternalMemoryFeatureFlagsKHR externalMemoryFeatures) {
        setExternalMemoryFeaturesNative(getVkAddress(), externalMemoryFeatures != null ? externalMemoryFeatures.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getExternalMemoryFeaturesQ() {
        return getExternalMemoryFeatures().getValue();
    }

    public void setExternalMemoryFeatures(int externalMemoryFeatures) {
        getExternalMemoryFeatures().setValue(externalMemoryFeatures);
    }

    protected static native long getExternalMemoryFeaturesNative(long address);
    protected static native void setExternalMemoryFeaturesNative(long address, long externalMemoryFeatures);

    public VkExternalMemoryHandleTypeFlagsKHR getExportFromImportedHandleTypes() {
        return new VkExternalMemoryHandleTypeFlagsKHR(getVkMemory(), getExportFromImportedHandleTypesNative(getVkAddress()));
    }

    
    public void setExportFromImportedHandleTypes(VkExternalMemoryHandleTypeFlagsKHR exportFromImportedHandleTypes) {
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

    public VkExternalMemoryHandleTypeFlagsKHR getCompatibleHandleTypes() {
        return new VkExternalMemoryHandleTypeFlagsKHR(getVkMemory(), getCompatibleHandleTypesNative(getVkAddress()));
    }

    
    public void setCompatibleHandleTypes(VkExternalMemoryHandleTypeFlagsKHR compatibleHandleTypes) {
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


    public static native long sizeof();

    public static class Array extends VkExternalMemoryPropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkExternalMemoryPropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalMemoryPropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(VkExternalMemoryPropertiesKHR o, int count){
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
        public VkExternalMemoryPropertiesKHR get(int i){
            return new VkExternalMemoryPropertiesKHR(getVkMemory(), address(i));
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
