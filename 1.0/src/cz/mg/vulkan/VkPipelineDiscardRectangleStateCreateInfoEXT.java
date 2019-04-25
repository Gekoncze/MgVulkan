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

    public VkPipelineDiscardRectangleStateCreateFlagsEXT getFlags() {
        return new VkPipelineDiscardRectangleStateCreateFlagsEXT(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineDiscardRectangleStateCreateFlagsEXT flags) {
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

    public VkDiscardRectangleModeEXT getDiscardRectangleMode() {
        return new VkDiscardRectangleModeEXT(getVkMemory(), getDiscardRectangleMode(getVkAddress()));
    }

    
    public void setDiscardRectangleMode(VkDiscardRectangleModeEXT discardRectangleMode) {
        setDiscardRectangleMode(getVkAddress(), discardRectangleMode != null ? discardRectangleMode.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getDiscardRectangleModeQ() {
        return getDiscardRectangleMode().getValue();
    }

    public void setDiscardRectangleMode(int discardRectangleMode) {
        getDiscardRectangleMode().setValue(discardRectangleMode);
    }

    protected static native long getDiscardRectangleMode(long address);
    protected static native void setDiscardRectangleMode(long address, long discardRectangleMode);

    public VkUInt32 getDiscardRectangleCount() {
        return new VkUInt32(getVkMemory(), getDiscardRectangleCount(getVkAddress()));
    }

    
    public void setDiscardRectangleCount(VkUInt32 discardRectangleCount) {
        setDiscardRectangleCount(getVkAddress(), discardRectangleCount != null ? discardRectangleCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getDiscardRectangleCountQ() {
        return getDiscardRectangleCount().getValue();
    }

    public void setDiscardRectangleCount(int discardRectangleCount) {
        getDiscardRectangleCount().setValue(discardRectangleCount);
    }

    protected static native long getDiscardRectangleCount(long address);
    protected static native void setDiscardRectangleCount(long address, long discardRectangleCount);

    public VkRect2D getPDiscardRectangles() {
        return new VkRect2D(getVkMemory(), getPDiscardRectangles(getVkAddress()));
    }

    private VkObject pDiscardRectangles = null;
    public void setPDiscardRectangles(VkRect2D pDiscardRectangles) {
        setPDiscardRectangles(getVkAddress(), pDiscardRectangles != null ? pDiscardRectangles.getVkAddress() : VkPointer.NULL);
        this.pDiscardRectangles = pDiscardRectangles;
    }

    protected static native long getPDiscardRectangles(long address);
    protected static native void setPDiscardRectangles(long address, long pDiscardRectangles);


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

        public static class Array extends VkPipelineDiscardRectangleStateCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineDiscardRectangleStateCreateInfoEXT.Pointer> {
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

            public Array(VkPipelineDiscardRectangleStateCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineDiscardRectangleStateCreateInfoEXT.Pointer get(int i){
                return new VkPipelineDiscardRectangleStateCreateInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
