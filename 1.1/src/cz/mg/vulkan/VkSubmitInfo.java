package cz.mg.vulkan;

public class VkSubmitInfo extends VkObject {
    public VkSubmitInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SUBMIT_INFO));
    }

    public VkSubmitInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSubmitInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSubmitInfo(VkPointer pointer) {
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

    public VkUInt32 getWaitSemaphoreCount() {
        return new VkUInt32(getVkMemory(), getWaitSemaphoreCountNative(getVkAddress()));
    }

    
    public void setWaitSemaphoreCount(VkUInt32 waitSemaphoreCount) {
        setWaitSemaphoreCountNative(getVkAddress(), waitSemaphoreCount != null ? waitSemaphoreCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getWaitSemaphoreCountQ() {
        return getWaitSemaphoreCount().getValue();
    }

    public void setWaitSemaphoreCount(int waitSemaphoreCount) {
        getWaitSemaphoreCount().setValue(waitSemaphoreCount);
    }

    protected static native long getWaitSemaphoreCountNative(long address);
    protected static native void setWaitSemaphoreCountNative(long address, long waitSemaphoreCount);

    public VkSemaphore getPWaitSemaphores() {
        return new VkSemaphore(getVkMemory(), getPWaitSemaphoresNative(getVkAddress()));
    }

    private VkObject pWaitSemaphores = null;
    public void setPWaitSemaphores(VkSemaphore pWaitSemaphores) {
        setPWaitSemaphoresNative(getVkAddress(), pWaitSemaphores != null ? pWaitSemaphores.getVkAddress() : VkPointer.NULL);
        this.pWaitSemaphores = pWaitSemaphores;
    }

    protected static native long getPWaitSemaphoresNative(long address);
    protected static native void setPWaitSemaphoresNative(long address, long pWaitSemaphores);

    public VkPipelineStageFlags getPWaitDstStageMask() {
        return new VkPipelineStageFlags(getVkMemory(), getPWaitDstStageMaskNative(getVkAddress()));
    }

    private VkObject pWaitDstStageMask = null;
    public void setPWaitDstStageMask(VkPipelineStageFlags pWaitDstStageMask) {
        setPWaitDstStageMaskNative(getVkAddress(), pWaitDstStageMask != null ? pWaitDstStageMask.getVkAddress() : VkPointer.NULL);
        this.pWaitDstStageMask = pWaitDstStageMask;
    }

    protected static native long getPWaitDstStageMaskNative(long address);
    protected static native void setPWaitDstStageMaskNative(long address, long pWaitDstStageMask);

    public VkUInt32 getCommandBufferCount() {
        return new VkUInt32(getVkMemory(), getCommandBufferCountNative(getVkAddress()));
    }

    
    public void setCommandBufferCount(VkUInt32 commandBufferCount) {
        setCommandBufferCountNative(getVkAddress(), commandBufferCount != null ? commandBufferCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCommandBufferCountQ() {
        return getCommandBufferCount().getValue();
    }

    public void setCommandBufferCount(int commandBufferCount) {
        getCommandBufferCount().setValue(commandBufferCount);
    }

    protected static native long getCommandBufferCountNative(long address);
    protected static native void setCommandBufferCountNative(long address, long commandBufferCount);

    public VkCommandBuffer getPCommandBuffers() {
        return new VkCommandBuffer(getVkMemory(), getPCommandBuffersNative(getVkAddress()));
    }

    private VkObject pCommandBuffers = null;
    public void setPCommandBuffers(VkCommandBuffer pCommandBuffers) {
        setPCommandBuffersNative(getVkAddress(), pCommandBuffers != null ? pCommandBuffers.getVkAddress() : VkPointer.NULL);
        this.pCommandBuffers = pCommandBuffers;
    }

    protected static native long getPCommandBuffersNative(long address);
    protected static native void setPCommandBuffersNative(long address, long pCommandBuffers);

    public VkUInt32 getSignalSemaphoreCount() {
        return new VkUInt32(getVkMemory(), getSignalSemaphoreCountNative(getVkAddress()));
    }

    
    public void setSignalSemaphoreCount(VkUInt32 signalSemaphoreCount) {
        setSignalSemaphoreCountNative(getVkAddress(), signalSemaphoreCount != null ? signalSemaphoreCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSignalSemaphoreCountQ() {
        return getSignalSemaphoreCount().getValue();
    }

    public void setSignalSemaphoreCount(int signalSemaphoreCount) {
        getSignalSemaphoreCount().setValue(signalSemaphoreCount);
    }

    protected static native long getSignalSemaphoreCountNative(long address);
    protected static native void setSignalSemaphoreCountNative(long address, long signalSemaphoreCount);

    public VkSemaphore getPSignalSemaphores() {
        return new VkSemaphore(getVkMemory(), getPSignalSemaphoresNative(getVkAddress()));
    }

    private VkObject pSignalSemaphores = null;
    public void setPSignalSemaphores(VkSemaphore pSignalSemaphores) {
        setPSignalSemaphoresNative(getVkAddress(), pSignalSemaphores != null ? pSignalSemaphores.getVkAddress() : VkPointer.NULL);
        this.pSignalSemaphores = pSignalSemaphores;
    }

    protected static native long getPSignalSemaphoresNative(long address);
    protected static native void setPSignalSemaphoresNative(long address, long pSignalSemaphores);


    public static native long sizeof();

    public static class Array extends VkSubmitInfo implements cz.mg.collections.array.ReadonlyArray<VkSubmitInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSubmitInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SUBMIT_INFO));;
        }

        public Array(int count, VkSubmitInfo o){
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
        public VkSubmitInfo get(int i){
            return new VkSubmitInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
