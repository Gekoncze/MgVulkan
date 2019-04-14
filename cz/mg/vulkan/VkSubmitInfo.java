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

    public VkUInt32 getWaitSemaphoreCount() {
        return new VkUInt32(getVkMemory(), getWaitSemaphoreCount(getVkAddress()));
    }

    
    public void setWaitSemaphoreCount(VkUInt32 waitSemaphoreCount) {
        setWaitSemaphoreCount(getVkAddress(), waitSemaphoreCount != null ? waitSemaphoreCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getWaitSemaphoreCount(long address);
    private static native void setWaitSemaphoreCount(long address, long waitSemaphoreCount);

    public VkSemaphore getPWaitSemaphores() {
        return new VkSemaphore(getVkMemory(), getPWaitSemaphores(getVkAddress()));
    }

    private VkObject pWaitSemaphores = null;
    public void setPWaitSemaphores(VkSemaphore pWaitSemaphores) {
        setPWaitSemaphores(getVkAddress(), pWaitSemaphores != null ? pWaitSemaphores.getVkAddress() : VkPointer.NULL);
        this.pWaitSemaphores = pWaitSemaphores;
    }

    private static native long getPWaitSemaphores(long address);
    private static native void setPWaitSemaphores(long address, long pWaitSemaphores);

    public VkPipelineStageFlags getPWaitDstStageMask() {
        return new VkPipelineStageFlags(getVkMemory(), getPWaitDstStageMask(getVkAddress()));
    }

    private VkObject pWaitDstStageMask = null;
    public void setPWaitDstStageMask(VkPipelineStageFlags pWaitDstStageMask) {
        setPWaitDstStageMask(getVkAddress(), pWaitDstStageMask != null ? pWaitDstStageMask.getVkAddress() : VkPointer.NULL);
        this.pWaitDstStageMask = pWaitDstStageMask;
    }

    private static native long getPWaitDstStageMask(long address);
    private static native void setPWaitDstStageMask(long address, long pWaitDstStageMask);

    public VkUInt32 getCommandBufferCount() {
        return new VkUInt32(getVkMemory(), getCommandBufferCount(getVkAddress()));
    }

    
    public void setCommandBufferCount(VkUInt32 commandBufferCount) {
        setCommandBufferCount(getVkAddress(), commandBufferCount != null ? commandBufferCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getCommandBufferCount(long address);
    private static native void setCommandBufferCount(long address, long commandBufferCount);

    public VkCommandBuffer getPCommandBuffers() {
        return new VkCommandBuffer(getVkMemory(), getPCommandBuffers(getVkAddress()));
    }

    private VkObject pCommandBuffers = null;
    public void setPCommandBuffers(VkCommandBuffer pCommandBuffers) {
        setPCommandBuffers(getVkAddress(), pCommandBuffers != null ? pCommandBuffers.getVkAddress() : VkPointer.NULL);
        this.pCommandBuffers = pCommandBuffers;
    }

    private static native long getPCommandBuffers(long address);
    private static native void setPCommandBuffers(long address, long pCommandBuffers);

    public VkUInt32 getSignalSemaphoreCount() {
        return new VkUInt32(getVkMemory(), getSignalSemaphoreCount(getVkAddress()));
    }

    
    public void setSignalSemaphoreCount(VkUInt32 signalSemaphoreCount) {
        setSignalSemaphoreCount(getVkAddress(), signalSemaphoreCount != null ? signalSemaphoreCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSignalSemaphoreCount(long address);
    private static native void setSignalSemaphoreCount(long address, long signalSemaphoreCount);

    public VkSemaphore getPSignalSemaphores() {
        return new VkSemaphore(getVkMemory(), getPSignalSemaphores(getVkAddress()));
    }

    private VkObject pSignalSemaphores = null;
    public void setPSignalSemaphores(VkSemaphore pSignalSemaphores) {
        setPSignalSemaphores(getVkAddress(), pSignalSemaphores != null ? pSignalSemaphores.getVkAddress() : VkPointer.NULL);
        this.pSignalSemaphores = pSignalSemaphores;
    }

    private static native long getPSignalSemaphores(long address);
    private static native void setPSignalSemaphores(long address, long pSignalSemaphores);


    public static native long sizeof();

    public static class Array extends VkSubmitInfo implements cz.mg.collections.array.ReadonlyArray<VkSubmitInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSubmitInfo.sizeof()));
            this.count = count;
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

        public static class Array extends VkSubmitInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSubmitInfo.Pointer> {
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

            public Array(VkSubmitInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSubmitInfo.Pointer get(int i){
                return new VkSubmitInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
