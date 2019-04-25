package cz.mg.vulkan;

public class VkPipelineDepthStencilStateCreateInfo extends VkObject {
    public VkPipelineDepthStencilStateCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO));
    }

    public VkPipelineDepthStencilStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineDepthStencilStateCreateInfo(VkMemory vkmemory, long vkaddress) {
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

    public VkPipelineDepthStencilStateCreateFlags getFlags() {
        return new VkPipelineDepthStencilStateCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineDepthStencilStateCreateFlags flags) {
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

    public VkBool32 getDepthTestEnable() {
        return new VkBool32(getVkMemory(), getDepthTestEnable(getVkAddress()));
    }

    
    public void setDepthTestEnable(VkBool32 depthTestEnable) {
        setDepthTestEnable(getVkAddress(), depthTestEnable != null ? depthTestEnable.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getDepthTestEnableQ() {
        return getDepthTestEnable().getValue();
    }

    public void setDepthTestEnable(int depthTestEnable) {
        getDepthTestEnable().setValue(depthTestEnable);
    }

    protected static native long getDepthTestEnable(long address);
    protected static native void setDepthTestEnable(long address, long depthTestEnable);

    public VkBool32 getDepthWriteEnable() {
        return new VkBool32(getVkMemory(), getDepthWriteEnable(getVkAddress()));
    }

    
    public void setDepthWriteEnable(VkBool32 depthWriteEnable) {
        setDepthWriteEnable(getVkAddress(), depthWriteEnable != null ? depthWriteEnable.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getDepthWriteEnableQ() {
        return getDepthWriteEnable().getValue();
    }

    public void setDepthWriteEnable(int depthWriteEnable) {
        getDepthWriteEnable().setValue(depthWriteEnable);
    }

    protected static native long getDepthWriteEnable(long address);
    protected static native void setDepthWriteEnable(long address, long depthWriteEnable);

    public VkCompareOp getDepthCompareOp() {
        return new VkCompareOp(getVkMemory(), getDepthCompareOp(getVkAddress()));
    }

    
    public void setDepthCompareOp(VkCompareOp depthCompareOp) {
        setDepthCompareOp(getVkAddress(), depthCompareOp != null ? depthCompareOp.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getDepthCompareOpQ() {
        return getDepthCompareOp().getValue();
    }

    public void setDepthCompareOp(int depthCompareOp) {
        getDepthCompareOp().setValue(depthCompareOp);
    }

    protected static native long getDepthCompareOp(long address);
    protected static native void setDepthCompareOp(long address, long depthCompareOp);

    public VkBool32 getDepthBoundsTestEnable() {
        return new VkBool32(getVkMemory(), getDepthBoundsTestEnable(getVkAddress()));
    }

    
    public void setDepthBoundsTestEnable(VkBool32 depthBoundsTestEnable) {
        setDepthBoundsTestEnable(getVkAddress(), depthBoundsTestEnable != null ? depthBoundsTestEnable.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getDepthBoundsTestEnableQ() {
        return getDepthBoundsTestEnable().getValue();
    }

    public void setDepthBoundsTestEnable(int depthBoundsTestEnable) {
        getDepthBoundsTestEnable().setValue(depthBoundsTestEnable);
    }

    protected static native long getDepthBoundsTestEnable(long address);
    protected static native void setDepthBoundsTestEnable(long address, long depthBoundsTestEnable);

    public VkBool32 getStencilTestEnable() {
        return new VkBool32(getVkMemory(), getStencilTestEnable(getVkAddress()));
    }

    
    public void setStencilTestEnable(VkBool32 stencilTestEnable) {
        setStencilTestEnable(getVkAddress(), stencilTestEnable != null ? stencilTestEnable.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getStencilTestEnableQ() {
        return getStencilTestEnable().getValue();
    }

    public void setStencilTestEnable(int stencilTestEnable) {
        getStencilTestEnable().setValue(stencilTestEnable);
    }

    protected static native long getStencilTestEnable(long address);
    protected static native void setStencilTestEnable(long address, long stencilTestEnable);

    public VkStencilOpState getFront() {
        return new VkStencilOpState(getVkMemory(), getFront(getVkAddress()));
    }

    
    public void setFront(VkStencilOpState front) {
        setFront(getVkAddress(), front != null ? front.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getFront(long address);
    protected static native void setFront(long address, long front);

    public VkStencilOpState getBack() {
        return new VkStencilOpState(getVkMemory(), getBack(getVkAddress()));
    }

    
    public void setBack(VkStencilOpState back) {
        setBack(getVkAddress(), back != null ? back.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getBack(long address);
    protected static native void setBack(long address, long back);

    public VkFloat getMinDepthBounds() {
        return new VkFloat(getVkMemory(), getMinDepthBounds(getVkAddress()));
    }

    
    public void setMinDepthBounds(VkFloat minDepthBounds) {
        setMinDepthBounds(getVkAddress(), minDepthBounds != null ? minDepthBounds.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public float getMinDepthBoundsQ() {
        return getMinDepthBounds().getValue();
    }

    public void setMinDepthBounds(float minDepthBounds) {
        getMinDepthBounds().setValue(minDepthBounds);
    }

    protected static native long getMinDepthBounds(long address);
    protected static native void setMinDepthBounds(long address, long minDepthBounds);

    public VkFloat getMaxDepthBounds() {
        return new VkFloat(getVkMemory(), getMaxDepthBounds(getVkAddress()));
    }

    
    public void setMaxDepthBounds(VkFloat maxDepthBounds) {
        setMaxDepthBounds(getVkAddress(), maxDepthBounds != null ? maxDepthBounds.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public float getMaxDepthBoundsQ() {
        return getMaxDepthBounds().getValue();
    }

    public void setMaxDepthBounds(float maxDepthBounds) {
        getMaxDepthBounds().setValue(maxDepthBounds);
    }

    protected static native long getMaxDepthBounds(long address);
    protected static native void setMaxDepthBounds(long address, long maxDepthBounds);


    public static native long sizeof();

    public static class Array extends VkPipelineDepthStencilStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineDepthStencilStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineDepthStencilStateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO));;
        }

        public Array(int count, VkPipelineDepthStencilStateCreateInfo o){
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
        public VkPipelineDepthStencilStateCreateInfo get(int i){
            return new VkPipelineDepthStencilStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineDepthStencilStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineDepthStencilStateCreateInfo.Pointer> {
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

            public Array(VkPipelineDepthStencilStateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineDepthStencilStateCreateInfo.Pointer get(int i){
                return new VkPipelineDepthStencilStateCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
