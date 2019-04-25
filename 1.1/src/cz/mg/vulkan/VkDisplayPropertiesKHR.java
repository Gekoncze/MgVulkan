package cz.mg.vulkan;

public class VkDisplayPropertiesKHR extends VkObject {
    public VkDisplayPropertiesKHR() {
        super(sizeof());
    }

    public VkDisplayPropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayPropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDisplayKHR getDisplay() {
        return new VkDisplayKHR(getVkMemory(), getDisplay(getVkAddress()));
    }

    
    public void setDisplay(VkDisplayKHR display) {
        setDisplay(getVkAddress(), display != null ? display.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDisplay(long address);
    protected static native void setDisplay(long address, long display);

    public VkChar getDisplayName() {
        return new VkChar(getVkMemory(), getDisplayName(getVkAddress()));
    }

    private VkObject displayName = null;
    public void setDisplayName(VkChar displayName) {
        setDisplayName(getVkAddress(), displayName != null ? displayName.getVkAddress() : VkPointer.NULL);
        this.displayName = displayName;
    }

    public String getDisplayNameQ() {
        return new VkString(getDisplayName()).toString();
    }

    public void setDisplayName(String displayName) {
        setDisplayName(new VkString(displayName));
    }

    protected static native long getDisplayName(long address);
    protected static native void setDisplayName(long address, long displayName);

    public VkExtent2D getPhysicalDimensions() {
        return new VkExtent2D(getVkMemory(), getPhysicalDimensions(getVkAddress()));
    }

    
    public void setPhysicalDimensions(VkExtent2D physicalDimensions) {
        setPhysicalDimensions(getVkAddress(), physicalDimensions != null ? physicalDimensions.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPhysicalDimensions(long address);
    protected static native void setPhysicalDimensions(long address, long physicalDimensions);

    public VkExtent2D getPhysicalResolution() {
        return new VkExtent2D(getVkMemory(), getPhysicalResolution(getVkAddress()));
    }

    
    public void setPhysicalResolution(VkExtent2D physicalResolution) {
        setPhysicalResolution(getVkAddress(), physicalResolution != null ? physicalResolution.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPhysicalResolution(long address);
    protected static native void setPhysicalResolution(long address, long physicalResolution);

    public VkSurfaceTransformFlagsKHR getSupportedTransforms() {
        return new VkSurfaceTransformFlagsKHR(getVkMemory(), getSupportedTransforms(getVkAddress()));
    }

    
    public void setSupportedTransforms(VkSurfaceTransformFlagsKHR supportedTransforms) {
        setSupportedTransforms(getVkAddress(), supportedTransforms != null ? supportedTransforms.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSupportedTransformsQ() {
        return getSupportedTransforms().getValue();
    }

    public void setSupportedTransforms(int supportedTransforms) {
        getSupportedTransforms().setValue(supportedTransforms);
    }

    protected static native long getSupportedTransforms(long address);
    protected static native void setSupportedTransforms(long address, long supportedTransforms);

    public VkBool32 getPlaneReorderPossible() {
        return new VkBool32(getVkMemory(), getPlaneReorderPossible(getVkAddress()));
    }

    
    public void setPlaneReorderPossible(VkBool32 planeReorderPossible) {
        setPlaneReorderPossible(getVkAddress(), planeReorderPossible != null ? planeReorderPossible.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPlaneReorderPossibleQ() {
        return getPlaneReorderPossible().getValue();
    }

    public void setPlaneReorderPossible(int planeReorderPossible) {
        getPlaneReorderPossible().setValue(planeReorderPossible);
    }

    protected static native long getPlaneReorderPossible(long address);
    protected static native void setPlaneReorderPossible(long address, long planeReorderPossible);

    public VkBool32 getPersistentContent() {
        return new VkBool32(getVkMemory(), getPersistentContent(getVkAddress()));
    }

    
    public void setPersistentContent(VkBool32 persistentContent) {
        setPersistentContent(getVkAddress(), persistentContent != null ? persistentContent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPersistentContentQ() {
        return getPersistentContent().getValue();
    }

    public void setPersistentContent(int persistentContent) {
        getPersistentContent().setValue(persistentContent);
    }

    protected static native long getPersistentContent(long address);
    protected static native void setPersistentContent(long address, long persistentContent);


    public static native long sizeof();

    public static class Array extends VkDisplayPropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayPropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayPropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDisplayPropertiesKHR o){
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
        public VkDisplayPropertiesKHR get(int i){
            return new VkDisplayPropertiesKHR(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
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

        public static class Array extends VkDisplayPropertiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDisplayPropertiesKHR.Pointer> {
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

            public Array(VkDisplayPropertiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDisplayPropertiesKHR.Pointer get(int i){
                return new VkDisplayPropertiesKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
