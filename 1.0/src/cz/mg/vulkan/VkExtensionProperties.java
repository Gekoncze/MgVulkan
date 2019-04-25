package cz.mg.vulkan;

public class VkExtensionProperties extends VkObject {
    public VkExtensionProperties() {
        super(sizeof());
    }

    public VkExtensionProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExtensionProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkChar getExtensionName() {
        return new VkChar(getVkMemory(), getExtensionName(getVkAddress()));
    }

    
    public void setExtensionName(VkChar extensionName) {
        setExtensionName(getVkAddress(), extensionName != null ? extensionName.getVkAddress() : VkPointer.NULL);
        
    }

    public String getExtensionNameQ() {
        return new VkString(getExtensionName()).toString();
    }

    public void setExtensionName(String extensionName) {
        setExtensionName(new VkString(extensionName));
    }

    protected static native long getExtensionName(long address);
    protected static native void setExtensionName(long address, long extensionName);

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


    public static native long sizeof();

    public static class Array extends VkExtensionProperties implements cz.mg.collections.array.ReadonlyArray<VkExtensionProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExtensionProperties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkExtensionProperties o){
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
        public VkExtensionProperties get(int i){
            return new VkExtensionProperties(getVkMemory(), addressAt(i));
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
