package cz.mg.vulkan;

public class VkPipelineViewportStateCreateInfo extends VkObject {
    public VkPipelineViewportStateCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO));
    }

    public VkPipelineViewportStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineViewportStateCreateInfo(VkMemory vkmemory, long vkaddress) {
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

    public VkPipelineViewportStateCreateFlags getFlags() {
        return new VkPipelineViewportStateCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineViewportStateCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getViewportCount() {
        return new VkUInt32(getVkMemory(), getViewportCount(getVkAddress()));
    }

    
    public void setViewportCount(VkUInt32 viewportCount) {
        setViewportCount(getVkAddress(), viewportCount != null ? viewportCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getViewportCountQ() {
        return getViewportCount().getValue();
    }

    public void setViewportCount(int viewportCount) {
        getViewportCount().setValue(viewportCount);
    }

    private static native long getViewportCount(long address);
    private static native void setViewportCount(long address, long viewportCount);

    public VkViewport getPViewports() {
        return new VkViewport(getVkMemory(), getPViewports(getVkAddress()));
    }

    private VkObject pViewports = null;
    public void setPViewports(VkViewport pViewports) {
        setPViewports(getVkAddress(), pViewports != null ? pViewports.getVkAddress() : VkPointer.NULL);
        this.pViewports = pViewports;
    }

    private static native long getPViewports(long address);
    private static native void setPViewports(long address, long pViewports);

    public VkUInt32 getScissorCount() {
        return new VkUInt32(getVkMemory(), getScissorCount(getVkAddress()));
    }

    
    public void setScissorCount(VkUInt32 scissorCount) {
        setScissorCount(getVkAddress(), scissorCount != null ? scissorCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getScissorCountQ() {
        return getScissorCount().getValue();
    }

    public void setScissorCount(int scissorCount) {
        getScissorCount().setValue(scissorCount);
    }

    private static native long getScissorCount(long address);
    private static native void setScissorCount(long address, long scissorCount);

    public VkRect2D getPScissors() {
        return new VkRect2D(getVkMemory(), getPScissors(getVkAddress()));
    }

    private VkObject pScissors = null;
    public void setPScissors(VkRect2D pScissors) {
        setPScissors(getVkAddress(), pScissors != null ? pScissors.getVkAddress() : VkPointer.NULL);
        this.pScissors = pScissors;
    }

    private static native long getPScissors(long address);
    private static native void setPScissors(long address, long pScissors);


    public static native long sizeof();

    public static class Array extends VkPipelineViewportStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineViewportStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineViewportStateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO));;
        }

        public Array(int count, VkPipelineViewportStateCreateInfo o){
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
        public VkPipelineViewportStateCreateInfo get(int i){
            return new VkPipelineViewportStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineViewportStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineViewportStateCreateInfo.Pointer> {
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

            public Array(VkPipelineViewportStateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineViewportStateCreateInfo.Pointer get(int i){
                return new VkPipelineViewportStateCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
