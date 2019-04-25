package cz.mg.vulkan;

public class VkSparseImageMemoryBindInfo extends VkObject {
    public VkSparseImageMemoryBindInfo() {
        super(sizeof());
    }

    public VkSparseImageMemoryBindInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSparseImageMemoryBindInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkImage getImage() {
        return new VkImage(getVkMemory(), getImage(getVkAddress()));
    }

    
    public void setImage(VkImage image) {
        setImage(getVkAddress(), image != null ? image.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getImage(long address);
    protected static native void setImage(long address, long image);

    public VkUInt32 getBindCount() {
        return new VkUInt32(getVkMemory(), getBindCount(getVkAddress()));
    }

    
    public void setBindCount(VkUInt32 bindCount) {
        setBindCount(getVkAddress(), bindCount != null ? bindCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getBindCountQ() {
        return getBindCount().getValue();
    }

    public void setBindCount(int bindCount) {
        getBindCount().setValue(bindCount);
    }

    protected static native long getBindCount(long address);
    protected static native void setBindCount(long address, long bindCount);

    public VkSparseImageMemoryBind getPBinds() {
        return new VkSparseImageMemoryBind(getVkMemory(), getPBinds(getVkAddress()));
    }

    private VkObject pBinds = null;
    public void setPBinds(VkSparseImageMemoryBind pBinds) {
        setPBinds(getVkAddress(), pBinds != null ? pBinds.getVkAddress() : VkPointer.NULL);
        this.pBinds = pBinds;
    }

    protected static native long getPBinds(long address);
    protected static native void setPBinds(long address, long pBinds);


    public static native long sizeof();

    public static class Array extends VkSparseImageMemoryBindInfo implements cz.mg.collections.array.ReadonlyArray<VkSparseImageMemoryBindInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSparseImageMemoryBindInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSparseImageMemoryBindInfo o){
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
        public VkSparseImageMemoryBindInfo get(int i){
            return new VkSparseImageMemoryBindInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSparseImageMemoryBindInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSparseImageMemoryBindInfo.Pointer> {
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

            public Array(VkSparseImageMemoryBindInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSparseImageMemoryBindInfo.Pointer get(int i){
                return new VkSparseImageMemoryBindInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
