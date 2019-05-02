package cz.mg.vulkan;

public class VkRenderPassBeginInfo extends VkObject {
    public VkRenderPassBeginInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO));
    }

    public VkRenderPassBeginInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRenderPassBeginInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkRenderPassBeginInfo(VkPointer pointer) {
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

    public VkRenderPass getRenderPass() {
        return new VkRenderPass(getVkMemory(), getRenderPassNative(getVkAddress()));
    }

    
    public void setRenderPass(VkRenderPass renderPass) {
        setRenderPassNative(getVkAddress(), renderPass != null ? renderPass.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getRenderPassNative(long address);
    protected static native void setRenderPassNative(long address, long renderPass);

    public VkFramebuffer getFramebuffer() {
        return new VkFramebuffer(getVkMemory(), getFramebufferNative(getVkAddress()));
    }

    
    public void setFramebuffer(VkFramebuffer framebuffer) {
        setFramebufferNative(getVkAddress(), framebuffer != null ? framebuffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getFramebufferNative(long address);
    protected static native void setFramebufferNative(long address, long framebuffer);

    public VkRect2D getRenderArea() {
        return new VkRect2D(getVkMemory(), getRenderAreaNative(getVkAddress()));
    }

    
    public void setRenderArea(VkRect2D renderArea) {
        setRenderAreaNative(getVkAddress(), renderArea != null ? renderArea.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getRenderAreaNative(long address);
    protected static native void setRenderAreaNative(long address, long renderArea);

    public VkUInt32 getClearValueCount() {
        return new VkUInt32(getVkMemory(), getClearValueCountNative(getVkAddress()));
    }

    
    public void setClearValueCount(VkUInt32 clearValueCount) {
        setClearValueCountNative(getVkAddress(), clearValueCount != null ? clearValueCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getClearValueCountQ() {
        return getClearValueCount().getValue();
    }

    public void setClearValueCount(int clearValueCount) {
        getClearValueCount().setValue(clearValueCount);
    }

    protected static native long getClearValueCountNative(long address);
    protected static native void setClearValueCountNative(long address, long clearValueCount);

    public VkClearValue getPClearValues() {
        return new VkClearValue(getVkMemory(), getPClearValuesNative(getVkAddress()));
    }

    private VkObject pClearValues = null;
    public void setPClearValues(VkClearValue pClearValues) {
        setPClearValuesNative(getVkAddress(), pClearValues != null ? pClearValues.getVkAddress() : VkPointer.NULL);
        this.pClearValues = pClearValues;
    }

    protected static native long getPClearValuesNative(long address);
    protected static native void setPClearValuesNative(long address, long pClearValues);


    public void set(VkRenderPassBeginInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkRenderPassBeginInfo implements cz.mg.collections.array.ReadonlyArray<VkRenderPassBeginInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRenderPassBeginInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO));;
        }

        public Array(int count, VkRenderPassBeginInfo o){
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
        public VkRenderPassBeginInfo get(int i){
            return new VkRenderPassBeginInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
