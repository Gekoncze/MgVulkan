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

        public static class Array extends VkExtensionProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkExtensionProperties.Pointer> {
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

            public Array(VkExtensionProperties[] a) {
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
            public VkExtensionProperties.Pointer get(int i){
                return new VkExtensionProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
