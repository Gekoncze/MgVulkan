package cz.mg.vulkan;

public class VkExternalImageFormatPropertiesNV extends VkObject {
    public VkExternalImageFormatPropertiesNV() {
        super(sizeof());
    }

    public VkExternalImageFormatPropertiesNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalImageFormatPropertiesNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkImageFormatProperties getImageFormatProperties() {
        return new VkImageFormatProperties(getVkMemory(), getImageFormatProperties(getVkAddress()));
    }

    
    public void setImageFormatProperties(VkImageFormatProperties imageFormatProperties) {
        setImageFormatProperties(getVkAddress(), imageFormatProperties != null ? imageFormatProperties.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getImageFormatProperties(long address);
    private static native void setImageFormatProperties(long address, long imageFormatProperties);

    public VkExternalMemoryFeatureFlagsNV getExternalMemoryFeatures() {
        return new VkExternalMemoryFeatureFlagsNV(getVkMemory(), getExternalMemoryFeatures(getVkAddress()));
    }

    
    public void setExternalMemoryFeatures(VkExternalMemoryFeatureFlagsNV externalMemoryFeatures) {
        setExternalMemoryFeatures(getVkAddress(), externalMemoryFeatures != null ? externalMemoryFeatures.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setExternalMemoryFeatures(int externalMemoryFeatures) {
        getExternalMemoryFeatures().setValue(externalMemoryFeatures);
    }

    private static native long getExternalMemoryFeatures(long address);
    private static native void setExternalMemoryFeatures(long address, long externalMemoryFeatures);

    public VkExternalMemoryHandleTypeFlagsNV getExportFromImportedHandleTypes() {
        return new VkExternalMemoryHandleTypeFlagsNV(getVkMemory(), getExportFromImportedHandleTypes(getVkAddress()));
    }

    
    public void setExportFromImportedHandleTypes(VkExternalMemoryHandleTypeFlagsNV exportFromImportedHandleTypes) {
        setExportFromImportedHandleTypes(getVkAddress(), exportFromImportedHandleTypes != null ? exportFromImportedHandleTypes.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setExportFromImportedHandleTypes(int exportFromImportedHandleTypes) {
        getExportFromImportedHandleTypes().setValue(exportFromImportedHandleTypes);
    }

    private static native long getExportFromImportedHandleTypes(long address);
    private static native void setExportFromImportedHandleTypes(long address, long exportFromImportedHandleTypes);

    public VkExternalMemoryHandleTypeFlagsNV getCompatibleHandleTypes() {
        return new VkExternalMemoryHandleTypeFlagsNV(getVkMemory(), getCompatibleHandleTypes(getVkAddress()));
    }

    
    public void setCompatibleHandleTypes(VkExternalMemoryHandleTypeFlagsNV compatibleHandleTypes) {
        setCompatibleHandleTypes(getVkAddress(), compatibleHandleTypes != null ? compatibleHandleTypes.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setCompatibleHandleTypes(int compatibleHandleTypes) {
        getCompatibleHandleTypes().setValue(compatibleHandleTypes);
    }

    private static native long getCompatibleHandleTypes(long address);
    private static native void setCompatibleHandleTypes(long address, long compatibleHandleTypes);


    public static native long sizeof();

    public static class Array extends VkExternalImageFormatPropertiesNV implements cz.mg.collections.array.ReadonlyArray<VkExternalImageFormatPropertiesNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalImageFormatPropertiesNV.sizeof()));
            this.count = count;
        }

        public Array(int count, VkExternalImageFormatPropertiesNV o){
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
        public VkExternalImageFormatPropertiesNV get(int i){
            return new VkExternalImageFormatPropertiesNV(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkExternalImageFormatPropertiesNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VkExternalImageFormatPropertiesNV.Pointer> {
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

            public Array(VkExternalImageFormatPropertiesNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkExternalImageFormatPropertiesNV.Pointer get(int i){
                return new VkExternalImageFormatPropertiesNV.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
