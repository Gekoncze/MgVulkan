package cz.mg.vulkan;

public class VkComputePipelineCreateInfo extends VkObject {
    public VkComputePipelineCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO));
    }

    public VkComputePipelineCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkComputePipelineCreateInfo(VkMemory vkmemory, long vkaddress) {
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

    public VkPipelineCreateFlags getFlags() {
        return new VkPipelineCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineCreateFlags flags) {
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

    public VkPipelineShaderStageCreateInfo getStage() {
        return new VkPipelineShaderStageCreateInfo(getVkMemory(), getStage(getVkAddress()));
    }

    
    public void setStage(VkPipelineShaderStageCreateInfo stage) {
        setStage(getVkAddress(), stage != null ? stage.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getStage(long address);
    protected static native void setStage(long address, long stage);

    public VkPipelineLayout getLayout() {
        return new VkPipelineLayout(getVkMemory(), getLayout(getVkAddress()));
    }

    
    public void setLayout(VkPipelineLayout layout) {
        setLayout(getVkAddress(), layout != null ? layout.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getLayout(long address);
    protected static native void setLayout(long address, long layout);

    public VkPipeline getBasePipelineHandle() {
        return new VkPipeline(getVkMemory(), getBasePipelineHandle(getVkAddress()));
    }

    
    public void setBasePipelineHandle(VkPipeline basePipelineHandle) {
        setBasePipelineHandle(getVkAddress(), basePipelineHandle != null ? basePipelineHandle.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getBasePipelineHandle(long address);
    protected static native void setBasePipelineHandle(long address, long basePipelineHandle);

    public VkInt32 getBasePipelineIndex() {
        return new VkInt32(getVkMemory(), getBasePipelineIndex(getVkAddress()));
    }

    
    public void setBasePipelineIndex(VkInt32 basePipelineIndex) {
        setBasePipelineIndex(getVkAddress(), basePipelineIndex != null ? basePipelineIndex.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getBasePipelineIndexQ() {
        return getBasePipelineIndex().getValue();
    }

    public void setBasePipelineIndex(int basePipelineIndex) {
        getBasePipelineIndex().setValue(basePipelineIndex);
    }

    protected static native long getBasePipelineIndex(long address);
    protected static native void setBasePipelineIndex(long address, long basePipelineIndex);


    public static native long sizeof();

    public static class Array extends VkComputePipelineCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkComputePipelineCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkComputePipelineCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO));;
        }

        public Array(int count, VkComputePipelineCreateInfo o){
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
        public VkComputePipelineCreateInfo get(int i){
            return new VkComputePipelineCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkComputePipelineCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkComputePipelineCreateInfo.Pointer> {
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

            public Array(VkComputePipelineCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkComputePipelineCreateInfo.Pointer get(int i){
                return new VkComputePipelineCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
