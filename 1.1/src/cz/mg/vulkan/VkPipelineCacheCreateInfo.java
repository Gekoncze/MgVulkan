package cz.mg.vulkan;

public class VkPipelineCacheCreateInfo extends VkObject {
    public VkPipelineCacheCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO));
    }

    public VkPipelineCacheCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineCacheCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkPipelineCacheCreateFlags getFlags() {
        return new VkPipelineCacheCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineCacheCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkSize getInitialDataSize() {
        return new VkSize(getVkMemory(), getInitialDataSize(getVkAddress()));
    }

    
    public void setInitialDataSize(VkSize initialDataSize) {
        setInitialDataSize(getVkAddress(), initialDataSize != null ? initialDataSize.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public long getInitialDataSizeQ() {
        return getInitialDataSize().getValue();
    }

    public void setInitialDataSize(long initialDataSize) {
        getInitialDataSize().setValue(initialDataSize);
    }

    protected static native long getInitialDataSize(long address);
    protected static native void setInitialDataSize(long address, long initialDataSize);

    public VkObject getPInitialData() {
        return new VkObject(getVkMemory(), getPInitialData(getVkAddress()));
    }

    private VkObject pInitialData = null;
    public void setPInitialData(VkObject pInitialData) {
        setPInitialData(getVkAddress(), pInitialData != null ? pInitialData.getVkAddress() : VkPointer.NULL);
        this.pInitialData = pInitialData;
    }

    protected static native long getPInitialData(long address);
    protected static native void setPInitialData(long address, long pInitialData);


    public static native long sizeof();

    public static class Array extends VkPipelineCacheCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineCacheCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineCacheCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO));;
        }

        public Array(int count, VkPipelineCacheCreateInfo o){
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
        public VkPipelineCacheCreateInfo get(int i){
            return new VkPipelineCacheCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineCacheCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineCacheCreateInfo.Pointer> {
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

            public Array(VkPipelineCacheCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineCacheCreateInfo.Pointer get(int i){
                return new VkPipelineCacheCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
