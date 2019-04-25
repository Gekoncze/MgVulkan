package cz.mg.vulkan;

public class VkDisplayPropertiesKHR extends VkObject {
    public VkDisplayPropertiesKHR() {
        super(sizeof());
    }

    protected VkDisplayPropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDisplayPropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDisplayPropertiesKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkDisplayKHR getDisplay() {
        return new VkDisplayKHR(getVkMemory(), getDisplayNative(getVkAddress()));
    }

    
    public void setDisplay(VkDisplayKHR display) {
        setDisplayNative(getVkAddress(), display != null ? display.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDisplayNative(long address);
    protected static native void setDisplayNative(long address, long display);

    public VkChar getDisplayName() {
        return new VkChar(getVkMemory(), getDisplayNameNative(getVkAddress()));
    }

    private VkObject displayName = null;
    public void setDisplayName(VkChar displayName) {
        setDisplayNameNative(getVkAddress(), displayName != null ? displayName.getVkAddress() : VkPointer.NULL);
        this.displayName = displayName;
    }

    public String getDisplayNameQ() {
        return new VkString(getDisplayName()).toString();
    }

    public void setDisplayName(String displayName) {
        setDisplayName(new VkString(displayName));
    }

    protected static native long getDisplayNameNative(long address);
    protected static native void setDisplayNameNative(long address, long displayName);

    public VkExtent2D getPhysicalDimensions() {
        return new VkExtent2D(getVkMemory(), getPhysicalDimensionsNative(getVkAddress()));
    }

    
    public void setPhysicalDimensions(VkExtent2D physicalDimensions) {
        setPhysicalDimensionsNative(getVkAddress(), physicalDimensions != null ? physicalDimensions.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPhysicalDimensionsNative(long address);
    protected static native void setPhysicalDimensionsNative(long address, long physicalDimensions);

    public VkExtent2D getPhysicalResolution() {
        return new VkExtent2D(getVkMemory(), getPhysicalResolutionNative(getVkAddress()));
    }

    
    public void setPhysicalResolution(VkExtent2D physicalResolution) {
        setPhysicalResolutionNative(getVkAddress(), physicalResolution != null ? physicalResolution.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPhysicalResolutionNative(long address);
    protected static native void setPhysicalResolutionNative(long address, long physicalResolution);

    public VkSurfaceTransformFlagsKHR getSupportedTransforms() {
        return new VkSurfaceTransformFlagsKHR(getVkMemory(), getSupportedTransformsNative(getVkAddress()));
    }

    
    public void setSupportedTransforms(VkSurfaceTransformFlagsKHR supportedTransforms) {
        setSupportedTransformsNative(getVkAddress(), supportedTransforms != null ? supportedTransforms.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSupportedTransformsQ() {
        return getSupportedTransforms().getValue();
    }

    public void setSupportedTransforms(int supportedTransforms) {
        getSupportedTransforms().setValue(supportedTransforms);
    }

    protected static native long getSupportedTransformsNative(long address);
    protected static native void setSupportedTransformsNative(long address, long supportedTransforms);

    public VkBool32 getPlaneReorderPossible() {
        return new VkBool32(getVkMemory(), getPlaneReorderPossibleNative(getVkAddress()));
    }

    
    public void setPlaneReorderPossible(VkBool32 planeReorderPossible) {
        setPlaneReorderPossibleNative(getVkAddress(), planeReorderPossible != null ? planeReorderPossible.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPlaneReorderPossibleQ() {
        return getPlaneReorderPossible().getValue();
    }

    public void setPlaneReorderPossible(int planeReorderPossible) {
        getPlaneReorderPossible().setValue(planeReorderPossible);
    }

    protected static native long getPlaneReorderPossibleNative(long address);
    protected static native void setPlaneReorderPossibleNative(long address, long planeReorderPossible);

    public VkBool32 getPersistentContent() {
        return new VkBool32(getVkMemory(), getPersistentContentNative(getVkAddress()));
    }

    
    public void setPersistentContent(VkBool32 persistentContent) {
        setPersistentContentNative(getVkAddress(), persistentContent != null ? persistentContent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPersistentContentQ() {
        return getPersistentContent().getValue();
    }

    public void setPersistentContent(int persistentContent) {
        getPersistentContent().setValue(persistentContent);
    }

    protected static native long getPersistentContentNative(long address);
    protected static native void setPersistentContentNative(long address, long persistentContent);


    public static native long sizeof();

    public static class Array extends VkDisplayPropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayPropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayPropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(VkDisplayPropertiesKHR o, int count){
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
        public VkDisplayPropertiesKHR get(int i){
            return new VkDisplayPropertiesKHR(getVkMemory(), address(i));
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
