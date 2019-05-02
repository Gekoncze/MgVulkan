package cz.mg.vulkan;

public class VkSparseBufferMemoryBindInfo extends VkObject {
    public VkSparseBufferMemoryBindInfo() {
        super(sizeof());
    }

    protected VkSparseBufferMemoryBindInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSparseBufferMemoryBindInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSparseBufferMemoryBindInfo(VkPointer pointer) {
        super(pointer);
    }



    public VkBuffer getBuffer() {
        return new VkBuffer(getVkMemory(), getBufferNative(getVkAddress()));
    }

    
    public void setBuffer(VkBuffer buffer) {
        setBufferNative(getVkAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getBufferNative(long address);
    protected static native void setBufferNative(long address, long buffer);

    public VkUInt32 getBindCount() {
        return new VkUInt32(getVkMemory(), getBindCountNative(getVkAddress()));
    }

    
    public void setBindCount(VkUInt32 bindCount) {
        setBindCountNative(getVkAddress(), bindCount != null ? bindCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBindCountQ() {
        return getBindCount().getValue();
    }

    public void setBindCount(int bindCount) {
        getBindCount().setValue(bindCount);
    }

    protected static native long getBindCountNative(long address);
    protected static native void setBindCountNative(long address, long bindCount);

    public VkSparseMemoryBind getPBinds() {
        return new VkSparseMemoryBind(getVkMemory(), getPBindsNative(getVkAddress()));
    }

    private VkObject pBinds = null;
    public void setPBinds(VkSparseMemoryBind pBinds) {
        setPBindsNative(getVkAddress(), pBinds != null ? pBinds.getVkAddress() : VkPointer.NULL);
        this.pBinds = pBinds;
    }

    protected static native long getPBindsNative(long address);
    protected static native void setPBindsNative(long address, long pBinds);


    public void set(VkSparseBufferMemoryBindInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkSparseBufferMemoryBindInfo implements cz.mg.collections.array.ReadonlyArray<VkSparseBufferMemoryBindInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSparseBufferMemoryBindInfo.sizeof()));
            this.count = count;
        }

        public Array(VkSparseBufferMemoryBindInfo o, int count){
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
        public VkSparseBufferMemoryBindInfo get(int i){
            return new VkSparseBufferMemoryBindInfo(getVkMemory(), address(i));
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
