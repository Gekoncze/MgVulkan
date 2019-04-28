package cz.mg.vulkan;

public class VkExternalMemoryProperties extends VkObject {
    public VkExternalMemoryProperties() {
        super(sizeof());
    }

    protected VkExternalMemoryProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalMemoryProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalMemoryProperties(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalMemoryFeatureFlags getExternalMemoryFeatures() {
        return new VkExternalMemoryFeatureFlags(getVkMemory(), getExternalMemoryFeaturesNative(getVkAddress()));
    }

    
    public void setExternalMemoryFeatures(VkExternalMemoryFeatureFlags externalMemoryFeatures) {
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

    public VkExternalMemoryHandleTypeFlags getExportFromImportedHandleTypes() {
        return new VkExternalMemoryHandleTypeFlags(getVkMemory(), getExportFromImportedHandleTypesNative(getVkAddress()));
    }

    
    public void setExportFromImportedHandleTypes(VkExternalMemoryHandleTypeFlags exportFromImportedHandleTypes) {
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

    public VkExternalMemoryHandleTypeFlags getCompatibleHandleTypes() {
        return new VkExternalMemoryHandleTypeFlags(getVkMemory(), getCompatibleHandleTypesNative(getVkAddress()));
    }

    
    public void setCompatibleHandleTypes(VkExternalMemoryHandleTypeFlags compatibleHandleTypes) {
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

    public static class Array extends VkExternalMemoryProperties implements cz.mg.collections.array.ReadonlyArray<VkExternalMemoryProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalMemoryProperties.sizeof()));
            this.count = count;
        }

        public Array(VkExternalMemoryProperties o, int count){
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
        public VkExternalMemoryProperties get(int i){
            return new VkExternalMemoryProperties(getVkMemory(), address(i));
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
