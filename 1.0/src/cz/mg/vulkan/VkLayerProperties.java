package cz.mg.vulkan;

public class VkLayerProperties extends VkObject {
    public VkLayerProperties() {
        super(sizeof());
    }

    protected VkLayerProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkLayerProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkLayerProperties(VkPointer pointer) {
        super(pointer);
    }



    public VkChar getLayerName() {
        return new VkChar(getVkMemory(), getLayerNameNative(getVkAddress()));
    }

    
    public void setLayerName(VkChar layerName) {
        setLayerNameNative(getVkAddress(), layerName != null ? layerName.getVkAddress() : VkPointer.NULL);
        
    }

    public String getLayerNameQ() {
        return new VkString(getLayerName()).toString();
    }

    public void setLayerName(String layerName) {
        setLayerName(new VkString(layerName));
    }

    protected static native long getLayerNameNative(long address);
    protected static native void setLayerNameNative(long address, long layerName);

    public VkUInt32 getSpecVersion() {
        return new VkUInt32(getVkMemory(), getSpecVersionNative(getVkAddress()));
    }

    
    public void setSpecVersion(VkUInt32 specVersion) {
        setSpecVersionNative(getVkAddress(), specVersion != null ? specVersion.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSpecVersionQ() {
        return getSpecVersion().getValue();
    }

    public void setSpecVersion(int specVersion) {
        getSpecVersion().setValue(specVersion);
    }

    protected static native long getSpecVersionNative(long address);
    protected static native void setSpecVersionNative(long address, long specVersion);

    public VkUInt32 getImplementationVersion() {
        return new VkUInt32(getVkMemory(), getImplementationVersionNative(getVkAddress()));
    }

    
    public void setImplementationVersion(VkUInt32 implementationVersion) {
        setImplementationVersionNative(getVkAddress(), implementationVersion != null ? implementationVersion.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getImplementationVersionQ() {
        return getImplementationVersion().getValue();
    }

    public void setImplementationVersion(int implementationVersion) {
        getImplementationVersion().setValue(implementationVersion);
    }

    protected static native long getImplementationVersionNative(long address);
    protected static native void setImplementationVersionNative(long address, long implementationVersion);

    public VkChar getDescription() {
        return new VkChar(getVkMemory(), getDescriptionNative(getVkAddress()));
    }

    
    public void setDescription(VkChar description) {
        setDescriptionNative(getVkAddress(), description != null ? description.getVkAddress() : VkPointer.NULL);
        
    }

    public String getDescriptionQ() {
        return new VkString(getDescription()).toString();
    }

    public void setDescription(String description) {
        setDescription(new VkString(description));
    }

    protected static native long getDescriptionNative(long address);
    protected static native void setDescriptionNative(long address, long description);


    public void set(VkLayerProperties o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkLayerProperties implements cz.mg.collections.array.ReadonlyArray<VkLayerProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkLayerProperties.sizeof()));
            this.count = count;
        }

        public Array(VkLayerProperties o, int count){
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
        public VkLayerProperties get(int i){
            return new VkLayerProperties(getVkMemory(), address(i));
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
