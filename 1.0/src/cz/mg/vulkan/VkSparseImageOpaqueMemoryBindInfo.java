package cz.mg.vulkan;

public class VkSparseImageOpaqueMemoryBindInfo extends VkObject {
    public VkSparseImageOpaqueMemoryBindInfo() {
        super(sizeof());
    }

    protected VkSparseImageOpaqueMemoryBindInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSparseImageOpaqueMemoryBindInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSparseImageOpaqueMemoryBindInfo(VkPointer pointer) {
        super(pointer);
    }



    public VkImage getImage() {
        return new VkImage(getVkMemory(), getImageNative(getVkAddress()));
    }

    
    public void setImage(VkImage image) {
        setImageNative(getVkAddress(), image != null ? image.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImageNative(long address);
    protected static native void setImageNative(long address, long image);

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


    public static native long sizeof();

    public static class Array extends VkSparseImageOpaqueMemoryBindInfo implements cz.mg.collections.array.ReadonlyArray<VkSparseImageOpaqueMemoryBindInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSparseImageOpaqueMemoryBindInfo.sizeof()));
            this.count = count;
        }

        public Array(VkSparseImageOpaqueMemoryBindInfo o, int count){
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
        public VkSparseImageOpaqueMemoryBindInfo get(int i){
            return new VkSparseImageOpaqueMemoryBindInfo(getVkMemory(), address(i));
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
