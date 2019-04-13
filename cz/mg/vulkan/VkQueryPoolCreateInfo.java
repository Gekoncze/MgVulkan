package cz.mg.vulkan;

public class VkQueryPoolCreateInfo extends VkObject {
    public VkQueryPoolCreateInfo() {
        super(sizeof());
    }

    public VkQueryPoolCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueryPoolCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkQueryPoolCreateInfo(VkObject pNext, VkQueryPoolCreateFlags flags, VkQueryType queryType, VkUInt32 queryCount, VkQueryPipelineStatisticFlags pipelineStatistics) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setQueryType(queryType);
        setQueryCount(queryCount);
        setPipelineStatistics(pipelineStatistics);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkQueryPoolCreateFlags getFlags() {
        return new VkQueryPoolCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkQueryPoolCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkQueryType getQueryType() {
        return new VkQueryType(getVkMemory(), getQueryType(getVkAddress()));
    }

    
    public void setQueryType(VkQueryType queryType) {
        setQueryType(getVkAddress(), queryType != null ? queryType.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getQueryType(long address);
    private static native void setQueryType(long address, long queryType);

    public VkUInt32 getQueryCount() {
        return new VkUInt32(getVkMemory(), getQueryCount(getVkAddress()));
    }

    
    public void setQueryCount(VkUInt32 queryCount) {
        setQueryCount(getVkAddress(), queryCount != null ? queryCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getQueryCount(long address);
    private static native void setQueryCount(long address, long queryCount);

    public VkQueryPipelineStatisticFlags getPipelineStatistics() {
        return new VkQueryPipelineStatisticFlags(getVkMemory(), getPipelineStatistics(getVkAddress()));
    }

    
    public void setPipelineStatistics(VkQueryPipelineStatisticFlags pipelineStatistics) {
        setPipelineStatistics(getVkAddress(), pipelineStatistics != null ? pipelineStatistics.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getPipelineStatistics(long address);
    private static native void setPipelineStatistics(long address, long pipelineStatistics);


    public static native long sizeof();

    public static class Array extends VkQueryPoolCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkQueryPoolCreateInfo> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkQueryPoolCreateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkQueryPoolCreateInfo o){
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
        public VkQueryPoolCreateInfo get(int i){
            return new VkQueryPoolCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkQueryPoolCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkQueryPoolCreateInfo.Pointer> {
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

            public Array(VkQueryPoolCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkQueryPoolCreateInfo.Pointer get(int i){
                return new VkQueryPoolCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
