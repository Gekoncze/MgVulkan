package cz.mg.vulkan;

public class VkExternalImageFormatPropertiesNV extends VkObject {
    public VkExternalImageFormatPropertiesNV() {
        super(sizeof());
    }

    protected VkExternalImageFormatPropertiesNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalImageFormatPropertiesNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalImageFormatPropertiesNV(VkPointer pointer) {
        super(pointer);
    }



    public VkImageFormatProperties getImageFormatProperties() {
        return new VkImageFormatProperties(getVkMemory(), getImageFormatProperties(getVkAddress()));
    }

    
    public void setImageFormatProperties(VkImageFormatProperties imageFormatProperties) {
        setImageFormatProperties(getVkAddress(), imageFormatProperties != null ? imageFormatProperties.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImageFormatProperties(long address);
    protected static native void setImageFormatProperties(long address, long imageFormatProperties);

    public VkExternalMemoryFeatureFlagsNV getExternalMemoryFeatures() {
        return new VkExternalMemoryFeatureFlagsNV(getVkMemory(), getExternalMemoryFeatures(getVkAddress()));
    }

    
    public void setExternalMemoryFeatures(VkExternalMemoryFeatureFlagsNV externalMemoryFeatures) {
        setExternalMemoryFeatures(getVkAddress(), externalMemoryFeatures != null ? externalMemoryFeatures.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getExternalMemoryFeaturesQ() {
        return getExternalMemoryFeatures().getValue();
    }

    public void setExternalMemoryFeatures(int externalMemoryFeatures) {
        getExternalMemoryFeatures().setValue(externalMemoryFeatures);
    }

    protected static native long getExternalMemoryFeatures(long address);
    protected static native void setExternalMemoryFeatures(long address, long externalMemoryFeatures);

    public VkExternalMemoryHandleTypeFlagsNV getExportFromImportedHandleTypes() {
        return new VkExternalMemoryHandleTypeFlagsNV(getVkMemory(), getExportFromImportedHandleTypes(getVkAddress()));
    }

    
    public void setExportFromImportedHandleTypes(VkExternalMemoryHandleTypeFlagsNV exportFromImportedHandleTypes) {
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

    public VkExternalMemoryHandleTypeFlagsNV getCompatibleHandleTypes() {
        return new VkExternalMemoryHandleTypeFlagsNV(getVkMemory(), getCompatibleHandleTypes(getVkAddress()));
    }

    
    public void setCompatibleHandleTypes(VkExternalMemoryHandleTypeFlagsNV compatibleHandleTypes) {
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


    public static native long sizeof();

    public static class Array extends VkExternalImageFormatPropertiesNV implements cz.mg.collections.array.ReadonlyArray<VkExternalImageFormatPropertiesNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalImageFormatPropertiesNV.sizeof()));
            this.count = count;
        }

        public Array(VkExternalImageFormatPropertiesNV o, int count){
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
        public VkExternalImageFormatPropertiesNV get(int i){
            return new VkExternalImageFormatPropertiesNV(getVkMemory(), addressAt(i));
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
