package cz.mg.vulkan;

public class VkPipelineViewportSwizzleStateCreateInfoNV extends VkObject {
    public VkPipelineViewportSwizzleStateCreateInfoNV() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV));
    }

    public VkPipelineViewportSwizzleStateCreateInfoNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineViewportSwizzleStateCreateInfoNV(VkMemory vkmemory, long vkaddress) {
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

    public VkPipelineViewportSwizzleStateCreateFlagsNV getFlags() {
        return new VkPipelineViewportSwizzleStateCreateFlagsNV(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineViewportSwizzleStateCreateFlagsNV flags) {
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

    protected static native long getViewportCount(long address);
    protected static native void setViewportCount(long address, long viewportCount);

    public VkViewportSwizzleNV getPViewportSwizzles() {
        return new VkViewportSwizzleNV(getVkMemory(), getPViewportSwizzles(getVkAddress()));
    }

    private VkObject pViewportSwizzles = null;
    public void setPViewportSwizzles(VkViewportSwizzleNV pViewportSwizzles) {
        setPViewportSwizzles(getVkAddress(), pViewportSwizzles != null ? pViewportSwizzles.getVkAddress() : VkPointer.NULL);
        this.pViewportSwizzles = pViewportSwizzles;
    }

    protected static native long getPViewportSwizzles(long address);
    protected static native void setPViewportSwizzles(long address, long pViewportSwizzles);


    public static native long sizeof();

    public static class Array extends VkPipelineViewportSwizzleStateCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VkPipelineViewportSwizzleStateCreateInfoNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineViewportSwizzleStateCreateInfoNV.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV));;
        }

        public Array(int count, VkPipelineViewportSwizzleStateCreateInfoNV o){
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
        public VkPipelineViewportSwizzleStateCreateInfoNV get(int i){
            return new VkPipelineViewportSwizzleStateCreateInfoNV(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineViewportSwizzleStateCreateInfoNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineViewportSwizzleStateCreateInfoNV.Pointer> {
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

            public Array(VkPipelineViewportSwizzleStateCreateInfoNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineViewportSwizzleStateCreateInfoNV.Pointer get(int i){
                return new VkPipelineViewportSwizzleStateCreateInfoNV.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
