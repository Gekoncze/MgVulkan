package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryProperties.html">khronos documentation</a>
 **/
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


    public VkExternalMemoryProperties(VkExternalMemoryFeatureFlags externalMemoryFeatures, VkExternalMemoryHandleTypeFlags exportFromImportedHandleTypes, VkExternalMemoryHandleTypeFlags compatibleHandleTypes) {
        super(sizeof());
        setExternalMemoryFeatures(externalMemoryFeatures);
        setExportFromImportedHandleTypes(exportFromImportedHandleTypes);
        setCompatibleHandleTypes(compatibleHandleTypes);
    }

    public VkExternalMemoryFeatureFlags getExternalMemoryFeatures() {
        return new VkExternalMemoryFeatureFlags(getVkMemory(), getExternalMemoryFeatures(getVkAddress()));
    }

    
    public void setExternalMemoryFeatures(VkExternalMemoryFeatureFlags externalMemoryFeatures) {
        setExternalMemoryFeatures(getVkAddress(), externalMemoryFeatures != null ? externalMemoryFeatures.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getExternalMemoryFeatures(long address);
    private static native void setExternalMemoryFeatures(long address, long externalMemoryFeatures);

    public VkExternalMemoryHandleTypeFlags getExportFromImportedHandleTypes() {
        return new VkExternalMemoryHandleTypeFlags(getVkMemory(), getExportFromImportedHandleTypes(getVkAddress()));
    }

    
    public void setExportFromImportedHandleTypes(VkExternalMemoryHandleTypeFlags exportFromImportedHandleTypes) {
        setExportFromImportedHandleTypes(getVkAddress(), exportFromImportedHandleTypes != null ? exportFromImportedHandleTypes.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getExportFromImportedHandleTypes(long address);
    private static native void setExportFromImportedHandleTypes(long address, long exportFromImportedHandleTypes);

    public VkExternalMemoryHandleTypeFlags getCompatibleHandleTypes() {
        return new VkExternalMemoryHandleTypeFlags(getVkMemory(), getCompatibleHandleTypes(getVkAddress()));
    }

    
    public void setCompatibleHandleTypes(VkExternalMemoryHandleTypeFlags compatibleHandleTypes) {
        setCompatibleHandleTypes(getVkAddress(), compatibleHandleTypes != null ? compatibleHandleTypes.getVkAddress() : VkPointer.NULL_ADDRESS);
        
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

        public static class Array extends VkExternalMemoryProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
