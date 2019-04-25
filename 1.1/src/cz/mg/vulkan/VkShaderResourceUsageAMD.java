package cz.mg.vulkan;

public class VkShaderResourceUsageAMD extends VkObject {
    public VkShaderResourceUsageAMD() {
        super(sizeof());
    }

    public VkShaderResourceUsageAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkShaderResourceUsageAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getNumUsedVgprs() {
        return new VkUInt32(getVkMemory(), getNumUsedVgprs(getVkAddress()));
    }

    
    public void setNumUsedVgprs(VkUInt32 numUsedVgprs) {
        setNumUsedVgprs(getVkAddress(), numUsedVgprs != null ? numUsedVgprs.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getNumUsedVgprsQ() {
        return getNumUsedVgprs().getValue();
    }

    public void setNumUsedVgprs(int numUsedVgprs) {
        getNumUsedVgprs().setValue(numUsedVgprs);
    }

    protected static native long getNumUsedVgprs(long address);
    protected static native void setNumUsedVgprs(long address, long numUsedVgprs);

    public VkUInt32 getNumUsedSgprs() {
        return new VkUInt32(getVkMemory(), getNumUsedSgprs(getVkAddress()));
    }

    
    public void setNumUsedSgprs(VkUInt32 numUsedSgprs) {
        setNumUsedSgprs(getVkAddress(), numUsedSgprs != null ? numUsedSgprs.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getNumUsedSgprsQ() {
        return getNumUsedSgprs().getValue();
    }

    public void setNumUsedSgprs(int numUsedSgprs) {
        getNumUsedSgprs().setValue(numUsedSgprs);
    }

    protected static native long getNumUsedSgprs(long address);
    protected static native void setNumUsedSgprs(long address, long numUsedSgprs);

    public VkUInt32 getLdsSizePerLocalWorkGroup() {
        return new VkUInt32(getVkMemory(), getLdsSizePerLocalWorkGroup(getVkAddress()));
    }

    
    public void setLdsSizePerLocalWorkGroup(VkUInt32 ldsSizePerLocalWorkGroup) {
        setLdsSizePerLocalWorkGroup(getVkAddress(), ldsSizePerLocalWorkGroup != null ? ldsSizePerLocalWorkGroup.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLdsSizePerLocalWorkGroupQ() {
        return getLdsSizePerLocalWorkGroup().getValue();
    }

    public void setLdsSizePerLocalWorkGroup(int ldsSizePerLocalWorkGroup) {
        getLdsSizePerLocalWorkGroup().setValue(ldsSizePerLocalWorkGroup);
    }

    protected static native long getLdsSizePerLocalWorkGroup(long address);
    protected static native void setLdsSizePerLocalWorkGroup(long address, long ldsSizePerLocalWorkGroup);

    public VkSize getLdsUsageSizeInBytes() {
        return new VkSize(getVkMemory(), getLdsUsageSizeInBytes(getVkAddress()));
    }

    
    public void setLdsUsageSizeInBytes(VkSize ldsUsageSizeInBytes) {
        setLdsUsageSizeInBytes(getVkAddress(), ldsUsageSizeInBytes != null ? ldsUsageSizeInBytes.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getLdsUsageSizeInBytesQ() {
        return getLdsUsageSizeInBytes().getValue();
    }

    public void setLdsUsageSizeInBytes(long ldsUsageSizeInBytes) {
        getLdsUsageSizeInBytes().setValue(ldsUsageSizeInBytes);
    }

    protected static native long getLdsUsageSizeInBytes(long address);
    protected static native void setLdsUsageSizeInBytes(long address, long ldsUsageSizeInBytes);

    public VkSize getScratchMemUsageInBytes() {
        return new VkSize(getVkMemory(), getScratchMemUsageInBytes(getVkAddress()));
    }

    
    public void setScratchMemUsageInBytes(VkSize scratchMemUsageInBytes) {
        setScratchMemUsageInBytes(getVkAddress(), scratchMemUsageInBytes != null ? scratchMemUsageInBytes.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getScratchMemUsageInBytesQ() {
        return getScratchMemUsageInBytes().getValue();
    }

    public void setScratchMemUsageInBytes(long scratchMemUsageInBytes) {
        getScratchMemUsageInBytes().setValue(scratchMemUsageInBytes);
    }

    protected static native long getScratchMemUsageInBytes(long address);
    protected static native void setScratchMemUsageInBytes(long address, long scratchMemUsageInBytes);


    public static native long sizeof();

    public static class Array extends VkShaderResourceUsageAMD implements cz.mg.collections.array.ReadonlyArray<VkShaderResourceUsageAMD> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkShaderResourceUsageAMD.sizeof()));
            this.count = count;
        }

        public Array(int count, VkShaderResourceUsageAMD o){
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
        public VkShaderResourceUsageAMD get(int i){
            return new VkShaderResourceUsageAMD(getVkMemory(), addressAt(i));
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

        public static class Array extends VkShaderResourceUsageAMD.Pointer implements cz.mg.collections.array.ReadonlyArray<VkShaderResourceUsageAMD.Pointer> {
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

            public Array(VkShaderResourceUsageAMD[] a) {
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
            public VkShaderResourceUsageAMD.Pointer get(int i){
                return new VkShaderResourceUsageAMD.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
