package cz.mg.vulkan;

public class VkPipelineDiscardRectangleStateCreateInfoEXT extends VkObject {
    public VkPipelineDiscardRectangleStateCreateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT));
    }

    public VkPipelineDiscardRectangleStateCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineDiscardRectangleStateCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineDiscardRectangleStateCreateInfoEXT(VkPointer pointer) {
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

    public VkPipelineDiscardRectangleStateCreateFlagsEXT getFlags() {
        return new VkPipelineDiscardRectangleStateCreateFlagsEXT(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkPipelineDiscardRectangleStateCreateFlagsEXT flags) {
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

    public VkDiscardRectangleModeEXT getDiscardRectangleMode() {
        return new VkDiscardRectangleModeEXT(getVkMemory(), getDiscardRectangleModeNative(getVkAddress()));
    }

    
    public void setDiscardRectangleMode(VkDiscardRectangleModeEXT discardRectangleMode) {
        setDiscardRectangleModeNative(getVkAddress(), discardRectangleMode != null ? discardRectangleMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDiscardRectangleModeQ() {
        return getDiscardRectangleMode().getValue();
    }

    public void setDiscardRectangleMode(int discardRectangleMode) {
        getDiscardRectangleMode().setValue(discardRectangleMode);
    }

    protected static native long getDiscardRectangleModeNative(long address);
    protected static native void setDiscardRectangleModeNative(long address, long discardRectangleMode);

    public VkUInt32 getDiscardRectangleCount() {
        return new VkUInt32(getVkMemory(), getDiscardRectangleCountNative(getVkAddress()));
    }

    
    public void setDiscardRectangleCount(VkUInt32 discardRectangleCount) {
        setDiscardRectangleCountNative(getVkAddress(), discardRectangleCount != null ? discardRectangleCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDiscardRectangleCountQ() {
        return getDiscardRectangleCount().getValue();
    }

    public void setDiscardRectangleCount(int discardRectangleCount) {
        getDiscardRectangleCount().setValue(discardRectangleCount);
    }

    protected static native long getDiscardRectangleCountNative(long address);
    protected static native void setDiscardRectangleCountNative(long address, long discardRectangleCount);

    public VkRect2D getPDiscardRectangles() {
        return new VkRect2D(getVkMemory(), getPDiscardRectanglesNative(getVkAddress()));
    }

    private VkObject pDiscardRectangles = null;
    public void setPDiscardRectangles(VkRect2D pDiscardRectangles) {
        setPDiscardRectanglesNative(getVkAddress(), pDiscardRectangles != null ? pDiscardRectangles.getVkAddress() : VkPointer.NULL);
        this.pDiscardRectangles = pDiscardRectangles;
    }

    protected static native long getPDiscardRectanglesNative(long address);
    protected static native void setPDiscardRectanglesNative(long address, long pDiscardRectangles);


    public static native long sizeof();

    public static class Array extends VkPipelineDiscardRectangleStateCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkPipelineDiscardRectangleStateCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineDiscardRectangleStateCreateInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT));;
        }

        public Array(int count, VkPipelineDiscardRectangleStateCreateInfoEXT o){
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
        public VkPipelineDiscardRectangleStateCreateInfoEXT get(int i){
            return new VkPipelineDiscardRectangleStateCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
