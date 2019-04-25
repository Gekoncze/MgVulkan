package cz.mg.vulkan;

public class VkLayerProperties extends VkObject {
    public VkLayerProperties() {
        super(sizeof());
    }

    public VkLayerProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkLayerProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkChar getLayerName() {
        return new VkChar(getVkMemory(), getLayerName(getVkAddress()));
    }

    
    public void setLayerName(VkChar layerName) {
        setLayerName(getVkAddress(), layerName != null ? layerName.getVkAddress() : VkPointer.NULL);
        
    }

    public String getLayerNameQ() {
        return new VkString(getLayerName()).toString();
    }

    public void setLayerName(String layerName) {
        setLayerName(new VkString(layerName));
    }

    protected static native long getLayerName(long address);
    protected static native void setLayerName(long address, long layerName);

    public VkUInt32 getSpecVersion() {
        return new VkUInt32(getVkMemory(), getSpecVersion(getVkAddress()));
    }

    
    public void setSpecVersion(VkUInt32 specVersion) {
        setSpecVersion(getVkAddress(), specVersion != null ? specVersion.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSpecVersionQ() {
        return getSpecVersion().getValue();
    }

    public void setSpecVersion(int specVersion) {
        getSpecVersion().setValue(specVersion);
    }

    protected static native long getSpecVersion(long address);
    protected static native void setSpecVersion(long address, long specVersion);

    public VkUInt32 getImplementationVersion() {
        return new VkUInt32(getVkMemory(), getImplementationVersion(getVkAddress()));
    }

    
    public void setImplementationVersion(VkUInt32 implementationVersion) {
        setImplementationVersion(getVkAddress(), implementationVersion != null ? implementationVersion.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getImplementationVersionQ() {
        return getImplementationVersion().getValue();
    }

    public void setImplementationVersion(int implementationVersion) {
        getImplementationVersion().setValue(implementationVersion);
    }

    protected static native long getImplementationVersion(long address);
    protected static native void setImplementationVersion(long address, long implementationVersion);

    public VkChar getDescription() {
        return new VkChar(getVkMemory(), getDescription(getVkAddress()));
    }

    
    public void setDescription(VkChar description) {
        setDescription(getVkAddress(), description != null ? description.getVkAddress() : VkPointer.NULL);
        
    }

    public String getDescriptionQ() {
        return new VkString(getDescription()).toString();
    }

    public void setDescription(String description) {
        setDescription(new VkString(description));
    }

    protected static native long getDescription(long address);
    protected static native void setDescription(long address, long description);


    public static native long sizeof();

    public static class Array extends VkLayerProperties implements cz.mg.collections.array.ReadonlyArray<VkLayerProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkLayerProperties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkLayerProperties o){
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
        public VkLayerProperties get(int i){
            return new VkLayerProperties(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
