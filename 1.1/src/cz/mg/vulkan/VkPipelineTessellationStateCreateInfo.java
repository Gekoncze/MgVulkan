package cz.mg.vulkan;

public class VkPipelineTessellationStateCreateInfo extends VkObject {
    public VkPipelineTessellationStateCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO));
    }

    public VkPipelineTessellationStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineTessellationStateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineTessellationStateCreateInfo(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSTypeNative(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSTypeNative(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSTypeNative(long address);
    protected static native void setSTypeNative(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNextNative(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNextNative(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNextNative(long address);
    protected static native void setPNextNative(long address, long pNext);

    public VkPipelineTessellationStateCreateFlags getFlags() {
        return new VkPipelineTessellationStateCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkPipelineTessellationStateCreateFlags flags) {
        setFlagsNative(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlagsNative(long address);
    protected static native void setFlagsNative(long address, long flags);

    public VkUInt32 getPatchControlPoints() {
        return new VkUInt32(getVkMemory(), getPatchControlPointsNative(getVkAddress()));
    }

    
    public void setPatchControlPoints(VkUInt32 patchControlPoints) {
        setPatchControlPointsNative(getVkAddress(), patchControlPoints != null ? patchControlPoints.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPatchControlPointsQ() {
        return getPatchControlPoints().getValue();
    }

    public void setPatchControlPoints(int patchControlPoints) {
        getPatchControlPoints().setValue(patchControlPoints);
    }

    protected static native long getPatchControlPointsNative(long address);
    protected static native void setPatchControlPointsNative(long address, long patchControlPoints);


    public void set(VkPipelineTessellationStateCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPipelineTessellationStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineTessellationStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineTessellationStateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO));;
        }

        public Array(int count, VkPipelineTessellationStateCreateInfo o){
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
        public VkPipelineTessellationStateCreateInfo get(int i){
            return new VkPipelineTessellationStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
