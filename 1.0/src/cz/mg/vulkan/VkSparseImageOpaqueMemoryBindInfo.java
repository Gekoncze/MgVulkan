package cz.mg.vulkan;

public class VkSparseImageOpaqueMemoryBindInfo extends VkObject {
    public VkSparseImageOpaqueMemoryBindInfo() {
        super(sizeof());
    }

    public VkSparseImageOpaqueMemoryBindInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSparseImageOpaqueMemoryBindInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkImage getImage() {
        return new VkImage(getVkMemory(), getImage(getVkAddress()));
    }

    
    public void setImage(VkImage image) {
        setImage(getVkAddress(), image != null ? image.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImage(long address);
    protected static native void setImage(long address, long image);

    public VkUInt32 getBindCount() {
        return new VkUInt32(getVkMemory(), getBindCount(getVkAddress()));
    }

    
    public void setBindCount(VkUInt32 bindCount) {
        setBindCount(getVkAddress(), bindCount != null ? bindCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBindCountQ() {
        return getBindCount().getValue();
    }

    public void setBindCount(int bindCount) {
        getBindCount().setValue(bindCount);
    }

    protected static native long getBindCount(long address);
    protected static native void setBindCount(long address, long bindCount);

    public VkSparseMemoryBind getPBinds() {
        return new VkSparseMemoryBind(getVkMemory(), getPBinds(getVkAddress()));
    }

    private VkObject pBinds = null;
    public void setPBinds(VkSparseMemoryBind pBinds) {
        setPBinds(getVkAddress(), pBinds != null ? pBinds.getVkAddress() : VkPointer.NULL);
        this.pBinds = pBinds;
    }

    protected static native long getPBinds(long address);
    protected static native void setPBinds(long address, long pBinds);


    public static native long sizeof();

    public static class Array extends VkSparseImageOpaqueMemoryBindInfo implements cz.mg.collections.array.ReadonlyArray<VkSparseImageOpaqueMemoryBindInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSparseImageOpaqueMemoryBindInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSparseImageOpaqueMemoryBindInfo o){
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
        public VkSparseImageOpaqueMemoryBindInfo get(int i){
            return new VkSparseImageOpaqueMemoryBindInfo(getVkMemory(), addressAt(i));
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
