package cz.mg.vulkan.vk;

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


    public VkSparseImageOpaqueMemoryBindInfo(VkImage image, VkUInt32 bindCount, VkSparseMemoryBind pBinds) {
        super(sizeof());
        setImage(image);
        setBindCount(bindCount);
        setPBinds(pBinds);
    }

    public VkImage getImage() {
        return new VkImage(getVkMemory(), getImage(getVkAddress()));
    }

    
    public void setImage(VkImage image) {
        setImage(getVkAddress(), image != null ? image.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getImage(long address);
    private static native void setImage(long address, long image);

    public VkUInt32 getBindCount() {
        return new VkUInt32(getVkMemory(), getBindCount(getVkAddress()));
    }

    
    public void setBindCount(VkUInt32 bindCount) {
        setBindCount(getVkAddress(), bindCount != null ? bindCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getBindCount(long address);
    private static native void setBindCount(long address, long bindCount);

    public VkSparseMemoryBind getPBinds() {
        return new VkSparseMemoryBind(getVkMemory(), getPBinds(getVkAddress()));
    }

    private VkObject pBinds = null;
    public void setPBinds(VkSparseMemoryBind pBinds) {
        setPBinds(getVkAddress(), pBinds != null ? pBinds.getVkAddress() : VkPointer.NULL);
        this.pBinds = pBinds;
    }

    private static native long getPBinds(long address);
    private static native void setPBinds(long address, long pBinds);


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
            return new VkSparseImageOpaqueMemoryBindInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSparseImageOpaqueMemoryBindInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSparseImageOpaqueMemoryBindInfo.Pointer> {
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

            public Array(VkSparseImageOpaqueMemoryBindInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSparseImageOpaqueMemoryBindInfo.Pointer get(int i){
                return new VkSparseImageOpaqueMemoryBindInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
