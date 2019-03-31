package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalImageFormatPropertiesNV.html">khronos documentation</a>
 **/
public class VkExternalImageFormatPropertiesNV extends VkObject {
    public VkExternalImageFormatPropertiesNV() {
        super(sizeof());
    }

    public VkExternalImageFormatPropertiesNV(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkExternalImageFormatPropertiesNV(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkExternalImageFormatPropertiesNV(VkImageFormatProperties imageFormatProperties, VkExternalMemoryFeatureFlagsNV externalMemoryFeatures, VkExternalMemoryHandleTypeFlagsNV exportFromImportedHandleTypes, VkExternalMemoryHandleTypeFlagsNV compatibleHandleTypes) {
        super(sizeof());
        setImageFormatProperties(imageFormatProperties);
        setExternalMemoryFeatures(externalMemoryFeatures);
        setExportFromImportedHandleTypes(exportFromImportedHandleTypes);
        setCompatibleHandleTypes(compatibleHandleTypes);
    }

    public VkImageFormatProperties getImageFormatProperties() {
        return new VkImageFormatProperties(getVkMemory(), getImageFormatProperties(getVkAddress()));
    }

    public void setImageFormatProperties(VkImageFormatProperties imageFormatProperties) {
        setImageFormatProperties(getVkAddress(), imageFormatProperties.getVkAddress());
    }

    private static native long getImageFormatProperties(long address);
    private static native void setImageFormatProperties(long address, long imageFormatProperties);

    public VkExternalMemoryFeatureFlagsNV getExternalMemoryFeatures() {
        return new VkExternalMemoryFeatureFlagsNV(getVkMemory(), getExternalMemoryFeatures(getVkAddress()));
    }

    public void setExternalMemoryFeatures(VkExternalMemoryFeatureFlagsNV externalMemoryFeatures) {
        setExternalMemoryFeatures(getVkAddress(), externalMemoryFeatures.getVkAddress());
    }

    private static native long getExternalMemoryFeatures(long address);
    private static native void setExternalMemoryFeatures(long address, long externalMemoryFeatures);

    public VkExternalMemoryHandleTypeFlagsNV getExportFromImportedHandleTypes() {
        return new VkExternalMemoryHandleTypeFlagsNV(getVkMemory(), getExportFromImportedHandleTypes(getVkAddress()));
    }

    public void setExportFromImportedHandleTypes(VkExternalMemoryHandleTypeFlagsNV exportFromImportedHandleTypes) {
        setExportFromImportedHandleTypes(getVkAddress(), exportFromImportedHandleTypes.getVkAddress());
    }

    private static native long getExportFromImportedHandleTypes(long address);
    private static native void setExportFromImportedHandleTypes(long address, long exportFromImportedHandleTypes);

    public VkExternalMemoryHandleTypeFlagsNV getCompatibleHandleTypes() {
        return new VkExternalMemoryHandleTypeFlagsNV(getVkMemory(), getCompatibleHandleTypes(getVkAddress()));
    }

    public void setCompatibleHandleTypes(VkExternalMemoryHandleTypeFlagsNV compatibleHandleTypes) {
        setCompatibleHandleTypes(getVkAddress(), compatibleHandleTypes.getVkAddress());
    }

    private static native long getCompatibleHandleTypes(long address);
    private static native void setCompatibleHandleTypes(long address, long compatibleHandleTypes);


    public static native long sizeof();

    public static class Array extends VkExternalImageFormatPropertiesNV implements cz.mg.collections.array.ReadonlyArray<VkExternalImageFormatPropertiesNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
