package cz.mg.vulkan;

public class VkExtensionProperties extends VkObject {
    public VkExtensionProperties() {
        super(sizeof());
    }

    protected VkExtensionProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExtensionProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExtensionProperties(VkPointer pointer) {
        super(pointer);
    }



    public VkChar getExtensionName() {
        return new VkChar(getVkMemory(), getExtensionNameNative(getVkAddress()));
    }

    
    public void setExtensionName(VkChar extensionName) {
        setExtensionNameNative(getVkAddress(), extensionName != null ? extensionName.getVkAddress() : VkPointer.NULL);
        
    }

    public String getExtensionNameQ() {
        return new VkString(getExtensionName()).toString();
    }

    public void setExtensionName(String extensionName) {
        setExtensionName(new VkString(extensionName));
    }

    protected static native long getExtensionNameNative(long address);
    protected static native void setExtensionNameNative(long address, long extensionName);

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


    public void set(VkExtensionProperties o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkExtensionProperties implements cz.mg.collections.array.ReadonlyArray<VkExtensionProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExtensionProperties.sizeof()));
            this.count = count;
        }

        public Array(VkExtensionProperties o, int count){
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
        public VkExtensionProperties get(int i){
            return new VkExtensionProperties(getVkMemory(), address(i));
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
